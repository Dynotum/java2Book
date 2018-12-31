package drako.ej4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        PrintStream ps = System.out;
        String data;

        try {
            ps.println("Introduce text: ");
            data = buffer.readLine();

            while (!data.equals("no")){
                data = buffer.readLine();
            }
            ps.println(data);

        } catch (Exception e) {
        }
    }


}
