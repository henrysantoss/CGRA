package cgra.Components;

import cgra.Math.MathProcessor;

public class Plane {

	private int code;
	private double x;
	private double y;
	private double radius;
	private double angle;
	private double speed;
	private double direction;

	public Plane() {}

	public Plane(int code, double x, double y, double radius, double angle, double speed, double direction) {
		this.code = code;
		this.x = x;
		this.y = y;
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
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
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

	public void convertToCartesian() {
		MathProcessor.convertPolarToCartesian(this);
	}
	public void convertToPolar() {
		MathProcessor.convertCartesianToPolar(this);
	}
}