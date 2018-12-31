package drako.ej5;

import java.io.PrintStream;

public class Test1 {
    public static void main(String[] args) {
        /*PrintStream flujo = System.out;

        char car1 = 'A', car2 = 65, car3 = 0;

        car3 = (char) (car1 + 'a' - 'A');
        flujo.println(car3 + " " + (char) car3);
        car3 = (char) (car2 + 32);
        flujo.println(car3 + " " + (char) car3);
        */

        multiplo();
    }

    public static void multiplo() {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 != 0) continue;
            System.out.println(i + " ");
        }
    }
}
