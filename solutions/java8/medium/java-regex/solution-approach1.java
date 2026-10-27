// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Problem     Java Regex
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-27, 01:49 p.m.
// ──────────────────────────────────────────────────



class MyRegex{
    public static final String zeroTo255 = "(\\d{1,2}|(1|0)\\d{2}|2[0-4]\\d|25[0-5])";
    public static final String pattern = "^"+ zeroTo255 +"\\."+ zeroTo255  +"\\."+  zeroTo255 +"\\."+zeroTo255+"$";
}
