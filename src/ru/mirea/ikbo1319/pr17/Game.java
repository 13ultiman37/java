package ru.mirea.ikbo1319.pr17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Game extends JComponent {
    public static final int FIELD_EMPTY = 0;
    public static final int FIELD_X = 10;
    public static final int FIELD_O = 200;
    int[][] field;
    boolean isXturn;

    void drawTable(Graphics graphics){
        int w = getWidth();
        int h = getHeight();
        int cellw = w / 3;
        int cellh = h / 3;
        graphics.setColor(Color.BLACK);
        for (int i = 1; i < 3; i++){
            graphics.drawLine(0, cellh * i, w, cellh * i);
            graphics.drawLine(cellw * i, 0, cellw * i, h);
        }
    }

    public Game(){
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();
    }

    public void initGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
            field[i][j] = FIELD_EMPTY;
            }
        }
        isXturn = true;
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1){
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            if (field[i][j] == FIELD_EMPTY){
                field[i][j] = isXturn?FIELD_X:FIELD_O;
                isXturn = !isXturn;
                repaint();
                int result = checkState();
                if (result != 0){
                    if (result == FIELD_O*3){
                        JOptionPane.showMessageDialog(this, "Нолики выиграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (result == FIELD_X*3){
                        JOptionPane.showMessageDialog(this, "Крестики выиграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Ничья!", "Ходы закончились", JOptionPane.INFORMATION_MESSAGE);
                    }
                    initGame();
                    repaint();
                }
            }
        }
    }

    void drawX(int i, int j, Graphics graphics){
        graphics.setColor(Color.BLACK);
        int wx = getWidth() / 3;
        int hx = getHeight() / 3;
        int x = i * wx;
        int y = j * hx;
        graphics.drawLine(x, y, x + wx, y + hx);
        graphics.drawLine(x, y + hx, x + wx, y);
    }

    void drawO(int i, int j, Graphics graphics){
        graphics.setColor(Color.BLACK);
        int wx = getWidth() / 3;
        int hx = getHeight() / 3;
        int x = i * wx;
        int y = j * hx;
        graphics.drawOval(x + 5 * wx / 100, y, wx * 9 / 10, hx);
    }

    void drawSign(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == FIELD_X) {
                    drawX(i, j, graphics);
                } else if (field[i][j] == FIELD_O) {
                    drawO(i, j, graphics);
                }
            }
        }
    }

    int checkState(){
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < 3; i++) {
            diag1 += field[i][i];
            diag2 += field[i][2 - i];
        }
        if (diag1 == FIELD_O*3 || diag1 == FIELD_X*3){
            return diag1;
        }
        if (diag2 == FIELD_O*3 || diag2 == FIELD_X*3){
            return diag2;
        }
        int check_i, check_j;
        boolean hasEmpty = false;
        for (int i = 0; i < 3; i++) {
            check_i = 0;
            check_j = 0;
            for (int j = 0; j < 3; j++) {
                if(field[i][j] == 0){
                    hasEmpty = true;
                }
                check_i += field[i][j];
                check_j += field[j][i];
            }
            if (check_i == FIELD_O*3 || check_i == FIELD_X*3){
                return  check_i;
            }
            if (check_j == FIELD_O*3 || check_j == FIELD_X*3){
                return  check_j;
            }
        }
        if (hasEmpty) return 0;
        else return -1;
    }

    @Override
    protected void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        graphics.clearRect(0, 0, getWidth(), getHeight());
        drawTable(graphics);
        drawSign(graphics);
    }


}
