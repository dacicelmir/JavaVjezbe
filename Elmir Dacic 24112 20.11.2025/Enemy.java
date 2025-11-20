package projekat4;

public class Enemy extends GameObject implements Attacker {
	String tipNeprijatelja;
	int damage;
	int health;
   
	public Enemy(int x, int y, String tipNeprijatelja, int damage, int health) {
	if damage < 0  illegalArgumentException("Damage ne moze biti negativan");
   else this.damage=damage;
	
	if health <0 && >100 illegalArgumentException("Health ne moze biti negativan i veci od 100");
   else this.health=health;
   
}

	private void illegalArgumentException(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getEffectiveDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
}