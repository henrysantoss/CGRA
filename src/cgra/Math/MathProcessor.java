package cgra.Math;

import cgra.Components.Plane;
import java.text.DecimalFormat;

public class MathProcessor {

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###.##");

    public static double formatDecimal(double value) {
        return Double.parseDouble(DECIMAL_FORMAT.format(value).replace(',', '.'));
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void convertCartesianToPolar(Plane plane) {
        double radius = Math.sqrt(Math.pow(plane.getX(), 2) + Math.pow(plane.getY(), 2));
        double angle = Math.toDegrees(Math.atan2(plane.getY(), plane.getX()));

        plane.setRadius(formatDecimal(radius));
        plane.setAngle(formatDecimal(angle));
    }

    public static void convertPolarToCartesian(Plane plane) {
        double angleRadians = Math.toRadians(plane.getAngle());
        double x = plane.getRadius() * Math.cos(angleRadians);
        double y = plane.getRadius() * Math.sin(angleRadians);

        plane.setX(formatDecimal(x));
        plane.setY(formatDecimal(y));
    }

    public static double calculatePossibleCollision(Plane plane1, Plane plane2) {
        double plane1Direction = Math.toRadians(plane1.getDirection());
        double plane2Direction = Math.toRadians(plane2.getDirection());
        
        double plane1VelocityX = plane1.getSpeed() * Math.cos(plane1Direction);
        double plane1VelocityY = plane1.getSpeed() * Math.sin(plane1Direction);
        
        double plane2VelocityX = plane2.getSpeed() * Math.cos(plane2Direction);
        double plane2VelocityY = plane2.getSpeed() * Math.sin(plane2Direction);
        
        // Famosa Baskhara >:)
        double a = Math.pow(plane1VelocityX - plane2VelocityX, 2) + Math.pow(plane1VelocityY - plane2VelocityY, 2);
        double b = 2 * ((plane1.getX() - plane2.getX()) * (plane1VelocityX - plane2VelocityX) + 
                        (plane1.getY() - plane2.getY()) * (plane1VelocityY - plane2VelocityY));
        double c = Math.pow(plane1.getX() - plane2.getX(), 2) + Math.pow(plane1.getY() - plane2.getY(), 2);
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta < 0) {
            return -1;
        }
        
        double timeOption1 = (-b + Math.sqrt(delta)) / (2 * a);
        double timeOption2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        double collisionTime = Math.min(timeOption1, timeOption2);
        
        if (collisionTime > 0) {
            return collisionTime; 
        }
        
        return -1;
    }    
}