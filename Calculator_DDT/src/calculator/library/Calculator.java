package calculator.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class Calculator extends AppUtils
{

	
	public boolean sum(int a,int b) throws InterruptedException
	{
		
		int expvalue,actvalue;
		expvalue=a+b;
		
		clickCalcButtons(a);		
		driver.findElement(By.xpath("//input[@value='+']")).click();		
		clickCalcButtons(b);		
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		actvalue=Integer.parseInt(driver.findElement(By.name("display")).getAttribute("value"));
		Thread.sleep(5000);
		clear();
		if(actvalue==expvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public boolean subtract(int a,int b) throws InterruptedException
	{
		
		int expvalue,actvalue;
		expvalue=a-b;
		
		clickCalcButtons(a);		
		driver.findElement(By.xpath("//input[@value='-']")).click();		
		clickCalcButtons(b);		
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		actvalue=Integer.parseInt(driver.findElement(By.name("display")).getAttribute("value"));
		Thread.sleep(5000);
		clear();
		if(actvalue==expvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean multiply(int a,int b) throws InterruptedException
	{
		
		int expvalue,actvalue;
		expvalue=a*b;
		
		clickCalcButtons(a);		
		driver.findElement(By.xpath("//input[@value='x']")).click();		
		clickCalcButtons(b);		
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		actvalue=Integer.parseInt(driver.findElement(By.name("display")).getAttribute("value"));
		Thread.sleep(5000);
		clear();
		if(actvalue==expvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean division(int a,int b) throws InterruptedException
	{
		
		int expvalue,actvalue;
		expvalue=a/b;
		
		clickCalcButtons(a);		
		driver.findElement(By.xpath("//input[@value='/']")).click();		
		clickCalcButtons(b);		
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		actvalue=Integer.parseInt(driver.findElement(By.name("display")).getAttribute("value"));
		Thread.sleep(5000);
		clear();
		if(actvalue==expvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void clickCalcButtons(int value)
	{
		String strval = Integer.toString(value);
		int count = strval.length();
		for(int i=0;i<count;i++)
		{
			char num = strval.charAt(i);
			driver.findElement(By.xpath("//input[@value='"+num+"']")).click();
		}		
	}
	
	public void clear()
	{
		driver.findElement(By.xpath("//input[@value='C']")).click();
	}
	
	
	
}
