package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.library.Calculator;
import utils.AppUtils;

public class MultiplicationTest extends AppUtils 
{

	@Parameters({"v1","v2"})
	@Test
	public void checkMultiplication(int value1,int value2) throws Exception
	{
		Calculator calc = new Calculator();
		boolean res = calc.multiply(value1, value2);
		Assert.assertTrue(res);
		
	}
	
	
}
