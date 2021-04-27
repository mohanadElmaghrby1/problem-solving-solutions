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
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt() , lockf=-1,ans=0;
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        lockf = a%2+b%2+c%2;
        if(lockf>1)
            lockf=1;
        for (int i = 3; i < n; i++) {
            if(scanner.nextInt()%2!=lockf){
                ans=i+1;
                break; }
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
