package com.yintp.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author yintp
 */
public class Q37SolveSudokuTest {
    @Test
    public void testCase1() {
        char[][] chars = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] expect = {{'5', '3', '4', '6', '7', '8', '9', '1', '2'}
            , {'6', '7', '2', '1', '9', '5', '3', '4', '8'}
            , {'1', '9', '8', '3', '4', '2', '5', '6', '7'}
            , {'8', '5', '9', '7', '6', '1', '4', '2', '3'}
            , {'4', '2', '6', '8', '5', '3', '7', '9', '1'}
            , {'7', '1', '3', '9', '2', '4', '8', '5', '6'}
            , {'9', '6', '1', '5', '3', '7', '2', '8', '4'}
            , {'2', '8', '7', '4', '1', '9', '6', '3', '5'}
            , {'3', '4', '5', '2', '8', '6', '1', '7', '9'}};
        Q37SolveSudoku q37SolveSudoku = new Q37SolveSudoku();
        q37SolveSudoku.solveSudoku(chars);
        Assert.assertArrayEquals(expect, chars);
        System.out.println(Arrays.deepToString(chars));
    }
}
