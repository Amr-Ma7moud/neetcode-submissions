/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
 
class Solution {
    fun reverseList( head: ListNode?): ListNode? {
        if ( head == null ) return null
        var node = head
        val st = Stack<ListNode>()
        while (node != null) {
            st.push(node)
            node = node.next
        }
        var newHead: ListNode? = null
        newHead = st.pop()
        var temp: ListNode? = newHead
        while( st.isNotEmpty() ) {
            temp?.next = st.pop()
            temp = temp?.next
        }
        temp?.next = null
        return newHead
    }
}
