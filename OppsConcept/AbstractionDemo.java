package OppsConcept;

public class AbstractionDemo {
    // concept of hiding unnecessary detail from user
    // 2 ways to perform abstraction in java
    // using abstract classes
    // abstract classes provides 0 % to 100 % abstraction
    // you can not instanciate an abstract class / you cant create object for it
    // using interfaces

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.speak();
        d1.guard();
        // syntax for object creation
        // new class_Constructor();

        // syntax for object creation and storing the object
        // class_name var = new class_Constructor(); 

        // new keyword is used for instanciation // allocating memory
        // class_Constructor() is used for initialization

        // dynamic method dispatch
        // a parent class ref can store child class object
        Animal a1 = new Dog();
        a1.speak();
        // a1.guard();
        // Dog d2 = new Animal();

    }
    

}
abstract class Animal{

    // abstract function
    // function which has only defination no declaration
    // we use abstract keyword to create abstract function
    public abstract void speak();

    public void noramlfunc(){
        System.out.println("is normal func");
    }


    
}

class Dog extends Animal{

    @Override
    public void speak(){
        System.out.println("Barking");
    }

    public void guard(){
        System.out.println("guarding");
    }


}

class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meowing");
    }
}

class Lion extends Animal{
    @Override
    public void speak(){
        System.out.println("Roaring");
    }
}

class Elephant extends Animal{
    public void speak(){
        System.out.println("thrumpet");
    }
}

abstract class DemoAbs{
    public void normal(){
        System.out.println("in normal function");
    }
}