package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class Case2 {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method method[]=obj.getClass().getMethods();
			for(int i=0;i<method.length;i++)
			{
				String name=method[i].getName();
				if(name.startsWith(name));
				{
					method[i].invoke(obj, null);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
