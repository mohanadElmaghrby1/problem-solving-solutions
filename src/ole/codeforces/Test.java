package ole.codeforces;

import ole.contest6.A;

import java.util.ArrayList;

/**
 * @author Mohannad Elmagharby
 * on 4/12/2020
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Float> a = new ArrayList();
        a.add(.1f);
        a.add(.3f);
        a.add(.4f);
        a.add(.5f);

        a.stream().mapToInt( s-> (int) (s*3)).forEach(System.out::println);
    }
}
