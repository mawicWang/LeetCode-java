/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        recursive(head, l1, l2, 0);
        return head.next;
    }
    
    private void recursive(ListNode res, ListNode l1, ListNode l2, int upgrade) {
        int sum, val, nextUpgrade;
        if(l1 != null || l2 != null) {
            int v1 = l1!=null ? l1.val : 0;
            int v2 = l2!=null ? l2.val : 0;
            sum = v1 + v2 + upgrade;
            val = sum%10;
            nextUpgrade = sum/10;
            res.next = new ListNode(val);
            
            ListNode _l1 = null, _l2 = null;
            if(l1 != null) {
                _l1 = l1.next;
            }
            if(l2 != null) {
                _l2 = l2.next;
            }
            recursive(res.next, _l1, _l2, nextUpgrade);
        } else if(upgrade != 0) {
            res.next = new ListNode(upgrade);
        }
        
    }
}
