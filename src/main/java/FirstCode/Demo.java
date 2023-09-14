package FirstCode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {


    public static void main(String[] args) {
        // My maven project still works like a normal java code
        System.out.println("Hello World");

        // set up driver before creating it
        WebDriverManager.edgedriver().setup();


        // Special object that can control my web browser
        WebDriver driver = new EdgeDriver();


        // navigate to facebook on google-chrome
        String facebookURL = "https://www.google.com/";
        // .get method opens a link
        driver.get(facebookURL);
        //driver.close();
    }
}









