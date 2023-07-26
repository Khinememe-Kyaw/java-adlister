<%--
  Created by IntelliJ IDEA.
  User: khinememekyaw
  Date: 7/26/23
  Time: 2:49 AM
  To change this template use File | Settings | File Templates.
--%>

<%--This form features choices to select the crust type, sauce type,
// size type (use select inputs), toppings (checkboxes), and delivery address (text input). Use System.out.println to output
// the values submitted by the user.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <h1>Welcome to Pizza Shop</h1>
    <form action="/pizza-order" method="POST">
        <h3>Choose the crust type</h3>
        <div>
            <select name ="crust">
                <option>Thin Crust</option>
                <option>Hand-Tossed Crust</option>
                <option>Deep Dish Crust</option>
            </select>
        </div>
        <h3>Choose the sauce</h3>
        <div>
            <select name="sauce">
                <option>Marinara Sauce</option>
                <option>Pesto Sauce</option>
                <option>BBQ Sauce</option>
            </select>
        </div>
        <h3>Choose the size</h3>
        <div>
            <select name="size">
                <option>Small (10 inches)</option>
                <option>Medium (12 inches)</option>
                <option>Large (14 inches)</option>
            </select>
        </div>
        <h3>Choose the toppings</h3>
        <div>
            <label for="pepperoni">
                <input id="pepperoni" type="checkbox" name="toppings" value="pepperoni"> Pepperoni
            </label>
            <label for="mushrooms">
                <input id="mushrooms" type="checkbox" name="toppings" value="mushrooms"> Mushrooms
            </label>
            <label for="pineapples">
                <input id="pineapples" type="checkbox" name="toppings" value="pineapples"> Pineapples
            </label>
        </div>
        <div>
            <label for="address">Enter the delivery address:</label>
            <input type="text" name="address" id="address">
        </div>
        <input type="submit" value="Submit">
    </form>
</div>


