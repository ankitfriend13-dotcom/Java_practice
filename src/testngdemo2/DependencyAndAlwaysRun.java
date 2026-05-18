package testngdemo2;


// One test case depends on another test case
//      @Test(dependsOnMethods = {"startCar"})
//      we need to always run the entire class inorder to run as one test depends on another



//  Always run -- if one of the dependent test fails then entire class is going to fail
//      to overcome that use --> @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
//      alwaysRun = true   --> this will cause the test case to run always even if dependent test case fails


import org.testng.annotations.Test;

public class DependencyAndAlwaysRun {
    @Test
    void startCar(){
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("car is driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("car stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("car parked");
    }

}
