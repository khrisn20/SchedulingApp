package controller;

import DAO.CountryQuery;
import DAO.FirstLevelDivisionQuery;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Country;
import model.Customer;
import model.FirstLevelDivision;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UpdateCustomerController implements Initializable {
    Stage stage;
    Parent scene;

    @FXML
    private TextField addressTxt;

    @FXML
    private ComboBox<Country> countryDrop;

    @FXML
    private TextField custIdTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField phoneTxt;

    @FXML
    private TextField postalTxt;

    @FXML
    private ComboBox<FirstLevelDivision> stateDrop;

    @FXML
    void OnActionDisplayMainMenu(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void OnActionSaveCustomer(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public void readCustomer(Customer customer){
        custIdTxt.setText(String.valueOf(customer.getCustomer_id()));
        nameTxt.setText(customer.getCustomer_name());
        addressTxt.setText(customer.getAddress());
        postalTxt.setText(customer.getPostal_code());
        phoneTxt.setText(customer.getPhone());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        try {
            countryDrop.setItems(CountryQuery.readAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            stateDrop.setItems(FirstLevelDivisionQuery.readAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
