package ole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/9/2020
 */
public class Step1_B {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String ns[] = bf.readLine().split(" ");
        int arr[]= new int [n];
        for (int i = 0; i < n; i++) {
           arr[i]=Integer.parseInt(ns[i]);
        }
//        int max=1;
//        for (int i = 0; i < arr.length; i++) {
//            int curr=1;
//            //right
//            curr+=getSectionsEqualOrLess( i , +1 , arr);
//
//            //left
//            curr+=getSectionsEqualOrLess( i , -1 , arr);
//            max = Math.max(curr , max);
//        }
//        System.out.println(max);
        System.out.println(OofN(arr));
    }

    public static int getSectionsEqualOrLess(int indx , int add , int arr[]){
        int ans=0;
        while ((indx+add) >= 0 && (indx+add) < arr.length && arr[indx]>=arr[indx+add]) {
                ++ans;
            indx+=add;
        }
        return ans;
    }


    public static int OofN(int arr[]){
        int ans=0;
        int clac[][]=new int [2][arr.length];
        int calc2[]=new int[arr.length];
        clac[0][0]=1;
        clac[1][arr.length-1]=1;

        calc2[0]=1;
        calc2[arr.length-1]=1;

        //right to left
        for (int i = 1 , j = arr.length-2; i < arr.length; i++, --j) {

            clac[0][i]=1;
            if (arr[i] >= arr[i-1]) {
                clac[0][i] +=clac[0][i-1];
                calc2[i]+=calc2[i-1];
            }

            clac[1][j]=1;
            if (arr[j] >= arr[j+1]) {
                clac[1][j] +=clac[1][j+1];
                calc2[j]+=calc2[j+1];
            }


        }

//        //left to right
//        for (int i = arr.length-2; i >=0; --i) {
//            clac[1][i]=1;
//            if (arr[i] >= arr[i+1]) {
//                clac[1][i] +=clac[1][i+1];
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            ans = Math.max(ans , (clac[0][i] + clac[1][i] -1));
//        }

        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans , calc2[i]);
        }

        return ans-1;

    }
}
