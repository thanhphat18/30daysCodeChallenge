package src.day5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void toSeparateString(String s){
        // Split the string into letters
        String[] letters = s.split("");
        //array store even index letters
        String[] even = new String[letters.length];
        //array store odd index letters
        String[] odd = new String[letters.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 0; i < letters.length;i++){
            // Check if the index is even or odd
            if(i % 2 == 0){
                even[evenIndex] = letters[i];
                evenIndex++;
            } else {
                odd[oddIndex] = letters[i];
                oddIndex++;
            }
        }
        // Now print them correctly
        for(int i = 0; i < evenIndex; i++){
            System.out.print(even[i]);
        }
        System.out.print(" ");
        for(int i = 0; i < oddIndex; i++){
            System.out.print(odd[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for(int i = 0; i < n; i++){
            String s = scanner.nextLine();
            toSeparateString(s);//TODO
        }
    }
}
