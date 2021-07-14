class Solution {
    public int minArray(int[] numbers) {
        int j = numbers.length-1;
        int i = 0;
        int mid = 0;
        while(i<j){
            mid = i+(j-i)/2;
            if(numbers[mid]<numbers[j]){
                j = mid;
            }else if(numbers[mid]>numbers[j]){
                i = mid+1;
            }else{
                j=j-1;
            }
        }
        return numbers[i];
    }
}