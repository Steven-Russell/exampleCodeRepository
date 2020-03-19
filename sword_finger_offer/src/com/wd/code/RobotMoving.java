package com.wd.code;

import java.util.Scanner;

/**
 * @author StevenRussell
 * @date 2020/3/10 14:37
 * <p>
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 **/
public class RobotMoving {
    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int threshold = scanner.nextInt();
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            System.out.println(movingCount(threshold, rows, cols));
        }
    }

    public static int movingCount(int threshold, int rows, int cols)
    {
        count =0;
        boolean[][] vis = new boolean[rows][cols];
        //初始位置是默认可以访问的
        moving(0,0,threshold,rows,cols,vis);
        return count;
    }
    private static void moving(int x, int y, int threshold, int rows, int cols, boolean[][] vis) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || vis[x][y] || convert(x) + convert(y) > threshold) {
            return;
        }
        //说明此点能够到达且标记为已经访问
        vis[x][y] = true;
        count++;
        //向上
        moving(x,y-1,threshold,rows,cols,vis);
        //向下
        moving(x,y+1,threshold,rows,cols,vis);
        //向左
        moving(x-1,y,threshold,rows,cols,vis);
        //向右
        moving(x+1,y,threshold,rows,cols,vis);
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
