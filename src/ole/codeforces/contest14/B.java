package ole.codeforces.contest14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/15/2020
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scanner.nextInt();
        Arrays.sort(arr);
        boolean ans=false;
        for (int i = 0; i < n-2; i++) {
            int a=arr[i], b =arr[i+1] , c=arr[i+2];
            if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
                ans = true;
                break;
            }
        }
        System.out.println(ans?"YES":"NO");

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
