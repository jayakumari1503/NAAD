//Java program to remove all whitespaces from a string.
package Task0.Introduction;

public class Task0_12 {
    public static void main(String args[]) {
        String string = "   Hello  W orld ";
        System.out.println(" Original sentence : " + string);
        
        string = string.replaceAll(" \\s " , " ");
        System.out.println(" After replacement : " + string);
    }
    
}
