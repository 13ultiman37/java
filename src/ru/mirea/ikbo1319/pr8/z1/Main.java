package ru.mirea.ikbo1319.pr8.z1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("20 случайных фигур");
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Paint paint = new Paint();
        frame.add(paint);
    }
}
