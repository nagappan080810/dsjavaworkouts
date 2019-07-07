package com.nagappans.dsalgolab.arrays;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class KnotsAndCrossStreak {
    public static void finder(InputStream in) {
        Scanner scanner = new Scanner(in);
        int t = scanner.nextInt();
        for (int t1=0; t1<t; t1++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            char matrix[][] = new char[m][n];
            //System.out.printf("\n problem for %d %d %d\n", m, n ,k);
            for (int m1=0; m1<m; m1++) {
                for (int n1=0; n1<n; n1++) {
                     matrix[m1][n1] = scanner.next().charAt(0);
                }
            }
            String allCombinations = createMatrixString(matrix, m, n);
            //System.out.println(allCombinations);
            char searchcross[] = new char[k];
            char searchknots[] = new char[k];
            Arrays.fill(searchcross, 'x');
            Arrays.fill(searchknots, 'o');
            int knotsCnt = countMatches(allCombinations, new String(searchcross));
            int crossCnt = countMatches(allCombinations, new String(searchknots));
            System.out.printf("%d %d \n", knotsCnt, crossCnt);
        }
    }

    private static int countMatches(String inputString, String pattern) {
        int cnt = -1, lastIndex = 0, fromIndex = 0;
        while(lastIndex != -1) {
            cnt++;
            lastIndex = inputString.indexOf(pattern, fromIndex);
            //System.out.printf("%d %d\n", fromIndex, lastIndex);
            fromIndex = lastIndex + 1;
        }
        return cnt;
    }

    private static String createMatrixString(char[][] matrix, int m, int n) {
        StringBuilder result = new StringBuilder();
        for (int m1=0; m1<m; m1++) { //horizontal
            for (int n1 = 0; n1 < n; n1++) {
                result.append(matrix[m1][n1]);
            }
            result.append('|');
        }
        //System.out.println(result);
        for (int n1 = 0; n1 < n; n1++) { //vertical
            for (int m1=0; m1<m; m1++) {
                result.append(matrix[m1][n1]);
            }
            result.append('|');
        }
        //System.out.println(result);
        int m1, n1, m2, n2;
        for (n2=0; n2<n; n2++) { //diagonal from left to right - upper half
            m1=0;//go to first row
            n1=n2;//go to first column and then forwards..
            while(n1<n && m1<m) {
                result.append(matrix[m1++][n1++]);
            }
            result.append('|');
        }
        for (m1=1; m1<m; m1++) { //diagonal from left to right - lower half
            n1=0; //go to first column..
            m2=m1; //go to second row and then downwards..
            while(n1<n && m1<m) {
                result.append(matrix[m1++][n1++]);
            }
            result.append('|');
        }

        m1=0;
        for (n2=n-1; n2>=0; n2--) { //diagonal from right to left - upper half
            m1=0; //go to first row
            n1=n2; //move one column backwards
            while(n1>=0 && m1<m) {
                //System.out.printf(" %d %d \n", m1, n1);
                result.append(matrix[m1++][n1--]);
            }
            result.append('|');
        }

        for (m2=1; m2<m; m2++) { //diagonal from right to left - lower half
            n1=n-1; //go to last column
            m1=m2;  //move one row forwards
            while(n1>=0 && m1<m) {
                //System.out.printf(" %d %d \n", m1, n1);
                result.append(matrix[m1++][n1--]);
            }
            result.append('|');
        }

        //System.out.println(result);
        return result.toString();
    }
}
