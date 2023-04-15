public static long totalTime(int n,int arr[],int time[])
    {
        HashMap<Integer,Integer> mm = new HashMap<>();
        long ans=-1;
        for(int i=0;i<n;i++){
            ans++;
            if(mm.get(arr[i])!=null){
                ans+=time[arr[i]-1];
                ans--;
            }
            mm.put(arr[i],i+1);
        }
        return ans;
    }
