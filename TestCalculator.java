package stringcalculator;

import static junit.framework.Assert.assertEquals;
//import static org.junit.Assert.*;




import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCalculator {
	
	@Rule
	public ExpectedException ex = ExpectedException.none();

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
       	assertEquals(3,act);
       }
    
    @Test
    public void shouldReturnSumOfThreeNumbers() {
        //act
    	int act = calculator.add("1,2,3");
    	//assert
    	assertThat(act, is(6));
    }
    
    @SuppressWarnings("deprecation")
   	@Test
       public void shouldAllowNewLineAsDelimiter() {
           //act
       	int act = calculator.add("1\n2,3");
       	//assert
       	assertEquals(6, act);
       }
    
    @SuppressWarnings("deprecation")
	@Test
    public void shouldSupportDifferentDelimiters() {
        //act
    	int act = calculator.add("//;\n1;2");
    	assertEquals(3, act);
    }
    
    @Test
    public void shouldThrowExceptionWhenNegative() {
        ex.expect(NumberFormatException.class);
        ex.expectMessage("negatives not allowed");
        calculator.add("1,-2");
    }
    
    @Test
    public void shouldThrowExceptionContainingAllNegatives() {
        ex.expectMessage("-2");
        ex.expectMessage("-3");
        calculator.add("1,-2,-3");
    }

}
