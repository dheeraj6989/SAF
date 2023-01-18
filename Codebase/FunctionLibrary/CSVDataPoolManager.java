package FunctionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

//-------------CSVDataPoolManager class---------------//
/**
 * CSVDataPoolManager class reads data from the .csv file whose path is specified by CSV_FILE_PATH
 * Functions list ->readData
 * 					readDataByRow
 * 					readRowCount
 * 					readColumns
 * 					createCellAndUpdateValue
 */
public class CSVDataPoolManager{

	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';
	private List<Map> mlistData;
	private Map<String,String> rowData;
	private List<String> columns;

	/**
	 * This function reads the CSV file provided by the arguments
	 * @param CSV_FILE_PATH Path of the CSV file
	 * @return List
	 * @throws FileNotFoundException 
	 */
	//------------readCSV() function----------------//
	public List<Map> readData(String CSV_FILE_PATH, int sheetIndex) throws IOException{

		int noOfColumns=0;
		mlistData = new ArrayList<Map>();

		//------------Try block----------------//
	
			// Read CSV file
			Scanner scanner = new Scanner(new File(CSV_FILE_PATH));

			// Read header row from CSV file
			List<String> headerLine = parseLine(scanner.nextLine());
			noOfColumns=headerLine.size();

			while (scanner.hasNext()) {
				rowData = new HashMap<String,String>();

				// Read current row
				List<String> line = parseLine(scanner.nextLine());

				for(int i=0; i<noOfColumns; i++) {
					// Add header name and data in Map
					rowData.put(headerLine.get(i), line.get(i));
				}

				// Add row map to ArrayList
				mlistData.add(rowData);
			}
			// Close scanner
			scanner.close();
		
		return(mlistData);
	}

	/**
	 * This function reads the CSV file By row
	 * @param CSV_FILE_PATH Path of the suit file
	 * @param iRow Row to be read
	 * @return Map Row data
	 * @throws FileNotFoundException 
	 */
	//------------readCSVByRow() function----------------//
	public Map<String,String> readDataByRow(String CSV_FILE_PATH, int sheetIndex, int iRow) throws IOException{

		// Initialize rowData
		rowData = new HashMap<String,String>();
		int noOfColumns=0;
		Scanner scanner;
		//------------Try block----------------//

			// Read CSV file
			scanner = new Scanner(new File(CSV_FILE_PATH));

			// Read header row from CSV file
			List<String> headerLine = parseLine(scanner.nextLine());
			noOfColumns=headerLine.size();

			// Iterate through scanner for specified row
			for(int i=0; i<iRow-1; i++){
				scanner.nextLine();
			}

			List<String> line;
			// Read the row specified by iRow
			if(iRow==0){
				line=headerLine;
			}
			else{
				line = parseLine(scanner.nextLine());
			}
			for(int i=0; i<noOfColumns; i++) {
				// Add header name and data in Map
				rowData.put(headerLine.get(i), line.get(i));
			}
			// Close scanner
			scanner.close();
		
		// Return row data
		return(rowData);
	}

	/**
	 * This function gives the exact row count in the CSV file
	 * @param CSV_FILE_PATH Path of the CSV file
	 * @return int Number of rows
	 * @throws FileNotFoundException 
	 */
	//------------readRowCount() function----------------//
	public int readRowCount(String CSV_FILE_PATH, int sheetIndex) throws IOException
	{
		int noOfRows = 0;
		Scanner scanner;
		
			// Read CSV file
			scanner = new Scanner(new File(CSV_FILE_PATH));

			// Iterate through scanner
			while (scanner.hasNext()) {
				// Count number of rows
				noOfRows++;
				scanner.nextLine();
			}
			// Close scanner
			scanner.close();
		
		//------------Return rowCount from function----------------//
		return noOfRows;
	}

	/**
	 * This function gives the list of columns in the CSV file
	 * @param CSV_FILE_PATH Path of the CSV file
	 * @return List Columns list
	 * @throws FileNotFoundException 
	 */
	//------------readColumns() function----------------//
	public List<String> readColumns(String CSV_FILE_PATH, int sheetIndex) throws IOException
	{
		int noOfRows = 0;
		Scanner scanner;
		
			// Read CSV file
			scanner = new Scanner(new File(CSV_FILE_PATH));

			columns = parseLine(scanner.nextLine());

			// Close scanner
			scanner.close();
	
		if(noOfRows>=1){
			// Reduce number of row by one, to avoid header row
			noOfRows--;
		}
		//------------Return rowCount from function----------------//
		return columns;
	}

	/**
	 * This is public function that creates a cell in CSV file and store data in it
	 * @param CSV_FILE_PATH Path of the CSV file
	 * @param columnName Name of column
	 * @param data to be saved
	 * @return void
	 * @throws IOException 
	 */
	//------------createCellAndUpdateValue() public function----------------//
	public void createCellAndUpdateValue(String CSV_FILE_PATH, int sheetIndex, int row, String columnName, String value) throws IOException{

		int columnNo=0;
	
			List<String> columns = readColumns("D:\\data.csv", 0);
			Iterator mitrRow = columns.iterator();

			System.out.println(columns);

			while(mitrRow.hasNext()){
				
				
				if(mitrRow.next().equals(columnName)){
					File inputFile = new File(CSV_FILE_PATH);
					// Read existing file 
					CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
					List<String[]> csvBody = reader.readAll();
					// get CSV row column  and replace with by using row and column
					csvBody.get(row)[columnNo] = value;
					reader.close();

					// Write to CSV file which is open
					CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
					writer.writeAll(csvBody);
					writer.flush();
					writer.close();
					break;
				}else{

				}
				columnNo++;			
			}

	}


	private List<String> parseLine(String cvsLine) {
		return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
	}

	private List<String> parseLine(String cvsLine, char separators) {
		return parseLine(cvsLine, separators, DEFAULT_QUOTE);
	}

	private List<String> parseLine(String cvsLine, char separators, char customQuote) {

		List<String> result = new ArrayList<String>();

		//if empty, return!
		if (cvsLine == null && cvsLine.isEmpty()) {
			return result;
		}

		if (customQuote == ' ') {
			customQuote = DEFAULT_QUOTE;
		}

		if (separators == ' ') {
			separators = DEFAULT_SEPARATOR;
		}

		StringBuffer curVal = new StringBuffer();
		boolean inQuotes = false;
		boolean startCollectChar = false;
		boolean doubleQuotesInColumn = false;

		char[] chars = cvsLine.toCharArray();

		for (char ch : chars) {

			if (inQuotes) {
				startCollectChar = true;
				if (ch == customQuote) {
					inQuotes = false;
					doubleQuotesInColumn = false;
				} else {

					//Fixed : allow "" in custom quote enclosed
					if (ch == '\"') {
						if (!doubleQuotesInColumn) {
							curVal.append(ch);
							doubleQuotesInColumn = true;
						}
					} else {
						curVal.append(ch);
					}

				}
			} else {
				if (ch == customQuote) {

					inQuotes = true;

					//Fixed : allow "" in empty quote enclosed
					if (chars[0] != '"' && customQuote == '\"') {
						curVal.append('"');
					}

					//double quotes in column will hit this!
					if (startCollectChar) {
						curVal.append('"');
					}

				} else if (ch == separators) {

					result.add(curVal.toString());

					curVal = new StringBuffer();
					startCollectChar = false;

				} else if (ch == '\r') {
					//ignore LF characters
					continue;
				} else if (ch == '\n') {
					//the end, break!
					break;
				} else {
					curVal.append(ch);
				}
			}

		}

		result.add(curVal.toString());

		return result;
	}


//	public static void main(String[] args) {
//		CSVDataPoolManager manager = new CSVDataPoolManager();
//		//		System.out.println(manager.readRowCount("D:\\data.csv",0));
//		//Map<String,String> rowData = manager.readDataByRow("D:\\data.csv", 0, 2);
//		//		List<String> columns = manager.readColumns("D:\\data.csv", 0);
//		//		System.out.println("columns---"+columns);
//		//				Iterator mitrRow = columns.iterator();
//
//
//				try {
//					manager.createCellAndUpdateValue("D:\\data.csv", 0, 1, "Code", "AU");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//		List<Map> mlistData1;
//		try {
//			mlistData1 = manager.readData("D:\\data.csv", 0);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Map<String,String> rowData = mlistData1.get(0);
//
//		System.out.print(rowData.get("Id"));
//		System.out.print(rowData.get("Code"));
//		System.out.println(rowData.get("Country"));
//
//		rowData = mlistData1.get(1);
//
//		System.out.print(rowData.get("Id"));
//		System.out.print(rowData.get("Code"));
//		System.out.println(rowData.get("Country"));
//
//		rowData = mlistData1.get(2);
//
//		System.out.print(rowData.get("Id"));
//		System.out.print(rowData.get("Code"));
//		System.out.println(rowData.get("Country"));
//
//		rowData = mlistData1.get(3);
//
//		System.out.print(rowData.get("Id"));
//		System.out.print(rowData.get("Code"));
//		System.out.println(rowData.get("Country"));
//
//	}

}