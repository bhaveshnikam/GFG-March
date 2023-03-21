class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
      int min_time=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            min_time=Math.min((Math.abs(cur-pos[i])*time[i]),min_time);
        }
        return min_time;
    }
}
