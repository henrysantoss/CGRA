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
}