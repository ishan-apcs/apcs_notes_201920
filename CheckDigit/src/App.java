public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static boolean isValid(int numWithCheckDigit) {
        return getCheck(numWithCheckDigit / 10) == numWithCheckDigit % 10;
    }

    /**
     * There needs to be an integer variable called numOfWrongChecks in the
     * CheckDigit class that tracks the desired value. This int must be static to
     * allow the static methods to use it. In the isValid method, instead of
     * directly returning the value of the comparison statement, the method should
     * instead store it in a boolean called valid. An if statement must check if
     * valid is false, if so, the numOfWrongChecks variable must be incremented by
     * 1. After this if statement is complete, the method can then return the valid
     * boolean variable.
     */
}
