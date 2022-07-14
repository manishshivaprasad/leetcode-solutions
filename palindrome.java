class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int p=0;
        if(x<0)
            return false;
        while(n!=0)
        {
            p=p*10+n%10;
            n=n/10;
        }
        if(p==x)
            return true;
        else
            return false;
        
    }
}