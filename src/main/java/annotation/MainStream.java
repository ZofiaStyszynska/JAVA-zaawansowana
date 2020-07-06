package annotation;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<String> capitalCities = List.of("Warsaw", "Berlin", "Amsterdam", "Lisbona", "Paris", "Rome ", "London");

        //Stary sposób
        List<String> capitalCitiesW = new ArrayList<>();

        for (String capital : capitalCities) {
            if (capital.startsWith("W")) {
                System.out.println(capital);
                capitalCitiesW.add(capital);

            }

        }
        //nowy sposób
        Set<String> stream = capitalCities.stream()
                .filter(p -> p.startsWith("W"))
                .collect(Collectors.toSet());
        String reversed = StringUtils.reverse("agb");

        List<String> capitalCitiesL = new ArrayList<>();
        for (String capital : capitalCities) {
            if (capital.startsWith("L")) {
                // System.out.println(capital);

                capital = capital.toUpperCase();
                //
                capital = StringUtils.reverse(capital);

                capitalCitiesL.add(capital);
                System.out.println(capital);

            }

        }
        Set<String> capitalsReversed = capitalCities.stream()
                .filter(p -> p.startsWith("L"))
                .map(String::toUpperCase)
                .map(StringUtils::reverse)
                .collect(Collectors.toSet());
        System.out.println(capitalsReversed);

        //wyfiltruj zaczynające się na O
        capitalCities.stream()
                .filter(p -> p.startsWith("O"))
                .findAny()
                .ifPresentOrElse(p -> System.out.println(p),
                        () -> System.out.println("Nie znaleziono stolic na O"));


        //stary sposób - odwrócić szyk liter

    }
}
