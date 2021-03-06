package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	//helps
    public static final String DEFAULT_DELIMITER_REGEX = "[,\n]";
    public static final String PREFIX = "//";

    public int add(String s) {
        //check empty string
    	if (s.isEmpty()) return 0;
        //parameters for the loop
    	String delimiter;
        String numbers;
        if (s.startsWith(PREFIX)) {
            //Support different delimiters
        	delimiter = s.substring(PREFIX.length(), PREFIX.length() + 1);
            numbers = s.substring(s.indexOf('\n') + 1);
        } else {
            delimiter = DEFAULT_DELIMITER_REGEX;
            numbers = s;
        }
        //getting a sum
        String[] strings = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<Integer>();
        for (String string : strings) {
            int n = Integer.parseInt(string);
            if (n < 0) negatives.add(n);
            sum += n;
        }
        //the exception check
        if (!negatives.isEmpty()) {
            throw new NumberFormatException("negatives not allowed " + negatives);
        }

        return sum;
    }

}
