boolean[] visited=new boolean[leaves];
        for(int i=0;i<N;i++){
            int strength=frogs[i];
            if(strength>leaves) continue;
            if(strength<leaves) if(visited[strength-1]) continue;
            for(int j=strength;j<=leaves;j+=strength){
                visited[j-1]=true;
                
            }
        }
        int count=0;
        for(int i=0;i<leaves;i++){
            if(!visited[i])count++;
        }
        return count;
