
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        if (count == k) {
            ListNode prev = null, curr = head, next = curr.next;

            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head.next = reverseKGroup(curr, k);

            return prev; 
        }

        return head;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        ListNode result = solution.reverseKGroup(node1, 3);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
            }
        }

}