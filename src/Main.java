import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ive randomly choose one number beetwen 1 and 100. Guess what the namber is");
        int randomNumber = (int) (Math.random()*100)+1;
        Scanner scan = new Scanner(System.in);
        boolean guess = false;

        for  (int i= 0; i<=9 && guess == false; i++){
            System.out.println("Insert number: ");
            int number = scan.nextInt();
            if (number > randomNumber ) {
                System.out.println("Incorrect - you're number is too big. You have " + (9-i) + " chance(s).");
                guess = false;

            }
            else if (number < randomNumber ) {
                System.out.println("Incorrect - you're number is too small." + (9-i) + " chance(s).");
                guess = false;

            }
            else (number == randomNumber){
                System.out.println("Correct! You win!!");
                guess = true;
                break;
            }
        }

        if (guess == false) {
            System.out.println("You defeated!");
            System.out.println("The number was: " + randomNumber);
        }


    }
}
