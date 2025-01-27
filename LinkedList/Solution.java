 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {

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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry = 0;
        while(l1 != null || l2 != null){
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            System.out.println("Num1: "+num1+": Num2: "+num2);

            
            int value = (carry+num1+num2)%10;
            ListNode node = new ListNode(value);
            dummy.next = node;
            dummy = dummy.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            carry = (num1+num2)/10;
        }
        if(carry == 1){
            ListNode node = new ListNode(1);
            dummy.next  = node;
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n4 = new ListNode(4,n1);
        ListNode n5 = new ListNode(2,n4);

        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(6,n6);
        ListNode n8 = new ListNode(5,n7);
        ListNode node = addTwoNumbers(n5,n8);
        while(node != null){
            System.out.print(node.val+" -> ");
        }
        System.out.println("END");
    }
}