package com.ksenia.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {

    //define the attributes
    PasswordValidatorGroup value() default PasswordValidatorGroup.LOWER_UPPER_CASE_NUMBERS;

    //define default error message
    String message() default "must contain small, capital letters and numbers";

    //define default groups
    Class<?>[] groups () default {};

    //define default payloads
    Class<? extends Payload>[] payload () default{};
}
