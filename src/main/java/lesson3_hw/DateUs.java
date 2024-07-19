package lesson3_hw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateUs {

    private static final DateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private int year;
    private int month;
    private int day;
    private String date;

    @Override
    public String toString() {
        return "DateUs{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public DateUs() {
        System.out.println("Введите дату в формате (гггг-мм-дд): ");
        this.date = prompt();
        this.year = Integer.parseInt(date.split("-")[0]);
        this.month = Integer.parseInt(date.split("-")[1]) ;
        this.day = Integer.parseInt(date.split("-")[2]);

    }

    private String prompt(){

        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        checkNull(result);
        checkValid(result);
        return result;
    }


    private void checkNull (String string){
        try {
            if(string.isEmpty()){
                //Вы ничего не ввели
                throw new NullPointerException("You haven't entered anything");
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean checkValid (String string){
        try {
            FORMAT.setLenient(false);
            FORMAT.parse(string);
        } catch (ParseException e) {
            throw new RuntimeException("You have entered invalid data");
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public String getDate() {
        return date;
    }

}
