package other;

// ����:���㽫�����ַ������Ϊ0ʱ��Ҫ���β�����������1�ĸ���
public class to_zero {

    public static void main(String[] args) throws InterruptedException{
        String s = "10001";
        System.out.println(countOne(new StringBuffer(s)));
    }

    public static int countOne(StringBuffer s){
        int count = 0;
        s.append('0');
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1' && s.charAt(i + 1) == '0')
                count ++;
        }
        return count;
    }
}
