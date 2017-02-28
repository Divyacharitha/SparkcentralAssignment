/**
 * Created by Divya on 2/27/17.
 */
public class Operations {

    /**
     *
     * @param op
     * @param b
     * @param a
     * @return result after performing arithmetic operations
     */
    public  static int performop(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            ArithmeticException("Division by zero not allowed");
                return a / b;
        }
        return 0;
    }


}
