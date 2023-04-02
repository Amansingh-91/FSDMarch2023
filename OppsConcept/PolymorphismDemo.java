package OppsConcept;

public class PolymorphismDemo {
    // Method Overloading // compile time
    // is the concept of creating multiple functions using same function name, the difference would be the no. of parameters or type of parameters
    public static int area(int a){
        // area of square
        return a * a;
    }
    public static int area(int a,int b){
        // area of rectngle
        return a * b;
    }
    public static double area(int b,long h){
        // area of triangle
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(12, 10));
        System.out.println(area(5, 10L));
        Student s1 =  new Student();
        Student s2 =  new Student("Aman");
        Student s3 =  new Student("jack",12);

        Dog d = new Dog();
        d.speak();


        

    }


}

class Student{
    int s_id;
    int age;
    String name;
    // constructor overloading
    Student(){
        this.s_id = -1;
        this.age = -1;
    }
    Student(String name){
        this.name = name;
    }
    Student(int s_id){
        this.s_id = s_id;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }


}

