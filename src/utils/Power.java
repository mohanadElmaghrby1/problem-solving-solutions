package utils;

/**
 * @author Mohannad Elmagharby
 * on 3/22/2020
 */
public class Power {

    public static void main(String[] args) {
        System.out.println(pow(2,2));
        System.out.println(pow(2,4));
//        System.out.println(pow(2,3));
//        System.out.println(pow(2,5));
//        System.out.println(pow(2,6));
    }





    static int pow(int base , int power ){
        if (power==1)
            return base;

        int left = pow(base , power/2);
        int right = pow(base , power/2);

        return left*right;
    }







//    static int pow(int base , int power){
//        if (power<=1){
//            return power==1?base:1;
//        }
//        return pow(base , power/2)*pow(base ,power/2)*pow(base,power%2);
//    }
}
