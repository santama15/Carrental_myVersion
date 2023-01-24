package com.sda.carrental.web.mvc.form.validation.constraint;

import com.sda.carrental.web.mvc.form.validation.validator.CorrectChronologyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {CorrectChronologyValidator.class})
public @interface CorrectChronology {
    String message() default "{com.sda.carrental.web.mvc.form.validation.constraints.CorrectChronology.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
