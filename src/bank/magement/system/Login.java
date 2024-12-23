package bank.magement.system;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {

     Login(){

//         image icon

        ImageIcon logoIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/logo.jpg")));

        Image resizedImage  = logoIcon.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);

        ImageIcon newImageIcon = new ImageIcon(resizedImage);

        JLabel iconLabel = new JLabel(newImageIcon);
        iconLabel.setBounds(70,10,100,100);

        this.setTitle("Bank Management System");
        this.setSize(800,400);
        this.setVisible(true);
        this.setLocation(350,200);
        this.setLayout(null);
        this.add(iconLabel);

        getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static  void main(String[] args){
         new Login();
    }
}
