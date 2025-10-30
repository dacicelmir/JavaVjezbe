package com.udg.me;

import java.util.StringTokenizer;

/**
 * Predstavlja igrača u igri.
 */
public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {
        super(x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        // Ukloni višak razmaka i formatiraj: " peTar petrović " -> "Petar Petrović"
        StringBuilder formatted = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name.trim());
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (!word.isEmpty()) {
                formatted.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase());
                if (st.hasMoreTokens()) formatted.append(" ");
            }
        }
        this.name = formatted.toString();
    }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        if (health < 0 || health > 100)
            throw new IllegalArgumentException("Health must be between 0 and 100");
        this.health = health;
    }

    @Override
    public String toString() {
        return String.format("Player[%s] @ (%d,%d) %dx%d HP=%d",
                name, getX(), getY(), getWidth(), getHeight(), health);
    }
}