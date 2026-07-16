class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val map = mutableMapOf<Char, Int>()
        //check Row
        board.forEach { row ->
            row.forEach { cell ->
                if (cell != '.' )
                    map[cell] = (map.getOrDefault(cell, 0) + 1)
                if ( map.getOrDefault(cell,0) > 1 ) {
                    return false
                }
            }
            map.clear()
        }
        map.clear()

        //check Column
        for ( col in 0..8 ){
            for (row in 0..8 ){
                if ( board[row][col] != '.' ) map[board[row][col]] =
                    map.getOrDefault(board[row][col], 0) + 1
                if ( map.getOrDefault(board[row][col], 0) > 1 ) return false
            }
            map.clear()
        }

        map.clear()
        //check Square
        for (sqrRow in 0..2){
            for (sqrCol in 0..2){
                for (row in 0..2) {
                    for (col in 0..2) {
                        if (board[row + sqrRow * 3][col + sqrCol * 3] != '.')
                            map[board[row + sqrRow * 3][col + sqrCol * 3]] =
                                map.getOrDefault(board[row + sqrRow * 3][col + sqrCol * 3], 0) + 1
                        if (map.getOrDefault(board[row + sqrRow * 3][col + sqrCol * 3], 0) > 1) return false
                    }
                }
                map.clear()
            }
            map.clear()
        }

        return true;
    }
}