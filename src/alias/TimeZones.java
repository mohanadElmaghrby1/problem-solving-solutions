package alias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Mohannad Elmagharby
 * on 5/12/2020
 */
public class TimeZones {

    public static void main(String[] args) {
//        TimeZone tz = TimeZone.getTimeZone("UTC");
//        DateFormat fromDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // Quoted "Z" to indicate UTC, no timezone offset
//        fromDateFormat.setTimeZone(tz);
//        String fromDate = fromDateFormat.format(new Date());
//
//        DateFormat toDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
//        toDateFormat.format(LocalDate.now());
//
//        System.out.println(fromDate);



//        nowZone();
//        getIntervalDateTime(10);

//        System.out.println(convertStringtoZoneDateTime("2020-05-19T10:15:12.000Z").isBefore(ZonedDateTime.now()));
//        System.out.println(ZonedDateTime.now(ZoneOffset.UTC)+","+ZonedDateTime.now(ZoneOffset.UTC).plusYears(100));
//
//
//        System.out.println("test:"+convertStringtoZoneDateTime("2020-06-09T13:34:54.000Z").plusDays(7));
//
//        List<String> dates = Arrays.asList(
//                "2030-01-30T22:59:52.000Z",
//                "2040-01-30T22:59:52.000Z",
//                "2020-05-19T13:59:52.000Z",
//                "2010-01-30T22:59:52.000Z");
//
//        System.out.println("break");
//        filterDates(dates).forEach(System.out::println);

        System.out.println(getMostRecent("2018-02-08T10:53:00.000Z", "2018-02-09T10:53:00.000Z"));

    }

    private static void nowZone(){
        System.out.println("zoneeeeeeeed");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now.format(formatter));

        ZonedDateTime zonedDateTime = ZonedDateTime.now().plusYears(5);
        System.out.println(zonedDateTime.format(formatter));
    }

    private static void getIntervalDateTime(int years){
        Instant nowUtc = Instant.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
        ZoneId utc = ZoneId.of("UTC");
        ZonedDateTime nowUTcDateTime = ZonedDateTime.ofInstant(nowUtc, utc);

        String startDate = nowUTcDateTime.format(dateFormatter);
        System.out.println(startDate);

        String endDate = nowUTcDateTime.plusYears(years).format(dateFormatter);
        System.out.println(startDate+","+endDate);

    }

    private static ZonedDateTime convertStringtoZoneDateTime(String datetimezone){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        return ZonedDateTime.parse(datetimezone);
    }


    private static List<String> filterDates(List<String> dates){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
        System.out.println(ZonedDateTime.now(ZoneOffset.UTC) +"==========now");
        return dates.stream()
                .filter(date ->ZonedDateTime.parse(date).isAfter(ZonedDateTime.now(ZoneOffset.UTC)))
                .collect(Collectors.toList());
    }


    private static String getMostRecent(String date1 , String date2){
        if (ZonedDateTime.parse(date1).isAfter( ZonedDateTime.parse(date2))) {
            return date1;
        }
        return date2;
    }
}
