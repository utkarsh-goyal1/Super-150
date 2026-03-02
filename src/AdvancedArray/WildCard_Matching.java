package AdvancedArray;

public class WildCard_Matching {

}
//class Solution {
//    public boolean isMatch(String s, String p) {
//        Boolean [][]memo=new Boolean [s.length()+1][p.length()+1];
//        return check(s,p,0,0,memo);
//    }
//    public static boolean check(String s, String p,int i,int j,Boolean [][]memo)
//    {
//        if(i>=s.length() && j>=p.length())
//        {
//            return true;
//        }
//        if(j>=p.length())
//        {
//            return false;
//        }
//        if(memo[i][j]!=null)
//        {
//            return memo[i][j];
//        }
//        if(i<s.length() &&(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'))
//        {
//            return memo[i][j]=check(s,p,i+1,j+1,memo);
//        }
//        else if(p.charAt(j)=='*')
//        {
//            return memo[i][j]=(i<s.length() && check(s,p,i+1,j,memo)) || check(s,p,i,j+1,memo);
//        }
//        return memo[i][j]=false;
//    }
//}