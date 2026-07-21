class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var l = 0;
        var r = nums.lastIndex;
        while ( l != r){
            when {
                nums[l]+nums[r] > target  -> r-- 
                nums[l]+nums[r] < target  -> l++
                else -> break 
            }
        }
        return intArrayOf(++l,++r)
    }
}
