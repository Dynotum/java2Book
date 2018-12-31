package drako.ej3;

public class Main {
    public static void main(String[] args) {
        float celsius = -40F;

        Degrees dg = new Degrees(celsius);

        float fare = dg.toFareheint();
        System.out.printf("Celcius: %.2f is Farheint: %.2f", dg.getCelcius(), fare);

        Class objectClass = dg.getClass();
        System.out.println("\n" + objectClass.getMethods());

    }
}
