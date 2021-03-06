package controller;

import DAO.ContactQuery;
import DAO.CountryQuery;
import DAO.FirstLevelDivisionQuery;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Contact;
import model.Country;
import model.FirstLevelDivision;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class CreateAppointmentController implements Initializable {
    Stage stage;
    Parent scene;

    @FXML
    private ComboBox<Contact> contactDrop;

    @FXML
    private TextField customerIDTxt;

    @FXML
    private TextField descTxt;

    @FXML
    private DatePicker endCal;

    @FXML
    private ComboBox<LocalDateTime> endHr;

    @FXML
    private ComboBox<LocalDateTime> endMin;

    @FXML
    private ComboBox<LocalDateTime> endSec;

    @FXML
    private ComboBox<Country> locCountryDrop;

    @FXML
    private ComboBox<FirstLevelDivision> locDivDrop;

    @FXML
    private DatePicker startCal;

    @FXML
    private ComboBox<LocalDateTime> startHr;

    @FXML
    private ComboBox<LocalDateTime> startMin;

    @FXML
    private ComboBox<LocalDateTime> startSec;

    @FXML
    private TextField titleTxt;

    @FXML
    private ComboBox<?> typeDrop;

    @FXML
    private TextField userIDtxt;

    @FXML
    void OnActionDisplayMainMenu(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void OnActionSaveAppointment(ActionEvent event) throws IOException {
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){

        try {
            contactDrop.setItems(ContactQuery.readAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            locCountryDrop.setItems(CountryQuery.readAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            locDivDrop.setItems(FirstLevelDivisionQuery.readAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
