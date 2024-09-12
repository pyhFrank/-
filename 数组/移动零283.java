public class 移动零283 {
//    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
//
//
//
//    示例 1:
//
//    输入: nums = [0,1,0,3,12]
//    输出: [1,3,12,0,0]
//    示例 2:
//
//    输入: nums = [0]
//    输出: [0]
//
//
//    提示:
//
//            1 <= nums.length <= 104
//            -231 <= nums[i] <= 231 - 1
    class Solution {
        public void swap(int[] nums, int first, int second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

        public void moveZeroes(int[] nums) {
            int zero = 0;
            int one = 0;
            while (zero < nums.length && one < nums.length) {
                while (zero < nums.length && nums[zero] != 0) {//find the first zero
                    zero++;
                }
                one = zero + 1;
                while (one < nums.length && nums[one] == 0) {
                    one++;
                }
                if(zero<nums.length&&one<nums.length)
                    swap(nums, zero, one);
            }
        }
    }
}
