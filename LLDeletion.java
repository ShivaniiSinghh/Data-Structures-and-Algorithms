import java.util.Scanner;

public class LLDeletion {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a node at head
    public void insert_front(int data) {
        LLDeletion.Node newnode = new LLDeletion.Node(data);
        if (head == null) {
            head = newnode;
            head.next = null;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    //DELETING NODE FROM BEGINNING
    public void delete_from_beginning() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        temp = temp.next;
        head = temp;
    }
    //TO DELETE NODE FROM END
//    public LLDeletion.Node delete_from_end(){
//        LLDeletion.Node temp = head;
//        if(temp == null){
//            System.out.println("List is empty");
//        }
//        if(temp.next == null){
//            System.out.println("Only one node was present in Linked List which is deleted");
//            return null;
//        }
//        while(temp.next.next !=null){
//            temp = temp.next;
//        }
//        temp.next= null;
//        return head;
//    }
    public void delete_from_end(){
        Node temp = head;
        Node ptr = temp.next;
        while(ptr.next !=null){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next= null;
    }
    //TO DELETE FROM A SPECIFIC POSITION
    public void delete_from_specific_position(int p){
        Node temp = head;
        Node ptr = temp.next;
        if(head == null){
            System.out.println("List is empty");
        }
        if(p==0){
            head = temp.next;
        }
        for(int i =0; i<p-1; i++){
            temp = temp.next;
            ptr = ptr.next;
        }
        temp.next = ptr.next;
    }
    public void printAll() {
        LLDeletion.Node p = head;
        int pos = 1;
        while (p != null) {
            System.out.println("Node at position " + pos + " is " + p.data);
            pos++;
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LLDeletion ll = new LLDeletion();
        ll.insert_front(1);
        ll.insert_front(2);
        ll.insert_front(3);
        ll.insert_front(4);
//      ll.delete_from_beginning();
//      ll.delete_from_end();
  ll.delete_from_specific_position(3);
        ll.printAll();
    }
}
