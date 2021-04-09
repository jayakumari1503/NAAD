//In this task you have to develop a game in which user has to guess an incomplete word (consonants omitted) shown. The game should work as follows :
//To start the game, call startGame(String s) and pass the word to be guessed.
//Write a function startGame(String s) in which,
//replace consonants in s with '_'
//chances = (noOfConsonantsInS + 3)
//while(chances-- != 0),
//print s and take a character as input
//if character exists in s, update s
//break if entire word is guessed (User WINS!)
//User loses if word is not guessed within the chances given.

package Task2;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  word as string :");
        String str = scanner.next().toUpperCase();
        if(startGame(str))
            System.out.println(" You Win!!");
        else
            System.out.println("You Lose!!");
    }

    public static boolean startGame(String S) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(S);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'A' && S.charAt(i) != 'E' && S.charAt(i) != 'I' && S.charAt(i) != 'O' && S.charAt(i) != 'U') {
                count++;
                stringBuilder.append("_");
            }
            else
                stringBuilder.append(S.charAt(i));
        }
        System.out.print(stringBuilder1);

    int chances = count + 3;
    int j = 0;
    String alphabet;
    boolean condition = false;

    while(chances--!=0) {

        System.out.print("\nWord : " +stringBuilder );
        System.out.print("\nchances :" + (chances + 1));
        System.out.print("\nGuess :");
        alphabet = scanner.next().toUpperCase();

        for(int i = 0; i<S.length(); i++) {
            if(alphabet.charAt(0) == S.charAt(i)) {
                j++;
                stringBuilder.setCharAt(i, alphabet.charAt(0));
            }
        }
        if(j>0) {
            System.out.print("Guess Alphabet :" + alphabet + " found" + j + " time(s)!");
        }
        else
         System.out.print("Guess Alphabet not found !!");

        j = 0;
        if(stringBuilder.toString().equals(stringBuilder1.toString())) {
            condition  = true;
            break;
        }
    }
    return condition;
    }

}
