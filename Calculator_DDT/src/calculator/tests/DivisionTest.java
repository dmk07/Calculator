package calculator.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.library.Calculator;
import utils.AppUtils;
import utils.XLUtils;

public class DivisionTest extends AppUtils
{

	
	@Test
	public void checkAddition() throws IOException, InterruptedException
	{
		
		String datafile="C:\\Selenium930\\Calculator_DDT\\testdatafiles\\Testdata.xlsx";
		String datasheet="DivisionData";
		
		int rowcount = XLUtils.getRowCount(datafile, datasheet);
		
		Calculator calc = new Calculator();
		for(int i=1;i<=rowcount;i++)
		{
 			double v1 = XLUtils.getNumerciCellData(datafile, datasheet, i, 0);
 			double v2 = XLUtils.getNumerciCellData(datafile, datasheet, i, 1);
 			
 			int a=(int)v1;
 			int b=(int)v2; 							
 			boolean res= calc.division(a, b);
 			Assert.assertTrue(res);
 			if(res)
 			{
 				XLUtils.setCellData(datafile, datasheet, i, 2, "Pass");
 				XLUtils.fillGreenColor(datafile, datasheet, i, 2);
 			}else
 			{
 				XLUtils.setCellData(datafile, datasheet, i, 2, "Fail");
 				XLUtils.fillRedColor(datafile, datasheet, i, 2);
 			}
 			calc.clear();
		}
		
	}
	
	
	
}
