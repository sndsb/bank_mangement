package bank.magement.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    Signup(){


        JLabel formno = new JLabel("Application Form No. " + getRandomNum());
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));


        setSize(850,800);
        setLocation(350,10);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(formno);
    }

    private long getRandomNum(){

        Random rand = new Random();

        return Math.abs((rand.nextLong() % 9000L) + 1000L);

    }
    public static void main (String[] args){

        new Signup();
    }
}

