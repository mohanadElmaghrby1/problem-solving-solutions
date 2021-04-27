package ole.contest21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/21/2020
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        int p=scanner.nextInt();
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < p; i++)
            set.add(scanner.nextInt());
        int y=scanner.nextInt();
        for (int i = 0; i < y; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println(set.size()==n?"I become the guy.":"Oh, my keyboard!");
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
