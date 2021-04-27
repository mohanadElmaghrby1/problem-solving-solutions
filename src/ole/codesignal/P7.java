package ole.codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * @author Mohannad Elmagharby
 * on 3/28/2020
 */
public class P7 {


    public static void main(String[] args) {
//        int []inputArray = {2,3};
//        int []inputArray = {5, 3, 6, 7, 9};
//        System.out.println(avoidObstacles(inputArray));
//        int arr[][] = {{1, 1, 1},
//                {1, 7, 1},
//                {1, 1, 1}};
//        System.out.println(boxBlur(arr)[0][0]);

//        System.out.println(alphabeticShift("abcdz"));
//        depositProfit(100,20,170);
        int a[]={2, 4, 7};
        System.out.println(absoluteValuesSumMinimization(a));

//        System.out.println(palindromeRearranging("aab"));
//        System.out.println(palindromeRearranging("abc"));
//        System.out.println(palindromeRearranging("aabbcd"));

//        System.out.println(isIPv4Address("172.316.254.1"));

//        System.out.println(reverseInParentheses("(abc)"));
//        System.out.println(reverseInParentheses("(abcd)"));
//        System.out.println(reverseInParentheses("foo(bar(baz))blim"));
//        System.out.println(reverseInParentheses("foo(bar)baz"));
//        System.out.println(reverseInParentheses("foo(bar)baz(blim)"));
//
//        int po[]={-1, 150, 190, 170, -1, -1, 160, 180};
//        Arrays.stream(sortByHeight(po)).forEach(System.out::println);
//
//        String inputArray[] = {"aba", "aa", "ad", "vcd", "aba"};
//        Arrays.stream(allLongestStrings(inputArray)).forEach(System.out::println);
//
//        int arr00[]={1, 2, 3, 4, 3, 6};//true
//        System.out.println(solve(arr00));
//        int arr0[]={1, 2, 3, 4, 5, 3, 5, 6}; //false
//        System.out.println(solve(arr0));
//        int arr[]={1,2,3,4}; //true
//        System.out.println(solve(arr));
//        int arr2[]={1,1,2,3};//true
//        System.out.println(solve(arr2));
//        int arr3[]={1,1,2,2,3};//false
//        System.out.println(solve(arr3));
//
//
//        int arr4[]={1,2,5,3,4}; //true
//        System.out.println(solve(arr4));
//
//
//        int arr5[]={8,1,2,5,3,4}; //false
//        System.out.println(solve(arr5));
//
//        int arr6[]={8,1,2,3,4}; //true
//        System.out.println(solve(arr6));
//
//        int arr7[]={1,2,3,4,1}; //true
//        System.out.println(solve(arr7));
//
//        int arr8[]={1,2,5,3,4,1}; //false
//        System.out.println(solve(arr8));
//
//
//        int matrix[][];

    }

    static boolean solve(int sequence[]) {
        int ans = 0;
        for (int i = 1; i < sequence.length && ans < 2; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                ans++;
                if (i > 1 && i < (sequence.length - 1))
                    if (sequence[i] <= sequence[i - 2] && sequence[i + 1] <= sequence[i - 1]) return false;
            }
        }
        return ans < 2;

    }

    static String[] allLongestStrings(String[] inputArray) {
        int max = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < inputArray.length; ++i) {
            max = Math.max(max, inputArray[i].length());
        }

        for (int i = 0; i < inputArray.length; ++i) {
            if (inputArray[i].length() == max) {
                ans.add(inputArray[i]);
            }
        }
        String s = "";
        for (int i = 0; i < s.length(); i++) {

        }
        return ans.toArray(new String[ans.size()]);
    }

    static int[] sortByHeight(int[] a) {
        int[] people = Arrays.stream(a).filter(i -> i >= 0).toArray();
        Arrays.sort(people);
        int pi = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = people[++pi];
            }
        }
        return a;
    }

    static String reverseInParentheses(String inputString) {
        char[] chars;
        chars = inputString.toCharArray();
        while (true) {
            int oin = -1, cin = -1;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(') {
                    oin = i;
                } else if (cin == -1 && chars[i] == ')') {
                    cin = i;
                    break;
                }
            }
            if (oin == -1) {
                break;
            }
            //reverse
            chars[oin] = ',';
            chars[cin] = ',';
            for (int i = 1; i <= (cin - oin) / 2; i++) {
                char temp = chars[oin + i];
                chars[oin + i] = chars[cin - i];
                chars[cin - i] = temp;
            }
        }

        return new String(chars).replaceAll(",", "");

    }

    static String[] addBorder(String[] picture) {
        String ast = "****************************************************************************************************";
        String bord[] = new String[picture.length + 2];
        bord[0] = ast.substring(0, bord[0].length() + 2);
        bord[bord.length - 1] = ast.substring(0, picture[0].length() + 2);
        for (int i = 1; i < bord.length - 1; ++i) {
            bord[i] = "*" + picture[i - 1] + "*";
        }
        return bord;

    }

    static boolean palindromeRearranging(String inputString) {
        int cnt[] = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            ++cnt[inputString.charAt(i) - 'a'];
        }
        boolean odd = inputString.length() % 2 == 1;
        boolean flag = false;
        int oddCnt = 0;
        for (int i = 0; i < cnt.length; i++) {
            oddCnt += (cnt[i] % 2);
        }
        if (odd && oddCnt == 1)
            return true;
        return oddCnt == 0;
    }


    static boolean isIPv4Address(String inputString) {
        String parts[] = inputString.split("\\.");
        for (int i = 0; i < parts.length; ++i) {
            try {
                int part = Integer.parseInt(parts[i]);
                if (part < 0 || part > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }


    static int avoidObstacles(int[] inputArray) {
        boolean visited[] = new boolean[10000];
        for (int i = 0; i < inputArray.length; ++i) {
            visited[inputArray[i]] = true;
        }
        int ans = 0;
        for (int i = 1; i <= 1002; ++i) {
            int last = 0;
            boolean solved = true;
            for (int j = 0; j < visited.length; j++) {
                if ((last + i) < 1002 && visited[last + i]) {
                    solved = false;
                    break;
                }
                last += i;
            }
            if (solved) {
                ans = i;
                break;
            }
        }
        return ans;
    }


    static int[][] boxBlur(int[][] image) {
        int ans[][] = new int[image.length - 2][image[0].length - 2];
        int dxdy[][] = {{0,0, 0, 1, 1, -1, 1, -1, -1}
                , {0,1, -1, 1, 0, -1, -1, 1, 0}};
        //possiple (n-2) * (m-2)
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[i].length - 1; j++) {
                for (int v = 0; v < 9; v++) {
                    ans[i - 1][j - 1] += image[i + dxdy[0][v]][j + dxdy[1][v]];
                }
                ans[i - 1][j - 1] /= 9;
            }
        }
        return ans;
    }

    int[][] minesweeper(boolean[][] matrix) {
        int ans[][] = new int[matrix.length][matrix[0].length];
        int dxdy[][] = {{0, 0, 1, 1, -1, 1, -1, -1}
                , {1, -1, 1, 0, -1, -1, 1, 0}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int v = 0; v < 8; v++) {
                    int r=(i+dxdy[0][v]);
                    int c = (j+ dxdy[1][v]);
                    if ( (r>=0 && r<ans.length && c>=0 && c<ans[i].length) && matrix[r][c])
                        ++ans[i][v];

                }
            }
        }

        return ans;

    }

    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray).map( i -> {
            if (i==elemToReplace)
                return substitutionElem;
            return i;
        }).toArray();
    }

    boolean variableName(String name) {
        return name.matches("[^0-9][a-z?A-Z? _? 0-9?]");
    }

    static String alphabeticShift(String inputString) {
        return inputString.chars()                // IntStream
                .mapToObj(ch -> {
                    ++ch;
                    if (ch > 'z')
                        ch = 'a';
                    return (char) ch;
                })  // Stream<Character>
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    static int depositProfit(int deposit, int rate, int threshold) {
        int ans=0;
        double de = deposit;
        while(de < threshold){
            de+=((de*rate)/100f);
            ++ans;
        }
        return ans;
    }



    static int absoluteValuesSumMinimization(int[] a) {
        int ans=Integer.MAX_VALUE , ind=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int max=0;
            for (int j = 0; j < a.length; j++) {
                max+=Math.abs(a[i]-a[j]);
            }
            if (max<=ans){
                if (ans==max) {
                    ind=Math.min(ind , a[i]);
                }
                else {
                    ind = a[i];
                }
                ans=max;
            }

        }
        return ind;
    }






}
