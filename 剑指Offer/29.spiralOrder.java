package 剑指Offer;

public class 29.spiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new int[0];
        int l = 0; // left
        int r = matrix.length[0]-1; // 一行的个数 // right
        int b = matrix.length - 1; //  行数   //bottom
        int t = 0 ;   //top
        int x = 0; // index

        int []res = new int[(r + 1) * (b + 1)];

        while(true){
            // 从左向右
            for(int i = l; i <= r;i++) res[x++] = matrix[t][i];

            //上倒下
            if(++t>b) break;
            for(int i = t; i<=b; i++) res[x++] = matrix[i][r];

            //从右到左
            if(--r<l) break;
            for(int i = r;i>=l;i--) res[x++] = matrix[b][i];

            // 从下到上
            if(t > --b) break;
            for(int i = b; i >= t; i--) res[x++] = matrix[i][l];

            if(++l >r) break;

        }
    }
}
