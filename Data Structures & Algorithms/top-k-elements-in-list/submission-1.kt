class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val maxHeap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
        val hashMap = hashMapOf<Int, Int>()
        val res = IntArray(k)
        nums.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        hashMap.forEach { f, s ->
            maxHeap.add(Pair(f, s))
        }
        for(i in 0..k-1){
            res[i] = maxHeap.poll().first;
        }

        return res;
    }
}
