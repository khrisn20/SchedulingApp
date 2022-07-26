package DAO;

import java.sql.*;
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
        String sql = "DELETE FROM APPOINTMENTS WHERE Appointment_ID = ?";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setInt(1, appointment_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }

    public static void read(int selected_appointment_id) throws SQLException {
        String sql = "SELECT * FROM APPOINTMENTS WHERE Appointment_ID = ?";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setInt(1, selected_appointment_id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            int appointment_id = rs.getInt("Appointment_ID");
            int customer_id = rs.getInt("Customer_ID");
            int user_id = rs.getInt("User_ID");
            String title = rs.getString("Title");
            String description = rs.getString("Description");
            String location = rs.getString("Location");
            int contact_id = rs.getInt("Contact_ID");
            String type = rs.getString("Type");
            Date start = rs.getDate("Start");
            Date end = rs.getDate("End");
        }
    }

    public static void readAll() throws SQLException {
        String sql = "SELECT * FROM APPOINTMENTS";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int appointment_id = rs.getInt("Appointment_ID");
            String title = rs.getString("Title");
            int customer_id = rs.getInt("Customer_ID");
            int contact_id = rs.getInt("Contact_ID");
            String description = rs.getString("Description");
            String location = rs.getString("Location");
            String type = rs.getString("Type");
            Date start = rs.getDate("Start");
            Date end = rs.getDate("End");
            int user_id = rs.getInt("User_ID");
        }


    }
}
