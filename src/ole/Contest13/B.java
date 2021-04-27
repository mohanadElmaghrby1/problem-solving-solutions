package ole.Contest13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/31/2020
 */
public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int v = 0; v < arr.length; v++) {
                    if (arr[i] == arr[j] + arr[v] && j != v) {
                        System.out.println((i + 1) + " " + (j + 1) + " " + (v + 1));
                        return;
                    }

                }

            }
        }
        System.out.println("-1");
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
