// 组合总和 III
package knowledge.huiShuo;
import java.util.*;
public class combinationSum3 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n, k, 1, 0);
        return result;
    }

    private void backTracking(int targetSum, int k, int startIndex, int sum) {
        // 减枝
        if (sum > targetSum) {
            return;
        }

        if (path.size() == k) { // 终止条件
            if (sum == targetSum) result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= 9; i++) { // 当层逻辑
            path.add(i);
            sum += i;
            backTracking(targetSum, k, i + 1, sum);
            //回溯
            path.removeLast();
            //回溯
            sum -= i;
        }
    }
}
