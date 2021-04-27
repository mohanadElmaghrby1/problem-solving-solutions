package ole.codeforces.sec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/13/2020
 */
public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), t = scanner.nextInt();
        int wastes[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            wastes[i][0] = scanner.nextInt();
            wastes[i][1] = scanner.nextInt();
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(-1, "Waste");
        map.put(0, "Carrots");
        map.put(1, "Kiwis");
        map.put(2, "Grapes");

        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            int wasteBefore = 0;
            for (int j = 0; j < wastes.length; j++) {
                if (r > wastes[j][0] || r >= wastes[j][0] && c > wastes[j][1])
                    ++wasteBefore;
                else if (r == wastes[j][0] && c == wastes[j][1]) {
                    wasteBefore = -1;
                    break;
                }
            }
            int cellsBefore = (r - 1) * m + (c - 1) - wasteBefore;
            if(wasteBefore==-1)
                cellsBefore=-1;
            ans.append(map.get((cellsBefore) % 3) + "\n");

        }
        System.out.println(ans.toString());
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
