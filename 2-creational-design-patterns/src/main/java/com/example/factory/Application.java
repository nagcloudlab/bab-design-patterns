package com.example.factory;

public class Application {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        productRepository.findAll().forEach(System.out::println);

    }
}
