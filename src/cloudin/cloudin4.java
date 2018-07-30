package cloudin;

/**
 * @author Li on 2018/7/30.
 */
public class cloudin4 {
    public static void main(String[] args) {
        /*有一整形数组，前半部分不递增，后半部分不递减，要求这种类型的数组排序，并剔除重复数据*/
//        int[] nums = {1, 2, 3, 3, 4, 2, 3, 3, 4};

        int[] nums = {22,3,4,5,6,3,2,3,0};

        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        int[] newNums = new int[nums.length];
        int k = 0;
        boolean flag = true;
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                newNums[k++] = nums[i];
            }
            flag = true;
        }

        int[] theNewNum = new int[k];
        for (int i = 0;i<k;i++){
            theNewNum[i] = newNums[i];
        }


        for (int i : theNewNum) {
            System.out.print(i+" ");
        }

    }
}
