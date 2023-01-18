package FunctionLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//-------------XLSDataPoolManager class---------------//
/**
 * XLSDataPoolManager class reads data from the .xls file whose path is
 * specified by XLS_FILE_PATH Functions list -> readData readDataByRow
 * readRowCount readColumns createCellAndUpdateValue
 */
public class XLSDataPoolManager {

	private InputStream minputStream = null;
	private InputStream minputStreamReadRow = null;
	private HSSFWorkbook mhssfwrkbokWorkbook;
	private HSSFRow mhssfrowRow = null;
	private HSSFCell mhssfcellCell = null;
	private HSSFSheet msheetSheet;
	private Iterator mitrRows, mitrCells;
	private Set set = null;
	private List<Map> mlistData;
	private int noOfRows = 0;

	/**
	 * This function reads the specified sheet in Excel file provided by the
	 * arguments
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @param sSheetName
	 *            Name of the sheet to be read
	 * @return List
	 * @throws IOException
	 * @throws Exception
	 */
	// ------------readData() function----------------//

	public List<Map> readData(String XLS_FILE_PATH, int sheetIndex)
			throws IOException {
		mlistData = new ArrayList<Map>();

		// ------------Declare Excel Sheet Variables----------------//
		minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		mhssfrowRow = null;
		mhssfcellCell = null;
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);
		mitrRows = msheetSheet.rowIterator();
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		set = null;
		Map<String, String> hm = null;

		// ------------Read no of modules to run----------------//
		for (int i = 1; (i < noOfRows) && (mitrRows.hasNext()); i++) {
			hm = new HashMap<String, String>();
			mhssfrowRow = (HSSFRow) mitrRows.next();
			mitrCells = mhssfrowRow.cellIterator();
			for (int j = 0; mitrCells.hasNext(); j++) {
				mitrCells.next();
				if (i > 0) {
					hm.put(getValue(msheetSheet.getRow(0).getCell(j)),
							getValue(msheetSheet.getRow(i).getCell(j)));
				}
			}
			// ------------Get a set of the entries----------------//
			mlistData.add(hm);
			if (minputStream != null) {
				minputStream.close();
				minputStream = null;
			}
			minputStream = null;
		}

		// ------------Return from function----------------//
		return (mlistData);
	}

	/**
	 * This function reads the Excel file By row
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @param sSheetIndex
	 *            Index of the sheet to be read
	 * @param iRow
	 *            Total no of rows
	 * @return Map
	 * @throws IOException
	 */
	// ------------readDataByRow() function----------------//
	public Map<String, String> readDataByRow(String XLS_FILE_PATH,
			int sheetIndex, int iRow) throws IOException {

		@SuppressWarnings("unused")
		List<Map> data = new ArrayList<Map>();
		Map<String, String> hm = null;

		// ------------Declare Excel Sheet Variables----------------//

		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		mhssfrowRow = null;
		mhssfcellCell = null;
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);
		mitrRows = msheetSheet.rowIterator();
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		set = null;
		int i = 1;

		// ------------Count total no of rows in a Excel----------------//
		for (; (i < noOfRows) && (mitrRows.hasNext()); i++) {
			if (i == iRow) {
				break;
			}
		}

		hm = new HashMap<String, String>();
		mhssfrowRow = (HSSFRow) mitrRows.next();
		mitrCells = mhssfrowRow.cellIterator();
		int j = 0;
		for (; mitrCells.hasNext(); j++) {
			mitrCells.next();
			hm.put(getValue(msheetSheet.getRow(0).getCell(j)),
					getValue(msheetSheet.getRow(iRow).getCell(j,
							Row.CREATE_NULL_AS_BLANK)));
		}

		if (minputStreamReadRow != null) {
			minputStreamReadRow.close();
			minputStreamReadRow = null;
		}
		minputStreamReadRow = null;

		// ------------Return from function----------------//
		return (hm);
	}

	/**
	 * This function gives the exact row count in the excel file
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @param sSheetName
	 *            Name of the sheet
	 * @return int
	 * @throws IOException
	 */
	// ------------readRowCount() function----------------//
	public int readRowCount(String XLS_FILE_PATH, int sheetIndex)
			throws IOException {
		int noOfRows = 0;

		minputStream = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStream);
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);
		noOfRows = msheetSheet.getPhysicalNumberOfRows();

		// ------------Return rowCount from function----------------//
		return noOfRows;
	}

	/**
	 * This function gives the exact row count in the excel file
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @param sSheetName
	 *            Name of the sheet
	 * @return int
	 * @throws IOException
	 */
	// ------------readRowCount() function----------------//
	public List<String> readColumns(String XLS_FILE_PATH, int sheetIndex)
			throws IOException {
		List<String> data = new ArrayList<String>();

		// ------------Declare Excel Sheet Variables----------------//

		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		mhssfrowRow = null;
		mhssfcellCell = null;
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);
		mitrRows = msheetSheet.rowIterator();
		noOfRows = msheetSheet.getPhysicalNumberOfRows();
		set = null;

		mhssfrowRow = (HSSFRow) mitrRows.next();
		mitrCells = mhssfrowRow.cellIterator();
		int j = 0;
		for (; mitrCells.hasNext(); j++) {
			mitrCells.next();
			data.add(j, getValue(msheetSheet.getRow(0).getCell(j)));
		}

		// ------------Return rowCount from function----------------//
		return data;
	}

	/**
	 * This is Private function reads the value in cell of excel file
	 * 
	 * @param cell
	 *            The cell's value to be read
	 * @return String
	 */
	// ------------getValue() private function----------------//
	private String getValue(Cell cell) {
		String value = "";

		// ------------Get the value of cell into the 'value' string
		// variable----------------//
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			if (HSSFDateUtil.isCellDateFormatted(cell)) {
				DateFormat formatter = new SimpleDateFormat(
						"E MMM dd HH:mm:ss Z yyyy");

				try {
					Date date = (Date) formatter.parse(cell.getDateCellValue()
							.toString());
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					String formatedDate = cal.get(Calendar.DATE) + "/"
							+ (cal.get(Calendar.MONTH) + 1) + "/"
							+ cal.get(Calendar.YEAR);

					value = "" + formatedDate;
				} catch (ParseException e) {
					e.printStackTrace();
				}

			} else {
				cell.setCellType(Cell.CELL_TYPE_STRING);
				// value =
				// BigDecimal.valueOf(cell.getNumericCellValue()).toString();
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
		// ------------Return from function----------------//
		return value;
	}

	/**
	 * This is public function that creates a cell in excel file and store data
	 * in it
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @param sheetIndex
	 *            Index of the sheet to be read
	 * @param columnName
	 *            Name of column
	 * @param data
	 *            to be saved
	 * @return void
	 * @throws IOException
	 */
	// ------------createCellAndUpdateValue() public function----------------//
	public void createCellAndUpdateValue(String XLS_FILE_PATH, int sheetIndex,
			int row, String columnName, String value) throws IOException {

		Cell c;
		HSSFCell cell;
		String data = null;
		int columnSize;

		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);

		columnSize = msheetSheet.getRow(0).getLastCellNum();
		// System.out.println("Column Size---"+columnSize);

		Row newRow = msheetSheet.getRow(row);

		for (int i = 0; i < columnSize; i++) {
			cell = msheetSheet.getRow(0).getCell(i);
			data = cell.getStringCellValue();

			if (data.equalsIgnoreCase(columnName)) {
				mhssfcellCell = (HSSFCell) newRow.createCell(i);
				mhssfcellCell.setCellValue(value);

				break;
			} // if ends

		} // loop ends

		closeWorkBook(XLS_FILE_PATH);

	}
	
	public void updateCellValue(String XLS_FILE_PATH, int sheetIndex,
			int row, String columnName, String value) throws IOException {

		Cell c;
		HSSFCell cell;
		String data = null;
		int columnSize;

		minputStreamReadRow = new FileInputStream(XLS_FILE_PATH);
		mhssfwrkbokWorkbook = new HSSFWorkbook(minputStreamReadRow);
		msheetSheet = mhssfwrkbokWorkbook.getSheetAt(sheetIndex);

		columnSize = msheetSheet.getRow(0).getLastCellNum();
	
	int column_number = 0;	
for(int i =0;i<columnSize;i++){
	
	
	String str  = msheetSheet.getRow(0).getCell(i).toString();
	System.out.println("value of string is "+str);
	System.out.println("value of cloumnname is"+columnName);
	if(str.equals(columnName)){
		column_number=i;
		
		System.out.println("value of cell si"+i);
		break;
	}
	
}
		
		System.out.println("value of columns numbe ris" + column_number);

		Row newRow = msheetSheet.getRow(row);
		

		int col_Num = -1;
      
   /*     for(int i = 0; i < columnSize; i++)
        {
      
        	
        	if(newRow.getCell(columnSize).getStringCellValue().trim().equals("result"))
            {
                col_Num = i;
            }
        }*/
 
        newRow = msheetSheet.getRow(row);
        if(newRow == null)
        	newRow = msheetSheet.createRow(row);
 System.out.println("the matchign cloumn number is "+column_number);
        cell =  (HSSFCell) newRow.getCell(column_number);
        if(cell == null)
            cell =  (HSSFCell) newRow.createCell(column_number);
 
        cell.setCellType(Cell.CELL_TYPE_STRING);
 
        cell.setCellValue(value);
 

		// loop ends
        closeWorkBook(XLS_FILE_PATH);

	}
	

	/**
	 * This is public function to close the excel file
	 * 
	 * @param XLS_FILE_PATH
	 *            Path of the suit file
	 * @return void
	 */
	// ------------closeWorkBook() public function----------------//
	public void closeWorkBook(String XLS_FILE_PATH) {
		try {

			// minputStreamReadRow.close();
			FileOutputStream outputStream = new FileOutputStream(XLS_FILE_PATH);
			mhssfwrkbokWorkbook.write(outputStream);
			outputStream.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		XLSDataPoolManager manager = new XLSDataPoolManager();
		Map<String, String> rowData;

		// manager.createCellAndUpdateValue("D:\\data.xls", 0, 1, "Id",
		// "Updated1_1");

		// System.out.println(manager.readRowCount("D:\\data.xls",0));

		// List<Map> mlistData1 = manager.readData("D:\\data.xls", 0);
		// rowData = mlistData1.get(0);
		// List<String> columns = manager.readColumns("D:\\data.xls", 0);
		// Iterator mitrRow = columns.iterator();
		// System.out.println(columns);

		// rowData = manager.readDataByRow("D:\\data.xls", 0, 1);
		// System.out.println(rowData.get("Id"));
		// System.out.println(rowData.get("Code"));
		// System.out.println(rowData.get("Country"));

	}
}
