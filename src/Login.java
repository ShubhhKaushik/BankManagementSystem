import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;


public class Login extends JFrame implements ActionListener{
    public static void main(String[] args) {
//        FlatArcIJTheme FlatLightLaf;
        new Login().setVisible(true);
    }

    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){

        setTitle("Automated Teller Machine");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,38));
        cardno.setBounds(120,150,200,40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        cardTextField.setBounds(300,150,230,30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,38));
        pin.setBounds(120,220,200,40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setForeground(Color.BLACK);
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setForeground(Color.BLACK);
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setForeground(Color.BLACK);
        signup.setBackground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==login){
            conn conn = new conn();
            String cardno = cardTextField.getText();
            String pin = pinTextField.getText();
            String query = "select * from login where cardNumber = '"+cardno+"' and pinNumber = '"+pin+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Card or Pin Number");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }

}
