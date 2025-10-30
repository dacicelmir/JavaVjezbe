package com.udg.me;


public class Enemy extends GameObject {
    protected String type;
    protected int damage;
    protected int health;

    public Enemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() { return type; }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty())
            throw new IllegalArgumentException("Type cannot be empty");
        this.type = type.trim();
    }

    public int getDamage() { return damage; }

    public void setDamage(int damage) {
        if (damage < 0 || damage > 100)
            throw new IllegalArgumentException("Damage must be between 0 and 100");
        this.damage = damage;
    }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        if (health < 0 || health > 100)
            throw new IllegalArgumentException("Health must be between 0 and 100");
        this.health = health;
    }

    // Osnovna šteta (može se redefinisati)
    public int getEffectiveDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return String.format("Enemy[%s] @ (%d,%d) %dx%d DMG=%d HP=%d",
                type, getX(), getY(), getWidth(), getHeight(), damage, health);
    }
}