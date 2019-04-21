//Calculate the absolute difference between the two diagonals of any square matrix.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {   
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            } //end inner for loop
        } //finish inputs scanning
        
        int diagonal1 = 0;
        int diagonal2 = 0;
        
        //compute the first diagonal sum
        for (int i=0; i<n; i++){
            //System.out.println(a[i][i]);
            diagonal1 = diagonal1 + a[i][i];
        }
        
        //compute the second diagonal sum
        for (int j=0; j<n; j++){
            diagonal2 = diagonal2 + a[j][(n-1)-j];
            //System.out.println(a[j][n-(j)]);
        }
        
        int answer = Math.abs(diagonal1 - diagonal2);
        System.out.println(answer);
    }
}
