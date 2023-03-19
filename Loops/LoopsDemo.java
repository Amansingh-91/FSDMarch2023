package Loops;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        // loops are noting but repeative thing or task
        Scanner sc = new Scanner(System.in);
        // for loop -> exact no. of time you need to repeat somthing
        // for(startpoint;end cond;inc/dec){
            // code block
        // }
        // for(int i = 1 ; i <=5 ;i++ ){
        //     System.out.println("enter the name");
        //     String name= sc.nextLine();
        //     System.out.println("hello"+name);
        // } 
        
        // while Loop

        char ch = 'y';
        int laps =0;
        while(ch == 'y'){
            laps++;
            System.out.println("Should i continue running");
            ch = sc.nextLine().charAt(0);
        }

        System.out.println(laps);
       
    }
}
