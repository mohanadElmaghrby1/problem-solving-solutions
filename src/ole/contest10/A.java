package ole.contest10;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/25/2020
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String lin = sc.next();
        int ans=0;
        for (int i = 0; i < lin.length(); i++) {
            ans+=Math.min(('z'+1)-lin.charAt(i) , lin.charAt(i)-'a');
        }

        out.println(ans);
        out.flush();
        out.close();
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
