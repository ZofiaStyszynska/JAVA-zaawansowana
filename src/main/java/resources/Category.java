package resources;

public enum Category implements Discountable {
    COMEDY(0, "Funny films") {
        @Override
        public String toString() {
            return "Ha, ha, ha....";
        }
    }
    , DRAMA(5, " Got tissue?"), HORROR(3, "Can't sleep that night"), MUSICAL(6, "Wanna dance?"),
    ACTION(2, "Shoot and drive fast");

    private final int discount;
    private final String description;

    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int discount() {
        return discount;
    }

    @Override
    public String toString() {
        return name () + description;
    }
}
//class Category extends Enum implements Discountable(){}
