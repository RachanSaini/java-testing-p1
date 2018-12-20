package com.stackroute;
import java.util.regex.Pattern;

public class CharType {
    public String charType(String s)

    {
        if (Pattern.matches("[a-z]", s)) {
            return("Small letter.");
        } else if (Pattern.matches("[A-Z]", s)) {
            return("Capital letter.");
        } else if (Pattern.matches("[0-9]", s)) {
            return("Digit.");
        } else if (Pattern.matches("[^A-Za-z0-9]", s)) {
            return("Special character.");
        }else{
            return ("false");
        }
    }
}
