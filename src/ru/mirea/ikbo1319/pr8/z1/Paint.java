package ru.mirea.ikbo1319.pr8.z1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Paint extends JPanel {

    public void paintComponent(Graphics paint) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Arc arc = new Arc();
        for (int i = 0; i < 5; i++){
            paint.setColor(circle.getRandom());
            paint.fillOval(circle.getX(), circle.getY(), circle.getR(), circle.getR());
            paint.setColor(rectangle.getRandom());
            paint.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
            paint.setColor(square.getRandom());
            paint.fillRect(square.getX(), square.getY(), square.getSide(), square.getSide());
            paint.setColor(arc.getRandom());
            paint.fillArc(arc.getX(), arc.getY(), arc.getWidth(), arc.getHeight(), arc.getStartAngle(), arc.getArc());
        }
    }
}
