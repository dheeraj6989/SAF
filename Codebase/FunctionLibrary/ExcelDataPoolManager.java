//------------Package Name----------------//
package FunctionLibrary;

//------------Importing Required Packages----------------//
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

//-------------ExcelDataPoolManager class---------------//
/**
 * Excel Data pool manager class reads the suit file in .xls format and decides which module to be run
 * and which scripts to be run.
 * @author 
 */
public class ExcelDataPoolManager {

	InputStream minputStream = null ;
	InputStream minputStreamReadRow = null ;
	HSSFWorkbook mhssfwrkbokWorkbook;
	HSSFRow mhssfrowRow = null;
	HSSFCell mhssfcellCell = null;
	HSSFSheet msheetSheet ; 

	Iterator mitrRows,mitrCells;	

	Set set = null ;

	List<Map> mlistData;
	int noOfRows=0;
	//------------Constructor ExcelDataPoolManager ----------------//
	public ExcelDataPoolManager() {
		super();
	}


	/**
	 * This function reads the specified sheet in Excel file provided by the arguments
	 * @param XLS_FILE_PATH Path of the suit file
	 * @param sSheetName Name of the sheet to be read
	 * @return List
	 * @throws Exception 
	 */
	//------------readExcel() function----------------//

	public List<Map> readExcel(String XLS_FILE_PATH , int sheetIndex) throws Exception 
	{
		mlistData = new ArrayList<Map>();
		//------------Try block----------------//		 

		//------------Declare Excel Sheet Variables----------------//
		minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		mhssfrowRow = null;
		mhssfcellCell = null;
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);
		mitrRows = msheetSheet.rowIterator();
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		set = null ;
		Map<String,String> hm = null;

		//------------Read no of modules to run----------------//
		for (int i = 1; (i < noOfRows) && (mitrRows.hasNext()); i++)
		{
			hm = new HashMap<String,String>(); 
			mhssfrowRow = (HSSFRow) mitrRows.next();
			mitrCells = mhssfrowRow.cellIterator();
			for( int j=0 ;mitrCells.hasNext() ; j++) 
			{
				mitrCells.next();
				if(i>0)
				{
					hm.put(getValue(msheetSheet.getRow(0).getCell(j)), getValue(msheetSheet.getRow(i).getCell(j)));
				}
			}
			//------------Get a set of the entries----------------// 
			mlistData.add(hm); 
			if (minputStream != null) 
			{
				minputStream.close();
				minputStream = null;
			}
			minputStream = null;
		}

		//------------Return from function----------------//
		return(mlistData);
	}


	/**
	 * This function reads the Excel file By row
	 * @param XLS_FILE_PATH Path of the suit file
	 * @param sSheetIndex Index of the sheet to be read
	 * @param iRow Total no of rows
	 * @return Map
	 * @throws IOException 
	 */
	//------------readExcelByRow() function----------------//

	public Map<String,String> readExcelByRow(String XLS_FILE_PATH , int sSheetIndex , int iRow) throws IOException {

		@SuppressWarnings("unused")
		List<Map> data = new ArrayList<Map>();
		Map<String,String> hm = null;


		//------------Declare Excel Sheet Variables----------------// 

		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		mhssfrowRow = null;
		mhssfcellCell = null;
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sSheetIndex); 
		mitrRows = msheetSheet.rowIterator();
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		set = null ;
		int i = 1;

		//------------Count total no of scripts in a Module----------------// 
		for (; (i < noOfRows) && (mitrRows.hasNext()); i++) {
			if( i == iRow ) {
				break;
			}
		}

		hm = new HashMap<String,String>(); 
		mhssfrowRow = (HSSFRow) mitrRows.next();
		mitrCells = mhssfrowRow.cellIterator();
		int j=0 ;
		for( ;mitrCells.hasNext() ; j++) {
			mitrCells.next();
			hm.put( getValue(msheetSheet.getRow(0).getCell(j)) , getValue(msheetSheet.getRow(iRow).getCell(j , Row.CREATE_NULL_AS_BLANK)));
		}

		if (minputStreamReadRow != null) 
		{
			minputStreamReadRow.close();
			minputStreamReadRow = null;
		}
		minputStreamReadRow = null;


		//------------Return from function----------------//
		return(hm);
	}


	/**
	 * This function shows the data of the Specified row 
	 * @param hm 
	 * @return void
	 */

	//------------showRowData() function----------------//
	@SuppressWarnings("rawtypes")
	public void showRowData(Map<String,String> hm){
		set = hm.entrySet();
		Iterator i = set.iterator();
		//------------Display elements----------------//
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() );
		} 
	}


	/**
	 * This function shows the data of the excel specified by the List
	 * @param sheetData List of mapping 
	 * @return boolean
	 */
	//------------showExelData() function----------------//
	@SuppressWarnings("rawtypes")
	public boolean showExelData(List<Map> sheetData) {
		Map cell = null;
		for (int i = 0; i < sheetData.size(); i++) {
			cell = (Map) sheetData.get(i);
			System.out.print( cell.get("Username") + " " + cell.get("Password"));
		}
		//------------Return from function----------------//
		return(true);
	}


	/**
	 * This is Private function reads the value in cell of excel file
	 * @param cell The cell's value to be read
	 * @return String
	 */
	//------------getValue() private function----------------//
	private String getValue( Cell cell){
		String value = "";

		//------------Get the value of cell into the 'value' string variable----------------//
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			if(HSSFDateUtil.isCellDateFormatted(cell))
			{
				DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");

				try {
					Date date = (Date)formatter.parse(cell.getDateCellValue().toString());
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);

					value=""+formatedDate;
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
			else{
				cell.setCellType(Cell.CELL_TYPE_STRING);
				//			value = BigDecimal.valueOf(cell.getNumericCellValue()).toString();
				value = cell.getStringCellValue();
			}
			break;

		case HSSFCell.CELL_TYPE_STRING:
			value = cell.getStringCellValue();
			break;

		case HSSFCell.CELL_TYPE_BLANK:
			value = "";
			break;

		case HSSFCell.CELL_TYPE_FORMULA:
			value = cell.getCellFormula();
			break;

		default:
			break;
		}
		//------------Return from function----------------//
		return value;
	}


	/**
	 * This function gives the exact row count in the excel file
	 * @param XLS_FILE_PATH Path of the suit file
	 * @param sSheetName Name of the sheet
	 * @return int
	 * @throws IOException
	 */
	//------------rowCount() function----------------//
	public int rowCount(String XLS_FILE_PATH , int sSheetIndex) throws IOException 
	{
		int noOfRows = 0;
		minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sSheetIndex); 
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		//------------Return rowCount from function----------------//
		return noOfRows;
	} 	


	public void createColumnAndUpdateValue(String XLS_FILE_PATH , int sheetIndex ,  String columnName, String value){

		try{

			Cell c;
			HSSFCell cell;
			String data=null;
			int columnSize;


			minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
			msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);


			columnSize = msheetSheet.getRow(0).getLastCellNum();
			System.out.println("Column Size---"+columnSize);

			Row newRow = msheetSheet.getRow(0);
			mhssfcellCell = (HSSFCell) newRow.createCell(columnSize);
			mhssfcellCell.setCellValue(columnName);

			newRow = msheetSheet.getRow(1);
			mhssfcellCell = (HSSFCell) newRow.createCell(columnSize);
			mhssfcellCell.setCellValue(value);

			closeWorkBook(XLS_FILE_PATH);


		} catch (Exception e){
			e.getMessage();
		}
	}

	public void createCellAndUpdateValue(String XLS_FILE_PATH , int sheetIndex ,  String columnName, String value){

		try{
			Cell c;
			HSSFCell cell;
			String data=null;
			int columnSize;

			minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
			msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);

			columnSize = msheetSheet.getRow(0).getLastCellNum();
			System.out.println("Column Size---"+columnSize);

			Row newRow = msheetSheet.getRow(1);

			for(int i=0; i<columnSize; i++)
			{
				cell = msheetSheet.getRow(0).getCell(i);
				data = cell.getStringCellValue();

				if(data.equalsIgnoreCase(columnName))
				{
					mhssfcellCell = (HSSFCell) newRow.createCell(i);
					mhssfcellCell.setCellValue(value);

					break;
				} // if ends

			} // loop ends



			closeWorkBook(XLS_FILE_PATH);


		} catch (Exception e){
			e.getMessage();
		}
	}


	public void closeWorkBook(String XLS_FILE_PATH )
	{
		try{

			//minputStreamReadRow.close();
			FileOutputStream outputStream = new FileOutputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook.write(outputStream);
			outputStream.close();

		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ExcelDataPoolManager excelDataPoolManager = new ExcelDataPoolManager();

		excelDataPoolManager.createCellAndUpdateValue("D:\\Methods.xls", 0 , "TEST" , "testasdf");

	}

}
