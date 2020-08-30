package com.ksenia.spring.constants;

import java.util.LinkedList;

public enum EducationLevel {
    NONE("none"),
    PRIMARY_SCHOOL("primary school"),
    SECONDARY_SCHOOL("secondary school"),
    LEVEL1("level 1"),
    LEVEL2("level 2"),
    LEVEL3("level 3"),
    ASSOCIATE("associate"),
    BACHELOR("bachelor's"),
    MASTER("master's"),
    DOCTOR("doctoral"),
    INCOGNITO("prefer not to say");

    public final String value;

    EducationLevel(String value){
        this.value=value;
    }

    public static LinkedList<String> getAllLevels(){
        LinkedList<String> levels = new LinkedList<>();
        for(EducationLevel level: EducationLevel.values()){
            levels.add(level.value);
        }return levels;
    }
}
