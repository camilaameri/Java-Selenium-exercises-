package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(co);
        driver.get("https://the-internet.herokuapp.com/");

       // List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //WebElement shiftingLink=  driver.findElement(By.linkText("Shifting Content"));
        //shiftingLink.click();
        //WebElement exampleLink= driver.findElement(By.linkText("Example 1: Menu Element"));
        //exampleLink.click();
        //List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        //System.out.println("Number of menu items: " + menuItems.size());




      //  driver.manage().window().setSize(new Dimension(375,812));
      //  WebElement inputsLink =  driver.findElement(By.linkText("Inputs"));
      //  inputsLink.click();

      //  System.out.println(driver.getTitle());
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
