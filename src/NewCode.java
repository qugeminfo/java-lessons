import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {
        int low = 1, high = 100, mid;
        Scanner scan = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100");

        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("Is your number less than, greater than or equal to " + mid + "?");
            System.out.println("Enter '<', '>' or '='");
            String input = scan.nextLine();

            if (input.equals("<")) {
                high = mid - 1;
            } else if (input.equals(">")) {
                low = mid + 1;
            } else if (input.equals("=")) {
                System.out.println("The number you're thinking of is " + mid);
                break;
            } else {
                System.out.println("Invalid input, try again");
            }
        }
    }
}

