package Other;// Catalan�����������ڵ㡢��������ƥ�䡢�ɶ���Ʊ���ָ������Ρ�ջ��˳��
// f(n) = f(0) * f(n - 1) + f(1) * f(n - 2) + ... + f(n - 2) * f(1) + f(n - 1) * f(0)
// ͳ��Catalan��

import java.util.ArrayList;
import java.util.List;

public class Catalan {
    public int Catalan(int n){
        if(n == 0)
            return 0;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1); // f(0) = 1;
        res.add(1); // f(1) = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j <= i - 1; j++) {
                sum += res.get(j) * res.get(i - 1 - j);
            }
            res.add(sum);
        }
        return res.get(n);
    }

    // ��������ƥ��
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        // ִ��������ȱ������������ܵĽ��
        dfs("", n, n, res);
        return res;
    }

    private void dfs(String curStr, int left, int right, List<String> res) {
        // ��Ϊÿһ�γ��ԣ���ʹ���µ��ַ��������������������
        // �ڵݹ���ֹ��ʱ��ֱ�Ӱ�����ӵ���������ɣ�ע���롸���ۡ��� 46 �⡢�� 39 ������
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        // ��֦����ͼ�������ſ���ʹ�õĸ����ϸ���������ſ���ʹ�õĸ������ż�֦��ע�����ϸ�ڣ�
        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(curStr + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(curStr + ")", left, right - 1, res);
        }
    }


    public static void main(String[] agrs){
        Catalan t = new Catalan();
        List<String> l = t.generateParenthesis(3);
        System.out.println("n = 3ʱ �ܹ��� " + t.Catalan(3) + " �������������");
        System.out.println("�����" + l.toString());

    }
}
