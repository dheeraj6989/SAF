package FunctionLibrary;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Time;

import FunctionLibrary.*;

public class SuiteExecutionDetails {

	private int runId;
	private String suiteId;
	private Timestamp startDate;
	private Timestamp endDate;
	private java.sql.Time executionTime;
	private DatabaseConnectivity connect;
	private String browserName;
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSuiteId() {
		return suiteId;
	}

	public void setSuiteId(String suiteId) {
		this.suiteId = suiteId;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Time getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Time executionTime) {
		this.executionTime = executionTime;
	}

	public int getRunId() throws SQLException {

		return runId;

	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public void setRunId(int runId) {
		this.runId = runId;
	}

	public void setConnectivity() {
		connect = new DatabaseConnectivity(getProjectName());
	}

	public int insert() throws SQLException {
		java.sql.Time myTime = java.sql.Time.valueOf("00:00:00");
		String sql = "insert into suiteexecutiondetails values('" + getRunId()
				+ "','" + getSuiteId() + "','" + getStartDate() + "','"
				+ getEndDate() + "','" + getExecutionTime() + "','"
				+ getBrowserName() + "')";
		connect.sendData(sql);
		return 0;
	}

	public int delete() throws SQLException {
		String sql = "";

		return 0;
	}

	public int update() throws SQLException {
		String sql = "update suiteexecutiondetails set  browser='"
				+ getBrowserName() + "' , suiteId='" + getSuiteId()
				+ "' , start_time='" + getStartDate() + "',end_time='"
				+ getEndDate() + "',execution_time='" + getExecutionTime()
				+ "' where runId='" + getRunId() + "'";
		connect.sendData(sql);
		return 0;
	}

	public ResultSet search(String columnName, String value)
			throws SQLException {
		ResultSet res = null;
		String sql = "SELECT * FROM `suiteexecutiondetails` WHERE "
				+ columnName + "='" + value + "'";

		try {
			res = connect.getData(sql);
		} catch (Exception s) {
			System.out.println("Sql exception Occured");
			s.printStackTrace();
		}
		return res;
	}

	public boolean isRecordExists() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet view() throws SQLException {
		String sql = "select * from suiteexecutiondetails";
		ResultSet rs = connect.getData(sql);
		return rs;
	}

	public int rename(String oldName, String newName) throws SQLException {
		return 0;
	}

	public int getMaxRunId() throws SQLException {
		try {
			String sql = "select max(runId) from suiteexecutiondetails";

			ResultSet rs = connect.getData(sql);

			if (rs.isBeforeFirst()) {
				if (rs.next()) {

					int runId = rs.getInt("max(runId)") + 1;
					return runId;
				}

				else {
					return 0;
				}
			} else
				return 0;
		}// try ends here
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}// maxId ends here
}// class ends here
