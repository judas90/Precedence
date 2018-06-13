class Dog {
    String name;
    String says;
}


public class Precedence {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name= "Cujo";
        System.out.println(spot.name);
        scruffy.says= "Hello";
        System.out.println(scruffy.says);
        Dog fluffy = new Dog();
        spot = fluffy;
        System.out.println(spot);
        System.out.println(spot.equals(fluffy));
        System.out.println(spot==fluffy);
        System.out.println(spot.toString()+scruffy);

    }
}