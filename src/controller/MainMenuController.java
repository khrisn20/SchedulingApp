package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Appointment;
import model.Country;
import model.Customer;
import model.FirstLevelDivision;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    Stage stage;
    Parent scene;

    @FXML
    private TableView<Customer> custTableview;

    @FXML
    private TableColumn<Customer, Integer> custIdClmn;

    @FXML
    private TableColumn<Customer, String> nameClmn;

    @FXML
    private TableColumn<Customer, String> addressClmn;

    @FXML
    private TableColumn<Country, String> countryClmn;

    @FXML
    private TableColumn<FirstLevelDivision, String> stateClmn;

    @FXML
    private TableColumn<Customer, String> postalClmn;

    @FXML
    private TableColumn<Customer, String> phoneClmn;



    @FXML
    private TableView<Appointment> appTableview;

    @FXML
    private TableColumn<Appointment, Integer> appIdClmn;

    @FXML
    private TableColumn<Appointment, String> titleClmn;

    @FXML
    private TableColumn<Appointment, Integer> appCustIdClmn;

    @FXML
    private TableColumn<Appointment, Integer> contactIdClmn;

    @FXML
    private TableColumn<Appointment, String> descClmn;

    @FXML
    private TableColumn<Appointment, String> locClmn;

    @FXML
    private TableColumn<Appointment, String> typeClmn;

    @FXML
    private TableColumn<Appointment, LocalDateTime> startClmn;

    @FXML
    private TableColumn<Appointment, LocalDateTime> endClmn;




    @FXML
    void OnActionDisplayCreateAppointment(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/CreateAppointment.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void OnActionDisplayCreateCustomer(ActionEvent event) throws IOException {
            stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/view/CreateCustomer.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();
    }

    @FXML
    void OnActionDisplayUpdateAppointment(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/UpdateAppointment.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void OnActionDisplayUpdateCustomer(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/UpdateCustomer.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
