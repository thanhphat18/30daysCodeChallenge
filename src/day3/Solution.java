package src.day3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static String checkNum(int n){
        if (n%2 == 0 && n >= 2 && n <= 5){
            return "Not Weird";
        } else if (n%2 == 0 && n >= 6 && n <= 20){
            return "Weird";
        } else if (n%2 == 0 && n > 20){
            return "Not Weird";
        } else {
            //otherwise odd (n %2 != 0)
            return "Weird";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(checkNum(N));
        bufferedReader.close();
    }
}
