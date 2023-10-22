// ������������ n �� k�����ط�Χ [1, n] �����п��ܵ� k ��������ϡ�
package knowledge.huiShuo;
import java.util.*;
public class A_combine {
    /*          ��������������
    void backtracking(����) {     1. ȷ������
        if (��ֹ����) {             2. ȷ����ֹ����
            ��Ž��;
            return;
        }

        for (ѡ�񣺱��㼯����Ԫ�أ����нڵ㺢�ӵ��������Ǽ��ϵĴ�С��) {  3. �����߼�
            ����ڵ�;
            backtracking(·����ѡ���б�); // �ݹ�
            ���ݣ�����������
            }
    }
    */
    public static void main(String[] a){
        A_combine c =new A_combine();
        c.combine(4, 2);
    }

    List<List<Integer>> res = new ArrayList<>(); // ������ �б�洢
    LinkedList<Integer> path = new LinkedList<>(); // ��ÿ�� k ���飬����洢
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return res;
    }

    private void backTracking(int n, int k, int startIndex){
        // ��ֹ����  
        if(path.size() == k){ // path��С���� k ��ֵ
            res.add(new ArrayList<>(path));
            return;
        }
        // �����߼�
        for (int i = startIndex; i <= n; i++) { // ���㣺������
            path.add(i); // ����
            backTracking(n, k, i + 1); // �²㣺���϶���
            path.removeLast(); // ����
        }
    }
}
