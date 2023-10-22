package knowledge.doublePointer;// 三数之和为 0 ，来自一个数组  【双指针解决】
import java.util.*;

public class threeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // 双指针找{a, b, c} a + b + c = 0
        List<List<Integer>> res = new ArrayList<>(); // 结果
        Arrays.sort(nums); // 排序

        for(int i = 0; i < nums.length; i++){ // a 的遍历

            if(nums[i] > 0) return res; // 排序首个元素 > 0,return

            if(i > 0 && nums[i] == nums[i - 1]) continue; // 去重 a

            int left = i + 1;  // b
            int right = nums.length - 1; // c

            while(left < right){

                if(nums[i] + nums[left] + nums[right] > 0) // 偏大
                    right --;
                else if(nums[i] + nums[left] + nums[right] < 0) // 偏小
                    left ++;
                else{ // 相等
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 找到一个后，去重 b 和 c
                    while(left < right && nums[left] == nums[left + 1]) left ++;
                    while(left < right && nums[right] == nums[right - 1]) right --;

                    right --;
                    left ++;
                }
            }
        }
        return res;
    }

}
