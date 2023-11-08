import cz.gyarab.util.paint.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter("Painter");

        Hexagon hexagon = new Hexagon(Color.GREEN, 50, 150, 50);
        painter.add(hexagon);

        painter.paint();
    }
}
