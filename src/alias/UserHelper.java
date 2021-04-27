package alias;

/**
 * @author Mohannad Elmagharby
 * on 5/3/2020
 */
public class UserHelper {

    public static void main(String[] args) {
        for (int i = 50; i < 400; i++) {
            String query="insert into user values ("+i+",'user"+i+"' , 'family"+i+"' ,'user"+i+"' ,'$2a$10$dlQoyURQf.B/9MNringgpOrAgJ/Xe011pruFoujKxFsFNnPrD9dhW',1);";
            System.out.println(query);
        }
    }
}
