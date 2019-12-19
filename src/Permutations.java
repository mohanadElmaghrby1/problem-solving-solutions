import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int nums[]={1,2,3};
//        com(0 , nums , new ArrayList<>());
//
//        //test
        permute(nums);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(0).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

//        String[] arr = {"a", "b", "c", "d"};
//        int[] intArr = {1, 2, 3, 4};
//        Arrays.stream(intArr)
//                .mapToObj(s-> s +"done")
//                .forEach(System.out::println);

    }

    public static List<List<Integer>> permute(int[] nums) {
        com(0,nums , new ArrayList<>());
        return ans;
    }

    static List<List<Integer>> ans = new ArrayList<>();
    static void com(int in, int nums[] ,  List<Integer> current) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = in; i < nums.length; i++) {
            if (!current.contains(nums[i])){
                current.add(nums[i]);
                com(in,  nums , current) ;
                current.remove((Integer)nums[i]);
            }
        }
    }
}
