package Assertions;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Dataprovider {
	public static String url;
	public static String email;
	public static String password;
	public static String portfolio_id;
	public static String portfolio_name;

	private static String csv_path="/home/parvathavarthini/Desktop/hive.csv";

	static Dataprovider data=new Dataprovider();
	public static String[] csvdata = data.csvdata();
	 
	public static String[]csvdata()
	{
		
		try
		{
			CSVReader reader = new CSVReader(new FileReader(csv_path));
			csvdata = reader.readNext();
			url=csvdata[0];
			email=csvdata[1];
			password=csvdata[2];
			portfolio_id=csvdata[3];
			portfolio_name=csvdata[4];
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		String readdata[]= {url,email,password,portfolio_id,portfolio_name};
		return readdata;
	}
	


}
