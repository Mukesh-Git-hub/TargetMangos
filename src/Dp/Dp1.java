package Dp;

import java.util.Arrays;
import java.util.Scanner;

public class Dp1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(call(n,dp));

    }
    static  int call(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=call(n-1,dp)+call(n-2,dp);

    }

}
