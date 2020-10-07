package ru.mirea.ikbo1319.pr10.z1;
import java.util.Scanner;

public class Main1 {

    public int cnt = 0;
    public double k = 0;
    public double s = 0;

    public double getK() {
        return k;
    }

    public double getS() {
        return s;
    }

    public int getCnt() {
        return cnt;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void Count(){
        int i = (int) Math.pow(10, this.k-1);
        while (i < Math.pow(10, this.k)) {
            int Ssum = 0;
            int num = i;

            while(num != 0) {
                Ssum += num % 10;
                num /= 10;
            }

            if (Ssum == s) {
                System.out.print(i + " ");
                this.cnt++;
            }
            i += 1;
        }
        System.out.println("Количество таких цифр: " + this.cnt);
    }
};

class Testing {
    public static void main(String[] args) {
        Main1 sum = new Main1();
        Scanner scan = new Scanner(System.in);
        System.out.print("K: ");
        int k = scan.nextInt();
        sum.setK(k);
        System.out.print("S: ");
        int s = scan.nextInt();
        sum.setS(s);
        sum.Count();
    }
}