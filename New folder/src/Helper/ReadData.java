/**
 * 
 */
package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author shwetap
 *
 */
public class ReadData {
	
	public void readData() throws FileNotFoundException
	{
		File file=new File("");
		FileInputStream is=new FileInputStream(file);
		
		XSSFWorkbook xf=new XSSFWorkbook();
		XSSFSheet sheet=xf.getSheet("");
		
		for(int i=0;i<10;i++)
		{
			
		}
		
		
	}

}
