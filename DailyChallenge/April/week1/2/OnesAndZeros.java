
import java.util.Arrays;
import java.util.Comparator;

/**
 * 给一个字符串数组 两个数字 m n
 * return 最大的 子集  字符串至多包含 m个0 和n个1
 * eg strs = ["10","0001","111001","1","0"], m = 5, n = 3
 * res 4 
 * The largest subset with at most 5 0's and 3 1's is 
 * {"10", "0001", "1", "0"}, so the answer is 4.
 * 
 * 
 * 
 * Input:
["111","1000","1000","1000"]
9 个 0
3 个 1
    Output:
    1
    Expected:
    3
    Stdout:
    111
    1000
    1000
    1000
 */
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // 1.按字符串长度进行排序
        // 2.对每个字符串进行 1 计数
        sortStrings(strs);
        for (String string : strs) {
            System.out.println(string);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<strs.length;i++){
            int n1 = num1OfString(strs[i]);
            int n0 = strs[i].length()-n1;

            m = m-n0;
            n = n-n1;
            if(m>=0 &&n>=0){
                max = i+1>max?i+1:max;
            }else{
                return max;
            }
        }

        return max;
    }
    public String[] sortStrings(String[] strs){
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int num = o1.length() - o2.length();
                if(num==0){
                    return o1.compareTo(o1);
                }
                return num;
            }
        });
        return strs;
    }
    public int num1OfString(String s){
        int n = 0;
        for (char c : s.toCharArray()) {
            if(c=='1'){
                ++n;
            }
        }
        return n;
    }
}


public class OnesAndZeros {
    public static void main(String[] args) {

        // String[] strs = {"10","0001","111001","1","0"};  
        String[] strs1 = {"10","11","1"};  
        
        int m = 1;
        int n = 1;      
        int max = new Solution().findMaxForm(strs1,m,n);
        System.out.println(max);
    }
}
