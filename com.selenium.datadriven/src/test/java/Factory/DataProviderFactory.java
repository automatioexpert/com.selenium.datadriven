package Factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory 
{

	
/*	ConfigDataProvider config_data;
	ExcelDataProvider excel_data;
	*/
	public static ConfigDataProvider getConfig()
	{
		
		ConfigDataProvider config=new ConfigDataProvider("./Configuration/framework.properties");
		return config;
	}
	
	
	public static ExcelDataProvider getExcel()
	{
		
		ExcelDataProvider excel=new ExcelDataProvider("./TestData/LoginData.xlsx");
		
		return excel;
	}
}
