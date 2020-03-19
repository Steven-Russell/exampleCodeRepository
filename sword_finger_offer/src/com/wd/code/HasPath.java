package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/11 20:20
 * <p>
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * <p>
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 **/
public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //根据matrix创建矩阵
        char[][] matrixMap = new char[rows][cols];
        //填充矩阵
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < matrix.length) {
                    matrixMap[i][j] = matrix[index++];
                }
            }
        }
        //阵点标志
        boolean[][] vis = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (solve(i, j, matrixMap, str, vis,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve(int x, int y, char[][] matrixMap, char[] str, boolean[][] vis,int index) {
        //边界条件
        if (x < 0 || y < 0 || x >= matrixMap.length || y >= matrixMap[x].length || vis[x][y]) {
            return false;
        }
        //判断当前字符是否满足顺序
        if(str[index]!=matrixMap[x][y]){
            return false;
        }
        //字符匹配完了直接返回
        if(index==str.length-1){
            return true;
        }
        //当前顶点已经被访问
        vis[x][y] = true;
        boolean flag = solve(x - 1, y, matrixMap, str, vis,index+1) ||
                       solve(x + 1, y, matrixMap, str, vis,index+1) ||
                       solve(x, y - 1, matrixMap, str, vis,index+1) ||
                       solve(x, y + 1, matrixMap, str, vis,index+1);
        vis[x][y] = false;//回溯访问过的顶点
        return flag;
    }
}
