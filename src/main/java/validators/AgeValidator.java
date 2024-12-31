package validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;
@Slf4j
public class AgeValidator implements ConstraintValidator<AgeValidation, Integer> {

    private Set<Integer> inValidValues;

    @Override
    public void initialize(AgeValidation constraintAnnotation) {
        // Optional: Initialize any resources or configurations here
        log.info("Initialize AgeValidator");
        inValidValues  = loadInValidValues();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null || inValidValues.contains(value)) {
            return false; // Adjust as per your logic
        }
        // Add custom validation logic here
        return value > 15;
    }

    private Set<Integer> loadInValidValues() {
        // Imagine fetching valid values from a database or an API
        return Set.of(100, 110, 120, 130, 140, 150);
    }
}
