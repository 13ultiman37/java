package ru.mirea.ikbo1319.pr6.z1;

public class MovablePoint implements MovableInterface {
        private double x;
        private double y;

        public MovablePoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        @Override
        public void move(double x, double y) {
            this.x += x;
            this.y += y;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
            }
}
