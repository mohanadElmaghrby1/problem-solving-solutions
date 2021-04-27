package utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mohannad Elmagharby
 * on 5/10/2020
 */
public class TestStream {

    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
//        nums.stream().map(num -> {
//            if (num%2==0)
//                num=addRandom(num);
//            return num;
//        }).forEach(System.out::println);

//        testParalle();

//        List<List<String>> data =new ArrayList<>();
//
//        List<String> ins1=new ArrayList<>();
//        ins1.addAll(Arrays.asList("1","2","3"));
//        data.add(ins1);
//
//        List<String> ins2=new ArrayList<>();
//        ins2.addAll(Arrays.asList("4","5","6"));
//        data.add(ins2);
//
//        flatMap(data);

//        new TestStream().testHashCode();
        dist();

    }

    public static int addRandom(int num){
        for (int i = 0; i < 100; i++) {
            num+=i;
        }
        return num;
    }

    private static void dist(){
        ArrayList<String> list= new ArrayList<>();
        list.add("user");
        list.add("admin");
        list.add("user");
        list.add("admin");
        List<String> collect = list.stream()
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

    private static void testParalle(){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.parallelStream().map( num ->{
            sleeeeep();
            return num;
        }).forEach(System.out::println);
    }
    private static void sleeeeep(){
        System.out.println("Threa name :"+Thread.currentThread().getName() );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void flatMap(List<List<String>> data){

        //using java 8 (Optional null safe )
        Optional.ofNullable(data)
                //Optional return stream or empty one if null
                .map(Collection::stream)
                .orElseGet(Stream::empty)

                .flatMap(Collection::stream)
                .forEach(System.out::println);




    }


    private  void testHashCode(){
        Model m1=new Model(1,"01005087893","01014152062");
        Model m2=new Model(1,"01005087893","01014152062");
        Model m3=new Model(3,"01005087893","01014152062");
        Model m4=new Model(4,"02143421344","01014152062");

        System.out.println("m1 hashcode:"+m1.hashCode());
        System.out.println("m2 hashcode:"+m2.hashCode());
        System.out.println("m3 hashcode:"+m3.hashCode());
        System.out.println("m4 hashcode:"+m4.hashCode());


        HashSet<Model> set = new HashSet<>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);

        System.out.println(set.size());
    }

    class Model {
        private int id;
        private String phoneNumber;
        private String secondePhoneNumber;

        public Model(int id, String phoneNumber, String secondePhoneNumber) {
            this.id = id;
            this.phoneNumber = phoneNumber;
            this.secondePhoneNumber = secondePhoneNumber;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSecondePhoneNumber() {
            return secondePhoneNumber;
        }

        public void setSecondePhoneNumber(String secondePhoneNumber) {
            this.secondePhoneNumber = secondePhoneNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Model model = (Model) o;
            return phoneNumber.equals(model.phoneNumber) &&
                    secondePhoneNumber.equals(model.secondePhoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(phoneNumber, secondePhoneNumber);
        }
    }
}
