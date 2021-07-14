class Solution {
    public int fib(int n) {
        if(n<=0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 1;
        int m1 = 1;
        int m2 = 1;
        int sum=0;
        for(int i = 3;i<=n;i++){
            sum = (m2+m1)%1000000007;
            m2 = m1;
            m1 = sum;
        }
        return sum;
    }
}