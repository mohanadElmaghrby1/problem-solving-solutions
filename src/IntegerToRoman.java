import java.util.HashMap;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(900));
    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap();
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        String ans = "";
        int i=0;
        while (num>0){
            if (num>=arr[i]){
                ans+=map.get(arr[i]);
                num-=arr[i];
            }else {
                ++i;
            }
        }
        return ans;
    }

}
