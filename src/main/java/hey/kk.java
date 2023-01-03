package hey;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class kk {
	@Test

	public void ghu() throws IOException
	
	  
	{
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Ameet\\Downloads\\hello.xlsx");
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int y=wb.getNumberOfSheets();
		for(int i=0;i<=y;i++)
		{
			if(wb.getSheetAt(i).equals("testcase"))
			{
				XSSFSheet sheet=wb.getSheetAt(i);
			java.util.Iterator<Row> r =sheet.iterator();
			Row rt=r.next();//by default the first rowonly we have test case name whole row not the value 
			
		java.util.Iterator<Cell> ce=rt.cellIterator();
		while(ce.hasNext())
		{int k=0;
		int column=0;
			if(ce.next().getStringCellValue().equalsIgnoreCase("testcase"))
			{
				column=k;
			}
		k++;
		System.out.println(k);
		}
			}
		}
			
			}
}
