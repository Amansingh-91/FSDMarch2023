package Functions;

import java.util.Scanner;

public class FunctionDemo {

    // function syntax
    // access-mod non-access-mod[optional] return-type functionName(parameters[optional]){
        // code block
    // }

    // types of function
    // parameterized function
    // non-parameteerized function

    // non-parameteerized function with no-return-type
    public void greet(){
        System.out.println("Hello friend, How are you?");
    }

    // non-parameteerized function with return-type
    public int greetCount(){
        System.out.println("Hello friend");
        return 12;
    }
    // parameterized function witn no-return-type
    public void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    } 

    public void greetWithName(String name){
        System.out.println("Hello "+name+" , How are you?");
    }

    // parameterized function witn return-type

    public int addTwoNumbersReturn(int a, int b){
        System.out.println("performing addition");
        return a + b;
    } 
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter three numbers to be added");
        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // sc.nextLine();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        // sc.nextLine();
        // System.out.println("enter third number");
        // int c = sc.nextInt();
        // sc.nextLine();

        // int d =  a + b +c;
        // System.out.println("the sum of two numbers is "+d);

        // syntax 
        // Class-name obj_name = new Class-name(); 

        FunctionDemo obj = new FunctionDemo();

        for (int i = 0; i < 5; i++) {
            // function call 
            // obj_name.functionName
            obj.greet();
        }

        // int myReturn =  obj.greetCount();
        // System.out.println(myReturn);
        obj.greetCount();

        obj.addTwoNumbers(12,13);
        obj.addTwoNumbers(12,12);


        obj.greetWithName("Aman");
        int c = obj.addTwoNumbersReturn(13, 14);
        int d = obj.addTwoNumbersReturn(12, 15);
        System.out.println(c+d);

    }
}
