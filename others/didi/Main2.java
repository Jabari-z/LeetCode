import java.util.*;

/**
 * 作者：牛客495449971号
 * 链接：https://www.nowcoder.com/discuss/637068?channel=-1&source_id=discuss_terminal_discuss_sim_nctrack&ncTraceId=9d79f630589846e7a781e1f2fc11039e.417.16182123531132790
 * 来源：牛客网
 * 
 * 小A的家门口有一排树，每棵树都有一个正整数的高度。由于树的高度不同，来到小A家的朋友都觉得很难看。
 * 为了将这些树高度变得好看，小A决定对其中某些树施展魔法，具体来说，每施展一次魔法，可以把一棵树的高度变成任意正整数（可以变高也可以变低）。
 * 小A认为，这排树如果能构成等差为x的等差数列就好看了。但是小A不想施展太多次魔法，他想知道最少施展魔法的次数。
 * 
 * 输入第一行包含两个正整数，n和x，含义如题面所示。 输入第二行包含n个正整数，第i个数的含义为第i棵树的高度ai
 * 输出包含一个正整数，即小A最少施展魔法的次数
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        s = sc.nextLine().split(" ");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int num = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            //
            int start = arr[i] - n * (i + 1);
            if (map.containsKey(start)) {
                map.put(start, map.get(start) + 1);
            } else {
                map.put(start, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() >= -1 && entry.getValue() > num) { // -1就是防止最小值为1的时候减去等差变成负数
                num = entry.getValue();
            }
        }
        System.out.println(m - num);
    }
}
