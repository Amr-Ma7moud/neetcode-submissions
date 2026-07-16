class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size
        var m = r/2
        
        while ( m < r ){
            when {
                nums[m] == target -> return m
                nums[m] > target  -> r = m; 
                nums[m] < target  -> l = m.inc()
            }
            m = (l+r)/2;
        }
        
        return -1
    }
}
