package knowledge;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A_Sort {
    public static void main(String[] args) throws InterruptedException{
        int []  a = {1, 5, 9, 11, 20, 26, 30, 56, 70, 90};
        int [] b = {5, 3, 7, 1, 6, 9, 8, 2, 4};
        int x = 1;
        System.out.println(Arrays.toString(b));

    }
    // -----------------------���ֲ���
    public static int binarySearch(int []a, int x){
        int R = a.length;
        int L = 0;
        while(L <= R){
            int M = (R + L) / 2;
            if(a[M] == x) return M;
            else if(a[M] > x) R = M - 1;
            else L = M + 1;
        }
        return -1;
    }
    // -----------------------ð������
    public static void BubbleSort(int []a){
        int L = a.length;
        for (int i = 0; i < L - 1; i++) { // �ܹ���Ҫ�Ƚϡ�n-1����Ԫ��
            Boolean isSwap = false;
            for (int j = 0; j < L - 1 - i; j++) { // ��������Ԫ�ضԱ�
                if(a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) break; //
        }
    }
    // -----------------------ѡ������
    public static void SelectSort(int []a){
        for (int i = 0; i < a.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < a.length; j++) {
                if(a[k] > a[j]) k = j; //�ҵ�δ�����Ӽ�����СԪ��
            }
            swap(a, i, k); // ����λ��
        }
    }
    // -----------------------��������
    public static void InsertSort(int []a){
        for (int i = 1; i < a.length; i++) { // δ�����Ӽ���1��ʼ
            int t = a[i]; // ������Ԫ��
            int j = i - 1; // �����Ӽ����Ͻ�
            while(j >= 0){
                if(t < a[j]) a[j + 1] = a[j]; // ������Ԫ�� < �����Ӽ�Ԫ��
                else break; // ������Ԫ�� > �����Ӽ�Ԫ��, ֱ���˳�
                j--;
            }
            a[j + 1] = t; // ��j + 1���ǲ����λ��
        }
    }

    // -----------------------��������
    public static void QuickSort(int []a, int L, int R){
        if(L >= R) return;
        int q = BinaryPatition(a, L, R); // �һ���
        QuickSort(a, L, q - 1); // ����������
        QuickSort(a, q + 1, R); // ����������
    }
    // ����
    public static int BinaryPatition(int []a, int L, int R){
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
    // ����
    public static void swap(int []a, int i ,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    // -----------------------�鲢���� -- �ֶ���֮
    public static void merge_Sort(int[] a, int L, int R){
        if(L < R){
            int M = (L + R) / 2;  // ȡ�е㲻�Ϸ���
            merge_Sort(a, L , M); // ��������
            merge_Sort(a, M + 1, R); // �Ұ������

            int[] b = new int[R - L + 1];
            merge(a, b, L, M, R);  // ���ϲ�������
        }
    }
    // ������a[L, M] ���Ұ��a[M + 1, R] �ϲ��� b[L, R]
    public static void merge(int[] a, int[] b, int L, int M, int R){
        int i = L; // �����½�
        int j = M + 1; // �Ұ���½�
        int k = 0; // b�����½�

        while (i <= M && j <= R){  // ͬʱ�����߳�����ÿ��ȡ��С
            if(a[i] < a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }
        // ����һ��������������ֱ�����һ��
        while (i <= M)
            b[k++] = a[i++];

        while (j <= R)
            b[k++] = a[j++];

        // ƴ�ӻص�a[L, R]�У�ֱ�� a[0, n]Ϊֹ
        for (int l = 0; l < k; l++) {
            a[L + l] = b[l];
        }

    }

}
