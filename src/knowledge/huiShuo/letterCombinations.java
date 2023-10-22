package knowledge.huiShuo;
import java.util.*;
public class letterCombinations {
    List<String> res = new ArrayList<>(); // �������
    StringBuffer path = new StringBuffer(); // ��·�����

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0)  return res;
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits, numString, 0);
        return res;
    }
    //���� digits ���Ϊ "23" ,��Ӧ���ַ�Ϊ "(abc) (def)", num Ϊ 2 -> abc
    private void backTracking(String digits, String[] numString, int num){

        if(num == digits.length()){ // ��ֹ������
            res.add(path.toString());
            return;
        }

        String str = numString[digits.charAt(num) - '0']; // digits.charAt(num) - '0' : ת int
        for (int i = 0; i < str.length(); i++) { // ���㣺�����ң���������"abc"  "def"
            path.append(str.charAt(i)); // ƴ���ַ�
            backTracking(digits, numString, num + 1); // �²㣺���϶���,�������� ��2�� ��3��
            path.deleteCharAt(str.length() - 1); // �Ƴ��ַ�
        }

    }
}
