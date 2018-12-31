package drako.ej7;

public class Main {
    public static void main(String[] args) {
        Tarot tarot = new Tarot(2, 4, 1997);

        System.out.printf("Your tarot is: %d", tarot.getTarot());
    }
}
