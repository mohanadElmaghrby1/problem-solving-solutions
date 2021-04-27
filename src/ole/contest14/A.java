package ole.contest14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/1/2020
 */
public class A {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        ArrayList<Long> luckynums = getLuckyNums(l , r);

        long curr =luckynums.get(0);
        long ans=curr;
        int i=0;
        while (curr<=r){
            ans+=(curr-l)*curr;
            l= (int) curr;
            curr=luckynums.get(++i);
        }

        ans+=(r-l)*curr;
        System.out.println(ans);
    }

     static ArrayList<Long> getLuckyNums(int l, int r) {
         Queue<String> q = new LinkedList<>();
         ArrayList<Long> nums = new ArrayList<>();
         q.add("");
         long add4=0 , add7=0;
         while (!(add4>r || add7>r)){
             String curr = q.remove();
              add4 = Long.parseLong(curr+"4");
             if (add4>=l)
                 nums.add(add4);
              add7 = Long.parseLong(curr+"7");
             if (add7>=l)
                 nums.add(add7);
             q.add(add4+"");
             q.add(add7+"");
         }
        return nums;
    }

    static class Scanner {
        StringTokenizer tokenizer;
        BufferedReader reader;

        public Scanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public boolean ready() throws IOException {
            return reader.ready();
        }
    }
}
