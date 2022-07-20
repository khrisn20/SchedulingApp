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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    Stage stage;
    Parent scene;

    @FXML
    private TableColumn<?, ?> addressClmn;

    @FXML
    private TableColumn<?, ?> appIdClmn;

    @FXML
    private TableView<?> appTableview;

    @FXML
    private TableColumn<?, ?> contactIdClmn;

    @FXML
    private TableColumn<?, ?> custIdClmn;

    @FXML
    private TableView<?> custTableview;

    @FXML
    private TableColumn<?, ?> descClmn;

    @FXML
    private TableColumn<?, ?> dividClmn;

    @FXML
    private TableColumn<?, ?> endClmn;

    @FXML
    private TableColumn<?, ?> locClmn;

    @FXML
    private TableColumn<?, ?> nameClmn;

    @FXML
    private TableColumn<?, ?> phoneClmn;

    @FXML
    private TableColumn<?, ?> postalClmn;

    @FXML
    private TableColumn<?, ?> startClmn;

    @FXML
    private TableColumn<?, ?> titleClmn;

    @FXML
    private TableColumn<?, ?> typeClmn;

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
