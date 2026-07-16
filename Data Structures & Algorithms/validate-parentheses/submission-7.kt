class Solution {
fun isValid(s: String): Boolean {
    val st = ArrayDeque<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> st.push(it)
            ')' -> if (st.peek() != '(') return false else st.pop()
            ']' -> if (st.peek() != '[') return false else st.pop()
            '}' -> if (st.peek() != '{') return false else st.pop()
        }
    }
    return st.isEmpty()
}
}
