import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class FastCash extends JFrame implements ActionListener {

    JButton deposit,withdrawal,fastCash,mini,pinChange,enquiry,exit;
    String pinNumber;
    FastCash(String pinNumber) {

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);

        JLabel text = new JLabel("Please Select The Amount To Withdraw");
        text.setBounds(185,210,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Rs 100");
        deposit.setBounds(160,315,150,25);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawal = new JButton("Rs 200");
        withdrawal.setBounds(360,315,150,25);
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        fastCash = new JButton("Rs 500");
        fastCash.setBounds(160,345,150,25);
        fastCash.addActionListener(this);
        image.add(fastCash);

        mini = new JButton("Rs 1,000");
        mini.setBounds(360,345,150,25);
        mini.addActionListener(this);
        image.add(mini);

        pinChange = new JButton("Rs 5,000");
        pinChange.setBounds(160,375,150,25);
        pinChange.addActionListener(this);
        image.add(pinChange);

        enquiry = new JButton("Rs 10,000");
        enquiry.setBounds(360,375,150,25);
        enquiry.addActionListener(this);
        image.add(enquiry);

        exit = new JButton("BACK");
        exit.setBounds(185,405,300,25);
        exit.addActionListener(this);
        image.add(exit);



        setSize(900,800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==exit){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }else{
            String amount  = ((JButton)e.getSource()).getText().substring(3);
            conn conn = new  conn();
            try{
                ResultSet rs = conn.s.executeQuery("select * from where pin = '"+pinNumber+"'");
                int balance = 0;

            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
