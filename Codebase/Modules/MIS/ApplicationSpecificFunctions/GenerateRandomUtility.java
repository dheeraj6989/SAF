package Modules.MIS.ApplicationSpecificFunctions;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.math.BigInteger;
import java.security.SecureRandom;

public class GenerateRandomUtility {

	private static String email;
	
	public String getProductCount() throws JSONException, IOException
	{
 		  Locale locale = new Locale("en", "IN");
                  NumberFormat numberFormat = NumberFormat.getInstance(locale);
		  JSONObject jsonObject = new JSONObject(JsonReader.readDataFromFile("TC_TE_01"));
		  JSONObject myResponse = jsonObject.getJSONObject("results");
   		  JSONObject tsmresponse = myResponse.getJSONObject("pagingLinks");
    		  int totalCount=tsmresponse.getInt("totalRecords");

    		  String totalRecords=numberFormat.format(totalCount)+" Results";
    		  return totalRecords;
	}
	
	public String generateUniqueEmailAddress(){
		email =new BigInteger(50, new SecureRandom()).toString(32)+"@gmail.com";
		return email;
	}
	
	public String getUniqueEmailAddress(){
		return email;
	}
}