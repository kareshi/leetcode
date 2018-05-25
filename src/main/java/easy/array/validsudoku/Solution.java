package easy.array.validsudoku;

public class Solution {

    private boolean isValidBlock(char... block) {
        boolean[] ticked = new boolean[10];
        for(int i=0; i<block.length; i++) {
            if('.' != block[i]) {
                int value = Character.getNumericValue(block[i]);
                if(!ticked[value]) {
                    ticked[value] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        //rows
        for(int r=0; r < board.length; r++) {
            if(!isValidBlock(board[r][0],board[r][1],board[r][2],board[r][3],board[r][4],board[r][5],board[r][6],board[r][7],board[r][8])) {
                return false;
            }
        }

        //columns
        for(int c=0; c < board.length; c++) {
            if(!isValidBlock(board[0][c],board[1][c],board[2][c],board[3][c],board[4][c],board[5][c],board[6][c],board[7][c],board[8][c])) {
                return false;
            }
        }

        //blocks
        for(int b=0; b < board.length / 3; b++) {
            for(int e=0; e < board.length / 3; e++) {
                if(!isValidBlock(board[b*3][e*3],board[b*3][e*3 + 1],board[b*3][e*3+2],
                        board[b*3+1][e*3],board[b*3+1][e*3+1],board[b*3+1][e*3+2],
                        board[b*3+2][e*3],board[b*3+2][e*3+1],board[b*3+2][e*3+2]))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
