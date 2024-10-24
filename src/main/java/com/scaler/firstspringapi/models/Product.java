package com.scaler.firstspringapi.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private double price;
    private String image;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    private int qty;
    private int numberOfOrders;

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for image
    public String getImage() {
        return image;
    }

    // Setter for image
    public void setImage(String image) {
        this.image = image;
    }

    // Getter for category
    public Category getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(Category category) {
        this.category = category;
    }

    // Getter for qty
    public int getQty() {
        return qty;
    }

    // Setter for qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for numberOfOrders
    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    // Setter for numberOfOrders
    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
}