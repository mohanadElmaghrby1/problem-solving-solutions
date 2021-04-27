package ole.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Mohannad Elmagharby
 * on 3/16/2020
 */
public class Step4_D2 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> solutions = new ArrayList<>();
        solutions.add("ABC");
        solutions.add("ACB");
        solutions.add("BAC");
        solutions.add("BCA");
        solutions.add("CAB");
        solutions.add("CBA");
        String inputs[]=new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i]=bf.readLine();
        }
        for (int i = 0; i < solutions.size(); i++) {
            String s = solutions.get(i);
            boolean flag = true;
            for (int j = 0; j < inputs.length; j++) {
                if (inputs[j].charAt(1)=='>'){
                    if (! (s.indexOf(inputs[j].charAt(0)) > s.indexOf(inputs[j].charAt(2)))){
                        flag=false;
                    }
                }else {
                    if (! (s.indexOf(inputs[j].charAt(2)) > s.indexOf(inputs[j].charAt(0)))){
                        flag=false;
                    }
                }
            }
            if (flag){
                System.out.println(solutions.get(i));
                return;
            }
        }

        System.out.println("Impossible");
    }
   }




/*
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
 */