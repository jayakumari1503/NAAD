//Java program to implement switch statement on strings.

package Task0.String;

public class J09 {
    public static void main(String[] args) {
     String Temperature = "Hot";

     switch(Temperature){
         case "Hot" ->
             System.out.print(" It's too hot.");

         case "Cold" ->
             System.out.print(" It's too cold.");

        default ->
            System.out.print(" What temperature is ?");

     }
    }
}
