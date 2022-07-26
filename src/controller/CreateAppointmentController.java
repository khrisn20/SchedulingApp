package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateAppointmentController implements Initializable {
    Stage stage;
    Parent scene;

    @FXML
    private ChoiceBox<?> contactDrop;

    @FXML
    private TextField customerIDTxt;

    @FXML
    private TextField descTxt;

    @FXML
    private DatePicker endCal;

    @FXML
    private ComboBox<?> endHr;

    @FXML
    private ComboBox<?> endMin;

    @FXML
    private ComboBox<?> endSec;

    @FXML
    private ChoiceBox<?> locCountryDrop;

    @FXML
    private ChoiceBox<?> locDivDrop;

    @FXML
    private DatePicker startCal;

    @FXML
    private ComboBox<?> startHr;

    @FXML
    private ComboBox<?> startMin;

    @FXML
    private ComboBox<?> startSec;

    @FXML
    private TextField titleTxt;

    @FXML
    private ChoiceBox<?> typeDrop;

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

    }
}