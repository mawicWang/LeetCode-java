/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length == 0) {
            return null;
        }
        if(length == 1) {
            return lists[0];
        }
        if(length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }
        ListNode[] l1 = new ListNode[length/2], l2 = new ListNode[length - length/2];
        System.arraycopy(lists, 0, l1, 0, l1.length);  
        System.arraycopy(lists, length/2, l2, 0, l2.length);
        return mergeTwoLists(mergeKLists(l1), mergeKLists(l2));
    }
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1, q=l2, head = new ListNode(0);
        ListNode cur = head;
        while(p != null && q != null) {
            if(p.val < q.val){
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        cur.next = p == null ? q : p;
        return head.next;
    }
}
