import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to guess: ");
        String str = input.nextLine();
        String toGuess = str.replaceAll("[a-z]","-");
        int counter = 0;
        StringBuilder sb = new StringBuilder(toGuess);
        System.out.println(sb);
        System.out.println("Enter a letter: ");
        do {
            char c=input.nextLine().charAt(0);
            for (int i = 0; i < str.length() ; i++) {
                if (c==str.charAt(i)){
                    sb.setCharAt(i,c);
                }
            }
            System.out.println(sb);
            counter++;

        } while (sb.toString().contains("-"));
        System.out.println("You guessed!!! The number of tries was: "+counter);
    }
}
