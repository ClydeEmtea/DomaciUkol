import cz.gyarab.util.paint.Shape;

import java.awt.*;

public class Hexagon extends Shape {

    private int size = 0;
    private int[] positionsX = new int[6];
    private int[] positionsY = new int[6];

    public Hexagon(Color color, int size, int x, int y) {
        super(color, x, y);
        this.size = size;
        setPositions();
    }

    private void setPositions() {
        int dY = (int)(Math.sin(Math.toRadians(60)) * size);
        positionsX[0] = getX() - size;
        positionsY[0] = getY();
        positionsX[1] = getX() - size/2;
        positionsY[1] = getY() + dY;
        positionsX[2] = getX() + size/2;
        positionsY[2] = getY() + dY;
        positionsX[3] = getX() + size;
        positionsY[3] = getY();
        positionsX[4] = getX() + size/2;
        positionsY[4] = getY() - dY;
        positionsX[5] = getX() - size/2;
        positionsY[5] = getY() - dY;
    }

    public void setSize(int size) {
        this.size = size;
        setPositions();
    }

    public int getSize() { return size; }

    @Override
    protected void paintShape(Graphics2D g) {
        g.fillPolygon(positionsX, positionsY, 6);
    }
}
