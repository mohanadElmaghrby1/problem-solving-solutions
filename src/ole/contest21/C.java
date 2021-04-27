package ole.contest21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/21/2020
 */
public class C {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(scanner.nextInt());
        String ans="YES";
        if (set.size()>3)
            ans="NO";
        else if (n>2 && set.size()==3) {
            Integer arr[]=set.toArray(new Integer[3]);
            Arrays.sort(arr);
            int max= arr[2];
            int min=arr[0];
            int mid=arr[1];
            ans=(max-mid)==(mid-min)?"YES":"NO";
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
