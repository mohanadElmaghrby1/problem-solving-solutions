package ole.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Mohannad Elmagharby
 * on 4/12/2020
 */
public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        AtomicInteger f = new AtomicInteger(scanner.nextInt());
        TreeMap<Integer , ArrayList<KL>> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt() , l = scanner.nextInt();
            int val =Math.min(k*2, l)-Math.min(k,l) ;
            if(!map.containsKey(val))
                map.put(val , new ArrayList<>());
            map.get(val).add(new KL(k,l));
        }
        Long ans=0l;
        for (Map.Entry<Integer, ArrayList<KL>> entry : map.entrySet()) {
             ans+= entry.getValue().stream().mapToLong(kl ->
                     Math.min(kl.k * ((f.decrementAndGet()) >=0?2:1), kl.l)).reduce(0,Long::sum);
        }
        System.out.println(ans);
    }
    static class KL{
        int k,l;

        public KL(int k, int l) {
            this.k = k;
            this.l = l;
        }
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
