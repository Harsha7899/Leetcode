/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode single_pointer = head;
        ListNode double_pointer = head;

        if (head == null)
        return false;

        while(double_pointer != null && double_pointer.next != null){
            double_pointer = double_pointer.next.next;
            single_pointer = single_pointer.next;
            if(double_pointer == single_pointer)
            return true;
        }
        return false;
    }
}