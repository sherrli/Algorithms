//Find the maximum number of matching pairs of socks, where one pair of socks consists of two socks with the same numerical value.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        //This does not work: ArrayList<int> sizes=new ArrayList<int>(Arrays.asList(ar));
        //because arrays are immutable, while lists are mutable
        //also, list is an interface, and arraylist is a class that implements list
        
        List<Integer> sizes = new ArrayList<Integer>();
        for (int index=0; index<n; index++){
            sizes.add(ar[index]);
        }
        
        int pairs=0;
              
        for (int i=0; i<n-1; i++){
            int counter=1;
            int currentSock=sizes.get(i);
            
            //check our list for all occurences of sizes[i]
            for (int j=0; j<n; j++){
                if (currentSock==0){
                    continue;
                    //value of 0 means we checked and made it null already
                }
                else if(i==j){
                    continue;
                    //do not pair a size with itself
                
                }else if(currentSock==sizes.get(j)){
                    counter++;
                }
            }
            
            //replace all occurences of sizes[i] with null
            Collections.replaceAll(sizes, currentSock, 0);
            //then truncate our decimal
            int currentPairs=counter/2;
            pairs=pairs+currentPairs;
            
        }
        
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
