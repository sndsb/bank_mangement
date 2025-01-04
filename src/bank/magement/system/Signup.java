package bank.magement.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    Signup(){


        JLabel formno = new JLabel("Application Form No. " + getRandomNum());
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));

        JLabel personalDetails = new JLabel("Personal Details");
        personalDetails.setBounds(290,60,400,40);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));


        JLabel name = new JLabel("Name : ");
        name.setBounds(100,150,250,40);
        name.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField nameField = new JTextField();
        nameField.setBounds(350,150,300,30);

        JLabel fathersName = new JLabel("Father's Name : ");
        fathersName.setBounds(100,190,250,40);
        fathersName.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField fathersNameField = new JTextField();
        fathersNameField.setBounds(350,190,300,30);

        JLabel dob = new JLabel("DOB : ");
        dob.setBounds(100,230,250,40);
        dob.setFont(new Font("Raleway",Font.BOLD,22));

        JDateChooser dobField = new JDateChooser();
        dobField.setBounds(350,230,300,30);


        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(100,270,250,40);
        gender.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField genderField = new JTextField();
        genderField.setBounds(350,270,300,30);


        JLabel email = new JLabel("Email : ");
        email.setBounds(100,310,250,40);
        email.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField emailField = new JTextField();
        emailField.setBounds(350,310,300,30);


        JLabel martial = new JLabel("Martial Status : ");
        martial.setBounds(100,350,250,40);
        martial.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField maritalField = new JTextField();
        maritalField.setBounds(350,350,300,30);

        JLabel address = new JLabel("Address : ");
        address.setBounds(100,390,250,40);
        address.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField addressField = new JTextField();
        addressField.setBounds(350,390,300,30);

        JLabel city = new JLabel("City : ");
        city.setBounds(100,430,250,40);
        city.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField cityField = new JTextField();
        cityField.setBounds(350,430,300,30);

        JLabel state = new JLabel("State : ");
        state.setBounds(100,470,250,40);
        state.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField stateField = new JTextField();
        stateField.setBounds(350,470,300,30);

        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setBounds(100,510,250,40);
        pincode.setFont(new Font("Raleway",Font.BOLD,22));

        JTextField pincodeField = new JTextField();
        pincodeField.setBounds(350,510,300,30);


        setSize(850,800);
        setLocation(350,10);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(formno);
        add(personalDetails);
        add(name);
        add(nameField);
        add(fathersName);
        add(fathersNameField);
        add(dob);
        add(dobField);
        add(gender);
        add(genderField);
        add(email);
        add(emailField);
        add(martial);
        add(maritalField);
        add(address);
        add(addressField);
        add(city);
        add(cityField);
        add(state);
        add(stateField);
        add(pincode);
        add(pincodeField);

    }

    private long getRandomNum(){

        Random rand = new Random();

        return Math.abs((rand.nextLong() % 9000L) + 1000L);

    }
    public static void main (String[] args){

        new Signup();
    }
}

