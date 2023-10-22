package knowledge.huiShuo;
import java.util.*;
public class letterCombinations {
    List<String> res = new ArrayList<>(); // 存最后结果
    StringBuffer path = new StringBuffer(); // 存路径结果

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0)  return res;
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits, numString, 0);
        return res;
    }
    //比如 digits 如果为 "23" ,对应的字符为 "(abc) (def)", num 为 2 -> abc
    private void backTracking(String digits, String[] numString, int num){

        if(num == digits.length()){ // 终止条件，
            res.add(path.toString());
            return;
        }

        String str = numString[digits.charAt(num) - '0']; // digits.charAt(num) - '0' : 转 int
        for (int i = 0; i < str.length(); i++) { // 当层：自左到右，遍历的是"abc"  "def"
            path.append(str.charAt(i)); // 拼接字符
            backTracking(digits, numString, num + 1); // 下层：自上而下,遍历的是 “2” “3”
            path.deleteCharAt(str.length() - 1); // 移除字符
        }

    }
}
