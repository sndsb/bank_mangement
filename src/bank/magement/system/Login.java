package bank.magement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends JFrame implements ActionListener {

    JButton loginButton,signupButton,clearButton;
    JTextField cardnoTextField;
    JPasswordField pinTextField;

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

         cardnoTextField = new JTextField();
        cardnoTextField.setBounds(300,150,250,30);


        //        pin text label
        JLabel pin = new JLabel("PIN No. :");
        pin.setFont(new Font("osward",Font.BOLD,28));
        pin.setBounds(120,220,250,30);

         pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);

//        button label

         loginButton = new JButton("Log In");
        loginButton.setBounds(300,300,100,30);
        loginButton.setBackground(Color.gray);
        loginButton.setForeground(Color.white);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

         clearButton = new JButton("Clear");
        clearButton.setBounds(450,300,100,30);
        clearButton.setBackground(Color.red);
        clearButton.setForeground(Color.white);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

         signupButton = new JButton("Sign up");
        signupButton.setBounds(300,350,200,30);
        signupButton.setBackground(Color.lightGray);
        signupButton.setForeground(Color.white);
        signupButton.setFocusable(false);
        signupButton.addActionListener(this);



        this.setTitle("Bank Management System");
        this.setSize(800, 500);
        this.setVisible(true);
        this.setLocation(550, 300);
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
        this.add(loginButton);
        this.add(clearButton);
        this.add(signupButton);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == clearButton){
             pinTextField.setText("");
             cardnoTextField.setText("");
        }else if (actionEvent.getSource() == loginButton){

        }else {

        }
    }
}
