package Interview.baiduInterview;

import java.util.Scanner;
public class exam_03_28 {

    public void main(String[] agrs){
        Solution s= new Solution();

    }
    class Solution {
        public void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] lst = new int[n];
            int[] isUse = new int[n];
            for (int i = 0; i < lst.length; i++) {
                lst[i] = scanner.nextInt();
            }

            QuickSort(lst, 0, lst.length - 1);

            int res = 0;

            for (int i = 0; i < m; i++) { // �غ���

                int index = n - 1;

                if(isUse[index] <= k){
                    res += lst[index];
                    isUse[index] += 1;
                }
                else{
                    index -= 1;
                    res += lst[index];
                    isUse[index] = 0;
                }

            }

            System.out.println(res);
        }

        public  int BinaryPatition(int []a, int L, int R){
            int pv = a[L]; // ȡ������Ԫ�ء�Ϊ����
            int j = R; // j�����ҵ����ұȻ���С
            int i = L; // i�����ҡ��ұȻ�����
            while(i != j){
                // j����
                while (a[j] > pv && i < j) j--;
                // i����
                while (a[i] <= pv && i < j) i++;
                //С��������ߣ��󽻻����ұ�
                swap(a, i, j);
            }
            swap(a, L, j); // ����Ԫ�ؽ������м�
            return j; // �����»���λ��
        }
        public  void QuickSort(int []a, int L, int R){
            if(L >= R) return;
            int q = BinaryPatition(a, L, R); // �һ���
            QuickSort(a, L, q - 1); // ����������
            QuickSort(a, q + 1, R); // ����������
        }
        public  void swap(int []a, int i ,int j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

    }
}
