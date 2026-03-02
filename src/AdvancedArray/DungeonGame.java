package AdvancedArray;

public class DungeonGame {

}
//class Solution {
//    public int calculateMinimumHP(int[][] dungeon) {
//        int [][]memo = new int[dungeon.length][dungeon[0].length];
//        for(int i=0;i<memo.length;i++)Arrays.fill(memo[i],-1);
//        return maxValue(dungeon,0,0,memo);
//    }
//    public static int maxValue(int [][]arr,int cr,int cc,int [][]memo)
//    {
//        if(cr>=arr.length || cc>=arr[0].length)
//        {
//            return Integer.MAX_VALUE;
//        }
//        if(cr==arr.length-1 && cc==arr[0].length-1)
//        {
//            return arr[cr][cc] > 0 ? 1: 1-arr[cr][cc];
//        }
//        if(memo[cr][cc]!=-1)
//        {
//            return memo[cr][cc];
//        }
//        int right=maxValue(arr,cr,cc+1,memo);
//        int down=maxValue(arr,cr+1,cc,memo);
//        int p=Math.min(right,down)-arr[cr][cc];
//        return memo[cr][cc]=p > 0 ? p : 1;
//    }
//}