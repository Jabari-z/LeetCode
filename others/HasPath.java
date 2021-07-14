public class HasPath {
    public boolean hasPath(char[][] matrix,char[] path){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int pathLength = 0;
        boolean visited[][] = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                visited[i][j] = false;
            }
        }
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if(hasPathCore(matrix,i,j,path,pathLength,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 
     * @param maxtrix 矩阵输入
     * @param rows  矩阵行
     * @param cols  矩阵列
     * @param row   当前行
     * @param col   当前列
     * @param str   路径
     * @param pathLength 已经探索路径长度
     * @param visited 是否访问过
     * @return haspath
     */
    private boolean hasPathCore(char[][] maxtrix,int row, int col, 
                                char[] str,int pathLength, boolean[][] visited) {
        boolean hasPath = false;
        int rows = maxtrix.length;
        int cols = maxtrix[0].length;
        if(pathLength==str.length){
            return true;
        }

        if(0<=row && row<rows && 
           0<=col && col<cols &&
           maxtrix[row][col]==str[pathLength] &&
           !visited[row][col]){
            pathLength++;
            visited[row][col] = true;
            System.out.println("访问成功："+maxtrix[row][col]);
            hasPath = hasPathCore(maxtrix, row-1, col, str, pathLength, visited)
                    ||hasPathCore(maxtrix, row, col-1, str, pathLength, visited)
                    ||hasPathCore(maxtrix, row+1, col, str, pathLength, visited)
                    ||hasPathCore(maxtrix, row, col+1, str, pathLength, visited);
            if(!hasPath){
                pathLength--;
                visited[row][col] = false;
                System.out.println("回朔"+maxtrix[row][col]);
            }
        }
        return hasPath;
    }
    public static void main(String[] args) {
        char[][] matrix = new char[3][4];
        char ch1[] = { 'a', 'b', 'c', 'd' };
        char ch2[] = { 'b', 'c', 'd', 'a' };
        char ch3[] = { 'c', 'd', 'a', 'b' };
        matrix[0] = ch1;
        matrix[2] = ch3;
        matrix[1] = ch2;
        char str[] = { 'a', 'b', 'c', 'd' };
        boolean b = new HasPath().hasPath(matrix, str);
        System.out.println(b);
    }
}
