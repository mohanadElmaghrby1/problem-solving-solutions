package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * created by mohannad on 15/09/2019
 */
public class Div2_451B {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String inputs[] = bf.readLine().split(" ");
        int arr[]=new int[n];
        for (int i = 0; i < n; ++i)
            arr[i]=(Integer.parseInt(inputs[i]));
        int sin=0,ein=0;
        /***
         3
         3 2 1
         * yes
         * 1 3
         *
         * 4
         * 2 1 0 3 4
         * yes
         * 1 3
         * 1 2 6 4 5 7
         */
        String ans="yes";
        boolean visited=false , brk=false;
        for (int i = 1; i < n; i++) {
           if (arr[i]<arr[(i-1)]){
               if (brk){
                   ans="no";
                   break;
               }
               ein=i;
               if(!visited)
                   sin=i-1;
               visited=true;

           }else {
               if(visited)
                   brk=true;

               if(visited&& arr[i]<arr[sin]){
                   ans="no";
                   break;
               }
           }
        }

        if(sin>0 &&arr[ein]<arr[sin-1])
            ans="no";
        ++sin;
        ++ein;
        System.out.println(ans.equals("no")?"no":"yes\n"+sin+" "+ein);

    }
}
