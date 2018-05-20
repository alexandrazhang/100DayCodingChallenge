package CodingChallengeEasy.fromDay11;

public class Day11LC463 {
    public int islandPerimeter(int[][] grid) {
        int pos = 0;
        int nei = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1) {
                    pos++;
                    if(i < row - 1 && grid[i + 1][j] == 1) nei++;
                    if(j < col - 1 && grid[i][j + 1] == 1) nei++;
                }
            }
        }
        return pos * 4 - nei * 2;
    }
}
