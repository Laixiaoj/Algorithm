package hash;// ����֮��Ϊ 0 �������ĸ�����  ��Map ��Ϊ Hash��
import java.util.*;

public class fourNumberSum_I {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        // {key: nums1 + nums2, value: count(nums1 + nums2)}
        Map<Integer, Integer> record = new HashMap<>();
        int temp = 0;
        int res = 0; // ���

        for(int i : nums1){ // ����num1 �� num2 ���������� ���� ͳ�ƴ���
            for(int j : nums2){
                temp = i + j;
                if(record.containsKey(temp)){
                    record.put(temp, record.get(temp) + 1);
                }else{
                    record.put(temp, 1);
                }
            }
        }

        for(int i : nums3){// ����num3 �� num4 ���������� ���� �ж��Ƿ���record�г���
            for(int j : nums4){
                temp = i + j;
                if(record.containsKey(0 - temp)){
                    res += record.get(0 - temp);
                }
            }
        }
        return res;
    }
}
