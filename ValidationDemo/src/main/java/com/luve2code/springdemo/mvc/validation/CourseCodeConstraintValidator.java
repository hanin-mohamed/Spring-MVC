package com.luve2code.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix=courseCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {
        boolean res;
        if (code!=null)
         res=code.startsWith(coursePrefix);
       else
           res= true;

        return res;
    }


}
