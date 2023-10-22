package doublePointer;// ����֮��Ϊ 0 �������ĸ�����  ��˫ָ�롿
import java.util.*;

public class fourNumberSum_II {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // {a, b, c, d} a + b + c + d = 0
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){ // a

            if(nums[i] > 0 && nums[i] > target)
                return res;

            if(i > 0 && nums[i] == nums[i - 1]) // ȥ��a
                continue;

            for(int j = i + 1; j < nums.length; j++){ // b

                if(j > i + 1 && nums[j] == nums[j - 1]) // ȥ��b
                    continue;

                int left = j + 1;  // c
                int right = nums.length - 1;  // d

                while(left < right){
                    if(nums[i] + nums[j] + nums[left] + nums[right] > target) // ƫ��
                        right--;
                    else if(nums[i] + nums[j] + nums[left] + nums[right] < target) // ƫС
                        left++;
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) // ȥ�� c
                            left++;
                        while(left < right && nums[right] == nums[right - 1]) // ȥ��d
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
