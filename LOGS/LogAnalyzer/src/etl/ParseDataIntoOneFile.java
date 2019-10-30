package etl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseDataIntoOneFile 
{

	public static void main(String[] args) 
	{
		File fileDailyInput = new File("C:\\PROJECTS\\DATA\\LOGS\\CDSID_DATA_IN_GENERIC.csv");
		Scanner scDailyInput=null;
		try 
		{
			scDailyInput=new Scanner(fileDailyInput);
		} 
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		while (scDailyInput.hasNextLine())
		{
			System.out.println(scDailyInput.nextLine());
		}
	}

}
