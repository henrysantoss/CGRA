package cgra.Math;

import static cgra.Math.MathProcessor.formatDecimal;

import cgra.Components.Plane;
import java.text.DecimalFormat;
import java.util.List;

public class TrackingUtils {

    public static final double AIRPORT_X = 0;
    public static final double AIRPORT_Y = 0;

    public static String checkPlanesNearAirport(List<Plane> planes, double minDistance) {
        StringBuilder report = new StringBuilder("Aviões próximos ao aeroporto:\n");

        for (Plane plane : planes) {
            double distance = MathProcessor.calculateDistance(plane.getX(), plane.getY(), AIRPORT_X, AIRPORT_Y);
            if (distance <= minDistance) {
                report.append("Avião ").append(plane.getCode()).append(" está a ").append(formatDecimal(distance))
                        .append(" metros do aeroporto.\n");
            }
        }

        return report.toString();
    }

    public static String checkPlanesNearEachOther(List<Plane> planes, double minDistance) {
        StringBuilder report = new StringBuilder("Aviões próximos:\n");

        for (int i = 0; i < planes.size(); i++) {
            Plane plane1 = planes.get(i);
            for (int j = i + 1; j < planes.size(); j++) {
                Plane plane2 = planes.get(j);
                double distance = MathProcessor.calculateDistance(plane1.getX(), plane1.getY(), plane2.getX(),
                        plane2.getY());
                if (distance <= minDistance) {
                    report.append("Avião ").append(plane1.getCode()).append(" e Avião ").append(plane2.getCode())
                            .append(" estão a ").append(formatDecimal(distance)).append(" metros de distância.\n");
                }
            }
        }

        return report.toString();
    }

    public static String checkPossibleCollisions(List<Plane> planes, double minTime) {
        StringBuilder report = new StringBuilder("Aviões com possibilidade de colisão:\n");
        boolean activeReport = false;

        for (int i = 0; i < planes.size(); i++) {
            Plane plane1 = planes.get(i);

            for (int j = i + 1; j < planes.size(); j++) {
                Plane plane2 = planes.get(j);

                double collisionTime = MathProcessor.calculatePossibleCollision(plane1, plane2);

                if (collisionTime == -1) {
                    continue;
                }

                if (collisionTime <= minTime) {
                    activeReport = true;
                    report.append(
                            "O Avião " + plane1.getCode() + " está em Rota de Colisão com o Avião "
                                    + plane2.getCode() + " em aproximadamente " + String.format("%.2f", collisionTime) + " segundos!\n");

                }
            }
        }

        return (activeReport) ? report.toString() : "Não há aviões com possibilidade de colisão!";
    }

}
