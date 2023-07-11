package com.example.factory;

import java.sql.*;
import java.util.*;

//design-pattern : DAO (Data Access Object) / Repository (Data Access Object)
public class ProductRepository {
    public void save(Product product) {

        try {
            Connection connection = MySqlConnectionFactory.getConnection();
            // step-3 : create a statement
            Statement statement = connection.createStatement();

            // step-4 : execute the query
            String sql = "INSERT INTO product (name, price) VALUES ('" + product.getName() + "','" + product.getPrice() + "')";
            statement.executeUpdate(sql);

            // step-5 : close the connection
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public List<Product> findAll() {

        try {
            // step-3 : create a statement
            Connection connection = MySqlConnectionFactory.getConnection();
            Statement statement = connection.createStatement();

            // step-4 : execute the query
            String sql = "SELECT * FROM product";
            ResultSet resultSet = statement.executeQuery(sql);

            // step-5 : extract data from result set
            List<Product> products = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                products.add(product);
            }

            // step-6 : close the result set
            resultSet.close();

            // step-7 : close the statement
            statement.close();

            // step-8 : close the connection
            connection.close();

            return products;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
