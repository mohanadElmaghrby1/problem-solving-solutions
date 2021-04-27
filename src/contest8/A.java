package contest8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/22/2020
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int b=scanner.nextInt();
        int d=scanner.nextInt();
        int sum=0 , ans=0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a>b)
                continue;
            sum+=a;
            if (sum>d){
                ++ans;
                sum=0;
            }
        }
        System.out.println(ans);

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
