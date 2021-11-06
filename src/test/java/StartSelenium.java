import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;




    @BeforeMethod
    public void setUp() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();


   wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/roiz/Documents/GitHub/Untitled/StartSelenium_Anna/chromedriver");
   //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
   wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
   //wd.navigate().forward();

    }
    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("login_login__3EHKB"));

        
        wd.findElement(By.id("root"));


        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));

        wd.findElement(By.partialLinkText("HO"));
        wd.findElement(By.partialLinkText("AB"));
        wd.findElement(By.partialLinkText("LO"));


        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("meta"));
        wd.findElement(By.tagName("link"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("br"));






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
