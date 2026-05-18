package Day7;

// In java class dont support Multiple inheritance
    // why?
/*
       1. Because extend keyword supports only one class

       2. Why can't we extend multiple classes,
            if there are same name of variables/ method inside two classes
            then there will be ambiguity issues (conflict/ confusion during compile time)

        If we don't have any duplicates? we shouldn't have any problem ?
        Suppose we have two classes c1/c2, without any duplicate method/ variables
        But in java all the classes are by default gets extended from 'Object' class
        So c1/c2 both will inherit methods from 'Object' class and
        if we want to extend both c1/c2 then again it will have ambiguity issues


        Multiple inheritance is achieved using interface concept
 */


public class OopsMultipleInheritanceDemo {
}
