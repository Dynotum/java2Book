package drako.ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);

        PrintStream flujoS = System.out;
        char car = 0;

        try {
            flujoS.print("\nCaracter: ");
            car = (char) buffer.read();
            flujoS.print(car);
            buffer.readLine();
            flujoS.print("\nCaracter: ");
            String car2 = buffer.readLine();
            flujoS.print(car2);
        } catch (IOException e) {
        }
    }
}
