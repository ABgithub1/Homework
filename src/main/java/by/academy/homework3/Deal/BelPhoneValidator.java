package by.academy.homework3.Deal;

import java.util.regex.Pattern;

public class BelPhoneValidator implements Validator {

    private static Pattern pattern = Pattern.compile("(^\\+375|80)((29)|(33)|(25)|(44))[0-9]{7}");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
