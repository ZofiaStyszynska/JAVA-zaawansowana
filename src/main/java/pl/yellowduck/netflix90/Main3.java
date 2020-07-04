package pl.yellowduck.netflix90;

import resources.Category;

public class Main3 {
    //detailed description of enum class
    public static void main(String[] args) {
        Category category = Category.DRAMA;
        System.out.println(category);
        System.out.println(category.toString());
        System.out.println(category.name());
        System.out.println(category.ordinal());

        Category comedy = Category.COMEDY;
        System.out.println(comedy);
        System.out.println(comedy.toString());
        System.out.println(comedy.name());
        System.out.println(comedy.ordinal());

//        System.out.println(Category.DRAMA.getClass());
//        System.out.println(Category.DRAMA.getDeclaringClass());
//        System.out.println(Category.HORROR.getClass());
//
}
}
