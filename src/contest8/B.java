package contest8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;

/**
 * @author Mohannad Elmagharby
 * on 3/22/2020
 */
public class B {

    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String line ;
//        while ((line=bf.readLine())!=null){
//            long base = Long.parseLong(line);
//            long power = Long.parseLong(bf.readLine());
//            int mod = Integer.parseInt(bf.readLine());
//            bf.readLine();
//            System.out.println(pow(base , power , mod));
//        }


        System.out.println(Integer.MAX_VALUE);
        System.out.println(pow(3,18132,17));
        System.out.println(pow(17,1765,3));
        System.out.println(pow(2147483647,2147483647,46340));


        System.out.println(new BigInteger("2147483647").modPow(new BigInteger("2147483647"),
                new BigInteger("46340")));
    }


//(3%2  * 3%2 *3 %2 * 3%2 * 3%2)%2
    static long pow(long base , long power , int mod){
        long ans=1;
        for (long i = 0; i < power; i++) {
            ans*=base;
            ans%=mod;
        }
        return ans;
    }












//log2(2147483647) = 30





    static HashMap<String , Long> map = new HashMap<>();


//

    static long pow2(long base , long power , int mod){
        //base case
        if (power==1){
            return base;
        }
        //left
        long left=pow2(base , power/2, mod)%mod;

        left*=(left);
        left%=mod;


        if (power%2==1)
            left*=base;


        return left%mod;
    }



//    static long pow2(long base , long power , int mod){
//        //base case
//        if (power==1){
//            return base;
//        }
//        if (map.containsKey(power))
////            return map.get(power);
//
//        //left
//        long left=pow2(base , power/2, mod)%mod;
//
//        long right=pow2(base , power/2, mod)%mod;
//
//        long ans = left* right;
//        ans%=mod;
//
//        if (power%2==1) {
//            ans*=base;
//            ans%=mod;
//        }
//        map.put(""+power , ans);
//        return ans;
//    }
}
