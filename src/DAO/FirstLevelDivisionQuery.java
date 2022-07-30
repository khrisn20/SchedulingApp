package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Country;
import model.FirstLevelDivision;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class FirstLevelDivisionQuery {

    public static ObservableList<FirstLevelDivision> readAll() throws SQLException {
        ObservableList<FirstLevelDivision> aList = FXCollections.observableArrayList();

        String sql = "SELECT * FROM FIRST_LEVEL_DIVISIONS";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int division_id = rs.getInt("Division_ID");
            String division = rs.getString("Division");
            LocalDateTime create_date = rs.getTimestamp("Create_Date").toLocalDateTime();
            String created_by = rs.getString("Created_By");
            Timestamp last_update = rs.getTimestamp("Last_Update");
            String last_updated_by = rs.getString("Last_Updated_By");
            int country_id = rs.getInt("Country_ID");

            FirstLevelDivision firstLevelDivision = new FirstLevelDivision(division_id, division, create_date, created_by, last_update, last_updated_by, country_id);
            aList.add(firstLevelDivision);
        }
        return aList;
    }
}
