package ru.mirea.ikbo1319.pr8.z3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Main {
    private static String path = "/gif/";
    String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg"};
    public static String filepath = "/gif/1.jpg";

    JFrame frame;

    public Main(){
        frame = new JFrame("GIF");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(1920, 1080);
        frame.add(new ImgPanel());
        frame.pack();
        frame.setVisible(true);
        gif();
    }

    public void gif(){
        int i = 0;
        while (true){
            filepath = path + images[i];
            i = (i + 1) % 6;
            System.out.println(i);
            try {
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }

    public static class ImgPanel extends JPanel{
        private Image image;

        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            try{
                image = ImageIO.read(new File(filepath));
            } catch(IOException e) {
                e.printStackTrace();
            }
            g2d.drawImage(image, 0, 0, this);
        }
    }
    public static void main(String[] args){
        new Main();
    }
}
