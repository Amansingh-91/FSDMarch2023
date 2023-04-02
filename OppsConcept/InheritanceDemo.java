package OppsConcept;
public class InheritanceDemo {
    public static void main(String[] args) {
       Man m1 = new Man();
       m1.name = "Aman";
       m1.sleep();
       m1.eating();
        Human h1 = new Human();
        m1.Gender ="Male";
       System.out.println(m1.name);
    }
}
class Human{
    String name;
    int age;
    
    void eating(){
        System.out.println(this.name +" is eating");
    }
}
class Man extends Human {
    String Gender;

    public void sleep(){
        System.out.println("Sleeping");
    }
}

class Women extends Human{
    
}