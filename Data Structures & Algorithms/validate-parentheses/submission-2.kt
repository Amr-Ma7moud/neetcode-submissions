class Solution {
    fun isValid(s: String): Boolean {
        val parenthesesMap = ""
        val openParentheses = arrayOf('(','{','[')
        val closedParentheses = arrayOf(')','}',']')
        val st = Stack<Char>()
        s.forEach {
            if ( it in openParentheses ) { st.push(it) }
            else if (
                it in closedParentheses
                && ! st.isEmpty()
                && closedParentheses.indexOf(it) == openParentheses.indexOf(st.peek()) ) st.pop()
            else return false
        }
        return st.isEmpty()
    }
}
