class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if ( s.length != t .length ) return false
        val firstHashMap = HashMap<Char, Int>();
        val secondHashMap = HashMap<Char, Int>();
        s.forEach {
            firstHashMap[it] = firstHashMap.getOrDefault(it, 0) + 1
        }
        t.forEach {
            secondHashMap[it] = secondHashMap.getOrDefault(it, 0) + 1
        }
        return firstHashMap.equals(secondHashMap);
    }
}
