package com.sgtesting.javascripting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemFromDropDownDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		selectItemFromDropDownDemo();
		showItemsFromDropDownDemo();
		selectItemsFromDropDownBasedOnPartialItemName();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\AutomationProtoTypemodel\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file://E://Manual_Testing//javascriptexecutor_dropdown//Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void selectItemFromDropDownDemo()
	{
		try
		{
			WebElement oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
			oSelect.selectByIndex(2);
			Thread.sleep(2000);
			oSelect.selectByValue("ide");
			Thread.sleep(2000);
			oSelect.selectByVisibleText("Selenium WebDriver");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void showItemsFromDropDownDemo()
	{
		WebElement oList=oBrowser.findElement(By.id("tools"));
		Select oSelect=new Select(oList);
		List<WebElement> olists=oSelect.getOptions();
		for(int i=0;i<olists.size();i++)
		{
			WebElement list=olists.get(i);
			String content=list.getText();
			System.out.println(content);
		}
	}
	private static void selectItemsFromDropDownBasedOnPartialItemName()
	{
		try
		{
			WebElement oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
			List<WebElement> olists=oSelect.getOptions();
			for(int i=0;i<olists.size();i++)
			{
				WebElement list=olists.get(i);
				String content=list.getText();
				System.out.println(content);
				if(content.endsWith("WebDriver"))
				{
					oSelect.selectByVisibleText(content);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();		
		}	
	}
}
