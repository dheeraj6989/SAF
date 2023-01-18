package FunctionLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.*;

import java.util.Date;

public class Reporting {

	String query;
	ResultSet rs;
	static int testcaseCount=0;
	DatabaseConnectivity databaseConnectivity = null;
	
	public Reporting(String databaseName){

		try {
			databaseConnectivity=new DatabaseConnectivity(databaseName);

//			query="create table IF NOT EXISTS ZT_testcase_desc (ID int not null auto_increment primary key,testCaseID int,stepNo int,step_desc varchar(200),expected_result varchar(200),actual_result varchar(200),status varchar(30),screenshot varchar(200))";
//			databaseConnectivity.sendData(query);
//			query="create table IF NOT EXISTS ZT_testcases (ID int not null auto_increment primary key,suite_ID int ,test_name varchar(50), module_name varchar(50), node varchar(20), exec_date date, exec_time time, steps int, passed int, failed int, warnings int, status varchar(30))";
//			databaseConnectivity.sendData(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void reportValidation(int testcaseID,int stepNo, String stepDesc, String expectedResultDesc, boolean status, String screenShot){

		String actualResult;
		String reportStatus="";
		if(status){
			actualResult="As Expected";
			reportStatus="PASS";
		}
		else{
			actualResult="Not As Expected";
			reportStatus="FAIL";
		}

		try {
			query="insert into ZT_testcase_desc values (null,"+testcaseID+","+stepNo+",'"+stepDesc+"','"+expectedResultDesc+"','"+actualResult+"','"+reportStatus+"', '"+screenShot+"')";
			databaseConnectivity.sendData(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void reportValidation(int testcaseID,int stepNo, String stepDesc, String expectedResultDesc, boolean status, String screenShot, String actualResult){

		String reportStatus="";
		if(status){
			reportStatus="PASS";
		}
		else{
			reportStatus="FAIL";
		}

		try {
			query="insert into ZT_testcase_desc values (null,"+testcaseID+","+stepNo+",'"+stepDesc+"','"+expectedResultDesc+"','"+actualResult+"','"+reportStatus+"', '"+screenShot+"')";
			databaseConnectivity.sendData(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Updated
	public void reportTestcase(int testcaseID ,int suiteID,String testcaseName, String modulename , String nodeIP, String browser, int steps, int passed, int failed, int warnings, boolean status,Date startTime,Date endTime ){
		
		DateFormat mObjDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar gCalenderCal_start= Calendar.getInstance();
		String dateTime = mObjDateFormat.format(gCalenderCal_start.getTime());

		String date=dateTime.split(" ")[0];
		String time=dateTime.split(" ")[1];
		long executionTime = endTime.getTime()-startTime.getTime();
		String reportStatus="";
		if(status){
			reportStatus="PASS";
		}
		else{
			reportStatus="FAIL";
		}
		
		try {
			query="update ZT_testcases set node ='"+nodeIP+"', exec_date ='"+date+"', exec_time ='"+time+"', steps ="+steps+", passed ="+passed+", failed ="+failed+", warnings="+warnings+", status ='"+reportStatus+"', start_time ='"+startTime+"', end_time = '"+endTime+"', execution_time ='"+executionTime+"' where ID = "+testcaseID+" ";			
			databaseConnectivity.sendData(query);;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser(String nodeIP){
		
		String browser="";
		query="select browser from system_tab where type = 'node' and machine_ip = '"+nodeIP+"'";
		rs=databaseConnectivity.getData(query);
		
		try {
			browser=rs.getString("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return browser;
	}

	
	// Updated
	  public int testcaseID(int runID, String testScriptID, String testcaseName, String modulename, String node, String browser, Timestamp startDate){
		int testCaseID=0;
		
		DateFormat mObjDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar gCalenderCal_start= Calendar.getInstance();
		String dateTime = mObjDateFormat.format(gCalenderCal_start.getTime());

		String date=dateTime.split(" ")[0];
		String time=dateTime.split(" ")[1];
		
	
		try {
			query="insert into ZT_testcases values (null,"+testScriptID+","+runID+",'"+testcaseName+"','"+modulename+"','"+node+"','"+date+"','"+time+"', 0, 0, 0, 0,'EXECUTING','"+startDate+"','"+startDate+"','0000','"+browser.toUpperCase()+"')";
			databaseConnectivity.sendData(query);
			
			query="select max(ID) from ZT_testcases where script_id = "+testScriptID+" and runId = "+runID+" and test_name = '"+testcaseName+"' and module_name = '"+modulename+"' and node='"+node+"'  and browser = '"+browser.toUpperCase()+"'";
			rs=databaseConnectivity.getData(query);
			rs.next();
			testCaseID=rs.getInt("max(ID)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testCaseID;
	}
	
}
