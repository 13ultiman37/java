package ru.mirea.ikbo1319.pr9;

import ru.mirea.ikbo1319.pr8.z1.Arc;
import ru.mirea.ikbo1319.pr8.z1.Circle;
import ru.mirea.ikbo1319.pr8.z1.Paint;
import ru.mirea.ikbo1319.pr8.z1.Rectangle;
import ru.mirea.ikbo1319.pr8.z1.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("20 случайных фигур");
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ru.mirea.ikbo1319.pr8.z1.Paint paint = new Paint();
        frame.add(paint);
    }
}
