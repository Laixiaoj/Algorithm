// �󡾲����ظ��ַ�����Ӵ��ĳ��ȡ� ���������ڡ�
package knowledge.string;
import java.util.HashMap;

public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        // ��������  abcaa  --->  abc
        HashMap<Character, Integer> map = new HashMap<>(); // ������ظ�����
        int L = 0; // �����½�as
        int res = 0; // ���
        for (int R = 0; R < s.length(); R++) {
            char element  = s.charAt(R); // ��ȡ�ַ�
            if(map.containsKey(element)){ // ���ڸ�keys��Ϊ��
                L =  Math.max(L, map.get(element) + 1); // �����½�, + 1���޳����ظ�Ԫ��
            }
            res = Math.max(res, R - L + 1); // ���³���
            map.put(element, R); // ���ַ��봮
        }
        return res;
    }
    StringBuffer s = new StringBuffer();
}
