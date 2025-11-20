package projekat4;

public class CircleCollider implements Collidable {

	private double centerX, centerY;
	private double radius;
	public double getCenterX() {
		return centerX;
	}
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}
	public double getCenterY() {
		return centerY;
	}
	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public boolean intersects(Collidable other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
