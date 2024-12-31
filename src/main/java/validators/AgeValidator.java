package validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<AgeValidation, Integer> {

    @Override
    public void initialize(AgeValidation constraintAnnotation) {
        // Optional: Initialize any resources or configurations here
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return false; // Adjust as per your logic
        }
        // Add custom validation logic here
        return value > 15;
    }
}
