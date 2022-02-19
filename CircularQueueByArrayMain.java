class CircularQueueByArray {
    int arr[];
    int size;
    int beginning;
    int top;
    public CircularQueueByArray(int size) {
        arr= new int[size];
        this.size = size;
        beginning = -1;
        top = -1;
    }
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull() {
        if(top+1 == beginning) {
            return true;
        }
        else if((beginning== 0) && (top+1 == size)) {
            return true;
        }
        else {
            return false;
        }
    }
    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("overflow");
        }
        else if(isEmpty()) {
            beginning = 0 ;
            top ++;
            arr[beginning] = value;
        }
        else {
            if(top+1 == size) {
                top= 0;
            }
            else {
                top++;
            }
            arr[top]= value;
        }
    }
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println(arr[beginning]);
            if(beginning == top) {
                beginning= top = -1;
            }
            else if(beginning+1 == size) {
                beginning = 0;
            }
            else {
                beginning++;
            }
        }
    }
    public void traverse() {
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
public class CircularQueueByArrayMain {
    public static void main(String[] args) {
        CircularQueueByArray  obj = new CircularQueueByArray(3);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        //obj.enqueue(40);
        obj.traverse();
        System.out.println("dequeue");
        obj.dequeue();

        System.out.println("======");
        obj.traverse();

        obj.enqueue(40);
        System.out.println("========");
        obj.traverse();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(100);
        obj.enqueue(200);
        obj.enqueue(300);
        System.out.println("==============");
        obj.traverse();
    }
}
