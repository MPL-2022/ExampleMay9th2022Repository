package com.sgtesting.autoit;

public class ExecuteAutoItScriptDemo {

	public static void main(String[] args) {
		executefile();
	}
	private static void executefile()
	{
		try
		{
			String fileName="E:\\Autoit\\autoit.exe";
			//Runtime.getRuntime().exec(fileName);
			Runtime obj=Runtime.getRuntime();
			obj.exec(fileName);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
