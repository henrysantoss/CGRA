package cgra.Components;


public class Plane {

	private int code;
	private double X;
	private double Y;
	private double radius;
	private double angle;
	private double speed;
	private double direction;
	
	public Plane() {}
	
	public Plane(int code, double X, double Y, double radius, double angle, double speed, double direction) {
		super();
		this.code = code;
		this.X = X;
		this.Y = Y;
		this.radius = radius;
		this.angle = angle;
		this.speed = speed;
		this.direction = direction;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public double getX() {
		return X;
	}
	public void setX(double X) {
		this.X = X;
	}

	public double getY() {
		return Y;
	}
	public void setY(double Y) {
		this.Y = Y;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDirection() {
		return direction;
	}
	public void setDirection(double direction) {
		this.direction = direction;
	}
}
