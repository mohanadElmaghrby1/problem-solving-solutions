package ole.contest10;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Mohannad Elmagharby
 * on 3/25/2020
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n =sc.nextInt();
        int c =sc.nextInt();
        char col = sc.next().charAt(0);
        visited=new boolean[n][c];
        char arr[][]=new char[n][c];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <c; j++) {
                if (arr[i][j]==col)
                    cnt(i,j,col , arr);

            }
        }

        System.out.println(ans.size());
    }
    static boolean visited[][];
    static HashSet<Character>ans=new HashSet<>();
    static void cnt(int r , int m , char col , char arr[][]){
        if (r<0 || r>=arr.length || m <0 || m>=arr[0].length || visited[r][m] || arr[r][m]=='.')
            return;
        if (arr[r][m]!= col){
            ans.add(arr[r][m]);
            return;
        }
        visited[r][m]=true;

        cnt(r,m+1,col,arr); //right
        cnt(r,m-1,col,arr); //left
        cnt(r-1,m,col,arr);//up
        cnt(r+1,m,col,arr);//down
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
