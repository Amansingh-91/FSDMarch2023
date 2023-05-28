package DSA;

public class QueueDemo{
    int front , rear;
    int arr[];
    public QueueDemo(int capacity){
        arr= new int[capacity];
        front = -1;
        rear = -1;
    }
    public void insert(int data){
        if(rear == arr.length -1){
            System.out.println("Overflow");
        }
        else{
            rear++;
            arr[rear] = data;
        }
    }
    public int delete(){
        if(rear == front){
            return -123;// garbage value
        }
        else{
            front++;
            int del = arr[front];
            arr[front] = -123;
            return del;
        }
    }
    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }
    public int peek(){
        if (this.isEmpty()) {
            return -123;
        }
        return arr[front +1];// front +1 != front++
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        QueueDemo q1 = new QueueDemo(5);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        q1.insert(6);
        System.out.println("printing queue");
        q1.printQueue();
        System.out.println(q1.isEmpty());
        System.out.println(q1.delete());

        System.out.println(q1.delete());
        System.out.println("printing queue");
        q1.printQueue();
        System.out.println(q1.delete());
        System.out.println(q1.delete());
        System.out.println("peek");
        System.out.println(q1.peek());
        System.out.println(q1.delete());
        
        

    }
}