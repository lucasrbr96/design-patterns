package com.design.pattern.creational.builder;

public class Product {
    private String name;
    private String description;
    private double price;

    //constructor private - prevent building new ones
    private Product(final String name) {
        //name is mandatory
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private final Product product;

        public Builder(final String name) {
            // Initializes the Product object in the Builder constructor
            product = new Product(name);
        }

        public Builder description(final String description) {
            product.description = description;
            return this;
        }

        public Builder price(final double price) {
            product.price = price;
            return this;
        }

        public Product build() {
            return product;
        }
    }

}
