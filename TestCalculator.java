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
    
    @SuppressWarnings("deprecation")
	@Test
    public void shouldReturnTheSameNumber1() {
    	//act
    	int act = calculator.add("1");
    	//assert
    	assertEquals(1,act);
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void shouldReturnTheSameNumber2() {
    	//act
    	int act = calculator.add("2");
    	//assert
    	assertEquals(2,act);
    }
    
    @SuppressWarnings("deprecation")
   	@Test
       public void shouldReturnSumOfTwoNumbers() {
           //act
       	int act = calculator.add("1,2");
       	//assert
       	assertEquals(5,act);
       }

}
