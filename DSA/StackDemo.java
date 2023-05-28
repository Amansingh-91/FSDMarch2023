package DSA;

public class StackDemo{
    int arr[];
    int top;

    public StackDemo(int size){
        arr = new int[size];
        top = -1;
    }
    public void printStack(){
        if(!isEmpty()){
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("stack is empty");
        }
    }
    public void push(int data){
        if(top == arr.length -1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("underflow");
            return -123;//garbage value
        }
        int del = arr[top];
        arr[top] = -123;//garbage value 
        top--;
        return del;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
     
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        return -123;//garbage value
    }

    public static void main(String[] args) {
        StackDemo s =  new StackDemo(5);
        s.push(5);
        s.push(7);
        s.push(9);
        s.push(15);
        s.push(12);
        s.push(18);//overflow
        s.printStack();
        System.out.println(s.isEmpty());//false
        System.out.println(s.pop());//12
        System.out.println(s.pop());//15
        s.printStack();
        System.out.println(s.peek());// 9
        System.out.println(s.pop());//9
        System.out.println(s.pop());//7
        System.out.println(s.pop());//5
        System.out.println(s.pop());//-123 underflow
        System.out.println(s.pop());//-123 underflow
        System.out.println(s.isEmpty());// true
        s.printStack();

    }

}