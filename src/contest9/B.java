package contest9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/24/2020
 */
public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = scanner.nextInt();
        long arr[]=new long[n+1];
        ArrayList<Long>list = new ArrayList<>();
        list.add(0l);
        for (int i = 1; i <= n; i++) {
            long v= scanner.nextLong();
            arr[i]=v;
            list.add(v);
            arr[i]+=arr[i-1];
        }

        Collections.sort(list);
//        Arrays.sort();
        for (int i = 1; i <=n; i++) {
            list.set(i , list.get(i)+list.get(i-1));
        }
        int m=scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int type = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (type==1){
                out.println(arr[r]-arr[l-1]);
            }else
                out.println(list.get(r)-list.get(l-1));
        }

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
