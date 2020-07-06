package annotation;

import java.lang.reflect.Method;

public class HeroMain {
    public static void main(String[] args) {
        Hero superman = new Hero ("Superman");
        Hero antman = new Hero ("Antman");
        Hero spiderman = new Hero("Priderman");

        //te metody się nie odpalą, bo set mocy został opakowany w "unmodificable" i potrzebna jest osobna metoda dla dodania mocy
       // antman.getSuperpowers().add("fire ball");
       // antman.getSuperpowers().add("Eye laser");

        antman.addSuperPower("Spiderweb");

//        Method[] methods = spiderman.getClass().getMethods();
//        for (Method method:methods){
//            System.out.println(method.getName());
//            Test declaredAnnotations = method.getAnnotation(Test.class);
//            System.out.println(declaredAnnotations);
        //}
    }
}
