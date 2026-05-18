package testngdemo;

// in testng we dont need to create main()

// Structure :
    // TestSuite --> Test Cases --> Test steps
    // Pakg     --> classes     --> methods  -- @Test

/*
        1. Setup    - open browser and application
        2. Login
        3. close
 */

// Using xml file we can run the test case : Refer
/*
        1. Go to settings -> Plugins -> Search "Testng XMl"
        2. Install "TestNg xml", then click on Project -> Create new TestNg xml
        3. Mention the "Test case / class name" inside xml
        4. Go to Run -> xml
 */


// Report generation :
/*
        1. Go to "Edit configuration"
        2. Select the "Xml" file then select tab "Listeners"
        3. click '+' and add "Email report" / "Failed report"
        4. Run the xml and check the report in "test-output"
 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("Searching for customer");
        Assert.fail();          // to fail this test case
    }

    @Test(priority = 4)
    void addCustomer(){
        System.out.println("Customer added");
    }
    @Test(priority = 5)
    void teardown(){
        System.out.println("Closing browser");
    }
}
