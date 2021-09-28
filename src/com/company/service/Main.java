package com.company.service;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello world");

        Product product;
        product = new Product("Keyboard");

        System.out.println(product.getName());
    }
}
