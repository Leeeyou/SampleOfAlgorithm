package com.algorithm2practice.sorting.sorting4;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/2/19.
 * <p>
 * 现在有一个行和列都排好序的矩阵，请设计一个高效算法，快速查找矩阵中是否含有值x。
 * 给定一个int矩阵mat，同时给定矩阵大小nxm及待查找的数x，请返回一个bool值，代表矩阵中是否存在x。所有矩阵中数字及x均为int范围内整数。保证n和m均小于等于1000。
 * 测试样例：
 * [[1,2,3],[4,5,6],[7,8,9]],3,3,10
 * 返回：false
 */
public class Finder {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.printf(findX(A, 3, 3, 2) + "");
    }

    public static boolean findX(int[][] mat, int n, int m, int x) {
        int horizon = 0, vertical = m - 1;
        while (horizon < n && vertical >= 0) {
            if (mat[horizon][vertical] > x) {
                vertical--;
            } else if (mat[horizon][vertical] < x) {
                horizon++;
            } else {
                return true;
            }
        }
        return false;
    }

}
