package ole.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/12/2020
 */
public class A {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();
        int lower =0;
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i)>96)
                ++lower;
        System.out.println(lower>=(s.length()+1)/2?s.toLowerCase():s.toUpperCase());
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
