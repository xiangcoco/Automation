package com.coco;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println(System.getProperty("os.name"));
        String name=System.getProperty("os.name");
        if (name.equals("Mac OS X")){
            System.out.print("thisA");
            System.setProperty("webdriver.chrome.driver", "/Users/coco/workspace/java/chromedriver");
        }

        else{
            System.out.print("thisB");
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        }


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        
        WebDriverWait waiter = new WebDriverWait(driver, 5*1000);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
        WebElement eleItem=driver.findElements(By.id("lst-ib")).get(0);

        eleItem.sendKeys("coco");

        WebElement eleItem1=driver.findElements(By.name("btnK")).get(0);
        eleItem1.click();

      //  assertTrue( true );
    }
}
