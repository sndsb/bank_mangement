package bank.magement.system;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {

    Login() {

//         image icon

        ImageIcon logoIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/logo.jpg")));

        Image resizedImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        ImageIcon newImageIcon = new ImageIcon(resizedImage);

        JLabel iconLabel = new JLabel(newImageIcon);
        iconLabel.setBounds(70, 10, 100, 100);

        //heading text label
        JLabel headingText  =  new JLabel("Welcome to ATM");
        headingText.setFont(new Font("osward",Font.BOLD,37));
        headingText.setBounds(200,40,400,40);

//        cardno text label
        JLabel cardno = new JLabel("Card No. :");
        cardno.setFont(new Font("osward",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);

        JTextField cardnoTextField = new JTextField();
        cardnoTextField.setBounds(300,150,250,30);


        //        pin text label
        JLabel pin = new JLabel("PIN No. :");
        pin.setFont(new Font("osward",Font.BOLD,28));
        pin.setBounds(120,220,250,30);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300,220,250,30);


        this.setTitle("Bank Management System");
        this.setSize(800, 400);
        this.setVisible(true);
        this.setLocation(350, 200);
        this.setLayout(null);

        getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        add label to component
        this.add(iconLabel);
        this.add(headingText);
        this.add(cardno);
        this.add(cardnoTextField);
        this.add(pin);
        this.add(pinTextField);
    }

    public static void main(String[] args) {
        new Login();
    }
}
