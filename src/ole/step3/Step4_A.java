package ole.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/16/2020
 */
public class Step4_A {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int r=0,c=0;
        for (int i = 0; i < 5; i++) {
            String row[] = bf.readLine().split(" ");
            for (int j = 0; j < row.length; j++) {
                if (row[j].equals("1")){
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println((Math.abs(2 - c) + Math.abs(2 - r)));
    }
}




/*
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
 */