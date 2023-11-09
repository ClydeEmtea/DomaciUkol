import cz.gyarab.util.paint.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter("Painter");

        Hexagon hexagon = new Hexagon(Color.RED, 50, 150, 50);
        Pentagon pentagon = new Pentagon(Color.BLUE, 100, 50, 250);
        Oktagon oktagon = new Oktagon(Color.GREEN, 50, 250, 250);
        Trojuhelnik trojuhelnik = new Trojuhelnik(Color.YELLOW, 50, 150, 150);
        Ctverec ctverec = new Ctverec(Color.BLACK, 50, 50, 50);
        painter.add(hexagon);
        painter.add(pentagon);
        painter.add(oktagon);
        painter.add(trojuhelnik);
        painter.add(ctverec);

        painter.paint();
    }
}
