import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class SignUp{

    public class SignUpOne extends JFrame{

        SignUpOne(){

            setLayout(null);

            Random ran = new Random();
            long random = Math.abs(ran.nextLong() %9000L) + 1000L;

            JLabel formno = new JLabel("Application Form No. : "+ random);
            formno.setFont(new Font("Raleway",Font.BOLD, 38));
            formno.setBounds(140,20,600,40);
            add(formno);


            JLabel personaldetails = new JLabel("Page 1: Personal Details:");
            personaldetails.setFont(new Font("Raleway",Font.BOLD, 22));
            personaldetails.setBounds(290,80,400,30);
            add(personaldetails);

            JLabel name = new JLabel("Name:");
            name.setFont(new Font("Raleway",Font.BOLD, 20));
            name.setBounds(100,140,100,30);
            add(name);

            JTextField nameTextField = new JTextField();
            nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            nameTextField.setBounds(300, 140, 400, 30);
            add(nameTextField);


            JLabel fname = new JLabel("Father's Name:");
            fname.setFont(new Font("Raleway",Font.BOLD, 20));
            fname.setBounds(100,190,200,30);
            add(fname);

            JTextField fnameTextField = new JTextField();
            fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            fnameTextField.setBounds(300, 190, 400, 30);
            add(fnameTextField);

            JLabel dob = new JLabel("Date Of Birth:");
            dob.setFont(new Font("Raleway",Font.BOLD, 20));
            dob.setBounds(100,240,200,30);
            add(dob);

            JDateChooser dateChooser = new JDateChooser();
            dateChooser.setBounds(300,240,400,30);
            dateChooser.setForeground(Color.RED);
            add(dateChooser);

            JLabel gender = new JLabel("Gender:");
            gender.setFont(new Font("Raleway",Font.BOLD, 20));
            gender.setBounds(100,290,200,30);
            add(gender);

            JRadioButton male = new JRadioButton("Male");
            male.setBounds(300, 290, 60, 30);
            male.setBackground(Color.WHITE);
            add(male);

            JRadioButton female = new JRadioButton("Female");
            female.setBounds(300, 290, 120, 30);
            female.setBackground(Color.WHITE);
            add(female);

            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(male);
            genderGroup.add(female);

            JLabel email = new JLabel("Email Address:");
            email.setFont(new Font("Raleway",Font.BOLD, 20));
            email.setBounds(100,340,200,30);
            add(email);

            JTextField emailTextField = new JTextField();
            emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            emailTextField.setBounds(300, 340, 400, 30);
            add(emailTextField);

            JLabel marital = new JLabel("Marital Status:");
            marital.setFont(new Font("Raleway",Font.BOLD, 20));
            marital.setBounds(100,390,200,30);
            add(marital);

            JRadioButton married = new JRadioButton("Male");
            married.setBounds(300,3290, 100, 30);
            married.setBackground(Color.WHITE);
            add(married);

            JRadioButton unmarried = new JRadioButton("Male");
            unmarried.setBounds(450, 390, 100, 30);
            unmarried.setBackground(Color.WHITE);
            add(unmarried);

            JRadioButton other = new JRadioButton("Male");
            other.setBounds(630, 390, 100, 30);
            other.setBackground(Color.WHITE);
            add(other);

            ButtonGroup maritialGroup = new ButtonGroup();
            maritialGroup.add(married);
            maritialGroup.add(unmarried);
            maritialGroup.add(other);

            JLabel address = new JLabel("Address:");
            address.setFont(new Font("Raleway",Font.BOLD, 20));
            address.setBounds(100,440,200,30);
            add(address);

            JTextField addresstextfield = new JTextField();
            addresstextfield.setFont(new Font("Raleway", Font.BOLD, 14));
            addresstextfield.setBounds(300, 440, 400, 30);
            add(nameTextField);

            JLabel city = new JLabel("City:");
            city.setFont(new Font("Raleway",Font.BOLD, 20));
            city.setBounds(100,490,200,30);
            add(city);

            JTextField cityTextField = new JTextField();
            cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            cityTextField.setBounds(300, 490, 400, 30);
            add(cityTextField);

            JLabel state = new JLabel("State:");
            state.setFont(new Font("Raleway",Font.BOLD, 20));
            state.setBounds(100,540,200,30);
            add(state);

            JTextField stateTextField = new JTextField();
            stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            stateTextField.setBounds(300, 540, 400, 30);
            add(stateTextField);

            JLabel pincode = new JLabel("Pin Of Code:");
            pincode.setFont(new Font("Raleway",Font.BOLD, 20));
            pincode.setBounds(100,590,200,30);
            add(pincode);

            JTextField pinTextField = new JTextField();
            pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            pinTextField.setBounds(300, 590, 400, 30);
            add(pinTextField);

            JButton next =  new JButton("Next");
            next.setBackground(Color.BLACK);
            next.setForeground(Color.WHITE);
            next.setFont(new Font("Raleway",Font.BOLD, 14));
            next.setBounds(630,660,80,30);
            add(next);

            getContentPane().setBackground(Color.WHITE);

            setSize(850,800);
            setLocation(350,10);
            setVisible(true);
        }
    }

    public static void main(String[] args) {

    }
}