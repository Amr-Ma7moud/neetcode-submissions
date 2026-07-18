class MinStack() {
    val stack = Stack<Int>()
    var min : Int? = null

    fun push(`val`: Int) {
        this.stack.push(`val`)
    }

    fun pop() {
        this.stack.pop()
    }

    fun top(): Int {
        return this.stack.peek()
    }

    fun getMin(): Int {
        return this.stack.min()
    }
}
