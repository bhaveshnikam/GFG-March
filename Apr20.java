static int ladoos(Node root, int home, int k){
        // Your code goes here
        int ans = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node need = new Node(0);
        Map<Node, Node> m = new HashMap<>();
        while(q.size()!=0){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.remove();
                if(temp.data==home)need=temp;
                if(temp.left!=null){
                    q.add(temp.left);
                    m.put(temp.left,temp);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    m.put(temp.right,temp);
                }
            }
        }
        Map<Node, Boolean> mm = new HashMap<>();
        q.add(need);
        int dis = 0;
        while(q.size()!=0){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.remove();
                mm.put(temp,true);
                ans+=temp.data;
                if(temp.left!=null && mm.get(temp.left)==null){
                    q.add(temp.left);
                }
                if(temp.right!=null && mm.get(temp.right)==null){
                    q.add(temp.right);
                }
                if(m.get(temp)!=null && mm.get(m.get(temp))==null){
                    q.add(m.get(temp));
                }
            }
            dis++;
            if(dis>k)break;
        }
        return ans;
    }
