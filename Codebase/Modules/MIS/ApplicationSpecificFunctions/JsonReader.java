package Modules.MIS.ApplicationSpecificFunctions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	// function to read data from url to String
	public static JSONObject readJsonFromUrl(String url) throws IOException,
			JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	// function to read data from file and return String data
	public static String readDataFromFile(String fileName) throws IOException {
		String JSONDATA = null;
		String everything = null;
		/*
		 * try {
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(new
		 * FileInputStream
		 * ("E:\\Automation\\saf\\Codebase\\Modules\\TE\\JSONData\\"
		 * +fileName+".json"))); String line; // reading data from file while
		 * ((line = br.readLine()) != null) { JSONDATA+=line;
		 * 
		 * } br.close();
		 * 
		 * } catch (IOException e) {
		 * System.out.println("ERROR: unable to read file " + fileName);
		 * e.printStackTrace(); } return JSONDATA;
		 */

		FileInputStream inputStream = new FileInputStream(
				"E:\\Automation\\saf\\Codebase\\Modules\\TE\\JSONData\\"
						+ fileName + ".json");
		try {
			everything = IOUtils.toString(inputStream);
		} finally {
			inputStream.close();
		}
		return everything;

	}

	public static void main(String[] args) throws IOException, JSONException {
		System.setProperty("java.net.useSystemProxies", "true");
		// JSONObject jsonObject =
		// readJsonFromUrl("http://www.te.com/teccatv2/service/search/products?c=usa&l=en&o=0&ptp=y&q=1513164-1&s=10&st=web");
		JSONObject jsonObject = new JSONObject(readDataFromFile("TC_TE_01"));
		// System.out.println(jsonObject.toString());
		// JSONObject jsonObject = new JSONObject(jsonString);
		JSONObject myResponse = jsonObject.getJSONObject("results");
		JSONObject tsmresponse = myResponse.getJSONObject("queryRequest");
		// JSONArray tsmresponse = (JSONArray) myResponse.get("queryRequest");
		System.out.println(tsmresponse.getString("searchTerms"));

	}
}