class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleanStr = s.lowercase().replace(Regex("[^a-z0-9]"),"")
        if (cleanStr.length == 0) return true

        var j = cleanStr.length-1
        println(cleanStr)
        for (i in 0..j/2){
            if (cleanStr[i] != cleanStr[j]) return false
            j--
        }
        return true
    }
}