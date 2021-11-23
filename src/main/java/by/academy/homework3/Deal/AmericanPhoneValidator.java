package by.academy.homework3.Deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    private static Pattern pattern = Pattern.compile("^\\+1\\d{10}");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
