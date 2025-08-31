import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MiniStatement extends JFrame {
    JLabel card,bank,mini,balance;
    String pinNumber;

    MiniStatement(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);

        mini = new JLabel();
        mini.setBounds(40,180,300,320);
        add(mini);

        bank = new JLabel("PUNJAB NATIONAL BANK");
        bank.setBounds(120,30,300,50);
        add(bank);

        card = new JLabel();
        card.setBounds(40,120,300,30);
        add(card);

        balance =  new JLabel();
        balance.setBounds(40,400,300,20);
        add(balance);

        try{
            conn conn = new conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinNumber ='"+pinNumber+"'");
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("cardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardNumber").substring(12));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            conn conn = new conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
            int bal = 0;
            while(rs.next()) {

                mini.setText(mini.getText() + "<html>" + rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount")+"<br><br><html>");
                if (rs.getString("type").equalsIgnoreCase("deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
                balance.setText("Your Current Account Balance Is: "+ bal);
            }



        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        setSize(400, 600);
        setLocation(20,20);
        setBackground(Color.WHITE);
//        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new  MiniStatement("");
    }
}
