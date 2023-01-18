//------------Package Name----------------//
package FunctionLibrary;

import java.io.File;
//------------Importing Required Packages----------------//
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
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

public class ExcelDataPoolManager_NEW {

	boolean flag = false;
	static int tempID = 0;
	String XLS_FILE_PATH = null;
	String sSheetName = null;
	
	InputStream minputStream = null ;
	InputStream minputStreamReadRow = null ;
	HSSFWorkbook mhssfwrkbokWorkbook;
	HSSFRow mhssfrowRow = null;
	HSSFCell mhssfcellCell = null;
	HSSFSheet msheetSheet ; 
	
	Iterator mitrRows, mitrCells;	
	
	Set set = null ;

	List<Map> mlistData;
	int noOfRows=0;
	int rowCount = 0;
	//------------Constructor ExcelDataPoolManager ----------------//
	public ExcelDataPoolManager_NEW() {
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

	public List<Map> readExcel() throws Exception 
	//public List<Map> readExcel(String XLS_FILE_PATH , String sSheetName) throws Exception 
	{
		mlistData = new ArrayList<Map>();
		//------------Try block----------------//		 

		//------------Declare Excel Sheet Variables----------------//
		//minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		mhssfrowRow = null;
		mhssfcellCell = null;
		//msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName); 
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

	
	public List<Map> readExcel(String XLS_FILE_PATH , String sSheetName) throws Exception 
		{
			mlistData = new ArrayList<Map>();
			//------------Try block----------------//		 

			//------------Declare Excel Sheet Variables----------------//
			//minputStream = new FileInputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
			mhssfrowRow = null;
			mhssfcellCell = null;
			//msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName); 
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
	 * @param sSheetName Name of the sheet to be read
	 * @param iRow Total no of rows
	 * @return Map
	 * @throws IOException 
	 */
	//------------readExcelByRow() function----------------//

	public Map<String,String> readExcelByRow(String XLS_FILE_PATH , String sSheetName , int iRow) throws IOException {
		
		@SuppressWarnings("unused")
		List<Map> data = new ArrayList<Map>();
		Map<String,String> hm = null;


		//------------Declare Excel Sheet Variables----------------// 
		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		mhssfrowRow = null;
		mhssfcellCell = null;
		//System.out.println(XLS_FILE_PATH + " = = = " +sSheetName);
		msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName); 
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
	
	
	public void createExcelSheetColumnName(Map<String, String> data){
		
		try {
			//String tempId = tagName + tempID;
			int i = 0;
		    mhssfrowRow = msheetSheet.getRow(i);
		    Row newRow = msheetSheet.createRow(i);
		    
		    if(data != null){
		    	
		    	 for (Map.Entry<String, String> entry : data.entrySet()) {
				       
				    	String key = entry.getKey();
				        String thing = entry.getValue();
				        
				        System.out.println("\t key :: " + key);
				        System.out.println("\t thing :: " + thing);
				        
				        mhssfcellCell = (HSSFCell) newRow.createCell(i);
					    mhssfcellCell.setCellValue(key);
					   
					    ++i;
				    }
		    	 flag = true;
		    } else {
		    	flag = false;
		    }
		    
		} catch (Exception e){
			e.printStackTrace();
		}
	
	}
	
	public void writeExcelRowAccordingToColumn(Map<String, String> data){
		
		if(flag == false)
		{
			createExcelSheetColumnName(data);
			flag = true;
		}
		
		int j = 0;
		int intCurrentRowCount = 0;
		mhssfrowRow = null;
		mhssfcellCell = null;
	    
		try {
			
			rowCount++;
		    mhssfrowRow = msheetSheet.getRow(0);
		    Row newRow = msheetSheet.createRow(rowCount+1);
		    intCurrentRowCount = rowCount+1;
		    
		    if(data != null){
		    	 for (Map.Entry<String, String> entry : data.entrySet()) {
				       
				    	String key = entry.getKey();
				        String thing = entry.getValue();

				        create_Cell_And_Update_Value(intCurrentRowCount, key, thing);
	    
					    ++j;
				    }
		    	 flag = true;
		    } else {
		    	flag = false;
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
	public String getValue( Cell cell){
		String value = "";

		//------------Get the value of cell into the 'value' string variable----------------//
		
		//System.out.println("cell :: " + cell);
		
		if(cell == null){
			value = "";
		} else {
			
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC:
				value = BigDecimal.valueOf(cell.getNumericCellValue()).toPlainString();
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
			} // SWITCH END
			
		} // ELSE END
		

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
	public int rowCount(String XLS_FILE_PATH , String sSheetName) throws IOException 
	{
		int noOfRows = 0;
		
		minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		
		msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName);
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		//------------Return rowCount from function----------------//
		return noOfRows;
	} 	
	
	public int rowCount(){
		int noOfRows = 0;
		
		try{
			minputStream = new FileInputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
			
			msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName); 
			noOfRows = msheetSheet.getPhysicalNumberOfRows();
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		return noOfRows;
	}
	
	public Map<String,String> readExcelByRow(int iRow) throws IOException {
		
		@SuppressWarnings("unused")
		List<Map> data = new ArrayList<Map>();
		Map<String,String> hm = null;


		//------------Declare Excel Sheet Variables----------------// 
		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		mhssfrowRow = null;
		mhssfcellCell = null;
		//System.out.println(XLS_FILE_PATH + " = = = " +sSheetName);
		msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName); 
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
	
	public void updateStatus(int rowCount, int column, String status){
		
		//System.out.println(rowC + " "  + column +  " " + status);
		
		try{
			
			Row newRow = msheetSheet.getRow(rowCount);
			Cell c = newRow.getCell(column);
			//System.out.println(c.getStringCellValue());
			
			
			c.setCellValue(status);
			
			closeWorkBook();
			setWorkBook(XLS_FILE_PATH, sSheetName);
			
			//newRow = msheetSheet.getRow(rowCount);
			//c = newRow.getCell(column);
			//System.out.println(c.getStringCellValue());
		   
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	} // Func End
	
	public void updateStatus(int row, String columnName, String value){
		
		try{
			
			Row newRow = msheetSheet.getRow(row);
			Cell c;
			
			HSSFCell cell;
			String data=null;
			int columnSize;
			
			//int noOfColumns = msheetSheet.getRow(0).getPhysicalNumberOfCells();
			columnSize = msheetSheet.getRow(0).getLastCellNum();
			
			for(int i=0; i<columnSize; i++)
			{ 
				
				cell = msheetSheet.getRow(0).getCell(i);
				data = cell.getStringCellValue();
				
				if(data.equalsIgnoreCase(columnName))
				{
					c = newRow.getCell(i);
					c.setCellValue(value);
					
					closeWorkBook();
					setWorkBook(XLS_FILE_PATH, sSheetName);
					
					break;
				} // if ends
				
			} // loop ends
			
		} catch (Exception e){
			e.getMessage();
		}
		
	}

	//*******************************************************************************
	//----------------------------------N E W F U N C--------------------------------
	//*******************************************************************************
	
	public void setWorkBook(String xls_File_Path, String sheetName)
	{
		try{
			XLS_FILE_PATH = xls_File_Path;
			sSheetName = sheetName;
			
			minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
			msheetSheet = mhssfwrkbokWorkbook.getSheet(sSheetName);
			
			minputStream = new FileInputStream(XLS_FILE_PATH);
			
			
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void closeWorkBook()
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
	
	private void create_Cell_And_Update_Value(int row, String columnName, String value){
		
		try{
			
			Row newRow = msheetSheet.getRow(row);
			Cell c;
			
			HSSFCell cell;
			String data=null;
			int columnSize;
			
			//int noOfColumns = msheetSheet.getRow(0).getPhysicalNumberOfCells();
			columnSize = msheetSheet.getRow(0).getLastCellNum();
			
			for(int i=0; i<columnSize; i++)
			{ 
				
				cell = msheetSheet.getRow(0).getCell(i);
				data = cell.getStringCellValue();
				
				if(data.equalsIgnoreCase(columnName))
				{
					mhssfcellCell = (HSSFCell) newRow.createCell(i);
				    mhssfcellCell.setCellValue(value);
				    
					closeWorkBook();
					setWorkBook(XLS_FILE_PATH, sSheetName);
					
					break;
				} // if ends
				
			} // loop ends
			
		} catch (Exception e){
			e.getMessage();
		}
	}
	
	public void update_Column_Value_For_Keyword(Map<String, String> data, String keyword){
		
		final String key = "keyword";
		
		int totalRows = 0;
		int totalColumns = 0;

		String currentColValue = null;
		String sheetColumnnName = null;
		
		HSSFCell cellvalue = null;
	    
		try {
			
		    totalRows = msheetSheet.getPhysicalNumberOfRows();
		    totalColumns = msheetSheet.getRow(0).getLastCellNum();
		    
		    int keywordColumnPos = 0;
		    for(int i=0; i<totalColumns; i++){
		    	sheetColumnnName = msheetSheet.getRow(0).getCell(i).toString();
		    	
		    	if(sheetColumnnName.equalsIgnoreCase(key)){
		    		
		    		cellvalue = msheetSheet.getRow(0).getCell(i);
		    		keywordColumnPos = i;
		    		break;
		    		
		    	}
		    }
		    
		    sheetColumnnName = null;
		    cellvalue = null;
		    
		    // TRAVERSE ROWS
		    for(int i=1; i<totalRows; i++){
		    	
		    	cellvalue = msheetSheet.getRow(i).getCell(keywordColumnPos);
		    	currentColValue = cellvalue.getStringCellValue();
		    	
		    	// SEARCH KEYWORD IN COLUMN ONE
		    	if(currentColValue.equalsIgnoreCase(keyword)){
		    		
		    		// TRVERSE COLUMNS
		    		for(int j=1; j<totalColumns; j++){
		    			
		    			sheetColumnnName = msheetSheet.getRow(0).getCell(j).toString();
		    			
		    			for (Map.Entry<String, String> entry : data.entrySet()) {
		    				
		    			    String key1 = entry.getKey();
					        String thing = entry.getValue();
					        
					        create_Cell_And_Update_Value(i, key1, thing);
		    		
		    			} // data FOR END
		    			
		    		} // totalColumns FOR END
		    		
		    	} // currentColValue IF END
		    	
		    } // totalRows FOR END
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getTotalSheetRows(){
		int totalRows = 0;
		try {
			// TOTAL NUMBER OF ROWS
		    totalRows = msheetSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalRows;
	}
	
	public int getTotalSheetColumns(){
		int totalColumns = 0;
		try {
		    // TOTAL NUMBER OF COLUMNS
		    totalColumns = msheetSheet.getRow(0).getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalColumns;
	}
	
	public Cell getCellForRowCol(int keywordRowPos, int keywordColumnPos){
		
		//return msheetSheet.getRow(0).getCell(1);
		
		return msheetSheet.getRow(keywordRowPos).getCell(keywordColumnPos);
	}
	
	public String readValueForRowCol(int rowNo, int colNo){
			return getValue(getCellForRowCol(rowNo, colNo));
	}
	
	public String readValueForRowCol(int rowNo, String colName){
		int totalSheetColumns = 0;
		int colPos = 0;
		String cellValue = null;
		
		try {
			
			totalSheetColumns = getTotalSheetColumns();
			//System.out.println("totalSheetColumns : " + totalSheetColumns);
			colPos = findColumnPosition(totalSheetColumns, colName);
			//System.out.println("colPos : " + colPos + " :: rowNo : " + rowNo);
			cellValue = readValueForRowCol(rowNo, colPos);
			//System.out.println("cellValue : " + cellValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
}
	
	public String get_Value_of_This_Row_Coulmn(String rowValue, String columnValue) {
		
		int totalRows = 0;
		int totalColumns = 0;
		
	    int keywordRowPos = 0;
	    int keywordColumnPos = 0;
	    
		String cellValue = null;
		String sheetColumnnName = null;
		
		try {
			
			// TOTAL NUMBER OF ROWS
		    totalRows = getTotalSheetRows();
		    
		    // TOTAL NUMBER OF COLUMNS
		    totalColumns = getTotalSheetColumns();
		    
		    //System.out.println("\t---> totalRows : " + totalRows + "\n\t----> totalColumns : " + totalColumns);
		    
		    // TRAVERS COLUMNS
		    for(int i=0; i<totalColumns; i++){
		    	
		    	sheetColumnnName = msheetSheet.getRow(0).getCell(i).toString();
		    	if(sheetColumnnName.equalsIgnoreCase(columnValue)){
		    		keywordColumnPos = i;
		    		break;
		    	}
		    }
		    
		    // TRAVERS ROWS
		    for(int i=0; i<totalRows; i++){
		    	
		    	sheetColumnnName = msheetSheet.getRow(i).getCell(0).toString();
		    	if(sheetColumnnName.equalsIgnoreCase(rowValue)){
		    		keywordRowPos = i;
		    		break;
		    	}
		    }
		    
		    // GET CELL VALUE
		    cellValue = getValue(msheetSheet.getRow(keywordRowPos).getCell(keywordColumnPos));
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cellValue;
	}
	
	public int findColumnPosition(int totalColumns, String columnName){
		
		String sheetColumnnName = null;
		int keywordColumnPos = 0;
		try {
		    for(int i=0; i<totalColumns; i++){
		    	
		    	sheetColumnnName = msheetSheet.getRow(0).getCell(i).toString();
		    	if(sheetColumnnName.equalsIgnoreCase(columnName)){
		    		keywordColumnPos = i;
		    		break;
		    	}
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return keywordColumnPos;
		
	}
	
	public String[][] getExcelData_ForDataProvider() {
		
		int totalNoOfCols = 0;
		int totalNoOfRows = 0;
		String[][] arrayExcelData = null;
		try {

			totalNoOfCols = getTotalSheetColumns();
			totalNoOfRows = getTotalSheetRows();
			int ci,cj; 
			
			System.out.println("totalNoOfCols : " + totalNoOfCols);
			System.out.println("totalNoOfRows : " + totalNoOfRows);
			
			// SINCE DATA SHEET WILL HAVE COLUMN NAMES
			arrayExcelData = new String[totalNoOfRows][totalNoOfCols];
			
			ci=0;
			for (int i= 1 ; i < totalNoOfRows; i++ , ci++) {

				cj=0;
				for (int j=0; j < totalNoOfCols; j++ , cj++) {
					
					System.out.println(" :: " +  readValueForRowCol(i, j));
					
					//arrayExcelData[ci][cj] = readValueForRowCol(i,j);
					// System.out.println(arrayExcelData[ci][cj]); 
					
					//arrayExcelData[i-1][j] = readValueForRowCol(i, j);
					//arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	
	public Object[][] getTableArray() throws Exception {   

		   String[][] tabArray = null;

		   try {

			   int startRow = 2;
			   int startCol = 1;

			   int ci,cj; 
			   int totalRows = getTotalSheetRows();
			   int totalCols = getTotalSheetColumns();
			   
			   tabArray = new String[totalRows-1][totalCols];

			  // System.out.println("totalRows : "  + totalRows);
			  // System.out.println("totalCols : "  + totalCols);
			   
			   ci=0;
			   for (int i=startRow; i<=totalRows; i++, ci++) {           	   

				   System.out.println();
				   
				  cj=0;
				   for (int j=startCol; j<=totalCols; j++, cj++){

					  //System.out.println("i = " + i + " :: j = " + j + " == " +  readValueForRowCol(i-1, j-1));

					   tabArray[ci][cj] = readValueForRowCol(i-1, j-1);
					   //tabArray[ci][cj] = readValueForRowCol(i, j);
					   
					  // tabArray[ci][cj]=getCellData(i,j);
					  // System.out.println(tabArray[ci][cj]);  

					} // FOR END - j
				   
					if(i==totalRows){
						break;
					}
			   } // FOR END - i

			} catch (Exception e){
				e.printStackTrace();
			}

			return(tabArray);
			
		} // FUNC END
	//*******************************************************************************
	//----------------------------------N E W F U N C--------------------------------
	//*******************************************************************************
	
	public static void main(String[] args) {
		
		try {
			/*Map<String, String> data = new HashMap<String, String>();
			data.put("url", "NEW URL");
			data.put("tc_name", "NEW TC NAME");
			data.put("column_names", "NEW COL NAME");
			data.put("function_names", "NEW FUNC NAME");
			
			String returnL= null;
			
			ExcelDataPoolManager_NEW e = new ExcelDataPoolManager_NEW();
			e.setWorkBook("D:\\workspace\\JavaTestingProjects\\WebContent\\jsonData\\Locale_Suffix_Info\\Locale_Suffix_Info.xls", "Sheet1");
			
			String languageCode = "en";
			String count = "ONE";
			
			
			returnL = e.get_Value_of_This_Row_Coulmn(languageCode, count);
			
			System.out.println("returnL : " + returnL);*/
			
			ExcelDataPoolManager_NEW excel = new ExcelDataPoolManager_NEW();
			excel.setWorkBook("D:\\Automation_POC\\SAF\\Codebase\\Modules\\TE\\Desktop\\TestData\\TC_TE_PDP_Multidata_en.xls", "Sheet1");
			Object[][] testObjArray =excel.getTableArray();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
