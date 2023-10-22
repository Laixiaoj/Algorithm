package knowledge.string;

// 反转单词 "the sky is blue" -> "blue is sky the"
public class A_reverseWords {

    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();  // 转字符
        StringBuilder res = new StringBuilder(); // 存结结果
        reverse(ch, 0, s.length() - 1); // 反转整串

        for(int i = 0; i < ch.length; i++){ // 反转一个一个单词

            if(ch[i] == ' ') continue;
            // 统计一个单词的长度
            int begin = i;
            while(i < ch.length && ch[i] != ' ') i++;
            reverse(ch, begin, i - 1); // 反转单词

            for (int j = begin; j < i; j++) // 存单词
                res.append(ch[j]);
            res.append(' '); // 分隔符

        }
        return new String(res.substring(0, res.length() - 1)); // 返回String，同时去除最后一个空格
    }

    // 自定义反转字符串
    public static void reverse(char[] ch, int left, int right){
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }
    }

    public static void main(String[] args){

        System.out.println(reverseWords("the sky is blue"));

    }

}
