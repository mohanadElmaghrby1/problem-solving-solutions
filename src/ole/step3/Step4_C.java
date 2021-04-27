package ole.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mohannad Elmagharby
 * on 3/16/2020
 */
public class Step4_C {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        int arr[] = new int[10];
        fillArr(arr, n);
        int ans = 0;
        while (true&&n.length()>1) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += (arr[i] * i);
                arr[i]=0;
            }
            fillArr(arr , sum+"");
            ++ans;
            if (sum<10) {
                break;
            }
        }

        System.out.println(ans);
    }
    static void fillArr(int arr[] , String number){
        for (int i = 0; i < number.length(); i++) {
            ++arr[number.charAt(i) - '0'];
        }
    }

}




/*
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
 */