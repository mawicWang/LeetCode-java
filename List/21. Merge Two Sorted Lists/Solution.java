/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1, q=l2, head = new ListNode(0);
        ListNode cur = head;
        while(p != null || q != null) {
            if(p == null) {
                cur.next = q;
                break;
            }
            if(q == null) {
                cur.next = p;
                break;
            }
            
            if(p.val < q.val){
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        
        return head.next;
    }
}
