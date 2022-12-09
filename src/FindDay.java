import java.io.*;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;

public class FindDay {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new  FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }

    public static String findDay(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);
        String days=dayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
        return days;
    }
    public static String dayOfWeek(int i){
        String d="";
        switch(i){
            case 1:
                d= "MONDAY";
                break;

            case 2:
                d= "TUESDAY";
                break;
            case 3:
                d="WEDNESDAY";
                break;
            case 4:
                d="THURSDAY";
                break; case 5:
                d="FRIDAY";
                break; case 6:
                d="SATURDAY";
                break; case 7:
                d="SUNDAY";
                break;
        }
        return d;
    }















}

