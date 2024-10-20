import java.util.Random;
import java.util.Scanner;

public class NumberGussing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scann = new Scanner(System.in);

        int guss = rand.nextInt(100 )+1;
        int userGuss = 0;

        System.out.println("Guess a number between 1 to 100");

        while(userGuss != guss){
            userGuss = scann.nextInt();

            if (guss < userGuss){
                System.out.println("Your guess is high");
            }
            else if (guss > userGuss){
                System.out.println("Your guess is low");
            }
            else{
                System.out.println("you won");
            }
        }
        }

    }

