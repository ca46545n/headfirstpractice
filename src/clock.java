import javax.swing.*;
import java.time.*;
import java.time.temporal.*;
public class clock {
    public static void main(String args[]) { //get current time and date

        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int second = now.get(ChronoField.SECOND_OF_MINUTE);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);


        if (hour < 12) {
            System.out.println("Morning bitches \n");
        } else if( hour < 17) {
            System.out.println("Good afternoon bitches \n");
        }else{
            System.out.println("Good Evening hoes \n");

        }


        System.out.print("It's  ");
        if(minute != 0) {
            System.out.print(minute + " ");
            System.out.print((minute != 1) ? "minutes" : " minute " );
            System.out.print("  and  ");
        }

        if (second != 0){
            System.out.print(second + " ");
            System.out.print((second != 1) ? "seconds" : " seconds " );
            System.out.print(" past  ");
        }

        System.out.print(" ");
        System.out.print((hour > 12 ) ? (hour - 12) : hour);
        System.out.print("  o' clock on ");

        switch (month){
            case 1:
                System.out.print(" January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
        }

       System.out.print(" "+ day +" ,"+  year +". " );

    }
}
