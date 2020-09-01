package com.ksenia.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UserInputConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserInput {

    //define the attributes
    UserInputValidatorGroup value() default UserInputValidatorGroup.NO_SPACES;

    //define default error message
    String message() default "Invalid input";

    //define default groups
    Class<?>[] groups () default {};

    //define default payloads
    Class<? extends Payload>[] payload () default{};
}
