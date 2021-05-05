package Entities;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class User {
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private String dateOfBirth;
    private Boolean userValidation;

    public User() {
    }

    public User(int id, String userName, String password, String firstName, String lastName, String identityNumber, String dateOfBirth, Boolean userValidation) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
        this.userValidation = userValidation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getUserValidation() {
        return userValidation;
    }

    public void setUserValidation(Boolean userValidation) {
        this.userValidation = userValidation;
    }
}
