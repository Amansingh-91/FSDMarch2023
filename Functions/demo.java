package Functions;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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


        // int d =  a + b + c;
        // System.out.println("the sum of two numbers is "+d);

        FunctionDemo obj =  new FunctionDemo();

        System.out.println("enter two numbers to be added");
        System.out.println("enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("enter second number");
        int b = sc.nextInt();
        sc.nextLine();

        int c = obj.addTwoNumbersReturn(a, b);
        System.out.println(c);

        System.out.println("What is your name ?");
        String name = sc.nextLine();
        obj.greetWithName(name);
        
    }
}
