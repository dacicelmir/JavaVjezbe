package com.udg.me;

// MeleeEnemy.java
/**
 * Melee neprijatelj - napada izbliza, koristi osnovnu štetu.
 */
public class MeleeEnemy extends Enemy {
    public MeleeEnemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(type, x, y, width, height, damage, health);
    }

    // Nema modifikatora štete
    @Override
    public int getEffectiveDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Melee" + super.toString().substring(5); // "Enemy" -> "MeleeEnemy"
    }
}