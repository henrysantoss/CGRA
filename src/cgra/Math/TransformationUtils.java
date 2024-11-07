package cgra.Math;

import cgra.Components.Plane;
import java.util.List;
import javax.swing.JTable;

public class TransformationUtils {

    public static void translatePlanes(List<Plane> planes, JTable grdData, double transX, double transY) {
        applyTransformation(planes, grdData, (plane) -> {
            plane.setX(plane.getX() + transX);
            plane.setY(plane.getY() + transY);
        });
    }

    public static void scalePlanes(List<Plane> planes, JTable grdData, double scaleX, double scaleY) {
        applyTransformation(planes, grdData, (plane) -> {
            plane.setX(plane.getX() * scaleX);
            plane.setY(plane.getY() * scaleY);
        });
    }

    public static void rotatePlanes(List<Plane> planes, JTable grdData, double angle, double centerX, double centerY) {
        double radians = Math.toRadians(angle);
        applyTransformation(planes, grdData, (plane) -> {
            double x = plane.getX() - centerX;
            double y = plane.getY() - centerY;
            double rotatedX = x * Math.cos(radians) - y * Math.sin(radians) + centerX;
            double rotatedY = x * Math.sin(radians) + y * Math.cos(radians) + centerY;
            plane.setX(rotatedX);
            plane.setY(rotatedY);
        });
    }

    private static void applyTransformation(List<Plane> planes, JTable grdData, PlaneTransformation transformation) {
        int[] selectedRows = grdData.getSelectedRows();
        for (int row : selectedRows) {
            Plane plane = planes.get(row);
            transformation.apply(plane);
            plane.convertToPolar();
            updateGridData(grdData, row, plane);
        }
    }

    private static void updateGridData(JTable grdData, int row, Plane plane) {
        grdData.setValueAt(plane.getX(), row, 1);
        grdData.setValueAt(plane.getY(), row, 2);
        grdData.setValueAt(plane.getRadius(), row, 3);
        grdData.setValueAt(plane.getAngle(), row, 4);
    }

    @FunctionalInterface
    private interface PlaneTransformation {
        void apply(Plane plane);
    }
}