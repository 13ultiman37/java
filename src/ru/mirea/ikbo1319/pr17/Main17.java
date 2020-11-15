package ru.mirea.ikbo1319.pr17;

import ru.mirea.ikbo1319.pr8.z2.Window;

import javax.swing.*;
import java.awt.*;

public class Main17 extends JComponent {

    public static void main(String[] args) {
        JFrame window = new JFrame("TIC-TAC-TOE");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        Game game = new Game();
        window.add(game);
    }
}
