
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class SignUp3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignUp3(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel l1=new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        setSize(850,820);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel type = new JLabel("Account Type: ");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100, 120, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 160, 180, 30);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(330, 160, 200, 30);
        add(r2);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 190, 220, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(330, 190, 250, 30);
        add(r4);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);

        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        card.setBounds(100, 240, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4140");
        number.setFont(new Font("Raleway", Font.BOLD, 16));
        number.setBounds(330, 240, 300, 30);
        add(number);

        JLabel cardDetail = new JLabel("Your 16 Digit Card Number");
        cardDetail.setFont(new Font("Raleway", Font.BOLD, 16));
        cardDetail.setBounds(100, 260, 220, 30);
        add(cardDetail);

        JLabel pin = new JLabel("Pin Number: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 310, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 16));
        pnumber.setBounds(330, 310, 300, 30);
        add(pnumber);

        JLabel pinDetail = new JLabel("Your 4 Digit PIN");
        pinDetail.setFont(new Font("Raleway", Font.BOLD, 16));
        pinDetail.setBounds(100, 330, 300, 30);
        add(pinDetail);

        JLabel services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway", Font.BOLD, 20));
        services.setBounds(100, 380, 300, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 410, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 410, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 440, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 440, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 470, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 470, 200, 30);
        add(c6);

        c7 = new JCheckBox("I Hereby Declare That The Above Entered Details Are Correct To The Best Of My Knowledge ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 550, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 16));
        submit.setBounds(300, 600, 200, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 16));
        cancel.setBounds(500, 600, 200, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);


    }
    public void  actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            String type = null;
            if(r1.isSelected()) {
                type = "Saving Account";
            }else if(r2.isSelected()) {
                type = "Current Account";
            }else if(r3.isSelected()) {
                type = "Fixed Deposit Account";
            }else type = "Recurring Deposit Account";

            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong()%90000000L))+ 5040936000000000L;

            String pinNumber = "" + Math.abs((random.nextLong()%9000L))+ 1000L;

            String facility = "";
            if(c1.isSelected()) {
                facility = facility + "ATM Card";
            }else if(c2.isSelected()) {
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()) {
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()) {
                facility = facility + " Email & SMS Alerts";
            }else if(c5.isSelected()) {
                facility = facility + " Cheque Book";
            }else if(c6.isSelected()) {
                facility = facility + " E-Statement";
            }

            try {
                if(type.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Select a Type of Account");
                }else {
                    conn conn = new conn();
                    String query1 = "insert into signUp3 values("+this.formno+","+type+","+cardNumber+","+pinNumber+","+facility+")";
                    conn.s.executeUpdate(query1);

                    setVisible(false);
                    new SignUp3(formno).setVisible(true);
                }
            }catch(Exception ex) {
                System.out.println(ex);
            }

        }else if(e.getSource()==cancel){

        }
    }

    public static void main(String[] args) {
        new SignUp3(" ").setVisible(true);
    }

}
