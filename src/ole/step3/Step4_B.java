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
public class Step4_B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> cubes= new ArrayList<>();
        String ns[] = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cubes.add(Integer.parseInt(ns[i]));
        }
        Collections.sort(cubes);
        cubes.forEach( (a)-> System.out.print(a+" "));
    }
}




/*
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
 */