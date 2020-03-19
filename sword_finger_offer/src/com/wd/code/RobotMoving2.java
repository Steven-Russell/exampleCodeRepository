package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/11 19:06
 **/
public class RobotMoving2 {

    public int movingCount(int threshold, int rows, int cols) {
        if(threshold<0){
            return 0;
        }
        boolean[][] vis = new boolean[rows][cols];
        int count = 1;
        vis[0][0] = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (convert(i) + convert(j) <= threshold) {
                    if (i - 1 >= 0 && vis[i - 1][j]) {
                        vis[i][j] = true;
                        count++;
                    } else if (i + 1 < rows && vis[i + 1][j]) {
                        vis[i][j] = true;
                        count++;
                    } else if (j + 1 < cols && vis[i][j + 1]) {
                        vis[i][j] = true;
                        count++;
                    } else if (j - 1 >= 0 && vis[i][j - 1]) {
                        vis[i][j] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static int convert(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
