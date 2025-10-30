package com.udg.me;


public class GameObject {
    private int x, y;
    private int width, height;

    // Konstruktor sa provjerama
    public GameObject(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    // Getteri i setteri sa validacijom
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getWidth() { return width; }
    public void setWidth(int width) {
        if (width <= 0) throw new IllegalArgumentException("Width must be > 0");
        this.width = width;
    }

    public int getHeight() { return height; }
    public void setHeight(int height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be > 0");
        this.height = height;
    }

    // Provjera kolizije
    public boolean intersects(GameObject other) {
        return this.x < other.x + other.width &&
               this.x + this.width > other.x &&
               this.y < other.y + other.height &&
               this.y + this.height > other.y;
    }

    @Override
    public String toString() {
        return String.format("GameObject @ (%d,%d) %dx%d", x, y, width, height);
    }
}