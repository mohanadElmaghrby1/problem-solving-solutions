package utils;

import java.util.List;

public class Combination {


    public static void main(String[] args) {
        com(0,"",2);
    }

   static void com(int in , String curr , int target){
        if (target==0){
            System.out.println(curr);
            return;
        }

       for (int i = in; i < 2; i++) {
           com(++in , curr+","+i , target-1);
       }
   }
}

