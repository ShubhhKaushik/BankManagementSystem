import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pinchange extends JFrame implements ActionListener {
    JLabel text,pinText,reText;
    JTextField pin,rePin;
    JButton change,back;
    Pinchange(String pinchange) {

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemClassLoader().getResource("atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);

        text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250,210,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,18));
        image.add(text);

        pinText = new JLabel("Enter New Pin");
        pinText.setBounds(165,260,200,25);
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(pinText);

        pin = new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(310,260,200,25);
        image.add(pin);

        reText = new JLabel("Re-Enter New Pin");
        reText.setBounds(165,300,200,25);
        reText.setForeground(Color.WHITE);
        reText.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(reText);

        rePin = new JTextField();
        rePin.setFont(new Font("Raleway",Font.BOLD,25));
        rePin.setBounds(310,300,200,25);
        image.add(rePin);

        change = new JButton("CHANGE");
        change.setBounds(160,370,150,25);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(360,370,150,25);
        back.addActionListener(this);
        image.add(back);


        setSize(900,800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        new Pinchange("").setVisible(true);
    }
}
