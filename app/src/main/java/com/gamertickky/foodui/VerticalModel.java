package com.gamertickky.foodui;

public class VerticalModel {
    private String item,price,review;
    private int image;

    public VerticalModel(String item, String price, int image,String review) {
        this.item = item;
        this.price = price;
        this.image = image;
        this.review = review;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

