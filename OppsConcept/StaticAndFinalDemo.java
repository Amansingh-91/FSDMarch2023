package OppsConcept;

class StaticAndFinalDemo{
    // Static and Final keywords are non-access modifiers
    // 
     int age;

    static int var =10;

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
   public static void main(String[] args) {
        StaticAndFinalDemo s1 =  new StaticAndFinalDemo();
        StaticAndFinalDemo s2 =  new StaticAndFinalDemo();
        var = 12;
        s1.age = 12;
        System.out.println(s2.var);
        System.out.println(s2.age);
        StaticAndFinalDemo.sum(10, 12);
        StaticAndFinalDemo.sum(10, 12);
   }
}