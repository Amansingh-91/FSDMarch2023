package OppsConcept;

public class ClassAndObjectDemo {
    // classes in java
    // logical entity
    // blueprint

    // Objects
    // Physical entity / real life entity
    // Instance of class
    public static void main(String[] args) {
        // local  variable Demo
        // int a ;
        // if(a == 0){
        //     int b = 20;
        //     System.out.println(a + b);
        // }
        // System.out.println(b);

        // Syntax for creating object
        // class_Name obj_name = new ClassConstructor();

        Student s1 = new Student("July",135);
        Student s2 = new Student();

        System.out.println("Name of student 2 is"+s2.s_id);
        System.out.println("Name of student 1 is"+s1.s_id);

        s1.isActive  = true;
        s1.Name = "Aman";
        s1.s_id = 123;

        s2.isActive  = false;
        s2.Name = "Divya";
        s2.s_id = 122;

        System.out.println("Name of student 2 is"+s2.Name);
        System.out.println("Name of student 1 is"+s1.Name);
        
        System.out.println("status :" + s2.isActive);
        s2.logIn();
        System.out.println("status :" + s2.isActive);
        s2.logOut();
        System.out.println("status :" + s2.isActive);








    }


}

class Student{
    // Three types of variables in java

    // local variables -> create inside a function , Has the local scope[Inside the block/the curly braces"{}" it is created], doesn't have default value

    // Instance variable -> created inside class but outside any function, has the object scope, they have default values


    // static / class variable -> created inside class but outside any function with static keyword , has class scope

    int s_id;//0
    String Name;// null
    boolean isActive;// false

    // Cunstructors 
    // special functions
    // which have same name as class name and have no return type
    //  Purpose of cunstructors are to provide value to Instance variables

    // Default constructor-> constructor with no parameters
    // if we don't create any constructor , the default constructor will be create by compiler
    
    Student(){
        this.Name = "Dharam";

    }

    // Parameterized constructor

    Student(String Name,int s_id){
        // x =5
        // neweq.x = x
        this.Name = Name;
        this.s_id = s_id;

    }

    public void logIn(){
     this.isActive = true;
    }

    public void logOut(){
        this.isActive = false;
    }






}