package FunctionLibrary;




	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtilities {

			private static HSSFSheet ExcelWSheet;
			private static HSSFWorkbook ExcelWBook;
			private static HSSFCell Cell;
			private static HSSFRow Row;
			
			public static void main(String args[]) throws Exception{
				getTableArray("D:\\workspace\\JavaTestingProjects\\WebContent\\jsonData\\Locale_Suffix_Info\\Locale_Suffix_Info.xls", "Sheet1");
			}
			
		public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

		   String[][] tabArray = null;

		   try {

			   FileInputStream ExcelFile = new FileInputStream(FilePath);

			   // Access the required test data sheet
			   System.out.println(FilePath);

			   ExcelWBook = new HSSFWorkbook(ExcelFile);

			   ExcelWSheet = ExcelWBook.getSheet(SheetName);

			   int startRow = 1;
			   int startCol = 1;

			   int ci,cj;
			   int totalRows = ExcelWSheet.getLastRowNum();

			   // you can write a function as well to get Column count

			   int totalCols = 2;
			   tabArray=new String[totalRows][totalCols];

			   ci=0;
			   for (int i=startRow;i<=totalRows;i++, ci++) {           	   

				  cj=0;
				   for (int j=startCol;j<=totalCols;j++, cj++){

					   tabArray[ci][cj]=getCellData(i,j);
					   System.out.println(tabArray[ci][cj]);  

					} // FOR END - j
			   } // FOR END - i

			} catch (FileNotFoundException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

			}

			catch (IOException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			return(tabArray);

			}

		
		
		public static String getCellData(int RowNum, int ColNum) throws Exception {

			try{

				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

				int dataType = Cell.getCellType();

				if  (dataType == 3) {

					return "";

				}else{

					String CellData = Cell.getStringCellValue();

					return CellData;

				}
			}catch (Exception e){

				System.out.println(e.getMessage());

				throw (e);

				}

			}

		}



