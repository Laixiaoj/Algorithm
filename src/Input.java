import java.util.*;
// ���������뷽ʽ
public class Input {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        // ------------ �� 1,2,3��ʽ���뵽����, ArraryList��
        String input = scanner.next();
        String[] string = input.split(","); // ��,�ָ�
        int[] a = new int[4];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int t = Integer.parseInt(string[i]);
            a[i] = t;
            arrayList.add(t);
        }

        // ------------ �����ַ�����StringBuffer
        String s = scanner.nextLine(); // �����ַ���
        StringBuffer stringBuffer = new StringBuffer(s);   // ����StringBuffer���͵��ַ����������̰߳�ȫ��StringBuilder�ǲ���ȫ


        // ------------------ArrayList ���������ֵ������Сֵ�����򡢷�ת
        Collections.sort(arrayList); // ����, ����ArrayList
        Collections.sort(arrayList, Collections.reverseOrder()); // ���򣬷���ArrayList
        Collections.max(arrayList);  // ���ֵ
        Collections.min(arrayList); // ��С��
        Collections.reverse(arrayList); // ��ת

        // ------------- ��������
        Arrays.sort(a);
    }


}
