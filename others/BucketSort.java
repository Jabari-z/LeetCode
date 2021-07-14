import java.util.*;
class BucketSort{

    public static int[] bucketSort(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        // 桶的个数
        int bucketNum = (max-min)/arr.length+1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>();


        // 初始化桶
        for(int i =0;i<bucketNum;i++){
            bucketArr.add(new ArrayList<Integer>());
        }
        //把元素放入桶中
        for(int i = 0;i<arr.length;i++){
            int num = (arr[i]-min)/(arr.length);
            bucketArr.get(num).add(arr[i]);
        }
        // 对每个桶进行排序
        int index = 0;
        for(int i = 0;i<bucketArr.size();i++){
            Collections.sort(bucketArr.get(i));
            for(int j = 0;j<bucketArr.get(i).size();j++){
                arr[index++] = bucketArr.get(i).get(j);
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,6,2,20,40,54,12};
        int[] sortarr = bucketSort(nums);
        for(int i = 0;i<sortarr.length;i++){
            System.out.print(sortarr[i]+" ");
        }
    }
}