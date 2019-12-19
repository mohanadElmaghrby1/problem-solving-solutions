import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int nums[]={1,1,2};
//        com(0 , nums , new ArrayList<>());
//
//        //test
        ans = permuteUnique(nums);
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


    public static List<List<Integer>> permuteUnique(int[] nums) {
        com(0,nums , new ArrayList<>() , new ArrayList<>());
        return new ArrayList<>(set);
    }

    static List<List<Integer>> ans = new ArrayList<>();
    static HashSet<List<Integer>> set = new HashSet<>();



    static void com(int in, int nums[] ,  List<Integer> current , List<Integer> used) {
        if (current.size() == nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }
        for (int i = in; i < nums.length; i++) {
            if (!used.contains(i)){
                current.add(nums[i]);
                used.add(i);
                com(in+1,  nums , current , used) ;
                current.remove(current.size()-1);
                used.remove((Integer)i);
            }
        }
    }
}
