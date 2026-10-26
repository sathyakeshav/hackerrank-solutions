// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
// Problem     Java Substring Comparisons
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-26, 01:32 p.m.
// ──────────────────────────────────────────────────



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0,k);
        largest  = s.substring(0,k);
        
        for (int i = 0;i <s.length() - k +1;i++){
            String sub_s = s.substring(i,i+k);
            if (smallest.compareTo(sub_s) > 0 ){
                smallest = sub_s;      
            }
            
            if (largest.compareTo(sub_s) < 0){
                largest = sub_s;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

