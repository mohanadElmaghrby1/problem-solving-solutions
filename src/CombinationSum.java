import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    public static void main(String[] args) {
        int candidates []= {2,3,5};

        combinationSum(candidates, 8);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combin(0,"",0 , candidates,target);
//        for (int i = 0; i < ans.size(); i++) {
//            for (int j = 0; j < ans.get(i).size(); j++) {
//                System.out.print(ans.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        return ans;
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static void combin(int sum,String s , int indx ,int[] candidates, int target){

        if (sum>target)
            return;

        if (sum==target){
            String[] split = s.split(",");
            ArrayList<Integer> seq=new ArrayList<>();
            for (int i = 1; i < split.length; i++) {
                seq.add(Integer.parseInt(split[i]));
            }
            ans.add(seq);
//            System.out.println("sum :"+sum);
//            System.out.println(s);
            return;
        }

        for (int i=indx;i<candidates.length ; ++i){
            if (i>indx)
                indx=i;
            combin(candidates[i]+sum,s+","+candidates[i],indx,candidates,target);
        }
    }
}
