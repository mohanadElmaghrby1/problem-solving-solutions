import java.util.*;
import java.util.stream.Collectors;

public class CombinationSumII {


    public static void main(String[] args) {
        int candidates[] = {10, 1, 2, 7, 6, 1, 5};


//        combinationSum(candidates,8);
        Arrays.sort(candidates);

        List<List<Integer>> lists = combinationSum2(candidates, 8);
//
        for (int i = 0; i < lists.size(); i++) {
            for (int i1 = 0; i1 < lists.get(i).size(); i1++) {
                System.out.print(lists.get(i).get(i1) + " ");
            }
            System.out.println();
        }


    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        com(0, "", candidates, new ArrayList<>(), target);
        return new ArrayList<>(set);
    }

    static HashSet<List<Integer>> set = new HashSet<>();

    static void com(int indx, String curr, int[] candidates, List<Integer> current, int target) {
        if (target == 0) {
            set.add(new ArrayList<>(current));
            return;
        }
        if (target < 0)
            return;

        for (int i = indx; i < candidates.length; i++) {
            current.add(candidates[i]);
            com(++indx, curr + "," + candidates[i], candidates, current, target - candidates[i]);
            current.remove((Integer) candidates[i]);
        }
    }

}
