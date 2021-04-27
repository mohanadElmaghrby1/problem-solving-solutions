package ole.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohannad Elmagharby
 * on 4/16/2020
 */
public class Parallel {

    public static void main(String[] args) {
        Parallel p =new Parallel();
//        p.play();

        ArrayList<Integer> l =new ArrayList<>();
        l=null;
        l.stream().forEach(System.out::println);
    }

    void play(){
        List<Integer> offsetRanges = new ArrayList<>();
        for (int i = 0; i <= 1800; i++) {
            offsetRanges.add(i*100);
        }
        offsetRanges.parallelStream().forEach(a ->print(a));
    }
    void print(int num){
        System.out.print(Thread.currentThread().getName()+"    ");
        System.out.println(num);
    }
}
