package ole.contest14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/1/2020
 */
public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       char []codeforces="CODEFORCES".toCharArray();
       char[]wrongpanner = scanner.next().toCharArray();
       int ind=0;
        for (int i = 0; i < wrongpanner.length && ind<codeforces.length; i++) {
            if (wrongpanner[i]==codeforces[ind])
                ++ind;
        }
        System.out.println(ind==codeforces.length?"YES":"NO");
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
