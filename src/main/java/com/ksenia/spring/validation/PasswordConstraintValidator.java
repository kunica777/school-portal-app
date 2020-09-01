package com.ksenia.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {
    private PasswordValidatorGroup passwordPattern;

    @Override
    public void initialize(Password password) {
        passwordPattern = password.value();
    }

    @Override
    public boolean isValid(String yourPassword, ConstraintValidatorContext constraintValidatorContext) {
       boolean result=false;
        switch(passwordPattern){
            case LOWER_CASE: result = testLowerCasePattern(yourPassword); break;
            case UPPER_CASE: result = testUppercasePattern(yourPassword); break;
            case NUMBERS: result = testNumbersPattern(yourPassword); break;
            case LOWER_UPPER_CASE_NUMBERS: result = testLowerUpperCaseNumbersPattern(yourPassword); break;
            case NO_SPACES: result = testNoSpacesPattern(yourPassword); break;
            default: break;
        }
        return result;
    }

    //valid if all characters from the password are in lower case, no white space permitted
    private boolean testLowerCasePattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='a' && theChar<='z')){
                return false;
            }
        }return true;
    }

    //valid if all characters from the password are in upper case, no white space permitted
    private boolean testUppercasePattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='A' && theChar<='Z')){
                return false;
            }
        }return true;
    }

    //valid if all characters from the password are decimals, no white space permitted
    private boolean testNumbersPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!Character.isDigit(theChar)){
                return false;
            }
        }return true;
    }

    //valid if password contains at list 1 of each (lower case, upper case and decimal), no white space permitted
    private boolean testLowerUpperCaseNumbersPattern(String password){
        int lowerCases = 0;
        int upperCases = 0;
        int numbers =0;
        char[] chars = password.toCharArray();
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
        }if(lowerCases>0 && upperCases>0 && numbers>0){
            return true;
        }
        return false;
    }

    //valid if password doesn't contain white spaces, all type of characters and symbols permitted
    private boolean testNoSpacesPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(Character.isSpaceChar(theChar)){
                return false;
            }
        }return true;
    }

}
