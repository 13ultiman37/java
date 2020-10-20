package ru.mirea.ikbo1319.pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main12 extends JFrame {

    public static final int width = 800;
    public static final int height = 600;
    private static final double G = 6.67;
    public Main12(){
        super("Солнечная система");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton button = new JButton("Узнать");
        JComboBox planetList = new JComboBox(Planet.values());
        JLabel label = new JLabel("Выберите планету, на которой вы хотите узнать величину ускорения свободного падения: ");
        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Planet planets = (Planet)planetList.getSelectedItem();
                double grav = planets.gravity() / 100000000000000000.00 ;
                label.setText(String.format("Сила приятжения на планете " + planets.getName() + " составляет " + "%.3f", grav) + " м/с^2 ");
            }
        });
        pane.add(label);
        button.setLayout(new BorderLayout());
        pane.add(planetList);
        setContentPane(pane);
        setSize(width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main12();
    }
}
