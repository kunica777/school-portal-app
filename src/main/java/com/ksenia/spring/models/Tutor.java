package com.ksenia.spring.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.LinkedHashMap;

public class Tutor{
    private final String title = "tutor";
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String gender;
    private String login;
    private String password;
    private String email;
    private String country;
    private String city;
    private String street;
    private String flatOrHouseNumber;
    private String postcode;

    private LinkedHashMap<String, String> countryOptions;

    public Tutor() {
        //hardcoded version: populate some random country options
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Austria", "Austria");
        countryOptions.put("Belgium","Belgium");
        countryOptions.put("Belarus","Belarus");
        countryOptions.put("Brazil","Brazil");
        countryOptions.put("Bulgaria","Bulgaria");
        countryOptions.put("Canada","Canada");
        countryOptions.put("China","China");
        countryOptions.put("Colombia","Colombia");
        countryOptions.put("Cyprus","Cyprus");
        countryOptions.put("Czechia","Czechia");
        countryOptions.put("Denmark","Denmark");
        countryOptions.put("Egypt","Egypt");
        countryOptions.put("Estonia","Estonia");
        countryOptions.put("Finland","Finland");
        countryOptions.put("France","France");
        countryOptions.put("Germany","Germany");
        countryOptions.put("Greece","Greece");
        countryOptions.put("India","India");
        countryOptions.put("Italy","Italy");
        countryOptions.put("Latvia","Latvia");
        countryOptions.put("Lithuania","Lithuania");
        countryOptions.put("Mexico","Mexico");
        countryOptions.put("Netherlands","Netherlands");
        countryOptions.put("Norway","Norway");
        countryOptions.put("Poland","Poland");
        countryOptions.put("Portugal","Portugal");
        countryOptions.put("Russia","Russia");
        countryOptions.put("Sweden","Sweden");
        countryOptions.put("Switzerland","Switzerland");
        countryOptions.put("Thailand","Thailand");
        countryOptions.put("Turkey","Turkey");
        countryOptions.put("Ukraine","Ukraine");
        countryOptions.put("United Kingdom","United Kingdom");
        countryOptions.put("USA","USA");
    }

    public String getTitle() {
        return title;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
}
