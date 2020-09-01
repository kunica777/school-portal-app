package com.ksenia.spring.models;

import com.ksenia.spring.constants.Countries;
import com.ksenia.spring.constants.EducationLevel;
import com.ksenia.spring.constants.Title;
import com.ksenia.spring.validation.UserInput;
import com.ksenia.spring.validation.UserInputValidatorGroup;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.LinkedList;

public class User {
    //user attributes
    private String title;
    @UserInput()
    private String firstName;
    @UserInput()
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String gender;
    @UserInput()
    private String login;
    @UserInput(value = UserInputValidatorGroup.LOWER_UPPER_CASE_DIGITS, message = "a-z + A-Z + 0-9 expected")
    private String password;
    private String email;
    @UserInput(value = UserInputValidatorGroup.NUMBERS, message = "digits expected")
    private String phoneNumber;
    private String country;
    private String courseName;
    private String educationLevel;

    //external collections attributes
    private final LinkedList<String> titlesList;
    private final LinkedList<String> countriesList;
    private final LinkedList<String> levelsList;

    public User() {
        titlesList = Title.getAllTitles();
        countriesList = new Countries().getCountries();
        levelsList = EducationLevel.getAllLevels();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public LinkedList<String> getTitlesList() {
        return titlesList;
    }

    public LinkedList<String> getCountriesList() {
        return countriesList;
    }

    public LinkedList<String> getLevelsList() {
        return levelsList;
    }
}
