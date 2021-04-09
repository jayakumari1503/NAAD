//Your task is to throw custom exception named InvalidReplacementsException in Task 1.1's program when
//replacements string is invalid
//replacement for a digit in s is not given in replacements string

//Example :
//modify("12", "2R") is invalid as replacement for 1 is not given
//modify("12", "12") is invalid as it does not match the format < int, char >

package Task1;

import java.util.Scanner;
class InvalidReplacementsException extends Exception {
    public InvalidReplacementsException(String message) {
        super(message);
        System.out.println(message);
    }
}

public class J04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string consists of digits (0-9) :");
        String Str = scanner.next();
        System.out.print("Enter a string which pair of < int, char > :");
        String pairs = scanner.next();
        System.out.print("String after replacement :\" " + modify(Str, pairs.toUpperCase()) + "\".");
    }

    public static String modify(String S, String replacements) {
        String regex = "[0-9][A-z]*$";
        if(replacements.matches(regex)) {
            System.out.println("Valid");
        }
        else{
            try{
                throw new InvalidReplacementsException("Invalid");
            }
            catch (InvalidReplacementsException e) {
                System.out.println(e);
                return null;
            }
        }
        return null;
    }
}

