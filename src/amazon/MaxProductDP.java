package amazon;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class MaxProductDP {

    public static void main(String[] args) {
        System.out.println(solve2(100, 20));
//        System.out.println(solve(100, 20, 1, ""));
    }

    static long visited[][]= new long[102][22];
    static long  solve2(int s , int k ){
        if (k==0){
            return s==0?1:-1;
        }
        if (visited[s][k] !=0){
            return visited[s][k];
        }
        long max=-1;
        for (int i = 1; i <= s; i++) {
            if (s-i >=0){
                max= Math.max(i*solve2(s-i , k-1 ) , max);
            }else break;
        }
        visited[s][k]=max;
        return max;
    }

    static int  solve(int s , int k , int ans , String l){
        if (k==0){
            System.out.println("{"+l+"} = "+ans);
            return ans;

        }
        int max=-1;
        for (int i = 1; i <= s; i++) {
            if (s-i >=0){
               max= Math.max(solve(s-i , k-1 , ans*i , l+","+i) , max);
            }else break;
        }

        return max;
    }
}
