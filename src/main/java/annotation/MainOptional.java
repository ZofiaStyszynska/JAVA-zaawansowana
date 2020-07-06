package annotation;

import java.util.Optional;

public class MainOptional {
    private static Optional<String> getSomeString(){
        return Optional.empty();// .valueOF("example");
    }
    public static void main(String[] args) {
        Optional<String> someString = getSomeString();

        if (someString.isPresent()){
            String s = someString.get();
            char c = s.charAt(5);

        }

        String myExpectedValue = someString.orElse("default");
        System.out.println(myExpectedValue);

    }
}
