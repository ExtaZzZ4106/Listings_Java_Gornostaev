package Listing_6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Listing6_5 {
    private Date fromDate = null;
    private SimpleDateFormat formatter = null;

    public Listing6_5(Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay() {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getYear() {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public static void main(String[] args) {
        Date currentDate = new Date();
        Listing6_5 datePart = new Listing6_5(currentDate);

        System.out.println("Day: " + datePart.getDay());
        System.out.println("Month: " + datePart.getMonth());
        System.out.println("Year: " + datePart.getYear());
        System.out.println("Hour: " + datePart.getHour());
        System.out.println("Minute: " + datePart.getMinute());
    }
}
