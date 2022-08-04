package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class Case1 {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method method[]=obj.getClass().getMethods();
			for(int i=0;i<method.length;i++)
			{
				String name=method[i].getName();
				System.out.println(name);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
