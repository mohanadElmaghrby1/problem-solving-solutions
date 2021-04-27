package ole.codeforces.contest15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 4/16/2020
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),m=scanner.nextInt();
        int arr[][]=new int[m+1][2];
        for (int i = 1; i <= m; i++) {
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }
        boolean removed[]=new boolean[n+1],flag=true;
        int cnt[]=new int[n+1],ans=0;
        while (flag){
            flag=false;
            for (int i = 1; i <= m; i++) {
                if(!(removed[arr[i][0]] || removed[arr[i][1]])){
                    ++cnt[arr[i][0]];
                    ++cnt[arr[i][1]];
                }
            }
            for (int i = 0; i < cnt.length; i++) {
                if(cnt[i]==1){
                    removed[i]=true;
                    flag=true;
                }
                cnt[i]=0;
            }
            ans+=flag?1:0;
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
