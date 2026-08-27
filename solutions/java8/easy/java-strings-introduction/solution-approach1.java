// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-27, 05:20 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        int len_a = A.length();
        int len_b = B.length();
        System.out.println(len_a+len_b);
        
        if( A.compareTo(B) > 0){

            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String A_o = A.substring(0,1).toUpperCase()+A.substring(1);
        String B_o = B.substring(0,1).toUpperCase()+B.substring(1);
        
            
        
        System.out.println(A_o+" "+B_o);
        
    }
}



