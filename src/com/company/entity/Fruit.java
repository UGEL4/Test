package com.company.entity;

public class Fruit {
    private int f_id;
    private String fruitName;
    private double price;
    private String comments;
    private int amount;

    public Fruit(int f_id, String fruitName, double price, String comments, int amount) {
        this.f_id = f_id;
        this.fruitName = fruitName;
        this.price = price;
        this.comments = comments;
        this.amount = amount;
    }

    public Fruit() {
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "f_id=" + f_id +
                ", fruitName='" + fruitName + '\'' +
                ", price=" + price +
                ", comments='" + comments + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
