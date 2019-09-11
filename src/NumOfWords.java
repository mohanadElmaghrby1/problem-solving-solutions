import java.util.HashMap;
import java.util.Scanner;

public class NumOfWords {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        String words[]=s.split("[ ]+");
        HashMap<String , Integer>map=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(map.get(words[i])==null){
                map.put(words[i],1);
            }else {
                map.put(words[i],map.get(words[i])+1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println("Key : " + key + " number  : " + value);
        });
    }
}
