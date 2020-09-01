package com.ksenia.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserInputConstraintValidator implements ConstraintValidator<UserInput, String> {
    private UserInputValidatorGroup userInputPattern;

    @Override
    public void initialize(UserInput userInput) {
        userInputPattern = userInput.value();
    }

    //import new patterns for user input validation here!
    @Override
    public boolean isValid(String yourInput, ConstraintValidatorContext constraintValidatorContext) {
       boolean result=false;
       if(yourInput != null){
        switch(userInputPattern){
            case LOWER_CASE: result = testLowerCasePattern(yourInput); break;
            case UPPER_CASE: result = testUppercasePattern(yourInput); break;
            case NUMBERS: result = testDigitsPattern(yourInput); break;
            case LOWER_UPPER_CASE_DIGITS: result = testLowerUpperCaseDigitsPattern(yourInput); break;
            case NO_SPACES: result = testNoSpacesPattern(yourInput); break;
            default: break;
        }}else{
           result=true;
       }
        return result;
    }

    //valid if all characters from the input are in lower case, no white space permitted
    private boolean testLowerCasePattern(String input){
        char[] chars = input.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='a' && theChar<='z')){
                return false;
            }
        }return true;
    }

    //valid if all characters from the input are in upper case, no white space permitted
    private boolean testUppercasePattern(String input){
        char[] chars = input.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='A' && theChar<='Z')){
                return false;
            }
        }return true;
    }

    //valid if all characters from the input are decimals, no white space permitted
    private boolean testDigitsPattern(String input){
        char[] chars = input.toCharArray();
        for(char theChar: chars){
            if(!Character.isDigit(theChar)){
                return false;
            }
        }return true;
    }

    //valid if input contains at list 1 of each (lower case, upper case and decimal), no white space permitted
    private boolean testLowerUpperCaseDigitsPattern(String input){
        int lowerCases = 0;
        int upperCases = 0;
        int numbers =0;
        char[] chars = input.toCharArray();
        for(char theChar: chars){
            if(Character.isDigit(theChar)){
                numbers++;
            }else if(Character.isLowerCase(theChar)){
                lowerCases++;
            }else if(Character.isUpperCase(theChar)){
                upperCases++;
            }else{
                return false;
            }
        }
        return lowerCases > 0 && upperCases > 0 && numbers > 0;
    }

    //valid if input doesn't contain white spaces, all type of characters and symbols permitted
    private boolean testNoSpacesPattern(String input){
        char[] chars = input.toCharArray();
        for(char theChar: chars){
            if(Character.isSpaceChar(theChar)){
                return false;
            }
        }return true;
    }

}
