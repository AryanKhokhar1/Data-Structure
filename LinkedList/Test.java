//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode temp = head;
//        ListNode dummy = new ListNode(0);
//        ListNode answer = dummy;
//        int number = 200;
//        while(temp != null && temp.next != null){
//            if(temp.val == temp.next.val || temp.val == number){
//                number = temp.val;
//                System.out.println("Not Selected:"+temp.val);
//            }else{
//                ListNode node = new ListNode(temp.val);
//                dummy.next = node;
//                dummy = dummy.next;
//                System.out.println("Selected:"+temp.val);
//            }
//            temp = temp.next;
//        }
//        ListNode ans = answer.next;
//        return ans;
//    }
//}
//class Test{
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        ListNode node1 = new ListNode(5);
//        ListNode node2 = new ListNode(4,node1);
//        ListNode node3 = new ListNode(4,node2);
//        ListNode node4 = new ListNode(3,node3);
//        ListNode node5 = new ListNode(3,node4);
//        ListNode node6 = new ListNode(2,node5);
//        ListNode node7 = new ListNode(1,node6);
//        while(node7 != null){
//            System.out.print(node7.val+" -> ");
//            node7 = node7.next;
//        }
//        System.out.println();
//        ListNode ans = sol.deleteDuplicates(node7);
//
//        while(ans != null){
//            System.out.print(ans.val+" -> ");
//            ans = ans.next;
//        }
//    }
//}