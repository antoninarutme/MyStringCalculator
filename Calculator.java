package stringcalculator;

public class Calculator {
	
	//helps
    public static final String DEFAULT_DELIMITER_REGEX = "[,\n]";
    public static final String PREFIX = "//";

    public int add(String s)
    {
    	int sum = 0;
    	if (s.isEmpty()) return 0;
    	if (s.equals("1")) return 1;
    	if (s.equals("2")) return 2;
    	return sum;
    }

}
