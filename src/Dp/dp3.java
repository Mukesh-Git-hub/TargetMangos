package Dp;

import java.util.Arrays;

public class dp3 {
     static void main(String[] args){
        int[] array= {20,10,80,10,40};
        int n=array.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       // System.out.println("Memorization top to bottom ="+method(dp,n-1,array));
         System.out.println("Tabulation bottom to top ="+method2(dp,array, array.length));
    }
    static int method(int[] dp,int n,int[] array){
      int right = Integer.MAX_VALUE;
      if(dp[n]!=-1) return dp[n];
        if(n==0) return 0;
        int left = method(dp,n-1,array) +  Math.abs(array[n] - array[n-1]);
        if(n>1){
             right = method(dp,n-2,array) + Math.abs(array[n] - array[n-2]);
        }
        return dp[n]=Math.min(left,right);

     }

     static int method2(int[] dp, int[] array, int n){
          dp[0]=0;

          for(int i=1;i<array.length;i++){
              int fs = dp[i-1]+ Math.abs(array[i]-array[i-1]);
              int se = Integer.MAX_VALUE;
              if(i>1){
                  se=dp[i-2]+Math.abs(array[i]-array[i-2]);
              }

              dp[i]=Math.min(fs,se);
          }
          return dp[n-1];

     }


}
