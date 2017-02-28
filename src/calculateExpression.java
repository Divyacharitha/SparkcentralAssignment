import java.util.Stack;

public class calculateExpression
{
    public static int calculate(String expression)
    {
        char[] elements = expression.toCharArray();

        // Stack for storing numbers
        Stack<Integer> values = new Stack<Integer>();

        // Stack for storing operators
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < elements.length; i++)
        {
            // skip the current element if it is whitespace
            if (elements[i] == ' ')
                continue;

            // if the element is number pushing into values stack
            if (elements[i] >= '0' && elements[i] <= '9')
            {
                StringBuffer sbuf = new StringBuffer();
                while (i < elements.length && elements[i] >= '0' && elements[i] <= '9')
                    sbuf.append(elements[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
            }


            // if an element is operator
            else if (elements[i] == '+' || elements[i] == '-' ||
                    elements[i] == '*' || elements[i] == '/')
            {
                while (!ops.empty() && hasPrecedence(elements[i], ops.peek()))
                    values.push(performOp(ops.pop(), values.pop(), values.pop()));
                ops.push(elements[i]);
            }
        }

        // Applying remaining operators to remaining values
        while (!ops.empty())
            values.push(performOp(ops.pop(), values.pop(), values.pop()));

        // Result is returned from top of value stack
        return values.pop();
    }


    /**
     *
     * @param op1
     * @param op2
     * @return Precedence of operators
     */
    public static boolean hasPrecedence(char op1, char op2)
    {
       return Precedence.hasPrecedence(op1,op2);
    }


    /**
     *
     * @param op
     * @param b
     * @param a
     * @return value after performing operations
     */
    public static int performOp(char op, int b, int a)
    {
       return Operations.performop(op,b,a);
    }


}