package testpart;
import java.util.*;

public class test {
    public static void main(String[] args){
        int[] a = {1, 2, 2, 2, 3, 1, 1, 3, 1, 2};
        Arrays.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        int maxCount = 0;
        int count = 0;
        int pre = 0;
        for (int i = 0; i < a.length; i++) {
            if(pre != a[i])
                count = 1;
            else
                count ++;

            if(count > maxCount){
                res.clear();
                res.add(a[i]);
                maxCount = count;
            }
            else if(count == maxCount){
                res.add(a[i]);
            }

            pre = a[i];
        }
        System.out.println(Arrays.toString(res.toArray()));
    }

}

