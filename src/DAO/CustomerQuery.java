package DAO;

import model.Customer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class CustomerQuery {
    public static int create(int customer_id, String customer_name, String address, String postal_code, String phone, Date create_date, String created_by, Timestamp last_update, String last_updated_by, int division_id) throws SQLException {
        String sql = "INSERT INTO CUSTOMERS (Customer_Name, Address, Postal_Code, Phone, Create_Date, Created_By, Last_Update, Last_Updated_By, Division_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setInt(1, customer_id);
        ps.setString(2, customer_name);
        ps.setString(3, address);
        ps.setString(4, postal_code);
        ps.setString(5, phone);
        ps.setDate(6, create_date);
        ps.setString(7, created_by);
        ps.setTimestamp(8, last_update);
        ps.setString(9, last_updated_by);
        ps.setInt(10, division_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }
}
