package ru.mirea.ikbo1319.pr8.z1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    protected Color color;
    protected int x, y;
    protected int r, g, b;

    public abstract Color getRandom();
    public abstract int getX();
    public abstract int getY();
}
