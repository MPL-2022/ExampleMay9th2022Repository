package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap
{
	public static Properties prop=null;
	public ObjectMap(String filename)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locatordetail=prop.getProperty(logicalname);
			String locator[]=locatordetail.split(",");
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			switch (locatorname.toLowerCase())
			{
			case "id":
				by=by.id(locatorvalue);
				break;
			case "name":
				by=by.name(locatorname);
				break;
			case "xpath":
				by=by.xpath(locatorvalue);
				break;
			case "tagname":
				by=by.tagName(locatorvalue);
				break;
			case "cssselector":
				by=by.cssSelector(locatorvalue);
				break;
			case "linktext":
				by=by.linkText(locatorvalue);
				break;
			case "classname":
				by=by.className(locatorvalue);
				break;
			default:
				System.out.println("Invalid Locator Name!!!!");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}
