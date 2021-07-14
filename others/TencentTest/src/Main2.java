import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 题目：
 * w万奖金分给n个人
 * 每个人的奖金有下限 和 上限
 *
 * //输入
 * 3 20
 * 8 10
 * 7 9
 * 1 4
 *
 * //输出
 * 9
 */
public class Main2 {
    public static void main(String[] args) {
        int n;
        int w;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        int res[] = new int[n];
        int [][] xy = new int[n][2];
        for (int i = 0; i < n; i++) {
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                    return o1[1]-o2[1];
                return o1[1]-o2[1];
            }
        });
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < xy[1].length; j++) {
//                System.out.println(xy[i][j]);
//            }
//        }
        int mid = n/2;
        int lowsum = 0;
        for (int i = 0; i < mid; i++) {
            lowsum+=xy[i][0];
        }
        int rem = w-lowsum;
        int highsum = 0;
        for (int i = mid;i<n;i++){
            highsum+=xy[i][1];

        }
        if(highsum>rem){
            // 返回平均数
            System.out.println(rem /(mid+1));
        }
        else{// 返回最大值即可
            System.out.println(xy[mid][1]);
        }

    }
}
