/**
 * Created by Divya on 2/27/17.
 */
public class Precedence {

    /**
     *
     * @param op1
     * @param op2
     * @return true if 'op2' has higher or same precedence as 'op1', otherwise returns false.
     */
    public static boolean hasPrecedence(char op1, char op2)
    {

        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
}
