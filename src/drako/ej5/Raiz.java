package drako.ej5;

public class Raiz {
    private Double a;
    private Double b;
    private Double c;
    private Double x;

    public Raiz(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a == 0 && b == 0) {
            System.out.println("Ecuacion degenerada\n");
        } else if (a == 0 && b != 0) {
            System.out.printf("Existe una raiz unica con valor %.2f", (-c / b));
        } else {
            calculate();
        }

    }


    public void calculate() {
        Double discriminante = Math.pow(b, 2) - (4 * a * c);
        Double re = -b / (2 * a);
        Double im = (discriminante / (2 * a));

        if (discriminante >= 0) {
            //dos raices
            System.out.printf("Raices Reales\nPrimera raiz: %.2f\nSegunda raiz: %.2f", re + im, re - im);
        } else { // menor que 0
            //dos raices complejas
            // x + yj, x - yJ
            System.out.printf("Raices Complejas\nPrimera raiz: %.2f + %.2f j\nSegunda raiz: %.2f - %.2f j", re, Math.abs(im), re, Math.abs(im));
        }
    }
}
