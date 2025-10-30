package com.udg.me;

//BossEnemy.java
/**
* Boss neprijatelj - duplira štetu.
*/
public class BossEnemy extends Enemy {
 public BossEnemy(String type, int x, int y, int width, int height, int damage, int health) {
     super(type, x, y, width, height, damage, health);
 }


 @Override
 public String toString() {
     return String.format("BossEnemy[%s] @ (%d,%d) %dx%d DMG=%dx2 HP=%d",
             type, getX(), getY(), getWidth(), getHeight(), damage, health);
 }
}