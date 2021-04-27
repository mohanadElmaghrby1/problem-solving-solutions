package ole.contest7;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/20/2020
 */
public class A {

    public static void main(String[] args) throws IOException, IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int arr[]=new int[n+2];
        for (int i = 0; i < n; i++)
            arr[i+1]=sc.nextInt();
        int m =sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x-1]+=(y-1);
            arr[x+1]+= (arr[x]-y);
            arr[x]=0;
        }
        for (int i = 1; i <= n; i++) {
            out.append(arr[i]+"\n");
        }
        out.flush();
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
