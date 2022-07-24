package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class AppointmentQuery {

    public static int create(int appointment_id, String title, String description, String location, String type, Date start, Date end, Date created_date, String created_by, Timestamp last_updated, int customer_id, int user_id, int contact_id) throws SQLException {
        String sql = "INSERT INTO APPOINTMENTS (Title, Description, Location, Type, Start, End, Create_Date, Created_By, Last_Update, Last_Updated_By, Customer_ID, User_ID, Contact_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, location);
        ps.setString(4, type);
        ps.setDate(5, start);
        ps.setDate(6, end);
        ps.setDate(7, created_date);
        ps.setString(8, created_by);
        ps.setTimestamp(9, last_updated);
        ps.setInt(10, customer_id);
        ps.setInt(11, user_id);
        ps.setInt(12, contact_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }

    public static int update(int appointment_id, String title, String description, String location, String type, Date start, Date end, Date created_date, String created_by, Timestamp last_updated, int customer_id, int user_id, int contact_id) throws SQLException {
        String sql = "UPDATE APPOINTMENTS SET Title = ?, Description = ?, Location = ?, Type = ?, Start = ?, End = ?, Create_Date = ?, Created_By = ?, Last_Update = ?, Last_Updated_By = ?, Customer_ID = ?, User_ID = ?, Contact_ID = ?  WHERE Appointments_ID = ?";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, location);
        ps.setString(4, type);
        ps.setDate(5, start);
        ps.setDate(6, end);
        ps.setDate(7, created_date);
        ps.setString(8, created_by);
        ps.setTimestamp(9, last_updated);
        ps.setInt(10, customer_id);
        ps.setInt(11, user_id);
        ps.setInt(12, contact_id);
        ps.setInt(13, appointment_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }

    public static int delete(int appointment_id) throws SQLException {
        String sql = "DELETE FROM APPOINTMENTS WHERE Appointment_ID =?";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setInt(1, appointment_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }
}
