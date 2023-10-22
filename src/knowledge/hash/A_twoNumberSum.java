package knowledge.hash;// 两数之和返回下标  【Map 作为 Hash】
import java.util.*;

public class A_twoNumberSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> record = new HashMap<>(); // {key:数组元素, value:数组下标}

        if(nums == null)    return res;

        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(record.containsKey(temp)){
                res[1] = i;
                res[0] = record.get(temp); // 拿到value:数组下标
                break;
            }
            record.put(nums[i], i); // 添加{key:数组元素, value:数组下标}
        }

        return res;
    }
}
