import java.util.Scanner;

class IfElseDemo{
    public static void main(String[] args) {
        // two conditional statements also known as decision making statements
        // if-else if-else
        // switch case

        Scanner sc = new Scanner(System.in);
        // if statement works when conditions become true
        System.out.println("enter your age");
        int age ;
        age = sc.nextInt();
        sc.nextLine();

        // if(conditions){
            //  block of code 
        // }

        //  x +5 ; x = 3
        // Relational operators // used to provide relation between two operends

        // > greater than
        // < less than  
        // == equality   
        // != not equal  4 != 5  true  4 != 4  false
        // >= greater than or equal to
        // <= less than or equal to

        // else if ladder 
        // elseif condition only get executed if previous condition is false
        // if(age > 17){// 18 > 17
        //     System.out.println("elegible");
        // }

        // else if(age == 17){
        //     System.out.println("elegible for learning licence");
        // }

        // else if(age == 16){
        //     System.out.println("try next year for learning licence");
        // } 
            
        // else{
        //     System.out.println("not elegible");
        // }
        
        // multiple if

        // if(age > 17){// 18 > 17
        //     System.out.println("elegible");
        // }

        // if(age == 17){
        //     System.out.println("elegible for learning licence");
        // }

        // if(age == 16){
        //     System.out.println("try next year for learning licence");
        // } 
            
        // else{
        //     System.out.println("not elegible");
        // }

        // nested if else
        
        // if(age >17 ){
        //     System.out.println("do you have driving licence? if yes press y else press n");
        //    char ch =  sc.nextLine().charAt(0);

        //    if(ch == 'y'){
        //     System.out.println("you can drive car");
        //    }
        //    else{
        //     System.out.println("you cant drive car");
        //    }

        // }
        // else if(age == 17){
        // System.out.println("elegible for learning licence");
        // }

        // else if(age == 16){
        //     System.out.println("try next year for learning licence");
        // } 
            
        // else{
        //     System.out.println("not elegible");
        // }

        //  multiple conditions
        //  we use Logical operators to join multiple conditions

        // && => and operator  
        // || => or operator 
        
        System.out.println("do you have driving licence? if yes press y else press n");
        char ch =  sc.nextLine().charAt(0);

        if(age >= 18 && ch =='y'&& 4 != 5){
            System.out.println("can drive");
        }
        else{
            System.out.println("cant drive");
        }



        System.out.println("Outside of if");

    }
}