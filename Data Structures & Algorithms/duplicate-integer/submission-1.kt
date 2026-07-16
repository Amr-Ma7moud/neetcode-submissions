
class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = hashSetOf<Int>();
        nums.forEach { 
            if (hashSet.contains(it)) return true;
            hashSet.add(it)
        }
        return false
    }
}