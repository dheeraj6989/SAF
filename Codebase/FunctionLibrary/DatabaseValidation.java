package FunctionLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mysql.jdbc.ResultSetMetaData;

public class DatabaseValidation {
//
//	String query;
//	Connection connection;
//	Statement st;
//	ResultSet rs;
//	boolean status;
//
//	ExcelDataPoolManager excelDataPoolManager = new ExcelDataPoolManager();
//	PropertyHandler propertyHandler = new PropertyHandler();
//
//
//	//-----constructor-----
//	public DatabaseValidation(){
//
//		propertyHandler.setFileName("DatabaseConfig");
//
//		String host = propertyHandler.readProperties("host");
//		String databaseName= propertyHandler.readProperties("database");
//		String userName= propertyHandler.readProperties("username");
//		String password= propertyHandler.readProperties("passsword");
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection=DriverManager.getConnection("jdbc:mysql://"+host+"/"+databaseName,userName,password);
//			st=connection.createStatement();		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//
//
//	//-------method for select queries------	
//	public boolean verifyData(String query , String filePath){
//
//		Iterator mitrRows;
//		String columnName;
//		String columnType = "";
//		String excelData = "";
//		String rsData = "";
//		int iRsRowCount;
//		int mlistDataRowCount;
//		int iRsColumnCount;
//		int imlistDataColumnCount;
//		Map<String, String> mlistData;
//
//	
//		try {
//			rs=st.executeQuery(query);
//			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
//
//
//			rs.last();
//			iRsRowCount= rs.getRow();
//			rs.beforeFirst();
//
//			mlistDataRowCount = (excelDataPoolManager.rowCount(filePath, 0)) - 1;
//
//			System.out.println("mlistDataRowCount---"+mlistDataRowCount);
//
//
//			//---------Check whether number of rows are equal or not----
//			if(iRsRowCount != mlistDataRowCount){
//				return false;
//			}
//
//			System.out.println("File path--"+filePath);
//			mlistData = excelDataPoolManager.readExcelByRow(filePath, 0 , 0);
//
//			iRsColumnCount = rsmd.getColumnCount();
//			imlistDataColumnCount = (mlistData.size()) - 1;
//
//			//---------Check whether number of columns are equal or not----
//			if(iRsColumnCount < imlistDataColumnCount){
//				return false;
//			}
//
//			Set<String> columns = mlistData.keySet();
//			mitrRows = columns.iterator();
//
//			System.out.println(columns);
//
//			//---------Check whether all the columns of excel exist in database table or not----
//			for(int i=0 ; i<=imlistDataColumnCount ; i++){
//				columnName =  (String) mitrRows.next();
//
//				if(!columnName.equals("")){
//					try {
//						System.out.println(columnName+" column index: "+rs.findColumn(columnName));
//
//					} catch (SQLException e) {
//						System.out.println("Column not found");
//						return false;
//					}
//				}
//			}
//
//			mitrRows = columns.iterator();
//
//			//---------Check whether data in excel is equal to the data in the database table or not----
//			for(int i=0 ; i<mlistDataRowCount ; i++){
//
//				System.out.println("In for loop");
//
//				rs.next();
//				mlistData = excelDataPoolManager.readExcelByRow(filePath, 0 , i+1);
//
//				mitrRows = columns.iterator();
//
//				for(int j=0 ; j<=imlistDataColumnCount ; j++){
//
//					columnName =  (String) mitrRows.next();
//					if(!columnName.equals("")){
//
//						excelData = (String)mlistData.get(columnName);
//						//System.out.println(columnName+"---"+excelData);
//
//						try {
//							columnType = rsmd.getColumnTypeName(rs.findColumn(columnName));
//							//System.out.println("columnType"+columnType);
//						} catch (SQLException e) {
//							//System.out.println("In upper catch");
//							return false;
//						}
//
//						switch(columnType.toUpperCase()){
//						case "INT":
//							rsData = Integer.toString(rs.getInt(columnName));
//							break;
//						case "BIGINT":
//							rsData = Integer.toString(rs.getInt(columnName));
//							break;
//						case "VARCHAR":
//							rsData = rs.getString(columnName);
//							break;
//
//						}
//						
//						System.out.println("New Excel data---"+excelData.trim().split("\\.")[0]);
//
//						if((excelData.trim()).equalsIgnoreCase(rsData) || (excelData.trim().split("\\.")[0]).equalsIgnoreCase(rsData)){
//							status = true;
//						}
//						else{
//							System.out.println(excelData+"---"+rsData);
//							status = false;
//						}
//					}
//				}
//			}
//
//		} catch (Exception e) {
//			System.out.println("In catch");
//			System.out.println(excelData+"---"+rsData);
//			e.printStackTrace();
//			return false;			
//		}
//
//		return status;
//	}
//
//
//	//-------method for nonselect queries------
//	public boolean executeQuery(String query){
//		try {
//			st.executeUpdate(query);
//
//
//
//
//		} catch (SQLException e) {
//			status = false;
//			e.printStackTrace();
//		}
//		return status;
//	}
//
//
//
//
//	public static void main(String[] args) {
//
//		DatabaseValidation dbc = new DatabaseValidation();
//
//		System.out.println(dbc.verifyData("select * from zt_test2" , "D:\\New_Eclipse\\SAF\\Codebase\\Modules\\Assurant\\TestData\\Methods.xls"));
//
//	}


}
