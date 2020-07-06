package annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Hero {
    private final String name;
    private Set<String> superpowers;

    public Hero(String name, String... powers) {
        this.name = name;
        this.superpowers = new HashSet<String>();
    }
    @Test
    public void saveWorld(){
        System.out.println("saving");
    }

    public Set<String> getSuperpowers() {
        //dzięki temu ograniczamy możliwość modyfikacji kodu - ENKAPSULACJA
        return Collections.unmodifiableSet(superpowers);
    }
// dodawanie mocy odbywa się poprzez wywołanie dodatkowej metody
    public void addSuperPower(String... power) {
        for (String s : power) {
            System.out.println("Oh I got new superpower");
            this.superpowers.add(s);
        }
    }
//    public Hero(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Hero hero = (Hero) o;
//        return Objects.equals(name, hero.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
