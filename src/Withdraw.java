import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {

    JButton withdraw,back;
    JLabel text;
    JTextField amount;
    String pinNumber;

    public Withdraw(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);

        text = new JLabel("Enter The Amount You Want To Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(180,210,400,20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(180,250,310,25);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(360,340,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(360,390,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==withdraw){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Deposit Amount cannot be Empty");
            }else{
                conn conn = new conn();
                String query = "insert into bank values('"+pinNumber+"','"+date+"','Withdraw','"+number+"')";
                try {
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+ number + " Withdrawn Successfully");
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }else if(e.getSource()==back){
            setVisible(false);
            new Transaction("").setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdraw("").setVisible(true);
    }


}
