package javaEnumirators;

public class Enumerators {
    enum carTypes{
        SUV, Hatchback, sedan, Sports;
    }

    public static void main(String[] args) {

        carTypes c1 = carTypes.SUV;

        System.out.println(c1.ordinal()); //Used to get the index of the custom data type elements

        for(carTypes c : carTypes.values()){    //values() is used to iterate adn get the values of the enumerator
            System.out.println(c);
            System.out.println(c.ordinal());
        }
    }

}
