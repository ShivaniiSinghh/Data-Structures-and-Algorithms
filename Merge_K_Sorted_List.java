package Tree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_List {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while (!pq.isEmpty()) {
            ListNode r = pq.poll();
            dummy.next = r;
            dummy = dummy.next;
            if (r.next != null) {
                pq.add(r.next);
            }
        }
        return temp.next;
    }
    public static void main(String[] args) {
    }
}
