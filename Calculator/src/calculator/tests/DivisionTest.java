package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.library.Calculator;
import utils.AppUtils;

public class DivisionTest extends AppUtils 
{

	@Parameters({"v1","v2"})
	@Test
	public void checkDivision(int value1,int value2) throws InterruptedException
	{
		
		Calculator calc = new Calculator();
		boolean res =  calc.division(value1, value2);
		Assert.assertTrue(res);
	}
	
	
	
}
