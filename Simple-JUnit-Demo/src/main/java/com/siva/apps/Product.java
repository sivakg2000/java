package com.siva.apps;

public class Product {
    String brandName;
    String model;
    Integer id;
    Double price;
    String category;

    public Product(String brandName, String model, Integer id, Double price, String category) {
        this.brandName = brandName;
        this.model = model;
        this.id = id;
        this.price = price;
        this.category = category;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
