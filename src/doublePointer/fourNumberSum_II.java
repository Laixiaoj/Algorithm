package doublePointer;// 四数之和为 0 ：来自四个数组  【双指针】
import java.util.*;

public class fourNumberSum_II {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // {a, b, c, d} a + b + c + d = 0
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){ // a

            if(nums[i] > 0 && nums[i] > target)
                return res;

            if(i > 0 && nums[i] == nums[i - 1]) // 去重a
                continue;

            for(int j = i + 1; j < nums.length; j++){ // b

                if(j > i + 1 && nums[j] == nums[j - 1]) // 去重b
                    continue;

                int left = j + 1;  // c
                int right = nums.length - 1;  // d

                while(left < right){
                    if(nums[i] + nums[j] + nums[left] + nums[right] > target) // 偏大
                        right--;
                    else if(nums[i] + nums[j] + nums[left] + nums[right] < target) // 偏小
                        left++;
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) // 去重 c
                            left++;
                        while(left < right && nums[right] == nums[right - 1]) // 去重d
                            right--;

                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
