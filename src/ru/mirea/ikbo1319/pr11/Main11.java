package ru.mirea.ikbo1319.pr11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main11 extends JFrame {
    public JTextField input = new JTextField("");
    public JTextArea text = new JTextArea("Введите число от 0 до 20:");
    public JButton button = new JButton("Проверить");
    public JTextArea finaloutput = new JTextArea("");
    public int number = -1;
    public int guessednumber = (int)(Math.random()*20);
    public int count = 0;
    Main11(){
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        text.setBounds(330,100,150,30);
        input.setBounds(300,150,200,30);
        button.setBounds(350,200,100,30);
        finaloutput.setBounds(250,250,300,30);
        finaloutput.setEditable(false);
        text.setEditable(false);
        frame.add(text);
        frame.add(finaloutput);
        frame.add(input);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.PINK);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Integer.parseInt(input.getText());
                if (number > guessednumber) {
                    finaloutput.setText("Ваше число больше искомого, попробуйте еще раз");
                }
                else if (number < guessednumber){
                    finaloutput.setText("Ваше число меньше искомого, попробуйте еще раз");
                }
                else if (number == guessednumber){
                    finaloutput.setBounds(100,300,200,100);
                    finaloutput.setFont(new Font("Consolas", Font.PLAIN, 40));
                    finaloutput.setText("Верно! Вы угадали!");
                    button.removeAll();
                }
                count++;
                if (count==3) {
                    finaloutput.setBounds(100,300,600,100);
                    finaloutput.setFont(new Font("Consolas", Font.PLAIN, 40));
                    finaloutput.setText("Попытки кончились."+ '\n' + "Искомое число: " + guessednumber);
                    button.removeAll();
                }

            }
        });
    }

    public static void main(String[] args) {
        Main11 m = new Main11();
    }
}
