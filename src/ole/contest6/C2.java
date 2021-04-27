package ole.contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mohannad Elmagharby
 * on 3/18/2020
 */
public class C2 {

    public static void main(String[] args)  throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nh[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nh[0]);
        int l = Integer.parseInt(nh[1]);

        String ls[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            list.add(Integer.parseInt(ls[i]));
        Collections.sort(list);

        //compare the 2 corners (0 to first num , l to last num)
        double ans = 2*Math.max(list.get(0)-0 , l-list.get(n-1));
        ans = Math.max(ans , binarySearch(l , list));
        System.out.format("%.10f", ans/2,0);
    }


    public static int binarySearch(int lat , ArrayList<Integer> list){
        int l=0,r=lat;
        int ans=Integer.MAX_VALUE;
        while (l<=r){
            int mid = l + (r-l)/2;
            //check if calculated mis is fit
            if(isWell(mid,list)){
                //save mid ansr
                ans=Math.min(ans , mid);
                //try number less than mid
                r = mid - 1;
            }else {
                //try number bigger than mid
                l=mid+1;
            }
        }
        return ans;
    }

    /**
     * check if given mid is applicable to cover the distance between lat
     * @param mid generated d
     * @param list
     * @return true if mid can cover all distances , false otherwise
     */
    public static boolean isWell(double mid,ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (mid < (list.get(i)-list.get(i-1)))
                return false;
        }
        return true;
    }

}
