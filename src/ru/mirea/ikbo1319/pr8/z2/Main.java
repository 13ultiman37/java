package ru.mirea.ikbo1319.pr8.z2;
import javax.swing.*;

public class Main extends  JFrame{
    public Main (String[] args) {
    super("Цветы");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setDefaultLookAndFeelDecorated(true);
    setSize(1000, 600);
    setVisible(true);
    Window img = new Window(args[0]);
    add(img);
    validate();
    repaint();
    }

    public static void main(String[] args) {
        new Main(args);
    }
}
