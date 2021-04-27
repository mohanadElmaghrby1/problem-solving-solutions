package ole.contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/18/2020
 */
public class A {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nh[] = bf.readLine().split(" ");
        int y = Integer.parseInt(nh[0]);
        int w = Integer.parseInt(nh[1]);
        String arr[]={"0/1","1/6","1/3","1/2","2/3","5/6","1/1"};
        System.out.println(arr[7-Math.max(y,w)]);


    }
}
