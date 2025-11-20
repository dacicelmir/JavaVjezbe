package projekat4;

public class RectangleCollider implements Collidable {
	private int x, y, width, height;
	
	public RectangleCollider(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		if (width < 0 || height < 0) {
			throw new IllegalArgumentException("Sirina i visina ne smiju biti negativni.");
		
		
		
		
		}
	
	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean intersects(Collidable other) {
		// TODO Auto-generated method stub
		return false;
	}






}
