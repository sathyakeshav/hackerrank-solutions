// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 11:29 a.m.
// ──────────────────────────────────────────────────


    static String sortArray(char[] a)   {   // Gives sorted string
        int len = a.length;
        
        for (int i=0;i<len-1;i++){          //bubble sort
            for(int j=0;j<len-1;j++){
                char temp = a[j+1];
                if (temp>a[j]){
                     a[j+1] = a[j];
                     a[j] = temp;
                }
            }
        }
        

        return String.valueOf(a);
    }
    
    
    static boolean isAnagram(String a, String b) {
        String low_a = a.toLowerCase();  //To Lowercase
        String low_b = b.toLowerCase();
        
        char[] c_a = low_a.toCharArray(); // To Char Array
        char[] c_b = low_b.toCharArray();
        
        String S_a = sortArray(c_a);     // Sorted String
        String S_b = sortArray(c_b);
        
        //System.out.println(S_a);      //Output
        //System.out.println(S_b);         
        
        if(S_a.equals(S_b)){            // compare sorted strings
            return true;
        }
        else return false;
    }

