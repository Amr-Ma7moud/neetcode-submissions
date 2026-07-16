
class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = mutableSetOf<Int>();
        nums.forEach { 
            if (hashSet.contains(it)) return true;
            hashSet.add(it)
        }
        return false
    }
}