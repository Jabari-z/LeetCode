import java.util.Scanner;

/**
 * 题目：一个数只能经过以下三种方式变换，
 * 1。n = n-1
 * 2。n为偶数，n=n/2
 * 3。n为3的倍数，n=n/3
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(min(1, 2, 3));
//        System.out.println(min(8, 12, 5));
        int n = sc.nextInt(); // n组测试数据
        int ans = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            ans = solve(num);
            System.out.println(ans);

        }
    }
    // right
    public static int solve1(int n){
        if(n==1) return 1;
//        if(n==2) return 2;
//        if(n==3) return 2;

        if(n%3==0 && n%2!=0) return Math.min(solve1(n/3),solve1(n-1))+1;
        else if(n%2==0 && n%3!=0) return Math.min(solve1(n/2),solve1(n-1))+1;
        else if(n%6==0)return 1+min(solve1(n-1),solve1(n/2),solve1(n/3));
        else return solve1(n-1)+1;
    }
    // 三数最小
    public static  int min(int n1,int n2,int n3){
        int n4 = n1>n2?n2:n1;
        return n3>n4?n4:n3;
    }
    //func
    public static int solve(int n){
        int[] res = new int[n+1];
        res[0]=0;
        res[1]=1;
        res[2]=2;
        res[3]=2;
        for (int i = 4;i<=n;i++){
            int n1;
            int n2 = Integer.MAX_VALUE;
            int n3 = Integer.MAX_VALUE;
            if(i%3==0) n3 = res[i/3];
            if(i%2==0) n2 = res[i/2];
            n1 = res[i-1];
            res[i]=min(n1,n2,n3)+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]);
        }
        return res[n];
    }

}
