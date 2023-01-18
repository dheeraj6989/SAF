/*package FunctionLibrary;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import java.sql.*;
import FunctionLibrary.*;

public class SuiteExecutionTime {

	private String suiteID;
	private Timestamp suiteStartTime;
	private Timestamp suiteEndTime;
	private Long executionTime;
	private String projectName;
	private java.util.Date start_date;
	private java.util.Date end_date;
	private String runId;
	private String browserName;
	
	@Parameters({"projectName", "browserName", "ip", "port_no","suiteID"})
	@BeforeSuite
	public void setUp(String projectName,String browserName,String ip,String port_no,String suiteID)
	//public void setUp()
	{
		System.out.println("Before Suite Called");
try{
	
				this.projectName=projectName;
				this.suiteID=suiteID;
				this.browserName=browserName;
				start_date= new java.util.Date();
				suiteStartTime=new Timestamp(start_date.getTime());
	// inseting suite Details before execution and getting runId from the table  
				SuiteExecutionDetails suiteObj=new SuiteExecutionDetails();
				suiteObj.setSuiteId(suiteID);
				suiteObj.setProjectName(projectName);
				suiteObj.setConnectivity();
				suiteObj.setBrowserName(browserName);
				suiteObj.setStartDate(suiteStartTime);
				GlobalVariable.runId=suiteObj.getMaxRunId();
				runId =Integer.toString(GlobalVariable.runId);
				suiteObj.setRunId(Integer.parseInt(runId));
				
				
				suiteObj.insert();
				
				System.out.println(suiteID+"---"+projectName+"----"+runId);
		}catch(Exception e){
	
				System.out.println("Exception Occurred in Before Suite");
				e.printStackTrace();
		}
		
		
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("After Suite Called");
		end_date= new java.util.Date();
		suiteEndTime=new Timestamp(end_date.getTime());
		executionTime=suiteEndTime.getTime()-suiteStartTime.getTime();
		long diffSeconds = executionTime / 1000 % 60;
		long diffMinutes = executionTime / (60 * 1000) % 60;
		long diffHours = executionTime / (60 * 60 * 1000) % 24;
		
		String time= diffHours+":"+diffMinutes+":"+diffSeconds;
		java.sql.Time myTime = java.sql.Time.valueOf(time);
		
		try{
		SuiteExecutionDetails suiteObj=new SuiteExecutionTime();
		
		int rId=GlobalVariable.runId;
		// updating the suiteexecutiondetails
		suiteObj.setSuiteId(suiteID);
		suiteObj.setStartDate(suiteStartTime);
		suiteObj.setEndDate(suiteEndTime);
		suiteObj.setProjectName(projectName);
		suiteObj.setExecutionTime(myTime);
		suiteObj.setRunId(rId);
		suiteObj.setBrowserName(browserName);
		suiteObj.setConnectivity();
		suiteObj.update();
		}catch(Exception e)
		{
			System.out.println("Error at tear down");
		}
		
		
		
		// insert suite Id and execution time in database
	}
}
*/