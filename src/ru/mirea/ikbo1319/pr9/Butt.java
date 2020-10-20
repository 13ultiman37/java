package ru.mirea.ikbo1319.pr9;
import ru.mirea.ikbo1319.pr8.z1.Paint;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Butt implements ActionListener {
    JFrame jFrame;

    Butt(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Paint paint = new Paint();
        jFrame.add(paint);
        jFrame.repaint();
    }

}