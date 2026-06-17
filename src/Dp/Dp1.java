package Dp;


import java.util.Arrays;

public class Dp1 {
    static void main() {
        int n=8;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(method(n, dp ));
    }
    static int method(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!= -1) return dp[n];
      return dp[n]= method(n-1,dp)+method(n-2,dp);
    }


}
