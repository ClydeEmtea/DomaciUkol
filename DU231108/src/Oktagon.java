import cz.gyarab.util.paint.Shape;

import java.awt.*;

public class Oktagon extends Shape {

    private int size = 0;
    private int[] positionsX = new int[8];
    private int[] positionsY = new int[8];

    public Oktagon(Color color, int size, int x, int y) {
        super(color, x, y);
        this.size = size;
        setPositions();
    }

    private void setPositions() {
        double angle = 360.0 / 8;
        for (int i = 0; i < 8; i++) {
            positionsX[i] = getX() + (int) (size * Math.cos(Math.toRadians(angle * i - 90)));
            positionsY[i] = getY() + (int) (size * Math.sin(Math.toRadians(angle * i - 90)));
        }
    }

    public void setSize(int size) {
        this.size = size;
        setPositions();
    }

    public int getSize() {
        return size;
    }

    @Override
    protected void paintShape(Graphics2D g) {
        g.fillPolygon(positionsX, positionsY, 8);
    }
}
