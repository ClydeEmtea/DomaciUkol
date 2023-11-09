import cz.gyarab.util.paint.*;
import cz.gyarab.util.paint.Shape;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter("Malíř");

        Shape hexagon = new Hexagon(Color.RED, 50, 150, 50);
        Shape pentagon = new Pentagon(Color.BLUE, 100, 50, 250);
        Shape oktagon = new Oktagon(Color.GREEN, 50, 250, 250);
        Shape trojuhelnik = new Trojuhelnik(Color.YELLOW, 50, 150, 150);
        Shape obdelnik = new Obdelnik(Color.BLACK, 50, 50, 50);

        painter.add(hexagon);
        painter.add(pentagon);
        painter.add(oktagon);
        painter.add(trojuhelnik);
        painter.add(obdelnik);

        painter.paint();
    }
}
