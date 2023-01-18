package FunctionLibrary;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HTML_Report {

	private WebDriver webdriver ;
	public static String mstrAppendString;
	public int mintSummaryCount=0;
	public int mintDetailCount=0,mintSubStepNo=0,mintPassed=0,mintFailed=0,mintWarnings=0,mintStepNo=0;
	public int ic=0;
	ScreenshotUtility screenshotUtil = null;

	public static ArrayList<String> mlistTC_Seq=new ArrayList<String>();
	public static DateFormat mObjDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static Date mDateToday=new Date();
	static String gstrAssignedTo="Test_Test";
	static String gstrCountryName="India";

	Calendar mstrCalender_strt = Calendar.getInstance();
	String mstrStartTime=mObjDateFormat.format(mstrCalender_strt.getTime());

	static String gstrResultPath = "";
	static FileWriter mObjFW0;
	public static String strt_tym;
	public static Calendar cal_strt;
	public static Calendar cal_end;
	public static int mintstarttimecounter=0;
	
	public String mstrTC_Name;
	public String mstrTC_Desc;
	public String mstrModuleName;
	int mintMasterStepNo=0;
	public String detail_strt_tym;
	
	private PropertyHandler propertyHandlerObj = null;
	private String propertyFileName = "global";

	private String BASE_PATH = "";
	private String resultPath = "";
	
	public HTML_Report(){
		setup();
	}
	
	private void setup(){
		try {
			propertyHandlerObj = new PropertyHandler();
			screenshotUtil = new ScreenshotUtility();
			propertyHandlerObj.setFileName(propertyFileName);
			
			BASE_PATH = propertyHandlerObj.readProperties("safRootPath");
			resultPath = propertyHandlerObj.readProperties("resultPath");
			
			//System.out.println("BASE_PATH :: " + BASE_PATH);
			//System.out.println("resultPath :: " + resultPath);
			BASE_PATH += resultPath;
			gstrResultPath = BASE_PATH;
			
			System.out.println("\tREPORT :: HTML_Report :: setup :: gstrResultPath = " + gstrResultPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void set_Script_Details(Map<String, String> scriptDetails){
		String unknown = "UNKNOWN";
		mstrTC_Name = (scriptDetails.get("mstrTC_Name") != null) ? scriptDetails.get("mstrTC_Name") : unknown;
		mstrTC_Desc = (scriptDetails.get("mstrTC_Name") != null) ? scriptDetails.get("mstrTC_Desc") : unknown;
		mstrModuleName = (scriptDetails.get("mstrTC_Name") != null) ? scriptDetails.get("mstrModuleName") : unknown;
	}
	
	public void set_WebDriver(WebDriver webDriver){
		this.webdriver = webDriver;
		screenshotUtil.set_WebDriver(webDriver);
	}
	
	public void init_detail_TC_report(String Test_Case, String TC_Desc) throws Exception {

		mstrTC_Name = Test_Case;
		int i,flag=0;

		for(i=0;i<mlistTC_Seq.size();i++) {
			if(mlistTC_Seq.get(i).equals(mstrTC_Name)) {
				flag=1;
			}
		}
		if(flag==0)
			mlistTC_Seq.add(mstrTC_Name);

		Calendar cal_strt = Calendar.getInstance();
		detail_strt_tym=mObjDateFormat.format(cal_strt.getTime());

		String path = gstrResultPath+this.mstrModuleName+"\\"+mstrTC_Name+".html";
		CSS_StyleSheet.write_StyleSheet(path);
		File fileObj = new File(path);
		fileObj.createNewFile();
		FileWriter f1 = new FileWriter(fileObj, true);

		String detail_header="\n<script>var txt='<title>Detail Test Case Report</title><table align=center width=900px><tr><td width=900px><h1><b>Detail Execution Log</b></h1></td></tr></table>'; document.write(txt);</script>";
		f1.append(detail_header);

		String mstrBottom_img="\n<table align=center width=900px><tr><td width=900px><img src=\"../Images/Bottom.GIF\"></td></tr></table>";
		f1.append(mstrBottom_img);

		String detail_hd_table="\n<script>var txt='<table class=subheader align=center width=900px ><tr><td class=subheader width=700px>Test Case: "+mstrTC_Name+"</td></tr><tr><td class=subheader width=700px>Test Description: "+TC_Desc+"</td></tr></table><hr class=divline>'; document.write(txt);</script>";
		f1.append(detail_hd_table);
		//<td class=subheader width=200px>Date:"+mObjDateFormat.format(mDateToday)+"</td> <td class=subheader>Assigned To: "+gstrAssignedTo+"</td>

		mstrAppendString="\n<script>var txt1='<table align=center width=900px><tr><td width=900px><a class=tcindex font-weight:bold href=\"../Automation_summary.html\"><b>Back to Automation Summary</a></tr></td></table><br>'; document.write(txt1);</script>";
		f1.append(mstrAppendString);

		mstrAppendString="<script>var txt='<br><table align=center width=900px class=teststeps><tr><td width=70px class=tsheader>Step#</td><td width=200px class=tsheader>Step Descritption</td><td width=200px class=tsheader>Expected Result</td><td width=200px class=tsheader>Actual Result</td><td width=70px align=center class=tsheader>Status</td><td width=100px class=tsheader>Screen Shot</td></tr>'; document.write(txt);</script>";
		f1.append(mstrAppendString);

		f1.close();
	}
	
	public String createTimeStampStr() throws Exception {
		Calendar mycalendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_hhmmss");
		String timeStamp = formatter.format(mycalendar.getTime());
		return timeStamp;
	}
	
	private void details_append(String step_desc, String Exp_Res, String Act_Res, String Status) throws Exception {
		System.out.println("\tREPORT :: START :: details_append");
		String screenShotPath = null;
		try{
			screenShotPath = gstrResultPath+"ScreeenShots\\\\"+this.mstrModuleName+"\\\\"+this.mstrTC_Name+"\\\\"+ createTimeStampStr() + ".PNG";;
			try {
				screenShotPath = screenShotPath.replaceAll("\\\\", "\\\\\\\\");
			} catch (Exception e) {}

			screenshotUtil.captureScreenshot(screenShotPath);

			File fileObj = null;
			FileWriter f1 = null;
			
			fileObj = new File(gstrResultPath+this.mstrModuleName+"/"+this.mstrTC_Name+".html");
			fileObj.createNewFile();
			f1=new FileWriter(fileObj,true);

			mintDetailCount++; //Counts the call to this function from individual test case
			
			if(mintDetailCount==1){
				init_detail_TC_report(this.mstrTC_Name,mstrTC_Desc);
			}

			if(Act_Res.equals("")&& Status.equals("")) {
				mintStepNo++;
				mintMasterStepNo=0;
				mintSubStepNo=0;
				mstrAppendString="<script>var txt='<tr><td width=70px class=tsindlevel1>"+mintStepNo+"</td><td width=300px class=tsgen>"+step_desc+"</td><td width=70px class=tsgen>"+Exp_Res+"</td><td width=70px class=tsgen></td><td width=70px align=center class=tsgen><b><font size = 2 color = green></td><td></td></tr>'; document.write(txt);</script>";
				f1.append("\n"+mstrAppendString);
			} else {
				mintSubStepNo++;
				if(Status.equalsIgnoreCase("PASS")) {
					mstrAppendString=
							"<script>var txt='<tr><td width=70px class=tsindlevel2>"
									+ mintStepNo+"."+mintSubStepNo+"</td><td width=300px class=tsgen>"
									+ step_desc+"</td><td width=70px class=tsgen>"
									+ Exp_Res+"</td><td width=70px class=tsgen>"
									+ Act_Res+"</td><td width=70px align=center class=tsgen><b><font size = 2 color = green>"
									+ Status+"</td><td class=tsind width=50px><a target=_blank class=anibutton href=\"file:///"
									+screenShotPath+"\"><img class=screen src=\"file:///"
									+gstrResultPath+"Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
				
				} else if(Status.equalsIgnoreCase("FAIL")) {
					if(mintMasterStepNo==0){
						mintFailed++;
						mintMasterStepNo++;
					}
					mstrAppendString="<script>var txt='<tr><td width=70px class=tsindlevel2>"+mintStepNo+"."
							+mintSubStepNo+"</td><td width=300px class=tsgen>"+step_desc+"</td><td width=70px class=tsgen>"
							+Exp_Res+"</td><td width=70px class=tsgen>"+Act_Res
							+"</td><td width=70px align=center class=tsgen><b><font size = 2 color = red>"
							+Status+"</td><td class=tsind width=50px><a target=_blank class=anibutton href=\"file:///"
							+screenShotPath+"\"><img class=screen src=\"file:///"
							+gstrResultPath+"Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
					
				} else if(Status.equalsIgnoreCase("Interrupted")) {
					if(mintMasterStepNo==0){
						mintFailed++;
						mintMasterStepNo++;
					}
					mstrAppendString="<script>var txt='<tr><td></td><td width=600px><b><font size = 2 color = Brown>"
							+step_desc+"</td><td></td><td></td><td><b><font size = 2 color = Brown>"
							+Status+"</td><td align=center width=50px><a target=_blank class=anibutton href=\"file:///"
							+screenShotPath+"\"><img class=screen src=\"file:///"
							+gstrResultPath+"Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
				}
				f1.append("\n"+mstrAppendString);

			} //Act_Res.equals("")&& Status.equals("") ELSE END

			f1.close();
			if(mintFailed==0) {
				mintPassed=mintStepNo;
				this.Summary(this.mstrTC_Name,mstrModuleName, mstrTC_Desc, String.valueOf(mintStepNo), String.valueOf(mintPassed), String.valueOf(mintFailed), String.valueOf(mintWarnings), "PASS");
			
			} else {
				mintPassed=mintStepNo-mintFailed;
				this.Summary(this.mstrTC_Name,mstrModuleName, mstrTC_Desc, String.valueOf(mintStepNo), String.valueOf(mintPassed), String.valueOf(mintFailed), String.valueOf(mintWarnings), "FAIL");
			}

		} catch(Exception e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("\tREPORT :: END :: details_append");
	} // FUNC :: DETAILS APPEND END
	
	public void details_append(String step_desc, String Exp_Res, boolean act_Res, boolean exp_Res, boolean interrupted, By byObj) {
		System.out.println("\tREPORT :: START :: details_append");
		String screenShotPath = null;
		boolean step_Status = false;
		try{
			screenShotPath = gstrResultPath+"ScreeenShots\\\\"+this.mstrModuleName+"\\\\"+this.mstrTC_Name+"\\\\"+ createTimeStampStr() + ".PNG";;
			try {
				screenShotPath = screenShotPath.replaceAll("\\\\", "\\\\\\\\");
			} catch (Exception e) {}

			screenshotUtil.captureScreenshot(screenShotPath, byObj);

			File fileObj = null;
			FileWriter f1 = null;
			
			fileObj = new File(gstrResultPath+this.mstrModuleName+"/"+this.mstrTC_Name+".html");
			fileObj.createNewFile();
			f1=new FileWriter(fileObj,true);

			mintDetailCount++; //Counts the call to this function from individual test case
			
			if(mintDetailCount==1){
				init_detail_TC_report(this.mstrTC_Name,mstrTC_Desc);
			}

			if(act_Res == false && exp_Res == false && interrupted == false){
				mintStepNo++;
				mintMasterStepNo=0;
				mintSubStepNo=0;
				mstrAppendString="<script>var txt='<tr><td width=70px class=tsindlevel1>"+mintStepNo+"</td><td width=300px class=tsgen>"+step_desc+"</td><td width=70px class=tsgen>"+Exp_Res+"</td><td width=70px class=tsgen></td><td width=70px align=center class=tsgen><b><font size = 2 color = green></td><td></td></tr>'; document.write(txt);</script>";
				f1.append("\n"+mstrAppendString);
			} else {
				step_Status = get_Status(act_Res, exp_Res, interrupted);
				
				mintSubStepNo++;
				if(interrupted) {
					if(mintMasterStepNo==0){
						mintFailed++;
						mintMasterStepNo++;
					}
					mstrAppendString="<script>var txt='<tr><td></td><td width=600px><b><font size = 2 color = Brown>"
							+step_desc+"</td><td></td><td></td><td><b><font size = 2 color = Brown>"
							+ get_Status_Desc(act_Res, exp_Res, interrupted) + "</td><td align=center width=50px><a target=_blank class=anibutton href=\"file:///"
							+screenShotPath+"\"><img class=screen src=\"file:///"
							+gstrResultPath+"Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
				} else if(step_Status == true) {
					mstrAppendString=
							"<script>var txt='<tr><td width=70px class=tsindlevel2>"
							+ mintStepNo + "." + mintSubStepNo + "</td><td width=300px class=tsgen>"
							+ step_desc + "</td><td width=70px class=tsgen>"
							+ Exp_Res + "</td><td width=70px class=tsgen>"
							+ get_Status_Desc(act_Res, exp_Res, interrupted) + "</td><td width=70px align=center class=tsgen><b><font size = 2 color = green>"
							+ get_Status_String(step_Status) + "</td><td class=tsind width=50px><a target=_blank class=anibutton href=\"file:///"
							+ screenShotPath + "\"><img class=screen src=\"file:///"
							+ gstrResultPath + "Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
				
				} else if(step_Status == false) {
					if(mintMasterStepNo==0){
						mintFailed++;
						mintMasterStepNo++;
					}
					mstrAppendString = 
							"<script>var txt='<tr><td width=70px class=tsindlevel2>"+mintStepNo+"."
							+ mintSubStepNo + "</td><td width=300px class=tsgen>"
							+ step_desc + "</td><td width=70px class=tsgen>"
							+ Exp_Res +  "</td><td width=70px class=tsgen>"
							+ get_Status_Desc(act_Res, exp_Res, interrupted) + "</td><td width=70px align=center class=tsgen><b><font size = 2 color = red>"
							+ get_Status_String(step_Status) + "</td><td class=tsind width=50px><a target=_blank class=anibutton href=\"file:///"
							+ screenShotPath + "\"><img class=screen src=\"file:///"
							+ gstrResultPath + "Images/img.png\"></a></td></tr>'; document.write(txt);</script>";
					
				}
				f1.append("\n"+mstrAppendString);

			} //Act_Res.equals("")&& Status.equals("") ELSE END

			f1.close();
			if(mintFailed==0) {
				mintPassed=mintStepNo;
				this.Summary(this.mstrTC_Name,mstrModuleName, mstrTC_Desc, String.valueOf(mintStepNo), String.valueOf(mintPassed), String.valueOf(mintFailed), String.valueOf(mintWarnings), "PASS");
			
			} else {
				mintPassed=mintStepNo-mintFailed;
				this.Summary(this.mstrTC_Name,mstrModuleName, mstrTC_Desc, String.valueOf(mintStepNo), String.valueOf(mintPassed), String.valueOf(mintFailed), String.valueOf(mintWarnings), "FAIL");
			}

		} catch(Exception e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("\tREPORT :: END :: details_append");
	} // FUNC :: DETAILS APPEND END
	
	public void Summary(String Test_Case,String Module,String Description,String Steps,String Passed,String Failed,String Warnings,String Status) throws Exception{

		System.out.println("\tREPORT :: START :: Summary");

		//*************************************************************
		//		File f1=new File(Global.gstrResultPath+"Dump");
		//		f1.mkdir();
		//		
		String str=gstrResultPath+"Dump\\"+Test_Case+".txt";

		try{
			//System.out.println("str :: " + str);
			File fileObj = new File(str);
			if(!fileObj.exists()){
				fileObj.getParentFile().mkdirs();
				fileObj.createNewFile();
			}
			mObjFW0=new FileWriter(fileObj);
		} catch(Exception e){
			e.printStackTrace();
		}

		//**********************************************************************************************
		if(Status.equalsIgnoreCase("PASS")){
			String summary="\n<script>var txt='<tr><td width=100px align=center class=tsgen><a class=tcindex href=\"./"+this.mstrModuleName+"/"+this.mstrTC_Name+".html\">"+Test_Case+"</a></td><td width=80px class=tsgen>"+Module+"</td><td width=200px class=tsgen>"+Description+"</td><td width=70px align=center class=tsgen>"+Steps+"</td><td width=70px align=center class=tsgen>"+Passed+"</td><td width=70px align=center class=tsgen>"+Failed+"</td><td width=70px align=center class=tsgen>"+Warnings+"</td><td width=70px align=center class=tsgen><b><font size = 2 color = green>"+Status+"</td></tr>'; document.write(txt);</script>";
			mObjFW0.write(summary);
		}//file:/
		//+Global.gstrResultPath
		else if(Status.equalsIgnoreCase("FAIL")){
			String summary="\n<script>var txt='<tr><td width=100px align=center class=tsgen><a class=tcindex href=\"./"+this.mstrModuleName+"/"+this.mstrTC_Name+".html\">"+Test_Case+"</a></td><td width=80px class=tsgen>"+Module+"</td><td width=200px class=tsgen>"+Description+"</td><td width=70px align=center class=tsgen>"+Steps+"</td><td width=70px align=center class=tsgen>"+Passed+"</td><td width=70px align=center class=tsgen>"+Failed+"</td><td width=70px align=center class=tsgen>"+Warnings+"</td><td width=70px align=center class=tsgen><b><font size = 2 color = red>"+Status+"</td></tr>'; document.write(txt);</script>";
			mObjFW0.write(summary);
		}

		mObjFW0.close();
		System.out.println("\tREPORT :: END :: Summary");
	}//end of summary

	public void end_Report() throws Exception
	{
		System.out.println("\tREPORT :: START :: end_Report");
		//		Thread.sleep(5000);
		String filePath = gstrResultPath+this.mstrModuleName+File.separator+this.mstrTC_Name+".html";
		//System.out.println("filePath :: " + filePath);
		File fileObj = new File(filePath);
		if(!fileObj.exists()){
			fileObj.getParentFile().mkdirs();
			fileObj.createNewFile();
		}
		mObjFW0=new FileWriter(fileObj,true);

		Calendar cal_end = Calendar.getInstance();
		String end_tym=mObjDateFormat.format(cal_end.getTime());

		Date date1 = mObjDateFormat.parse(detail_strt_tym);
		Date date2 = mObjDateFormat.parse(end_tym);
		long difference = date2.getTime() - date1.getTime();

		long var1=difference%1000;
		difference=(difference/1000);
		String Duration1=difference+"."+var1;
		String summary1="\n<script>var txt='</table><br><br><table width=900px align = center><tr><td width=650px></td><td colspan=2 class=tsheader>Execution Time</td></tr><tr><td width=650px></td><td class=pfhead width=120px>Start Time</td><td class=pfind width=130px>"+detail_strt_tym+"</td></tr><tr><td width=650px></td><td class=pfhead width=120px>End Time</td><td class=pfind width=130px>"+end_tym+"</td></tr><tr><td width=650px></td><td class=pfhead width=120px>Duration</td><td class=pfind width=130px>"+Duration1+" secs</td></tr></table>'; document.write(txt);</script>";
		mObjFW0.append(summary1);
		mObjFW0.close();
		System.out.println("\tREPORT :: END :: end_Report");
	}

	public static void build_Automation_Summary() throws Exception
	{
		System.out.println("\tREPORT :: START :: build_Automation_Summary");
		//*******************************************
		// Initially writes a schema for automation summary report
		//*******************************************
		String path = gstrResultPath+"Automation_summary.html";
		
		CSS_StyleSheet.write_StyleSheet(path);
		
		File fileObj = new File(path);
		if(!fileObj.exists()){
			fileObj.getParentFile().mkdirs();
			fileObj.createNewFile();
		}
		mObjFW0=new FileWriter(fileObj, true);

		mstrAppendString="\n<script>var txt='<title>Automation summary</title><table width=900px align=center class=reportheader><tr><td height=50px><a href=\"http://www.zensar.com/\">Zensar</a><BR><td height=50px align=center>"+gstrCountryName+"</td></tr></table>'; document.write(txt);</script>";
		mObjFW0.append(mstrAppendString);

		String mstrBottom_img="\n</head><table align=center width=900px><tr><td width=900px><img src=\"./Images/Bottom.GIF\"></td></tr></table>";
		mObjFW0.append(mstrBottom_img);

		String summary="\n<script>var txt='<br><br><table align=center width=900px class=teststeps id=\"summary_table\"><tr><td align=center width=100px class=tsheader>Test_Case</td><td width=80px class=tsheader>Module</td><td width=200px class=tsheader>Description</td><td width=70px class=tsheader>Steps</td><td width=70px class=tsheader>Passed</td><td width=70px class=tsheader>Failed</td><td width=70px class=tsheader>Warnings</td><td width=70px class=tsheader>Status</td></tr>'; document.write(txt);</script>";
		mObjFW0.append(summary);

		//*****************************************
		BufferedReader br;
		for(int i=0;i<mlistTC_Seq.size();i++)
		{

			String str=gstrResultPath+"Dump/"+mlistTC_Seq.get(i)+".txt";
			File f=new File(str);
			if(!fileObj.exists()){
				fileObj.getParentFile().mkdirs();
				fileObj.createNewFile();
			}
			FileReader fr=new FileReader(f);
			br = new BufferedReader(fr);

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				mObjFW0.append(line);
				mObjFW0.append("\n");
				line = br.readLine();
			}

			br.close();
			fr.close();
			f.deleteOnExit();
		}

		Calendar cal_end1 = Calendar.getInstance();
		String end_tym1=mObjDateFormat.format(cal_end1.getTime());
		String gstrStart_time= mObjDateFormat.format(cal_end1.getTime());

		//Date date3 = mObjDateFormat.parse(Global.gstrStart_time);
		Date date3 = mObjDateFormat.parse(gstrStart_time);
		Date date4 = mObjDateFormat.parse(end_tym1);
		long difference1 = date4.getTime() - date3.getTime();
		long var=difference1%1000;
		difference1=(difference1/1000);
		String Duration=difference1+"."+var;

		String summary2="\n<script>var txt='</table><br><br><table width=900px align=center><tr><td width=650px></td><td colspan=2 class=tsheader>Total Execution Time</td></tr><tr><td width=650px></td><td class=pfhead width=120px>Start Time</td><td class=pfind width=130px>"
				+gstrStart_time+"</td></tr><tr><td width=650px></td><td class=pfhead width=120px>End Time</td><td class=pfind width=130px>"+end_tym1+"</td></tr><tr><td width=650px></td><td class=pfhead width=120px>Duration</td><td class=pfind width=130px>"+Duration+" secs</td></tr></table>'; document.write(txt);</script>";
		mObjFW0.append(summary2);

		//		String mstrBottom2_img="\n<br><br><br><br><table align=center width=900px><tr><td width=900px><img src=\"file:///"+Global.gstrResultPath+"Images/Bottom.GIF\"></td></tr></table>";
		//		mObjFW0.append(mstrBottom2_img);

		mObjFW0.close();
		System.out.println("\tREPORT :: END :: build_Automation_Summary");
	}

	public void log_Exception_Details(Exception e)
	{
		//System.out.println("*************In Exception Handling Class*************"+ex.getClass());
		//ex.printStackTrace();
		//report.details_append( "Execution Interrupted because of exception" , "" , "", "Interrupted");
		
		String exClass = "";
		String ex_Desc = "";
		try {
			exClass = e.getClass().toString();
			ex_Desc = e.getMessage();
			if(exClass.contains("StaleElementReferenceException"))
			{
				//System.out.println("Identified specific exception "+exClass);
				//System.out.println();
				details_append( "Execution Interrupted because of StaleElementReferenceException" , "" , "", "Interrupted");
			}
			else if(exClass.contains("NoSuchElementException"))
			{
				details_append( "Execution Interrupted because of NoSuchElementException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("InvalidElementStateException"))
			{
				details_append( "Execution Interrupted because of InvalidElementStateException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("ElementNotVisibleException"))
			{
				details_append( "Execution Interrupted because of ElementNotVisibleException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("ErrorInResponseException"))
			{
				details_append( "Execution Interrupted because of ErrorInResponseException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("InvalidSwitchToTargetException"))
			{
				details_append( "Execution Interrupted because of InvalidSwitchToTargetException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("NoSuchFrameException"))
			{
				details_append( "Execution Interrupted because of NoSuchFrameException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("NoSuchWindowException"))
			{
				details_append( "Execution Interrupted because of NoSuchWindowException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("NoSuchAttributeException"))
			{
				details_append( "Execution Interrupted because of NoSuchAttributeException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("NoAlertPresentException"))
			{
				details_append( "Execution Interrupted because of NoAlertPresentException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("ElementNotSelectableException"))
			{
				details_append( "Execution Interrupted because of ElementNotSelectableException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("InvalidCookieDomainException"))
			{
				details_append( "Execution Interrupted because of InvalidCookieDomainException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("UnableToSetCookieException"))
			{
				details_append( "Execution Interrupted because of UnableToSetCookieException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("RemoteDriverServerException"))
			{
				details_append( "Execution Interrupted because of RemoteDriverServerException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("TimeoutException"))
			{
				details_append( "Execution Interrupted because of TimeoutException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("MoveTargetOutOfBoundsException"))
			{
				details_append( "Execution Interrupted because of MoveTargetOutOfBoundsException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("UnexpectedTagNameException"))
			{
				details_append( "Execution Interrupted because of UnexpectedTagNameException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("InvalidSelectorException"))
			{
				details_append( "Execution Interrupted because of InvalidSelectorException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("ImeNotAvailableException"))
			{
				details_append( "Execution Interrupted because of ImeNotAvailableException" , "" , "", "Interrupted");
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("ImeActivationFailedException"))
			{
				details_append( "Execution Interrupted because of ImeActivationFailedException" , "" , "", "Interrupted");	
				//System.out.println("Identified specific exception "+exClass);
			}
			else if(exClass.contains("UnhandledAlertException"))
			{
				details_append( "Execution Interrupted because of Unhandled message ALERT" , "" , "", "Interrupted");
				Thread.sleep(3000);
				//System.out.println("Identified specific exception "+exClass);
				
//				Alert alert = null;
//				try {
//					//System.out.println("Alert found"+((TargetLocator) driver).alert().getText());
//					alert = driver.switchTo().alert();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block	
//					e.printStackTrace();
//					System.out.println("Alert found"+alert.getText());
//					
//					
//				}
//				// Get the text of the alert or prompt
//				 
//				//System.out.println("Alert found");
//				
//				
//				// And acknowledge the alert (equivalent to clicking "OK")
//				alert.accept();

			} // IF END
		} catch (Exception ex) {
			System.out.println("\tREPORT :: ERROR WHILE REPORTING EXCEPTION");
			ex.printStackTrace();
		}
		
	} // FUNC END
	
	private String get_Status_Desc(boolean act_Res, boolean exp_Res, boolean interrupted){
		String str_PASS = " Step Executed AS EXPECTED ";
		String str_FAIL = " Step DID NOT Execute AS EXPECTED ";
		String str_INTERRUPTED = " Step SKIPPED due to INTERRUPTION ";
		
		if(interrupted){
			return str_INTERRUPTED;
		} else if(act_Res == exp_Res){
			return str_PASS;
		} else if(act_Res != exp_Res){
			return str_FAIL;
		} else {
			return " - ";
		}
	}
	
	private boolean get_Status(boolean act_Res, boolean exp_Res, boolean interrupted){
		boolean operationStatus = false;
		if(interrupted){
			operationStatus = false;
		} else if(act_Res == exp_Res){
			operationStatus = true;
		} else if(act_Res != exp_Res){
			operationStatus = false;
		}
		return operationStatus;
	}
	
	private String get_Status_String(boolean status){
		String str_PASS = " PASS ";
		String str_FAIL = " FAIL ";
		if(status){
			return str_PASS;
		} else {
			return str_FAIL;
		}
	}

} // CLASS END
