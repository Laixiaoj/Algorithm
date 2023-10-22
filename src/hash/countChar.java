package hash;

// ����ţ��� magazine �����ҵ� ransomNote ������ ��Ϊ Hash��
public class countChar {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] record = new int[26]; // ʹ�������ϣ����

        for(char i : magazine.toCharArray())
            record[i - 'a'] += 1; // ͳ��magazine�ַ�

        for(char i : ransomNote.toCharArray())
            record[i - 'a'] -= 1; // ͳ��ransomNote�ַ�

        for(int i : record){
            if(i < 0)  return false; // ��magazine�ַ�������
        }
        return true;
    }
}


