package com.gamertickky.foodui;

public class horizontalModel {
    private String text;
    private int Color;

    public horizontalModel(String text, int color) {
        this.text = text;
        Color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }
}
