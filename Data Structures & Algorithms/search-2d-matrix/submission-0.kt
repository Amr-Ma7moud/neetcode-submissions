class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var l = 0;
        var r = matrix[0].lastIndex;

        for ( row in matrix){
            when {
                target > row[r] -> continue
                target == row[r] -> return true
                else -> for(i in row){
                    if (i == target) return true
                }
            }
        }
        return false
    }
}
