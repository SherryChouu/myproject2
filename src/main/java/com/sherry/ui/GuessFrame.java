package com.sherry.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("TIPS");
    JTextField number = new JTextField(8);
    Random random = new Random();
    int secret = random.nextInt(10)+1;

    //Construction
    public GuessFrame(){
        super();
        System.out.println("secret: " + secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num > secret){
                    label.setText("Smaller");
                }else if(num < secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo! the secret number is" +secret);
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
    }
    //Methods
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
    }
}
