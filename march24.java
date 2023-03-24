String removeReverse(String S) 
    { 
        // code here
        int arr[]=new int[26];
        HashMap<Integer,Integer> mm = new HashMap<>();
        for(int i=0;i<S.length();i++)arr[S.charAt(i)-'a']++;
        int i=0,j=S.length()-1;
        StringBuilder ans =new StringBuilder();
        boolean ghumi = false;
        while(i<=j){
            if(ghumi==true){
                if(arr[S.charAt(j)-'a']>1){
                    arr[S.charAt(j)-'a']--;
                    ghumi=false;
                }
                else mm.put(j,1);
                j--;
            }
            else{
                if(arr[S.charAt(i)-'a']>1){
                    arr[S.charAt(i)-'a']--;
                    ghumi = true;
                }
                else mm.put(i,1);
                i++;
            }
        }
        for(i=0;i<S.length();i++){
            if(mm.get(i)!=null)ans.append(S.charAt(i));
        }
        if(ghumi==true)ans.reverse();
        return ans.toString();
    }
