// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
// Problem     Java Currency Formatter
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-26, 05:31 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        String us = defaultFormat.format(payment);
        
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cnFormat.format(payment);
        
        NumberFormat feFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = feFormat.format(payment);
        
        Locale indial = new Locale("en", "IN");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(indial);
        String india = inFormat.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
