import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {


    public static void main(String[] args) {
        int candidates []= {2,3,5};

        combinationSum(candidates, 8);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combin(0,new ArrayList<>(),0 , candidates,target);
        return ans;
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public  static void combin(int sum,List<Integer> current , int indx ,int[] candidates, int target){

        if (sum>target)
            return;

        if (sum==target){
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i=indx;i<candidates.length ; ++i){
            if (i>indx)
                indx=i;
            current.add(candidates[i]);
            combin(candidates[i]+sum,current,indx,candidates,target);
            current.remove((Integer)candidates[i]);
        }
    }
}
