package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Contact;
import model.Country;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class CountryQuery {
    public static ObservableList<Country> readAll() throws SQLException {
        ObservableList<Country> aList = FXCollections.observableArrayList();

        String sql = "SELECT * FROM COUNTRIES";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int country_id = rs.getInt("Country_ID");
            String country = rs.getString("Country");
            LocalDateTime create_date = rs.getTimestamp("Create_Date").toLocalDateTime();
            String created_by = rs.getString("Created_By");
            Timestamp last_update = rs.getTimestamp("Last_Update");
            String last_updated_by = rs.getString("Last_Updated_By");

            Country country1 = new Country(country_id, country, create_date, created_by, last_update, last_updated_by);
            aList.add(country1);
        }
        return aList;
    }
}
