import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class SignUpOne extends JFrame implements  ActionListener {

    long random;
    JLabel formno;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField,
            passwordTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;

    SignUpOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 900000L) + 100000L;


        formno = new JLabel("Application Form No. : " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);


        JLabel personaldetails = new JLabel("Page 1: Personal Details:");
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldetails.setBounds(290, 60, 400, 30);
        add(personaldetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 120, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 120, 400, 30);
        add(nameTextField);


        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 170, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 170, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 220, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 220, 400, 30);
        dateChooser.setForeground(Color.RED);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 270, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 270, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 320, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 320, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 370, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 370, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 370, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 370, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritialGroup = new ButtonGroup();
        maritialGroup.add(married);
        maritialGroup.add(unmarried);
        maritialGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 420, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 420, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 470, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 470, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 520, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 520, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Of Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 570, 200, 30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 570, 400, 30);
        add(pinTextField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(630, 620, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 900);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String formnno = String.valueOf(random);
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = "" + pinTextField.getText();

        try{
            if(name.equals(" ")){
                JOptionPane.showMessageDialog(null, "Please enter your name");
            }else{
                conn c = new conn();
                String query = "insert into signup values('"+formnno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";

                c.s.executeUpdate(query);

                setVisible(false);
                new SignUp2("").setVisible(true);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }


    }



    public static void main(String[] args) {
        new SignUpOne().setVisible(true);
    }
}