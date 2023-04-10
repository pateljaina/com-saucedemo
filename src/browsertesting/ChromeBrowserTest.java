package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";//store url
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//Places URL to browser(using the get method to open Url)
        driver.manage().window().maximize();//maximise the window
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//add wait
        driver.findElement(By.id("user-name")).sendKeys("standard_user");//enter permitted username to username field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");//enter permitted password to password field
        driver.findElement(By.id("login-button")).click();//click on login button
        driver.close();//close the browser

    }
}
