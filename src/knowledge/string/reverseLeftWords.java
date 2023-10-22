package knowledge.string;

// 左旋转字符串
public class reverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();

        reverse(ch, 0, n - 1);  // 反转前n个字符  ab|cdefg -> ba|cdefg
        reverse(ch, n, ch.length - 1); // 反转剩余字符 ba|cdefg -> ba|gfedc
        reverse(ch, 0, ch.length - 1); // 反转整个字符 bagfedc -> cdefgab

        return new String(ch);

    }
    // 自定义反转字符串
    public void reverse(char[] ch, int left, int right){
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }
    }

}
