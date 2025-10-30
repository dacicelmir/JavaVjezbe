package com.udg.me;

//Game.java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* Glavna klasa igre.
* Članovi grupe: [TVOJE IME], [IME 2], [IME 3]
*/
public class Game {
 private Player player;
 private ArrayList<Enemy> enemies;
 private ArrayList<String> eventLog;

 public Game(Player player) {
     this.player = player;
     this.enemies = new ArrayList<>();
     this.eventLog = new ArrayList<>();
 }

 // 1. Provjera kolizije
 public boolean checkCollision(Player p, Enemy e) {
     return p.intersects(e);
 }

 // 2. Smanji zdravlje igrača
 public void decreaseHealth(Player p, Enemy e) {
     int dmg = e.getEffectiveDamage();
     int oldHp = p.getHealth();
     int newHp = Math.max(0, oldHp - dmg);
     p.setHealth(newHp);

     String enemyType = e instanceof BossEnemy ? "BossEnemy" : 
                       e instanceof MeleeEnemy ? "MeleeEnemy" : "Enemy";

     eventLog.add(String.format("HIT: Player by %s for %d -> HP %d -> %d",
             e.getType(), dmg, oldHp, newHp));
 }

 // 3. Dodaj neprijatelja
 public void addEnemy(Enemy e) {
     enemies.add(e);
     eventLog.add("ADD: " + e.getType() + " at (" + e.getX() + "," + e.getY() + ")");
 }

 // 4. Pretraga po tipu (case-insensitive)
 public List<Enemy> findByType(String query) {
     if (query == null) return new ArrayList<>();
     String lowerQuery = query.toLowerCase().trim();
     return enemies.stream()
             .filter(e -> e.getType().toLowerCase().contains(lowerQuery))
             .collect(Collectors.toList());
 }

 // 5. Neprijatelji u koliziji sa igračem
 public List<Enemy> collidingWithPlayer() {
     return enemies.stream()
             .filter(e -> checkCollision(player, e))
             .collect(Collectors.toList());
 }

 // 6. Riješi sve kolizije
 public void resolveCollisions() {
     for (Enemy e : enemies) {
         if (checkCollision(player, e)) {
             decreaseHealth(player, e);
         }
     }
 }

 // Parsiranje stringa: "Goblin;12,5;16x16;20;boss"
 public Enemy parseEnemy(String data) {
     String[] parts = data.split(";");
     if (parts.length != 5)
         throw new IllegalArgumentException("Invalid enemy format");

     String type = parts[0].trim();
     String[] pos = parts[1].split(",");
     String[] dim = parts[2].split("x");
     int damage = Integer.parseInt(parts[3].trim());
     String modifier = parts[4].trim().toLowerCase();

     int x = Integer.parseInt(pos[0].trim());
     int y = Integer.parseInt(pos[1].trim());
     int width = Integer.parseInt(dim[0].trim());
     int height = Integer.parseInt(dim[1].trim());
     int health = 100; // default

     if (modifier.equals("boss")) {
         return new BossEnemy(type + " King", x, y, width, height, damage, health);
     } else {
         return new MeleeEnemy(type, x, y, width, height, damage, health);
     }
 }

 // Ispis dnevnika
 public void printEventLog() {
     System.out.println("\n=== EVENT LOG ===");
     eventLog.forEach(System.out::println);
 }

 // Getteri
 public Player getPlayer() { return player; }
 public ArrayList<Enemy> getEnemies() { return enemies; }

 // MAIN - TESTIRANJE
 public static void main(String[] args) {
     // Kreiraj igrača
     Player player = new Player(" peTar  petrović ", 10, 5, 32, 32, 85);
     Game game = new Game(player);

     System.out.println("Player created: " + player);

     // 1. Dodaj MeleeEnemy ručno
     MeleeEnemy goblin = new MeleeEnemy("Goblin", 12, 5, 16, 16, 20, 60);
     game.addEnemy(goblin);

     // 2. Parsiraj i dodaj BossEnemy iz stringa
     String bossData = "Goblin;12,5;32x32;25;boss";
     Enemy boss = game.parseEnemy(bossData);
     game.addEnemy(boss);

     // Ispis svih neprijatelja
     System.out.println("\nAll enemies:");
     game.getEnemies().forEach(e -> System.out.println(" - " + e));

     // Pretraga po "gob"
     System.out.println("\nEnemies containing 'gob':");
     game.findByType("gob").forEach(e -> System.out.println(" - " + e));

     // Stanje prije kolizije
     System.out.println("\nBefore collision: " + player);

     // Riješi kolizije
     game.resolveCollisions();

     // Stanje poslije
     System.out.println("After collision: " + player);

     // Ispis dnevnika
     game.printEventLog();
 }
}