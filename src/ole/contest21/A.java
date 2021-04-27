package ole.contest21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/21/2020
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        StringBuilder ans=new StringBuilder("");
        for (int i = 0; i < n; i++) {
            String wor=scanner.next();
            if (wor.length()>10){
                ans.append(wor.charAt(0)+""+(wor.length()-2)+""+wor.charAt(wor.length()-1)+"\n");
            }else ans.append(wor+"\n");
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
