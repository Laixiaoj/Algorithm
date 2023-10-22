// 出现频率最高的 k 个数字  【Map 作为 Hash】
package hash;
import java.util.*;

public class A_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> record = new HashMap<>(); // key 为 nums元素， value 为统计数
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
        //利用Map的entrySet方法，转化为list进行排序
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        //利用Collections的sort方法对list排序
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                //正序排列，倒序反过来
                return o2.getValue() - o1.getValue();
            }
        });
        //遍历排序好的list，一定要放进LinkedHashMap，因为只有LinkedHashMap是根据插入顺序进行存储
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer,Integer> e : entryList) {
            linkedHashMap.put(e.getKey(),e.getValue());
        }
        return linkedHashMap;
    }


}
