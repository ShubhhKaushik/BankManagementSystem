import java.sql.*;
public class test {

    public class TestConnection {
        public static void main(String[] args) {
            try {
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "yourPassword");
                System.out.println("Connected successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
