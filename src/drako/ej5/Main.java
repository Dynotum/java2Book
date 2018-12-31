package drako.ej5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Raiz
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read A.B.C\n");
        Raiz raiz = new Raiz(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        */

        // Esfera
        /*
        Esfera esfera = new Esfera(45.6);
        System.out.printf("Radio: %.2f\nVolumen: %.2f", esfera.getRadio(), esfera.getVolume());
        */

        // Name and year
        /*
        String name, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me yout name.");
        name = sc.nextLine();
        System.out.println("Give me your birthday year.");
        year = sc.nextLine();
        System.out.printf("Hola %s, en el anio 2030 tendras %d anios", name, getYearDif(Integer.parseInt(year)));
        */

    }

    public static int getYearDif(int year) {
        final int FUTURE_YEAR = 2030;

        if (year < 1920) {
            throw new java.lang.Error("Muy anciano para ser real");
        } else if (year > FUTURE_YEAR) {
            throw new java.lang.Error("Con que eres del futuro?");
        }

        return FUTURE_YEAR - year;
    }
}
