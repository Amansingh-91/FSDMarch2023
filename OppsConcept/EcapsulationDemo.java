package OppsConcept;

public class EcapsulationDemo {
    // wrappinmg up of data into a single unit
    //  ussed to increase security

    // data hiding and Ecapsulation goes hand in hand

    // access modifiers
    // public , private , protected , default
    public static void main(String[] args) {
        admin a1 = new admin();
        // a1.name = "Aman";
        // a1.salary = 30000;
        System.out.println(a1.getName());
        System.out.println(a1.getSalary());
        a1.setSalary(20000);
        System.out.println(a1.getSalary());


    }


}

class admin{
    private String name;
    private int salary;

    admin(){
        this.name = "Aman";
        this.salary = 30000;
    }

    // getter and setter methods
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    // setter 
    public void setSalary(int salary){
        this.salary = salary;
    }

}

