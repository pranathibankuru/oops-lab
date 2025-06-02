public class EvenNumberExceptionExample {
    static class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}
    public static void checkOddNumber(int number) throws EvenNumberException {
        System.out.println("B.PRANATHI,CSE24022");
        if (number % 2 == 0) {
            throw new EvenNumberException("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        for (int number : numbers) {
            try {
                checkOddNumber(number);
            } catch (EvenNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}