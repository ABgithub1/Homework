package by.academy.homework3.Deal;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
