// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-26, 01:34 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        // Write your code here.
        String[] s_a = s.split("[\\s!,?._'@]+");
        
        
        System.out.println(s_a.length);
        for (int i = 0;i < s_a.length ;i++){
            System.out.println(s_a[i]);
        }
            
    }
}

