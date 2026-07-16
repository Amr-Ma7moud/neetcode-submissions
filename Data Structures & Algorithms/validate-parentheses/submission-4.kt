class Solution {
fun isValid(s: String): Boolean {
    if ( s.length <= 1) return false
    val st = Stack<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> st.push(it)
            ')' -> if (st.isEmpty() || st.peek() != '(') return false else st.pop()
            ']' -> if (st.isEmpty() || st.peek() != '[') return false else st.pop()
            '}' -> if (st.isEmpty() || st.peek() != '{') return false else st.pop()
        }
    }
    return st.isEmpty()
}
}
