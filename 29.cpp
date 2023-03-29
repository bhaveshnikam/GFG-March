class Solution

{

    public:

    int countSubstring(string S)

    {

        // code here

        /*

        gEEk

        g gE gEE gEEk => gE, gEEk

        E EE EEk

        E Ek => Ek

        k

        Total substring = 4 + 3 + 2 + 1 = n(n+1)/2;

        */

        int n = S.length();

       

        int ans = 0;

       

        for(int i = 0; i<n; i++){

           

            int up = 0, low = 0;

            int j = i;

           

            while(j<n){

                if(S[j]>='a' and S[j]<='z') low++;

                else up++;

                if(low==up) ans++;

                j++;

            }

        }

       

        return ans;

    }

};

