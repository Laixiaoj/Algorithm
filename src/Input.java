import java.util.*;
// 常见的输入方式
public class Input {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        // ------------ 按 1,2,3格式输入到数组, ArraryList中
        String input = scanner.next();
        String[] string = input.split(","); // 以,分割
        int[] a = new int[4];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int t = Integer.parseInt(string[i]);
            a[i] = t;
            arrayList.add(t);
        }

        // ------------ 输入字符串、StringBuffer
        String s = scanner.nextLine(); // 输入字符串
        StringBuffer stringBuffer = new StringBuffer(s);   // 输入StringBuffer类型的字符串，这是线程安全，StringBuilder是不安全


        // ------------------ArrayList 排序、求最大值、求最小值、倒序、反转
        Collections.sort(arrayList); // 排序, 返回ArrayList
        Collections.sort(arrayList, Collections.reverseOrder()); // 倒序，返回ArrayList
        Collections.max(arrayList);  // 最大值
        Collections.min(arrayList); // 最小组
        Collections.reverse(arrayList); // 反转

        // ------------- 数组排序
        Arrays.sort(a);
    }


}
