package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Appointment;

import java.sql.*;
import java.time.LocalDateTime;

public class AppointmentQuery {

    public static int create(int appointment_id, String title, String description, String location, String type, LocalDateTime start, LocalDateTime end, LocalDateTime created_date, String created_by, Timestamp last_updated, int customer_id, int user_id, int contact_id) throws SQLException {
        String sql = "INSERT INTO APPOINTMENTS (Title, Description, Location, Type, Start, End, Create_Date, Created_By, Last_Update, Last_Updated_By, Customer_ID, User_ID, Contact_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, location);
        ps.setString(4, type);
        ps.setTimestamp(5, Timestamp.valueOf(start));
        ps.setTimestamp(6, Timestamp.valueOf(end));
        ps.setTimestamp(7, Timestamp.valueOf(created_date));
        ps.setString(8, created_by);
        ps.setTimestamp(9, last_updated);
        ps.setInt(10, customer_id);
        ps.setInt(11, user_id);
        ps.setInt(12, contact_id);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }

    public static int update(int appointment_id, String title, String description, String location, String type, LocalDateTime start, LocalDateTime end, LocalDateTime created_date, String created_by, Timestamp last_updated, int customer_id, int user_id, int contact_id) throws SQLException {
        String sql = "UPDATE APPOINTMENTS SET Title = ?, Description = ?, Location = ?, Type = ?, Start = ?, End = ?, Create_Date = ?, Created_By = ?, Last_Update = ?, Last_Updated_By = ?, Customer_ID = ?, User_ID = ?, Contact_ID = ?  WHERE Appointments_ID = ?";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, location);
        ps.setString(4, type);
        ps.setTimestamp(5, Timestamp.valueOf(start));
        ps.setTimestamp(6, Timestamp.valueOf(end));
        ps.setTimestamp(7, Timestamp.valueOf(created_date));
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
            LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
            LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();
        }
    }

    public static ObservableList<Appointment> readAll() throws SQLException {
        ObservableList<Appointment> aList = FXCollections.observableArrayList();

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
            LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
            LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();
            int user_id = rs.getInt("User_ID");

            Appointment appointment = new Appointment(appointment_id, title, description, location, type, start, end, customer_id, user_id, contact_id);
            aList.add(appointment);
        }
        return aList;
    }
}
