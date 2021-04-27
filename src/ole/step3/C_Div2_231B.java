package ole.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Mohannad Elmagharby
 * on 3/15/2020
 */
public class C_Div2_231B {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ndl[] = bf.readLine().split(" ");
        int n = Integer.parseInt(ndl[0]);
        int d= Integer.parseInt(ndl[1]);
        int l= Integer.parseInt(ndl[2]);
        solve(n,d,l);

//        System.out.println(getMax(n,l));

//        long str = System.nanoTime();
//        solve(0, 0,n , d, l, new int [n] );
//        if (!solved) {
//            System.out.println(-1);
//        }

//        System.out.println((str-System.nanoTime())/1000000000);


    }

    static HashMap<String , Boolean> visited = new HashMap<>();
    static boolean solved=false;
    public static void solve(int indx , int sum , int n , int d , int l , int arr[]){
        if (visited.containsKey(indx+","+sum) || solved)
            return;

        if (indx == (n) ){
            System.out.println("sum:"+sum);
            if (sum==d){
//                System.out.println(sum);
                printArr(arr);
                solved=true;
                //print arr
            }
            return;
        }

        for (int i = 1; i <= l; i++) {
            visited.put((indx+","+sum), true);
            arr[indx]=i;
            solve(indx+1, (i-(sum)) , n , d , l , arr);
        }
    }

    static void printArr(int arr[]){
        for (int i = 0; i <arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
    }



    static void solve (int n , int d , int l){
        int min=getMin(n, l);
        int max= getMax(n,l);
        if (d<min || d>max){
            System.out.println(-1);
            return ;
        }

        int ansr[]=new int [n];
        int sub = max-d;
        for (int i = n; i >0 ; i--) {
            if (i%2==(n%2)){
                int re = Math.min(sub , (l-1));
                ansr[i-1]= l-re;
                sub-=re;
            }else
                ansr[i-1]=1;
        }

        System.out.println("can run");
        printArr(ansr);
    }
    static int getMax(int n , int l){
        if (n%2==0)
            return  ((n/2)*(l-1));
        return ((n/2)*(l-1))+l;
    }

    static int getMin(int n , int l){
        if (n%2==0)
            return (n/2)*(1-l);
        return ((n/2)*(1-l))+1;
    }
}
