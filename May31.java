public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer,Integer> mm = new HashMap<>();
        for(int i=0;i<n;i++){
            mm.putIfAbsent(arr[i],0);
            mm.put(arr[i],mm.get(arr[i])+1);
        }
        int ans=0,f=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> x:mm.entrySet()){
            if(x.getValue()<f){
                f=x.getValue();
                ans=x.getKey();
            }
            else if(x.getValue()==f){
                ans=Math.max(ans,x.getKey());
            }
        }
        return ans;
    }
    
