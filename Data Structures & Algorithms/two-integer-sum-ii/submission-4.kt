class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var l = 0;
        var r = nums.lastIndex;
        var currSum = 0
        while ( l != r){
            currSum = nums[l]+nums[r]
            when {
                currSum > target  -> r-- 
                currSum < target  -> l++
                else -> break 
            }
        }
        return intArrayOf(l.inc(),r.inc())
    }
}
