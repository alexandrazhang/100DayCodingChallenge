package CodingChallengeEasy.fromDay11;

/**
 * Created by yzhang on 5/23/18.
 */
public class Day16LC695 {
    public int maxAreaOfIsland(int[][] grid) {
        int numb = 0;
        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                int curMax = 0;
                if(grid[i][j] == 1){
                    curMax++;
                    if(hasNeighber(grid, i, j)){
                        max = Math.max(max, curMax);
                    }
                } else {
                    curMax = 0;
                }
            }
        }
        return max;
    }
    private boolean hasNeighber(int[][] grid, int i, int j){
        boolean right = j < grid[0].length - 1 && grid[i][j+1] == 1;
        boolean down = i < grid.length - 1 && grid[i + 1][j] == 1;
        return right | down;
    }

}
