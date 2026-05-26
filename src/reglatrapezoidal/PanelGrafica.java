package reglatrapezoidal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JPanel;

public class PanelGrafica extends JPanel {

    private double[] x = new double[0];
    private double[] y = new double[0];
    private final DecimalFormat fmt = new DecimalFormat("0.##");

    public PanelGrafica() {
        setBackground(new Color(239, 243, 248));
    }

    public void setDatos(double[] x, double[] y) {
        if (x == null || y == null || x.length == 0 || y.length == 0 || x.length != y.length) {
            this.x = new double[0];
            this.y = new double[0];
        } else {
            this.x = Arrays.copyOf(x, x.length);
            this.y = Arrays.copyOf(y, y.length);
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int left = 45;
        int right = 20;
        int top = 20;
        int bottom = 35;

        g2.setColor(new Color(205, 212, 224));
        g2.setStroke(new BasicStroke(1f));
        int gridX = 5;
        int gridY = 5;
        for (int i = 0; i <= gridX; i++) {
            int gx = left + (int) Math.round(i * (w - left - right) / (double) gridX);
            g2.drawLine(gx, top, gx, h - bottom);
        }
        for (int i = 0; i <= gridY; i++) {
            int gy = top + (int) Math.round(i * (h - top - bottom) / (double) gridY);
            g2.drawLine(left, gy, w - right, gy);
        }

        g2.setColor(new Color(110, 120, 140));
        g2.setStroke(new BasicStroke(1.6f));
        g2.drawLine(left, h - bottom, w - right, h - bottom);
        g2.drawLine(left, h - bottom, left, top);

        g2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        g2.drawString("x", w - right - 8, h - bottom + 18);
        g2.drawString("f(x)", left - 30, top + 6);

        if (x.length < 2 || y.length < 2) {
            g2.setColor(new Color(110, 120, 140));
            g2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            g2.drawString("Genere la tabla y calcule para visualizar trapecios.", left + 10, top + 20);
            g2.dispose();
            return;
        }

        double minX = x[0];
        double maxX = x[0];
        double minY = Math.min(0, y[0]);
        double maxY = Math.max(0, y[0]);

        for (int i = 1; i < x.length; i++) {
            minX = Math.min(minX, x[i]);
            maxX = Math.max(maxX, x[i]);
            minY = Math.min(minY, Math.min(0, y[i]));
            maxY = Math.max(maxY, Math.max(0, y[i]));
        }

        double rangeX = maxX - minX;
        if (rangeX == 0) {
            rangeX = 1;
        }

        double rangeY = maxY - minY;
        if (rangeY == 0) {
            rangeY = 1;
        }

        int baseY = h - bottom - (int) Math.round((0 - minY) * (h - top - bottom) / rangeY);
        baseY = Math.max(top, Math.min(h - bottom, baseY));

        g2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        g2.setColor(new Color(120, 130, 145));
        for (int i = 0; i <= gridX; i++) {
            double value = minX + i * rangeX / gridX;
            int gx = left + (int) Math.round(i * (w - left - right) / (double) gridX);
            g2.drawString(fmt.format(value), gx - 6, h - bottom + 14);
        }
        for (int i = 0; i <= gridY; i++) {
            double value = maxY - i * rangeY / gridY;
            int gy = top + (int) Math.round(i * (h - top - bottom) / (double) gridY);
            g2.drawString(fmt.format(value), left - 40, gy + 4);
        }

        for (int i = 0; i < x.length - 1; i++) {
            int x1 = left + (int) Math.round((x[i] - minX) * (w - left - right) / rangeX);
            int x2 = left + (int) Math.round((x[i + 1] - minX) * (w - left - right) / rangeX);
            int y1 = h - bottom - (int) Math.round((y[i] - minY) * (h - top - bottom) / rangeY);
            int y2 = h - bottom - (int) Math.round((y[i + 1] - minY) * (h - top - bottom) / rangeY);

            Path2D trapezoid = new Path2D.Double();
            trapezoid.moveTo(x1, baseY);
            trapezoid.lineTo(x1, y1);
            trapezoid.lineTo(x2, y2);
            trapezoid.lineTo(x2, baseY);
            trapezoid.closePath();

            g2.setColor(new Color(81, 134, 222, 95));
            g2.fill(trapezoid);
            g2.setColor(new Color(40, 91, 180));
            g2.draw(trapezoid);
        }

        g2.setColor(new Color(20, 73, 158));
        g2.setStroke(new BasicStroke(2.2f));
        for (int i = 0; i < x.length - 1; i++) {
            int x1 = left + (int) Math.round((x[i] - minX) * (w - left - right) / rangeX);
            int x2 = left + (int) Math.round((x[i + 1] - minX) * (w - left - right) / rangeX);
            int y1 = h - bottom - (int) Math.round((y[i] - minY) * (h - top - bottom) / rangeY);
            int y2 = h - bottom - (int) Math.round((y[i + 1] - minY) * (h - top - bottom) / rangeY);
            g2.drawLine(x1, y1, x2, y2);
        }

        g2.setColor(new Color(17, 56, 122));
        for (int i = 0; i < x.length; i++) {
            int px = left + (int) Math.round((x[i] - minX) * (w - left - right) / rangeX);
            int py = h - bottom - (int) Math.round((y[i] - minY) * (h - top - bottom) / rangeY);
            g2.fillOval(px - 3, py - 3, 6, 6);
        }

        g2.dispose();
    }
}
