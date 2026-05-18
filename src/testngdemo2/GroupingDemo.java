package testngdemo2;




// Groups in testng
//          @Test(groups = {"regression"}) --> we can also defined multiple groups
//          @Test(groups = {"regression,"sanity"})


/*
        inside xml we can create the group that we want to run
        Hierarchy  - suit name -> test name -> groups -> classes -> test methods
 */

import org.testng.annotations.Test;

public class GroupingDemo {
    @Test(groups = {"regression"})
    void test1(){
        System.out.println("This is test 1 .. ");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is test 2 .. ");
    }

    @Test(groups = {"sanity"})
    void test3(){
        System.out.println("This is test 3 .. ");
    }

    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is test 4 .. ");
    }

    @Test(groups = {"regression"})
    void test5(){
        System.out.println("This is test 5 .. ");
    }

    @Test(groups = {"regression", "sanity"})
    void tes6(){
        System.out.println("This is test 6 .. ");
    }
}
