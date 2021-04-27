package ole.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/17/2020
 */
public class Step5_A {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sol=bf.readLine().toLowerCase().compareTo(bf.readLine().toLowerCase());
        System.out.println(sol==0?0:sol>0?1:-1);

    }
}
