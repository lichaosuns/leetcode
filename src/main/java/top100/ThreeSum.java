package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/3sum/solutions/39722/pai-xu-shuang-zhi-zhen-zhu-xing-jie-shi-python3-by/?envType=study-plan-v2&envId=top-100-liked">...</a>
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> returnList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int preValue = Integer.MIN_VALUE;
            int thirdIndex = nums.length - 1;
            for (int j = i + 1; j < nums.length - 1; j++) {
                while (thirdIndex > j) {
                    int threeSum = nums[i] + nums[j] + nums[thirdIndex];
                    if (threeSum == 0 && nums[thirdIndex] != preValue) {
                        returnList.add(Arrays.asList(nums[i], nums[j], nums[thirdIndex]));
                    }
                    if(threeSum >= 0) {
                        preValue = nums[thirdIndex];
                        thirdIndex--;
                    } else {
                        break;
                    }
                }

            }
        }
        return returnList;

    }
}
