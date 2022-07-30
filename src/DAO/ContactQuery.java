package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Appointment;
import model.Contact;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ContactQuery {

    public static ObservableList<Contact> readAll() throws SQLException {
        ObservableList<Contact> aList = FXCollections.observableArrayList();

        String sql = "SELECT * FROM CONTACTS";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int contact_id = rs.getInt("Contact_ID");
            String contact_name = rs.getString("Contact_Name");
            String email = rs.getString("Email");

            Contact contact = new Contact(contact_id, contact_name, email);
            aList.add(contact);
        }
        return aList;
    }
}
