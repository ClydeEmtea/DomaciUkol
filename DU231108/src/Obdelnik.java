import cz.gyarab.util.paint.Shape;

import java.awt.*;

public class Obdelnik extends Shape {

    private int size = 0;
    private final int[] positionsX = new int[4];
    private final int[] positionsY = new int[4];

    public Obdelnik(Color color, int size, int x, int y) {
        super(color, x, y);
        this.size = size;
        setPositions();
    }

    private void setPositions() {
        positionsX[0] = getX() - size;
        positionsY[0] = getY() - size / 2;
        positionsX[1] = getX() + size / 2;
        positionsY[1] = getY() - size / 2;
        positionsX[2] = getX() + size / 2;
        positionsY[2] = getY() + size / 2;
        positionsX[3] = getX() - size;
        positionsY[3] = getY() + size / 2;

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
        g.fillPolygon(positionsX, positionsY, 4);
    }
}
