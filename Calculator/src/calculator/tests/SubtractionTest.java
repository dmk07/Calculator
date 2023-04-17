package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.library.Calculator;
import utils.AppUtils;

public class SubtractionTest extends AppUtils 
{

	@Parameters({"v1","v2"})
	@Test
	public void checkSubtract(int value1,int value2) throws InterruptedException
	{
		Calculator calc = new Calculator();
		boolean res=  calc.subtract(value1, value2);
		Assert.assertTrue(res);
	}
	
	
	
}
