import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;




    @BeforeMethod
    public void setUp() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();


  // wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/roiz/Documents/GitHub/Untitled/StartSelenium_Anna/chromedriver");
   //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
   wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
   //wd.navigate().forward();

    }
    @Test
    public void testName(){

    }

    @Test
     public void testName2(){

    }
    @AfterMethod
    public void postCondition(){
        //wd.close();
        //wd.quit();

    }
}
