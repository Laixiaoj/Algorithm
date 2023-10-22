package knowledge.string;

// ����ת�ַ���
public class reverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();

        reverse(ch, 0, n - 1);  // ��תǰn���ַ�  ab|cdefg -> ba|cdefg
        reverse(ch, n, ch.length - 1); // ��תʣ���ַ� ba|cdefg -> ba|gfedc
        reverse(ch, 0, ch.length - 1); // ��ת�����ַ� bagfedc -> cdefgab

        return new String(ch);

    }
    // �Զ��巴ת�ַ���
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
