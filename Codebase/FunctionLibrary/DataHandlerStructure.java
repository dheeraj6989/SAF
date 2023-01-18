package FunctionLibrary;

import java.util.List;
import java.util.Map;

public interface DataHandlerStructure {

	public List<Map> readData(String FILE_PATH, int sheetIndex);
	public Map<String,String> readDataByRow(String FILE_PATH , int sheetIndex , int iRow);
	public int readRowCount(String FILE_PATH , int sheetIndex);
	public List<String> readColumns(String FILE_PATH , int sheetIndex);
	public void createCellAndUpdateValue(String FILE_PATH, int sheetIndex, int row, String columnName, String value);
	
}
