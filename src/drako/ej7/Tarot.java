package drako.ej7;

import java.util.ArrayList;
import java.util.List;

public class Tarot {
    private int day;
    private int month;
    private int year;
    private int result;


    public Tarot(int dDay, int mMonth, int yYear) {
        this.day = dDay;
        this.month = mMonth;
        this.year = yYear;
    }

    public int getTarot() {
        List<Integer> modulos = new ArrayList<>();
        result = day + month + year;

        while (result > 0) {
            System.out.println("Primer result = " + result + "> 0 || " + modulos.size() + " modulos.size == 0");

            modulos.add(result % 10);
            result = result / 10;
            System.out.println("entro: " + modulos + " result: " + result);

            if (result == 0) {
                for (Integer i : modulos) {
                    result += i;
                    System.out.println("result inside modules= " + result);
                }
                modulos.clear();
                System.out.println("after clleaning" + modulos);
                if (result / 10 == 0) {
                    System.out.println("return: " + result);
                    return result;
                }
            }
            System.out.println("final result= " + result);
        }
        return result;
    }
}
