package ExceptionHandeling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ExceptionDemo {
    public static void main(String[] args)throws FileNotFoundException {
        // Exception
        // compile time exception /checked
        // runtime or unchecked exception
        // to handle the exception we use Try catch block
        Scanner sc = new Scanner(System.in);
        File file = new File(
            "C:\\Users\\pankaj\\Desktop\\test.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
        int a =0;
        try{
            System.out.println("enter the number");
            a = sc.nextInt();
            // System.out.println(a);
        }
        catch(Exception babaYaga){
            System.out.println(babaYaga);
            System.out.println("handeling exception");
        }
        System.out.println(a);
        

    }
}
