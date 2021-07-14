
/**
 * 输入 n 和长度为n的字符串
 * 一个字符串，中相邻的两个数和为10就可以消掉
 * 问最后字符串的长度为？
 * 2 1 3 7 9 6
 * 2 1     9 6
 * 2         6
 * 
 * res：2
 */
import java.util.Scanner;
import java.util.Stack;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] nums = s.toCharArray();
        System.out.println(solve(nums,n));
        sc.close();
    }
    public static int solve(char[] nums,int n){ 
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i]-'0';
            if(!stack.empty()){
                if(num+stack.peek()==10){
                    stack.pop();
                }else{
                    stack.push(num);
                }
            }else{
                stack.push(num);
            }
        }
        return stack.size();
    }
    // public static int solve(char[] nums,int n){    
    //     for (int i = 0; i < n-1; i++) {
    //         if(nums[i]-'0'+nums[i+1]-'0'==10){
    //             //等于10后边的进行 前移
    //             for (int j = i; j < n-2; j++) {
    //                 nums[j]=nums[j+2];
    //             }
    //             n = solve(nums,n-2);
    //         }
    //     }
    //     return n;
    // }
}