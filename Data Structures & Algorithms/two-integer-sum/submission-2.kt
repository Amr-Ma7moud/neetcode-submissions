class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashtable = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, it ->
        hashtable[it] = index
    }
    nums.forEachIndexed { index, it ->
        if ( hashtable[target - it] != null&& hashtable[target-it] != index ) return intArrayOf(index,hashtable[target - it]!!)
    }
    return intArrayOf()
}
}
