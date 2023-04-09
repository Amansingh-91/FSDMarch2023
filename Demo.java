import java.util.Scanner;

public class Demo {
    public static void main(String[] args ) { // 1unit
        Scanner sc = new Scanner(System.in);// 1 unit
        System.out.println("enter the number");// 1 unit
        int n =  sc.nextInt();// 1 unit also 1 unit space
        sc.nextLine();// 1 unit
        // for (int i = 0; i < n; i++) {// 1 unit of space for i
        //     System.out.println(i);// 1 unit
        //     System.out.println("hello"); // 1 unit
        // } // n * 2
        // time polynomial equation for this program
        // 5 + (n * 2) = 2n + 5 => c1 * n + c2
        // highest polynomial power
        // 2n 
        // remove the constant , whatever remains is your time complexity
        // n => O(n) bigOh time of this program

        // space polynomial equation for this program
        // 2* n^0= 2
        // highest polynomial power
        //  2*n^0
        // remove the constant , whatever remains is your time complexity
        // n^0 => O(1) bigOh space of this program

        for(int i =1 ; i<= n ;i = i * 2){
            System.out.println(i);
        } 

    }
}
