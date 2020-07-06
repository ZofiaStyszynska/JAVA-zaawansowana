package exceptions;

import java.util.IllegalFormatException;

public class IllegalStateExeption {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("error handled. " + e.getMessage());
        }
        try {
            test();
        } catch (IllegalAccessError | IllegalFormatException e) {
            System.out.println("error handled. " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("error handled### " + e.getMessage());
        } finally {
            System.out.println("Finally always call");
        }
    }

    private static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException(" Żródłowy problem. Błędny stan.");
        }
        System.out.println("after error");
    }
}
