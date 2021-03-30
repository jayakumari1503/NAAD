//Java program to convert string to date.

package Task0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class J01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the date in  the format of 'yyyy-MM-dd' as a string : ");
        String strDate = scanner.next();

        LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.ISO_DATE);

        System.out.print(" Date : " + date);
    }

}
