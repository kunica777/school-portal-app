package com.ksenia.spring.models;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public class Student{

    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String gender;
    private String login;
    private String password;
    private String email;
    private String countryCode;
    private String city;
    private String street;
    private String flatOrHouseNumber;
    private String postcode;

    //TODO: fix import of country options into spring (below)
    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.putAll(createListOfCountries());
    }

    public String getTitle() {
        return "student";
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

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountry(){
        return countryOptions.get(countryCode);
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlatOrHouseNumber() {
        return flatOrHouseNumber;
    }

    public void setFlatOrHouseNumber(String flatOrHouseNumber) {
        this.flatOrHouseNumber = flatOrHouseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private HashMap<String, String> createListOfCountries(){
        String[] locales = Locale.getISOCountries();
        HashMap<String, String> countryList = new HashMap<>();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            countryList.put(obj.getCountry(),obj.getDisplayCountry());
        }return countryList;
    }
}
