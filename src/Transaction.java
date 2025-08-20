import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit,withdrawal,fastCash,mini,pinChange,enquiry,exit;
    String pinNumber;
    Transaction(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210,200,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(160,305,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(360,305,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(160,340,150,30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        mini = new JButton("Mini Statement");
        mini.setBounds(360,340,150,30);
        mini.addActionListener(this);
        image.add(mini);

        pinChange = new JButton("PIN Change");
        pinChange.setBounds(160,375,150,30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        enquiry = new JButton("Balance Enquiry");
        enquiry.setBounds(360,375,150,30);
        enquiry.addActionListener(this);
        image.add(enquiry);

        exit = new JButton("EXIT");
        exit.setBounds(185,410,300,30);
        exit.addActionListener(this);
        image.add(exit);



        setSize(900,800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==exit){
            System.exit(0);
        }else if(e.getSource()==deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }else if(e.getSource() == withdrawal){
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        }else if(e.getSource()==fastCash){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Transaction("").setVisible(true);
    }
}
