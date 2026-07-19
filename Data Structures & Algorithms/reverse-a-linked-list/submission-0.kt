/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head

        while (current != null) {
            val next = current.next   // Save next node
            current.next = prev       // Reverse pointer
            prev = current            // Move prev forward
            current = next            // Move current forward
        }

        return prev
    }
}