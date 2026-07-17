class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if( nums.isEmpty() ) return 0
        val set = nums.toSortedSet();
        var res = 0;
        var max = 0;
        set.forEach {
            if( set.contains(it-1) )
                res = res.inc()
            else if ( max > res ) max = max else {
                max = res
                res = 0;
            }

        }
        return max(max,res).inc();
    }
}