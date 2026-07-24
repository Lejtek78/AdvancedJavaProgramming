package j8.jdbc.my_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankService {

    private static Connection con;
    private static BankService bank;

    static void main() {
        bank = new BankService();
    }

    public BankService() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "lejtek", "mao04121178");
            System.out.println("DB connection established!");
        } catch (SQLException e) {
            System.err.println("Exception.");
            e.printStackTrace();
        }
    }

}
