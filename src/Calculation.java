import java.util.Scanner;

/**
 * Created by Divya on 2/27/17.
 */
public class Calculation {

    /**
     *
     * Main method that performs calculation
     */
    public static void main(String[] args) {
        calculateExpression c = new calculateExpression();
        System.out.println("Please enter input Expression to calculate:");
        Scanner scanner = new Scanner(System. in);
        String input = scanner. nextLine();
        System.out.println(c.calculate(input));
        System.out.println(c.calculate("100 * 2 + 12"));
    }
}
