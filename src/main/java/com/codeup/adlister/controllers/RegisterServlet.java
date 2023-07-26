package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;
import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty() || password == null || password.isEmpty() || email == null || email.isEmpty()) {
            response.sendRedirect("/register");
            return;
        }

        // TODO: create a new user based off of the submitted information
        User user = new User(username, email, password);

        Users usersDao = DaoFactory.getUsersDao();
        long userId = usersDao.insert(user);

        // TODO: if a user was successfully created, send them to the login page
        if (userId != 0) {
            response.sendRedirect("/login");
        } else {
            response.sendRedirect("/register");
        }
    }
    }
}
