//Rotate every char in a string S by K letters by changing ASCii values. Only encrypt the letters.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt()%26; //modulo 26, takes remainder of division by length of the alphabet, saves time
        
        String newWord = ""; //start the encryptedword as an empty string, and append characters to it
        
       
        for (int i = 0; i < n; i++) {
            
            int ascii = (int) s.charAt(i);
            
            //for lowercase letters: last alphabet letter is z (ascii = 122), first is a (ascii = 97)
            if (ascii >= 97 && ascii<=122) {
                ascii = ascii + k;
                if (ascii > 122){
                    //int toBeAddedToAscii = ascii - 123;
                    //ascii = 97 + toBeAddedToAscii;
                    ascii = ascii - 26;
                }
                char actual = (char) ascii;
                newWord += actual;
                //appends new char to the string newWord
            }    
                  
            //for capital letters: A = ascii_65, Z = ascii_90 *don't want to turn a capital into a lowercase
            else if (ascii <= 90 && ascii >= 65) {
                ascii = ascii + k;
                if (ascii > 90) {
                    ascii = ascii - 26;
                }
                char actual = (char) ascii;
                newWord = newWord + actual;
            }           
            
            else {
                newWord = newWord + s.charAt(i);
            }
        }
        
        System.out.println(newWord);
        in.close();
    }
}
