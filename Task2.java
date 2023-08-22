import java.util.Scanner;

public class Task2 {


    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Character: ");

            char c = scan.next().charAt(0);

            System.out.printf("The character %c has the value %d%n", c, ((int) c));
        }
    }




}
