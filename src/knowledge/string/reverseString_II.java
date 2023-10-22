package knowledge.string;

// 反转 2k 前 k 个字符串  【转字符处理】
public class reverseString_II {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();  // 字符串转字符数组

        for(int i = 0; i < ch.length; i += 2 * k){

            int start = i;
            int end = Math.min(ch.length - 1, start + k - 1);
            while(start < end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }

        }

        return new String(ch); // 返回String
    }
}
