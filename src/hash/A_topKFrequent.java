// ����Ƶ����ߵ� k ������  ��Map ��Ϊ Hash��
package hash;
import java.util.*;

public class A_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> record = new HashMap<>(); // key Ϊ numsԪ�أ� value Ϊͳ����
        for (int i = 0; i < nums.length; i++) {
            if(record.containsKey(nums[i])){
                record.put(nums[i], 1 + record.get(nums[i]));
            }
            else{
                record.put(nums[i], 1);
            }
        }

        record = sortMap(record);
        int index = 0;
        for(Integer key : record.keySet()){
            if(index == k) break;
            res[index ++] = key;
        }
        return res;
    }

    public static Map<Integer, Integer> sortMap(Map<Integer, Integer> map) {
        //����Map��entrySet������ת��Ϊlist��������
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        //����Collections��sort������list����
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                //�������У����򷴹���
                return o2.getValue() - o1.getValue();
            }
        });
        //��������õ�list��һ��Ҫ�Ž�LinkedHashMap����Ϊֻ��LinkedHashMap�Ǹ��ݲ���˳����д洢
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer,Integer> e : entryList) {
            linkedHashMap.put(e.getKey(),e.getValue());
        }
        return linkedHashMap;
    }


}
