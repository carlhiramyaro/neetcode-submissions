class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        """
        Init 3 hashmaps
        one with the index of the row we are in as the y key and a set of the values in thath row as the value
        second with the index of the col we are in as the key and a set of the values in that col as the value
        the third the index of the square we are in(claculated as r//3, c//3) as the key and a set of the values in that square as the value

        iterate through the grid:
        if . continue
        if the value exists in any of the sets in our hasmap we want to return false

        we can add the values to the hashmap
        after the loop we can return true
        """

        rows = collections.defaultdict(set)
        cols = collections.defaultdict(set)
        squares = collections.defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue
                if board[r][c] in rows[r] or board[r][c] in cols[c] or board[r][c] in squares[(r//3, c//3)]:
                    return False
                rows[r].add(board[r][c])
                cols[c].add(board[r][c])
                squares[(r//3, c//3)].add(board[r][c])
        return True

                
        
        