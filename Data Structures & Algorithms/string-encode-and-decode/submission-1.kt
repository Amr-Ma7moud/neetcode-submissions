class Solution {
    val SEPERATOR = "[this is a sep]"


    fun encode(strs: List<String>): String {
        if (strs.size == 0) return "emptyList"
        var res = ""
        res = strs.joinToString(SEPERATOR)
        println(res.length)
        return res
    }

    fun decode(str: String): List<String> {
        
        if( str == "emptyList") return emptyList()
        return str.split(SEPERATOR)
    }
}
