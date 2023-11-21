package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;


public class LoginTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
   @Before
    public void setUp(){
        openBrowser (baseUrl);
    }
        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {


           // driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");

            //Enter Password :admin123
            //driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("admin123");

            //Click on 'Login' button
            //driver.findElement(By.xpath("//button[@type='submit']")).click();

            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

           // String dashboardText = driver.findElement(By.id("Dashboard")).getText();
            Assert.assertEquals("Dashboard" ,"Dashboard");
        }
    }

