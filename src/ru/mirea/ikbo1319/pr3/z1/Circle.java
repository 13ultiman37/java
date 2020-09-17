package ru.mirea.ikbo1319.pr3.z1;
import java.lang.Math;

public class Circle {
    int r;
    double p, s;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getS() {
        return square(r);
    }

    public void setS(double s) {
        this.s = square(r);
    }

    public void setP(double p) {
        this.p = perimetr(r);
    }

    public double perimetr(int r)
    {
        return this.p = 2*r* Math.PI;
    }

    public double getP() {
        return perimetr(r);
    }

    public double square (int r)
    {
        return this.s = Math.PI*r*r;
    }
}

