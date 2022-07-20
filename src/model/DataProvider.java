package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProvider {

    private static ObservableList<Appointment> allAppointments = FXCollections.observableArrayList();

    public static void addAppointment(Appointment appointment){
        allAppointments.add(appointment);
    }

    public static ObservableList<Appointment> getAllAppointments(){
        return allAppointments;
    }

    private static ObservableList<Contact> allContacts = FXCollections.observableArrayList();

    public static void addContact(Contact contact){
        allContacts.add(contact);
    }

    public static ObservableList<Contact> getAllContacts(){
        return allContacts;
    }

    private static ObservableList<Customer> allCustomers = FXCollections.observableArrayList();

    public static void addCustomer(Customer customer){
        allCustomers.add(customer);
    }

    public static ObservableList<Customer> getAllCustomers(){
        return allCustomers;
    }

    private static ObservableList<User> allUsers = FXCollections.observableArrayList();

    public static void addUser(User user){
        allUsers.add(user);
    }

    public static ObservableList<User> getAllUsers(){
        return allUsers;
    }

    private static ObservableList<Country> allCountries = FXCollections.observableArrayList();

    public static ObservableList<Country> getAllCountries() {
        return allCountries;
    }

    private static ObservableList<FirstLevelDivision> allFirstLevelDivisions = FXCollections.observableArrayList();

    public static ObservableList<FirstLevelDivision> getAllFirstLevelDivisions(){
            return allFirstLevelDivisions;
    }

}
