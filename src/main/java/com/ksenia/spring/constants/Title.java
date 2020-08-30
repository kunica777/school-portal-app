package com.ksenia.spring.constants;

import java.util.LinkedList;

public enum Title {
    DR("Dr"),
    MS("Ms"),
    MRS("Mrs"),
    MR("Mr");

    public final String value;

    private Title(String value){
        this.value=value;
    }

    public static LinkedList<String> getAllTitles(){
        LinkedList<String> titles = new LinkedList<>();
        for(Title title: Title.values()){
            titles.add(title.value);
        }return titles;
    }
}

