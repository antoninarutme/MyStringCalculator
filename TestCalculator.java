package stringcalculator;

import static junit.framework.Assert.assertEquals;
//import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	
	private final Calculator calculator = new Calculator();

    @SuppressWarnings("deprecation")
	@Test
    public void shouldReturnZeroWhenEmptyString()  {
    	//act//
    	int act = calculator.add("");
    	//assert
    	assertEquals(0, act);
    }

}
