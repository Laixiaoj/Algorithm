package knowledge.string;

// ��ת���� "the sky is blue" -> "blue is sky the"
public class A_reverseWords {

    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();  // ת�ַ�
        StringBuilder res = new StringBuilder(); // �����
        reverse(ch, 0, s.length() - 1); // ��ת����

        for(int i = 0; i < ch.length; i++){ // ��תһ��һ������

            if(ch[i] == ' ') continue;
            // ͳ��һ�����ʵĳ���
            int begin = i;
            while(i < ch.length && ch[i] != ' ') i++;
            reverse(ch, begin, i - 1); // ��ת����

            for (int j = begin; j < i; j++) // �浥��
                res.append(ch[j]);
            res.append(' '); // �ָ���

        }
        return new String(res.substring(0, res.length() - 1)); // ����String��ͬʱȥ�����һ���ո�
    }

    // �Զ��巴ת�ַ���
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
