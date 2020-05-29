Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.


public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0) && helper(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean helper(char[][] board, int i, int j, String word, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index)){
            return false;
        }
        
        char c = board[i][j];
        board[i][j] = ' ';
        boolean found = helper(board, i+1, j, word, index + 1) ||
            helper(board, i-1, j, word, index + 1) ||
            helper(board, i, j+1, word, index + 1) ||
            helper(board, i, j-1, word, index + 1);
        
        board[i][j] = c;
        return found;
    }

