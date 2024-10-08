package project_1;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
public class Excel_DDTFile 
{
	int name=0;
	int number=0;
	int pwd=0;
	public void registerData() throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\SeleniumP\\DDT_File_Project1\\Project 1-Automation.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String name=w1.getSheet("RegistrationDetails").getRow(1).getCell(0).getStringCellValue();
		String number=w1.getSheet("RegistrationDetails").getRow(1).getCell(1).getStringCellValue();
		String pwd = w1.getSheet("RegistrationDetails").getRow(1).getCell(2).getStringCellValue();
		
	}
}

/*Object[][] data=new Object[3][3]; //3Rows //3Columns
		//Set Data 1
		data[1][0]="Juhi Parmar"; //user first & last name
		data[1][1]="8564792030"; //user mobile number
		data[1][2]="Juhi@2030"; // create new pwd for registration
		//Set Data 2
		data[2][0]="Rahul Vaidya"; //user first & last name
		data[2][1]="7725460091"; //user mobile number
		data[2][2]="#Rahul@0091"; // create new pwd for registration
		//Set Data 3
		data[3][0]="Pragya Raut"; //user first & last name
		data[3][1]="9700514223"; //user mobile number
		data[3][2]="#Pragya@2024"; // create new pwd for registration*/