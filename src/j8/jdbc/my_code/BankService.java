package j8.jdbc.my_code;

import java.sql.*;

public class BankService {

    private static Connection con;
    private static BankService bank;

    static void main() {
        bank = new BankService();

        bank.retrieveOne();
        System.out.println();
//        bank.retrieveAll();

    }

    private void retrieveOne() {
        System.out.println(bank.getAccountDetails("123456", "12345678"));
    }

    private BankAccount getAccountDetails(String branchCode, String accountNumber) {
        String selectSQL = "SELECT * FROM bank_db.bank_table WHERE (branch_code = ? AND account_number = ?)";
        BankAccount bankAccount = null;

        try (PreparedStatement ps = con.prepareStatement(selectSQL)) {
            ps.setString(1, branchCode);
            ps.setString(2, accountNumber);

            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                return bankAccount;
            }

            bankAccount = new BankAccount(
                    rs.getString("branch_code"),
                    rs.getString(2),
                    rs.getString("cust_name"),
                    rs.getString("cust_address"),
                    rs.getDouble("balance"));

        } catch (SQLException sqle) {
            System.err.println("SqlException in getAccountDetails()");
            sqle.printStackTrace();
        }

        return bankAccount;
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
