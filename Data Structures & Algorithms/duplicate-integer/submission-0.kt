class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = hashMapOf<Int , Int>();
        for (num in nums) {
            hashSet[num] = hashSet.getOrDefault(num, 0) + 1;
            if ( hashSet.getOrDefault(num, 0) > 1) return true;
        }

        return false
    }
}
