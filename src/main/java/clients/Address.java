package clients;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    private String cityName;
    private String streetName;
    private int buildingNum;
    private int apartmentNum;
    private String postalCode;
    private static final String POSTALCODEPATTERN = "[0-9]{2}-[0-9]{3}";

    private Address(String cityName, String streetName, int buildingNum, int apartmentNum, String postalCode) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNum = buildingNum;
        this.apartmentNum = apartmentNum;
        this.postalCode = postalCode;
    }


    public static Address createAddress(String cityName, String streetName, int buildingNum, int apartmentNum, String postalCode) {
        if (StringUtils.isAnyEmpty(cityName, streetName, postalCode))
            throw new IllegalArgumentException("Pole wymagane");
        if (buildingNum<=0) throw new IllegalArgumentException("Nieprawidłowy numer budynku");
        if (!postalCodeValidator(postalCode)) throw new IllegalArgumentException("Nieprawidłowy format kodu pocztowego");
        return new Address(cityName, streetName, buildingNum, apartmentNum, postalCode);
    }

    public static boolean postalCodeValidator(String postalCode){
        Pattern pattern = Pattern.compile(POSTALCODEPATTERN);
        Matcher matcher = pattern.matcher(postalCode);
        return matcher.matches();
    }

    public void printOutAddress(Client client){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adres klienta")
                .append("\nulica: ")
                .append(streetName + " ")
                .append(this.buildingNum + "/")
                .append(this.apartmentNum)
                .append("\nMiejscowość: ")
                .append(this.cityName)
                .append("\nKod pocztowy: ")
                .append(this.postalCode);
        System.out.println(stringBuilder.toString());
    }


}
