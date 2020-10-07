package ru.mirea.ikbo1319.pr8.z2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JComponent {
    private Image img;
    public Window(String path){
        try {
            File file = new File(path);
            System.out.println(path);
            img = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void paintComponent (Graphics g){
        g.drawImage(img, 50, 50, this);
    }
}
