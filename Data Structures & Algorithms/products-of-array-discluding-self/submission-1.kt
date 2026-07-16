class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val suffixProduct = IntArray(nums.size)
        val prefixProduct = IntArray(nums.size)
        prefixProduct[0] = 1
        suffixProduct[nums.size-1] = 1

        for( i in 1..nums.size-1 ){
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1]
        }
        for( i in nums.size-2  downTo 0){
            suffixProduct[i] = suffixProduct[i+1] * nums[i+1]
        }
        for( i in 0..nums.size-1){
            prefixProduct[i] = prefixProduct[i] * suffixProduct[i];  
        }
        return prefixProduct;
    }
}
