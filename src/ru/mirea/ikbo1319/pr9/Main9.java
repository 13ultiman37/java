package ru.mirea.ikbo1319.pr9;


import javax.swing.*;
import java.awt.*;

public class Main9 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        Button button = new Button("Press");
        frame.add(button, BorderLayout.SOUTH);
        button.addActionListener(new Butt(frame));
        frame.setVisible(true);
    }
}