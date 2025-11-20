package projekat4;

public abstract class GameObject {
	private int x, y;
	
	public abstract String getDisplayName();
	boolean intersects(GameObject other) {
		this.collider.intersects(other.collider);
		toString();
	
	}
}
