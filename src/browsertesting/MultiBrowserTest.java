package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";//given browser
    static String baseUrl = "https://www.saucedemo.com/";//base url
    static WebDriver driver;//driver stored

    public static void main(String[] args) {//if statement to open with Chrome, Firefox or Edge
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");//if wrong browser - print statement
        }

        driver.get(baseUrl);//Places URL to browser(using the get method to open Url)
        driver.manage().window().maximize();//maximise the window
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.findElement(By.id("user-name")).sendKeys("standard_user");//places username in username field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");//places password in password field
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//adding weight
        driver.findElement(By.id("login-button")).click();//clicking login wait
        driver.close();//close browser
    }
}