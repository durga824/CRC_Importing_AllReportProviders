package com.CRC_Reading_Values;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading_Values 
{
	public static Properties prop;
	public Reading_Values()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\pmaniratnam\\eclipse-workspace\\CRC_IMPORTING_ALLREPORTS\\ReadingValues.properties");
			prop.load(fis);
		} catch (Exception e) 
		{
			e.getMessage();			
		}
	}
}
