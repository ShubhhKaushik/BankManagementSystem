import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements  ActionListener {
    long random;
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton yes,no,syes,sno;
    JComboBox religion,category,income,occupation,educate;
    String formno;

    SignUp2(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel  l1 = new JLabel("Page 2: Additional Details:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290, 60, 400, 30);
        add(l1);

        JLabel l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(100, 120, 100, 30);
        add(l2);

        String[] valReligion = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,120,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 170, 200, 30);
        add(l3);

        String[] valCategory = {"General","OBC","SC","ST"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 170, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 220, 200, 30);
        add(l4);

        String[] valIncome = {"Null","<1,50,000","<2,50,000","<5,00,000","<7,50,000","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 220, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100, 270, 200, 30);
        add(l5);

        JLabel l6 = new JLabel("Qualification:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 315, 200, 30);
        add(l6);

        String[] educationalval = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        educate = new JComboBox(educationalval);
        educate.setBounds(300, 315, 400, 30);
        educate.setBackground(Color.WHITE);
        add(educate);


        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 370, 200, 30);
        add(l7);

        String[] occupationVal = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(occupationVal);
        occupation.setBounds(300, 370, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 420, 200, 30);
        add(l8);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 420, 400, 30);
        add(panTextField);


        JLabel l9 = new JLabel("Aadhaar Number:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100, 470, 200, 30);
        add(l9);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 470, 400, 30);
        add(aadharTextField);


        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100, 520, 200, 30);
        add(l10);

        yes = new JRadioButton("Yes");
        yes.setBounds(300, 520, 60, 30);
        yes.setBackground(Color.WHITE);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(400, 520, 120, 30);
        no.setBackground(Color.WHITE);
        add(no);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yes);
        seniorGroup.add(no);


        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 570, 200, 30);
        add(l11);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 570, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 570, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup ExistGroup = new ButtonGroup();
        ExistGroup.add(syes);
        ExistGroup.add(sno);


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

    public SignUp2(JLabel formno) {
    }

    public void actionPerformed(ActionEvent e) {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducate = (String)educate.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();

        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen = "Yes";
        }else if(no.isSelected()){
            seniorcitizen = "No";
        }
        String exist = null;
        if(syes.isSelected()){
            exist = "Yes";
        }else if(sno.isSelected()){
            exist = "No";
        }
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        try{
                conn c = new conn();

            String query = "insert into signUp2 values(',"+sreligion+", "+sincome+", "+scategory+", "+seducate+", "+soccupation+", "+seniorcitizen+", "+exist+", "+pan+", "+aadhar+"')";
                c.s.executeUpdate(query);


        }catch(Exception ex){
            System.out.println(ex);
        }


    }



    public static void main(String[] args) {
        new SignUp2("").setVisible(true);
    }
}