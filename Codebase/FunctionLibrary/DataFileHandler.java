package FunctionLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//-------------DataFileHandler class---------------//
/**
 * DataFileHandler class reads data from the file whose path and type are specified by FILE_PATH
 * Functions list -> readData
 * 					readDataByRow
 * 					readRowCount
 * 					readColumns
 * 					createCellAndUpdateValue
 */
public class DataFileHandler {

	private List<Map> mlistData;
	private Map<String,String> rowData;
	private List<String> columns;

	CSVDataPoolManager csvManager;
	XLSDataPoolManager xlsManager;
	XLSXDataPoolManager xlsxManager;

	public DataFileHandler(){
		csvManager=new CSVDataPoolManager();
		xlsManager=new XLSDataPoolManager();
		xlsxManager=new XLSXDataPoolManager();
	}

	/**
	 * This function reads the CSV file provided by the arguments
	 * @param FILE_PATH Path of the data file
	 * @return List
	 * @throws IOException 
	 */
	//------------readCSV() function----------------//
	public List<Map> readData(String FILE_PATH, int sheetIndex) throws IOException{

		if(FILE_PATH.endsWith(".csv")){
			mlistData=csvManager.readData(FILE_PATH, sheetIndex);
		}
		else if(FILE_PATH.endsWith(".xls")){
			mlistData=xlsManager.readData(FILE_PATH, sheetIndex);
		}
		else if(FILE_PATH.endsWith(".xlsx")){
			mlistData=xlsxManager.readData(FILE_PATH, sheetIndex);
		}
		else{
			throw new IOException();
		}

		//------------Return mlistData from function----------------//
		return(mlistData);
	}

	/**
	 * This function reads the data file By row
	 * @param FILE_PATH Path of the suit file
	 * @param iRow Row to be read
	 * @return Map Row data
	 * @throws FileNotFoundException 
	 */

	
	
	//------------readCSVByRow() function----------------//
	public Map<String,String> readDataByRow(String FILE_PATH, int sheetIndex, int iRow) throws IOException{

		if(FILE_PATH.endsWith(".csv")){
			rowData=csvManager.readDataByRow(FILE_PATH, sheetIndex, iRow);
		}
		else if(FILE_PATH.endsWith(".xls")){
			rowData=xlsManager.readDataByRow(FILE_PATH, sheetIndex, iRow);
		}
		else if(FILE_PATH.endsWith(".xlsx")){
			rowData=xlsxManager.readDataByRow(FILE_PATH, sheetIndex, iRow);
		}
		else{
			System.out.println("SOME ERROR OCCURED - readDataByRow");
			throw new IOException();
		}

		//------------Return rowData from function----------------//
		return rowData;
	}
	
	


	/**
	 * This function gives the exact row count in the data file
	 * @param FILE_PATH Path of the data file
	 * @return int Number of rows
	 * @throws FileNotFoundException 
	 */
	//------------readRowCount() function----------------//
	public int readRowCount(String FILE_PATH, int sheetIndex) throws IOException
	{
		int noOfRows=0;

		if(FILE_PATH.endsWith(".csv")){
			noOfRows=csvManager.readRowCount(FILE_PATH, sheetIndex);
		}
		else if(FILE_PATH.endsWith(".xls")){
			noOfRows=xlsManager.readRowCount(FILE_PATH, sheetIndex);
		}
		else if(FILE_PATH.endsWith(".xlsx")){
			noOfRows=xlsxManager.readRowCount(FILE_PATH, sheetIndex);
		}
		else{
			throw new IOException();
		}

		//------------Return noOfRows from function----------------//
		return noOfRows;
	}

	/**
	 * This function gives the list of columns in the data file
	 * @param FILE_PATH Path of the data file
	 * @return List Columns list
	 * @throws FileNotFoundException 
	 */
	//------------readColumns() function----------------//
	public List<String> readColumns(String FILE_PATH, int sheetIndex) throws IOException
	{
		if(FILE_PATH.endsWith(".csv")){
			columns=csvManager.readColumns(FILE_PATH, 0);
		}
		else if(FILE_PATH.endsWith(".xls")){
			columns=xlsManager.readColumns(FILE_PATH, sheetIndex);
		}
		else if(FILE_PATH.endsWith(".xls")){
			columns=xlsxManager.readColumns(FILE_PATH, sheetIndex);
		}
		else{
			throw new IOException();
		}

		//------------Return columns from function----------------//
		return columns;
	}

	/**
	 * This is public function that creates a cell in data file and store data in it
	 * @param FILE_PATH Path of the data file
	 * @param columnName Name of column
	 * @param data to be saved
	 * @return void
	 * @throws IOException 
	 */
	//------------createCellAndUpdateValue() public function----------------//
	public void createCellAndUpdateValue(String FILE_PATH,int sheetIndex, int row, String columnName, String value) throws IOException{

		if(FILE_PATH.endsWith(".csv")){
			csvManager.createCellAndUpdateValue(FILE_PATH, sheetIndex, row, columnName, value);
		}
		else if(FILE_PATH.endsWith(".xls")){
			xlsManager.createCellAndUpdateValue(FILE_PATH, sheetIndex, row, columnName, value);
		}
		else if(FILE_PATH.endsWith(".xls")){
			xlsxManager.createCellAndUpdateValue(FILE_PATH, sheetIndex, row, columnName, value);
		}
		else{
			throw new IOException();
		}
		

	}
	
	
	public void updateCellValue(String FILE_PATH,int sheetIndex, int row, String columnName, String value) throws IOException{
		
		 if(FILE_PATH.endsWith(".xls")){
			 xlsManager.updateCellValue(FILE_PATH, sheetIndex, row, columnName, value);
		}
	}
		

	//	public static void main(String[] args) {
	//		CSVDataPoolManager manager = new CSVDataPoolManager();
	//		System.out.println(manager.readRowCount("D:\\data.csv", 0));
	//		Map<String,String> rowData = manager.readDataByRow("D:\\data.csv", 0, 0);
	//		List<Map> mlistData1 = manager.readData("D:\\data.csv", 0);
	//		Map<String,String> rowData = mlistData1.get(7);
	//		List<String> columns = manager.readColumns("D:\\data.csv", 0);
	//		Iterator mitrRow = columns.iterator();
	//		System.out.println(rowData.get("Id"));
	//		System.out.println(rowData.get("Code"));
	//		System.out.println(rowData.get("Country"));
	//
	//		manager.createCellAndUpdateValue("D:\\data.csv", 0, "", "");
	//	}

}
