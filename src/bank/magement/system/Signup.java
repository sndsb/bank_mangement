package bank.magement.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField nameField,fathersNameField,emailField,addressField,cityField,stateField,pincodeField;
    JButton nextBtn;
    Random rand;
    JRadioButton male,female,married,unmarried,other;
    ButtonGroup buttonGroup,maritialBtn;
    JDateChooser dobField;

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

        nameField = new JTextField();
        nameField.setBounds(350,150,300,30);

        JLabel fathersName = new JLabel("Father's Name : ");
        fathersName.setBounds(100,190,250,40);
        fathersName.setFont(new Font("Raleway",Font.BOLD,22));

        fathersNameField = new JTextField();
        fathersNameField.setBounds(350,190,300,30);

        JLabel dob = new JLabel("DOB : ");
        dob.setBounds(100,230,250,40);
        dob.setFont(new Font("Raleway",Font.BOLD,22));

        dobField = new JDateChooser();
        dobField.setBounds(350,230,300,30);


        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(100,270,250,40);
        gender.setFont(new Font("Raleway",Font.BOLD,22));

        male = new JRadioButton("Male");
        male.setBackground(Color.white);
        male.setBounds(350,270,120,30);
        male.setFocusable(false);

        female = new JRadioButton("Female");
        female.setBackground(Color.white);
        female.setBounds(490,270,160,30);
        female.setFocusable(false);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        JLabel email = new JLabel("Email : ");
        email.setBounds(100,310,250,40);
        email.setFont(new Font("Raleway",Font.BOLD,22));

        emailField = new JTextField();
        emailField.setBounds(350,310,300,30);


        JLabel martial = new JLabel("Martial Status : ");
        martial.setBounds(100,350,250,40);
        martial.setFont(new Font("Raleway",Font.BOLD,22));

        married = new JRadioButton("Married");
        married.setBackground(Color.white);
        married.setBounds(350,350,90,30);
        married.setFocusable(false);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.white);
        unmarried.setFocusable(false);
        unmarried.setBounds(450,350,90,30);


        other = new JRadioButton("Other");
        other.setBackground(Color.white);
        other.setFocusable(false);
        other.setBounds(550,350,90,30);


        maritialBtn = new ButtonGroup();
        maritialBtn.add(married);
        maritialBtn.add(unmarried);
        maritialBtn.add(other);


        JLabel address = new JLabel("Address : ");
        address.setBounds(100,390,250,40);
        address.setFont(new Font("Raleway",Font.BOLD,22));

        addressField = new JTextField();
        addressField.setBounds(350,390,300,30);

        JLabel city = new JLabel("City : ");
        city.setBounds(100,430,250,40);
        city.setFont(new Font("Raleway",Font.BOLD,22));

        cityField = new JTextField();
        cityField.setBounds(350,430,300,30);

        JLabel state = new JLabel("State : ");
        state.setBounds(100,470,250,40);
        state.setFont(new Font("Raleway",Font.BOLD,22));

        stateField = new JTextField();
        stateField.setBounds(350,470,300,30);

        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setBounds(100,510,250,40);
        pincode.setFont(new Font("Raleway",Font.BOLD,22));

        pincodeField = new JTextField();
        pincodeField.setBounds(350,510,300,30);

        nextBtn = new JButton("Next");
        nextBtn.setBackground(Color.black);
        nextBtn.setForeground(Color.white);
        nextBtn.setFont(new Font("Raleway",Font.BOLD,14));
        nextBtn.setBounds(580,580,80,30);
        nextBtn.setFocusable(false);
        nextBtn.addActionListener(this);

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
        add(male);
        add(female);
        add(email);
        add(emailField);
        add(martial);
        add(married);
        add(unmarried);
        add(other);
        add(address);
        add(addressField);
        add(city);
        add(cityField);
        add(state);
        add(stateField);
        add(pincode);
        add(pincodeField);
        add(nextBtn);

    }

    private long getRandomNum(){

        rand = new Random();

        return Math.abs((rand.nextLong() % 9000L) + 1000L);

    }
    public static void main (String[] args){

        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + getRandomNum();
        String name = nameField.getText();
        String fathersName = fathersNameField.getText();
        String dob = dobField.getDateEditor().getUiComponent().getName();

        String gender = null;

        if(male.isSelected())
             gender = "male";
        else if (female.isSelected())
            gender = "female";

        String email = emailField.getText();

        String maritalStatus = null;

        if(married.isSelected())
            maritalStatus = "married";
        else if (unmarried.isSelected())
            maritalStatus="unmarried";
        else if (other.isSelected())
            maritalStatus="other";

        String address = addressField.getText();
        String state = stateField.getText();
        String city = cityField.getText();
        String pin = pincodeField.getText();

        try{

            System.out.println("dob" + dob);
            if(name.isEmpty())
                JOptionPane.showMessageDialog(null,"Name is required",null,JOptionPane.ERROR_MESSAGE);

            if(pin.isEmpty())
                JOptionPane.showMessageDialog(null,"Pin no field is required",null,JOptionPane.ERROR_MESSAGE);


            Conn c = new Conn();

//            String query = String.format("INSERT INTO user (name, pin, dob) VALUES ('%s', '%s', '%s')",name,pin,dob);
            String query = "INSERT INTO user (name, pin, dob) VALUES (?, ?, ?)";

            PreparedStatement pstmt = c.c.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, pin);
            pstmt.setString(3, dob);

//            c.s.executeUpdate(query);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
                JOptionPane.showMessageDialog(null, "User added successfully!");
            } else {
                System.out.println("No rows were inserted.");
            }


        }catch (Exception e){

        }


    }
}

