package com.arun.refactoring;

/**
 * @author arun on 12/18/20
 */
public class BooleanParameters {

    public static void main(String[] args) {
        bigUglyMethod(10, 20);
        //requirement is to add few more complex logic after Complex logic 3 for one of the use case where we have to print the addition of 2 numbers
        bigUglyMethodRefactored(30, 40);
        bigUglyMethodRefactoredWithExtraStuff(20, 40);
    }

    //we could have passed a boolean, but that is not what is ideal when the code is less
    static void bigUglyMethod(int a, int b) {
        System.out.println("Complex logic 1 " + a + " : " + b);
        System.out.println("Complex logic 2 " + a + " : " + b);
        System.out.println("Complex logic 3 " + a + " : " + b);

        System.out.println("More Complex logic 4 " + a + " : " + b);
        System.out.println("More Complex logic 5 " + a + " : " + b);
        System.out.println("More Complex logic 6 " + a + " : " + b);
    }


    static void bigUglyMethodRefactored(int a, int b) {
        beforeLogic(a, b);
        afterLogic(a, b);
    }

    static void bigUglyMethodRefactoredWithExtraStuff(int a, int b) {
        beforeLogic(a, b);
        System.out.println("This is the extra stuff done : " + (a + b));
        afterLogic(a, b);
    }

    private static void beforeLogic(int a, int b) {
        System.out.println("Complex logic 1 " + a + " : " + b);
        System.out.println("Complex logic 2 " + a + " : " + b);
        System.out.println("Complex logic 3 " + a + " : " + b);
    }

    private static void afterLogic(int a, int b) {
        System.out.println("More Complex logic 4 " + a + " : " + b);
        System.out.println("More Complex logic 5 " + a + " : " + b);
        System.out.println("More Complex logic 6 " + a + " : " + b);
    }

}
