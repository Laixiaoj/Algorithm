package knowledge.hash;// ����֮�ͷ����±�  ��Map ��Ϊ Hash��
import java.util.*;

public class A_twoNumberSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> record = new HashMap<>(); // {key:����Ԫ��, value:�����±�}

        if(nums == null)    return res;

        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(record.containsKey(temp)){
                res[1] = i;
                res[0] = record.get(temp); // �õ�value:�����±�
                break;
            }
            record.put(nums[i], i); // ���{key:����Ԫ��, value:�����±�}
        }

        return res;
    }
}
