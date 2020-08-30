package com.ksenia.spring.constants;

import java.util.LinkedList;
import java.util.Locale;

public class Countries {

    public Countries() {
    }

    private LinkedList<String> createCountries(){
        String[] locales = Locale.getISOCountries();
        LinkedList<String> countryList = new LinkedList<>();
        for (String country : locales) {
            Locale obj = new Locale("", country);
            countryList.add(obj.getDisplayCountry());
        }return countryList;
    }

    public LinkedList<String> getCountries(){
        return createCountries();
    }
}
