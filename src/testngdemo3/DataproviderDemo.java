package testngdemo3;


// Apart from parameter there is another way to pass data using Data provider
//          Syntax - @DataProvider(name="LoginDataProvider")
//          Syntax for using - @Test(dataProvider = "LoginDataProvider")


//          If data provider is present in another class -
//              @Test(dataProvider = "LoginDataProvider", dataProviderClass = name.class)


    //  1. In same tc we create a method which is responsible for generating data -- called as Data provider method
    //  2. Data returns a two-d array
    //  3. Data provider can be implemented in same or another class

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"abc@gamil.com","abc"},{"xyz@gamil.com","xyz"},{"ijk@gamil.com","ijk"}};
            return data;
    }

    @Test(dataProvider = "LoginDataProvider")
    public void logintTest(String email, String pwd){
        System.out.println(email + " " + pwd);
    }

}
