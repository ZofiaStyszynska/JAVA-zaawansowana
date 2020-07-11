package exceptions;

public class ExThrow_Throw {
    public static void main(String[] args) throws ValidationException {
        m1();

    }

    private static void m1() throws ValidationException {
        m2();
    }

    private static void m2() throws ValidationException {
        m3();
    }

    private static void m3() {
        throw new IllegalArgumentException("aa");

    }
    class ValidationException extends Exception{
        public ValidationException (String msg){

        }

    }
}
