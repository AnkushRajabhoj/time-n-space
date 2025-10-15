// Last updated: 15/10/2025, 06:03:16
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverseLL(l1);
        // l2 = reverseLL(l2);
    
        int c = 0;


        ListNode sum = null;
        ListNode tail = null;
        while(l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0; 
            int l2Val = l2 != null ? l2.val : 0; 
            int s = (l1Val+ l2Val + c) % 10;
            c = (l1Val+ l2Val + c) / 10;
            ListNode node = new ListNode(s);
            if (sum == null) {
                sum = node;
            } else {
                tail.next = node;
            }
            tail = node;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (c != 0) {
             ListNode node = new ListNode(c);
             tail.next = node;
             tail = node;
        }
        return sum;
    }

    public ListNode reverseLL(ListNode l1) {
        ListNode tail = null;
        while(l1 != null) {
            ListNode temp = l1.next;
            l1.next = tail;
            tail = l1;
            l1 = temp;
        }
        return tail;
    }


}