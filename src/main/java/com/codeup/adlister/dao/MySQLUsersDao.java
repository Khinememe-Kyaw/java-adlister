package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import javax.servlet.jsp.jstl.core.Config;
import java.sql.*;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        String wildCard = "%" + username + "%";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, wildCard);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    return new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user info", e);
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?);";

        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                while (rs.next()) {
                    return rs.getLong(1);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0L;
    }

    // Add a close method to close the database connection when no longer needed
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error closing the database connection!", e);
        }
    }
}
