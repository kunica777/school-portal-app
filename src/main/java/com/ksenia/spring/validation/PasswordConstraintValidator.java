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
            case LOWER_CASE: result = testLowerCapitalsPattern(yourPassword); break;
            case UPPER_CASE: result = testUpperCapitalsPattern(yourPassword); break;
            case NUMBERS: result = testNumbersPattern(yourPassword); break;
            case LOWER_UPPER_CASE_NUMBERS: result = testLowerUpperCapitalsNumbersPattern(yourPassword); break;
            case NO_SPACES: result = testNoSpacesPattern(yourPassword); break;
            default: break;
        }
        return result;
    }

    //test lower capitals pattern
    private boolean testLowerCapitalsPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='a' && theChar<='z')){
                return false;
            }
        }return true;
    }

    //test upper capitals pattern
    private boolean testUpperCapitalsPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!(theChar>='A' && theChar<='Z')){
                return false;
            }
        }return true;
    }

    //test numbers pattern
    private boolean testNumbersPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(!Character.isDigit(theChar)){
                return false;
            }
        }return true;
    }

    //test lower upper capitals and numbers pattern
    private boolean testLowerUpperCapitalsNumbersPattern(String password){
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

    //test no spaces pattern
    private boolean testNoSpacesPattern(String password){
        char[] chars = password.toCharArray();
        for(char theChar: chars){
            if(Character.isSpaceChar(theChar)){
                return false;
            }
        }return true;
    }

}
