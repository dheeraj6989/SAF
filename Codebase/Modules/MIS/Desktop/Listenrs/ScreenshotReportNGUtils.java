package Modules.MIS.Desktop.Listenrs;

import java.io.File;
import java.util.List;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.uncommons.reportng.ReportNGUtils;


public class ScreenshotReportNGUtils extends ReportNGUtils {

    public static final String DRIVER_ATTR = "driver";

    public List<String> getTestOutput(ITestResult result) {
        List<String> output = super.getTestOutput(result);
        // add screenshot if there is one
        String screenshot = (String)result.getAttribute("screenshot");
        String output2  = (String)result.getAttribute("outputDir");
        
         System.out.println("the value of screenshot is :-"+screenshot );
         
        if (screenshot != null) {
            String url = (String)result.getAttribute("screenshotURL");
            if (url == null)
                url = "";
            
            // ReportNG output directory is private, so get screenshot from output root
            System.out.println(output2);
            output.add("screenshot for "+result.getName()+" "+url+"<br><img src=\""+output2+"\">");
            final String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";
            System.setProperty(ESCAPE_PROPERTY, "false");
            String fileName = output2;
            Reporter.setCurrentTestResult(result);
          
            Reporter.log("<a href=\""+fileName+"\"> Clickhere </a>");
            
        }
        return output;
    }
}