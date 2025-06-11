import java.sql.*;
public class conn {

    Connection c;
    Statement s;

    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","QWERTY@12345");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {

    }

}
