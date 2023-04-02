package OppsConcept;

public class InterfaceDemo {
    
    

    
}
interface A{
    double PI =3.14;
    // interfaces are blueprint for classes

    // 100 %  abstract
    // all variables in interface are by default public static final 

    // all methods in interfaces are by default public abstract
    // compiler would see the below function as
    // public abstract void func1();
    void func1();
}
interface B{
    
    void func1();
}

interface Q extends A,B{

}
class D{
// speak()
void speak(){
    System.out.println("D");
}
}
class F{
// speak()
void speak(){
    System.out.println("F");
}
}

// not possible using classes
// class X extends D,F{

// }
class C implements A,B{
    @Override
    public void func1(){

    }
}

// to inherit one interface into a class we use implements keyword
// to inherit one interface into another interface we use extends keyword
// to inherit one class into another class we use extends keyword

// cant do 
//  interface A extends D (D is class here)
