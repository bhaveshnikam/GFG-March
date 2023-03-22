class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    // code here
	    long xcount = 0;
        long ycount = 0;
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        st.push(S.charAt(0));
        
        if (X > Y) {
            for (int i = 1; i < S.length(); i++) {
                if (!st.isEmpty() && (S.charAt(i) == 'r' && st.peek() == 'p')) {
                    st.pop();
                    xcount++;
                } else
                    st.push(S.charAt(i));
            }
            st2.push(st.peek());
            st.pop();
            
            while (!st.isEmpty()) {
                if (!st2.isEmpty() && (st.peek() == 'r' && st2.peek() == 'p')) {
                    st.pop();
                    ycount++;
                    st2.pop();
                } else {
                    st2.push(st.peek());
                    st.pop();
                }
            }
        } else {
            for (int i = 1; i < S.length(); i++) {
                if (!st.isEmpty() && (S.charAt(i) == 'p' && st.peek() == 'r')) {
                    st.pop();
                    ycount++;
                } else {
                    st.push(S.charAt(i));
                }
            }
            st2.push(st.peek());
            st.pop();
            
            while (!st.isEmpty()) {
                if (!st2.isEmpty() && (st.peek() == 'p' && st2.peek() == 'r')) {
                    st.pop();
                    xcount++;
                    st2.pop();
                } else {
                    st2.push(st.peek());
                    st.pop();
                }
            }
        }
        return xcount * X + ycount * Y;
	        
	    
        
	}
} 
