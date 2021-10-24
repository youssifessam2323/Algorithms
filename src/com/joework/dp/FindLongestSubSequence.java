package com.joework.dp;

public class FindLongestSubSequence {

    
    public int longestSubSequence(String s1, String s2){

        int[][] res = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            res[i][0] = 0;
        }

        for (int i = 0; i <= s2.length(); i++) {
            res[0][i] = 0;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    res[i][j] = res[i - 1][j - 1] + 1;
                }else { 
                    res[i][j] = Math.max(res[i - 1][j], res[i][j-1]);
                }
            }
        }

        // for printing the choosen characters
        int i = s1.length(), j = s2.length() ;

        while(i > 0 && j > 0){
            if(s1.charAt(i - 1) != s2.charAt(j - 1)){
                if(res[i - 1][j] > res[i][j - 1]){
                    i--;    
                }else { 
                    j--;
                }
            }else { 
                System.out.println("Char " + s1.charAt(i - 1) + " is Included");
                i--;
                j--;
            }
        }

        return res[s1.length()][s2.length()];
    }


    public static void main(String[] args) {
        FindLongestSubSequence f = new FindLongestSubSequence();
      System.out.println(  f.longestSubSequence("ABCBD", "BDCAB"));
    }
}
