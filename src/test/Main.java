//package test;
//
///**
// * @author Mohannad Elmagharby
// * on 4/8/2020
// */
//public class Main {
//
//    public static void main(String[] args) {
//        // JSON string to Java object
//        String jsonInString = "not valid";
//        ObjectMapper mapper = new ObjectMapper();
//
//        Note note;
//        try {
//            note = mapper.readValue(jsonInString, Note.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//
//        String valid = "{\"firstname\":\"jean\",\"lastname\":\"dupont\",\"login\":\"abcd1234\",\"aliasName\":\"johnny\"}";
//
//        try {
//            note = mapper.readValue(jsonInString, Note.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//    }
//}
