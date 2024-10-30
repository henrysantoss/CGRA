package cgra.Components;

import java.text.DecimalFormat;

public class MathProcessor {
    private static double formatDecimal(double value) {
        DecimalFormat df = new DecimalFormat("###.##");
        return Double.parseDouble(df.format(value).replace(',', '.'));
    }

    public static double generateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }

    public static Plane convertCartesianToPolar(Plane p) {
        double radius, angle;

        radius = Math.sqrt((p.getX() * p.getX()) + (p.getY() * p.getY()));
        angle = Math.toDegrees(Math.atan(p.getY() / p.getX()));

        p.setRadius(formatDecimal(radius));
        p.setAngle(formatDecimal(angle));
        return p;
    }

    public static Plane convertPolarToCartesian(Plane p) {
        double x, y, angleRadians;

        angleRadians = Math.toRadians(p.getAngle());

        x = p.getRadius() * Math.cos(angleRadians);
        y = p.getRadius() * Math.sin(angleRadians);

        p.setX(formatDecimal(x));
        p.setY(formatDecimal(y));
        return p;
    }  
}