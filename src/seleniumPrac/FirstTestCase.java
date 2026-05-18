package seleniumPrac;


import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;


public class FirstTestCase {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        // windows max
        driver.manage().window().maximize();


        // Checking title
        String page_title = driver.getTitle();
        if(page_title.equals("Automation Testing Practice")){
            System.out.println("matched");
        }
        else {
            System.out.println("Title didnt matched");
        }

        // Input name
        driver.findElement(By.id("name")).sendKeys("John");

        // Link text and partial link text -- used to locate only links
        // Link text  --- pass full text
        // Partial Link text    --   pass partial text

//        driver.findElement(By.linkText("Online Trainings")).click();

        // Fetching class name : Using findElements
        List<WebElement> element = driver.findElements(By.className("laptops"));
        System.out.println("Number of identified list of elements : " + element.size());
        for(WebElement x : element){
            System.out.println(x);
        }


        // tagname --- to capture group of webelements
        // Anything present inside <> is called tag name -- <div>   <a>
        List<WebElement> tagnameTest = driver.findElements(By.tagName("table"));
        System.out.println("Number of tagname table found : " + tagnameTest.size());


        // Xpath - relative and absolute
        // Relative - jump directly to the element, starts with '//'    //*[@class = " "]//*[contains(text(),""))]
        // Absolute - Starts from beginning, starts with '/', ex - /html/title/body/hear/

        // How to mention multiple attributes in xpath:
        //      --- //tagname[@attribute][@attribute]


        // xpath -- and / or operator
        //      --- //tagname[@attribute1 and @attribute2]
        //      --- //tagname[@attribute1 and @attribute2]

        // xpath --     inner text  -> text()
        //      --- //tagname[text()="value"]       // "value" is not an attribute, its a inner text

        // xpath -- Link text
        /*
                <a href = "https://xyz.com"> Click Me </a>      // Click me is both Link text and inner text

                <div> welcome <div>                             // Welcome is just inner text, it's not a Link text
         */


        // xpath --     contains()
        //      --- /// tagname[contains(@attribute,"Value")]
        //      --- /// tagname[contains(text(),"Value")]           // if inner text is present


        // xpath --     starts-with()           -- it will check for the attribute starts with
        //      --- /// tagname[starts-with(@attribute,"Value")]

        // xpath ---    handling dynamic element
                // look for any attribute or inner text() which is common in dynamic element


        //  xpath --    chained -- when there are no attribute or tagname or inner tex then we can access by using previous tagname


        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit wait
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement waitElement = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        // Fluent wait
        Wait<WebDriver> wait3 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))        // total time to wait
                .pollingEvery(Duration.ofSeconds(5))        // check every 5 seconds
                .ignoring(NoSuchElementException.class);    // ignore these while waiting

        WebElement element2 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        driver.close();
    }

}
