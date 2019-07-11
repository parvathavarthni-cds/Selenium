package dataprovider_csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class dataprovider 
{
	public static void main (String args[]) throws IOException
	{
		 CSVReader reader = new CSVReader(new FileReader("/home/parvathavarthini/Desktop/hive.csv"));
		  String[] csvCell;
		  while ((csvCell = reader.readNext()) != null) 
		  {   
			   String FName = csvCell[0];
			   String LName = csvCell[1];
			   String Email = csvCell[2];
			   String Mob = csvCell[3];
			   System.out.println(FName);
			   System.out.println(LName);
			   System.out.println(Email);
			 



}
	
}
}