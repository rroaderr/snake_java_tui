import java.util.Scanner;

public class Globals {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String movement = "0";

        while (!(movement.toUpperCase().equals("W") ||
                 movement.toUpperCase().equals("A") ||
                 movement.toUpperCase().equals("S") ||
                 movement.toUpperCase().equals("D"))) {

            System.out.println("Move with WASD:");
            movement = Globals.sc.nextLine(); // works now

            if (!(movement.toUpperCase().equals("W") ||
                  movement.toUpperCase().equals("A") ||
                  movement.toUpperCase().equals("S") ||
                  movement.toUpperCase().equals("D"))) {
                System.out.println("Use W, A, S, or D");
            }
        }

        System.out.println("You moved: " + movement.toUpperCase());
    }
}