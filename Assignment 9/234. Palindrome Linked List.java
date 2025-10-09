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

// TC: O(n)
// SC: O(1)

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode fast = head, slow = head, prev = null;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            ListNode NN = slow.next;  // Reverse Logic
            slow.next = prev;
            prev = slow;
            slow = NN;
        }

        if (fast!=null) {           // if length is odd then mid.next for slow
            slow = slow.next;
        }

        while(slow!=null) {
            if (slow.val != prev.val) return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}

// Example 1:
// Input: head = [1,2,2,1]
// Output: true

// Example 2:
// Input: head = [1,2]
// Output: false
