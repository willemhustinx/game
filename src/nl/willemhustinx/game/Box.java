package nl.willemhustinx.game;

import java.awt.*;

public class Box extends GameObject {

    public Box(int x, int y) {
        super(x, y);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, 32, 32);

    }

    public Rectangle getBounds() {
        return null;
    }
}
