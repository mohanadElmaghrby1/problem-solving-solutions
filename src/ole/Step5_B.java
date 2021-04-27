package ole;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mohannad Elmagharby
 * on 3/17/2020
 */
public class Step5_B {

    public static void main(String[] args) throws IOException, IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder ans = new StringBuilder("");
        int n = Integer.parseInt(scanner.nextLine());
        String s =scanner.nextLine();
        ans.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            if ((n+i)%2==0)
                ans.insert(0,s.charAt(i));
            else
                ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
}
