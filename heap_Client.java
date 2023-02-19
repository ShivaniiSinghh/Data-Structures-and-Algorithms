package Tree;

public class heap_Client {
    public static void main(String[] args) {
        Min_Heap hp = new Min_Heap();
        hp.add(10);
        hp.add(2);
        hp.add(5);
        hp.add(-4);
        hp.add(7);
        hp.add(-1);
        hp.add(15);
        hp.add(3);
        hp.add(8);
        hp.display();
        System.out.println(hp.min());
        hp.display();
        System.out.println(hp.remove());
        hp.display();
        System.out.println(hp.remove());
        hp.display();
    }
}
