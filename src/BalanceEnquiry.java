import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pinNumber;
    JButton back;
    BalanceEnquiry(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemClassLoader().getResource("atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);

        back = new JButton("BACK");
        back.setBounds(360,402,150,25);
        back.addActionListener(this);
        image.add(back);

        conn conn = new  conn();
        int balance = 0;
        try {
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '" + pinNumber + "'");
            while (rs.next()) {
                if (rs.getString("type").equalsIgnoreCase("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }

            }
        }catch(Exception ex){
            System.out.println(ex);
        }

        



        setSize(900,800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
