public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterThanOrEqual = (a >= b);
        boolean isLessThanOrEqual = (a <= b);

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        System.out.println("a <= b: " + isLessThanOrEqual);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        boolean andResult = (x && y);
        boolean orResult = (x || y);
        boolean notResult = !x;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + andResult); // AND
        System.out.println("x || y: " + orResult);  // OR
        System.out.println("!x: " + notResult);     // NOT
    }
}
 
    

