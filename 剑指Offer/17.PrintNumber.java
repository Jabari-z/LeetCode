package 剑指Offer;

class PrintNumber {
    public int[] printNumbers(int n) {
        int[] res = new int[(int)(Math.pow(10,n)-1)];

        for (int i = 1; i <= res.length; i++) {
            res[i-1] = i;
        }
        return res;
    }



    // 考虑大整数
    public  void print1ToMaxOfDigits(int n) {
        
        if(n<0) return;
        char[] number = new char[n]; // 存放整数
        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i +'0'); // 固定第一个数字
            print1ToMaxOfDigitsRecursively(number,n,0); //进行递归
        }
    }
    
    private void print1ToMaxOfDigitsRecursively(char[] number, int length, int index) {
        if (index == length-1) {
            // 已经递归出一个数字了 打印输出
            PrintNumbers(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index+1] = (char) (i+'0');
            print1ToMaxOfDigitsRecursively(number, length, index+1);
        }

    }
    // 打印数字 去掉前置0
    private void PrintNumbers(char[] number) {
        boolean isBegining0 = true;

        for (int i = 0; i < number.length; i++) {
            if (isBegining0 && number[i]!='0') {
                // 如果是0 则不是数字的开始
                isBegining0 = false;
            }
            if (!isBegining0) {
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new PrintNumber().print1ToMaxOfDigits(3);
    }
}