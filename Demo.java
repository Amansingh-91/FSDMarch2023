import java.util.LinkedList;

public class Demo {
    int max;
    Demo(int max){
        this.max = max;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(13);
        System.out.println(ll);
        Demo d1 = new Demo(11);
        Demo d2 = new Demo(18);
        LinkedList<Demo> ll1 = new LinkedList<>();
        ll1.add(d1);
        ll1.add(d2);
        System.out.println(ll1);
    }
    public String toString(){
        return ""+this.max +" aman";
    }
}
