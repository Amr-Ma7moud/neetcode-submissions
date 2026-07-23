/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        when{
            ( list1 == null && list2 == null) -> return null
            (list1 == null) ->return list2
            (list2 == null) ->return list1
        }

        var newList :ListNode? = null;

        var temp1 = list1
        var temp2 = list2

        if (temp1.`val` > temp2.`val`){
            newList = temp2
            temp2= temp2.next
        }else{
            newList = temp1
            temp1= temp1.next
        }
        var tempList = newList
        tempList.next = null
        while( temp1 != null || temp2 != null ){
            if( temp1 == null ) {
                tempList?.next = temp2
                break
            }
            else if( temp2 == null ) {
                tempList?.next = temp1
                break
            }
            if (temp1.`val` > temp2.`val`){
                tempList?.next = temp2
                temp2= temp2.next
            } else{
                tempList?.next = temp1
                temp1= temp1.next
            }
            tempList = tempList?.next
        }

        return newList;
    }

}
