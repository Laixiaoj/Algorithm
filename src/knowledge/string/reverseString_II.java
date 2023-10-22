package knowledge.string;

// ��ת 2k ǰ k ���ַ���  ��ת�ַ�������
public class reverseString_II {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();  // �ַ���ת�ַ�����

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

        return new String(ch); // ����String
    }
}