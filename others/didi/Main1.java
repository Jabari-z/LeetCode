import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main1 {
    /**
     * 你有一个操作系统，他将要执行n个任务，每个任务有两个阶段，准备阶段和执行阶段，任务必须先完成准备，然后才能执行。
     * 你的操作系统在任意时刻可以执行一个任务，并同时准备多个任务 问你最少花费多少时间可以执行完所有的任务 输入 n表示n个任务
     * n行，第一个数字为准备时间，第二个数字为执行时间
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] task = new int[n][2];
        for (int i = 0; i < n; i++) {
            task[i][0] = sc.nextInt();
            task[i][1] = sc.nextInt();
        }

        Arrays.sort(task, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                // 第一维小的 排前 第一维 相同的 比较 第二维
                return (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0];
                // return 0;
            }
        });

        int tot = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("in for:" + tot + " " + cur);
            // 准备
            if (task[i][0] > cur) {
                tot += (task[i][0] - cur);
                cur += (task[i][0] - cur);
                System.out.println(tot + " " + cur);
            }
            // 执行
            tot += task[i][1];
            cur += task[i][1];
            System.out.println("end for:" + tot + " " + cur);
        }
        System.out.println(tot);
    }
}