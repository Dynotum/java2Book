package drako.ej1;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate( - 0.0, 0.0, 0.0);
        //Calculate calculate1 = new Calculate();

        double result = calculate.result();

        System.out.printf("Result: %.2f", result);
    }
}
