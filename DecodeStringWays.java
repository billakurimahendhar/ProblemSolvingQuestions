class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0')
        return 0;
          int dp[]=new int[s.length()];
          dp[0]=1;
          for(int i=1;i<dp.length;i++){
            if(s.charAt(i)!='0')
            dp[i]=dp[i-1];
            int d= Integer.parseInt(s.substring(i - 1, i + 1));
            if (d>= 10 && d <= 26) 
                dp[i] += (i >= 2) ? dp[i - 2] : 1;
            
          }
          return dp[s.length()-1];
    }
}