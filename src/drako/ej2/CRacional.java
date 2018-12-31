package drako.ej2;

public class CRacional {
    private int numerador;
    private int denominador;

    public CRacional(int num, int den) {
        numerador = num;
        if (den == 0) {
            throw new java.lang.Error("Cannot divide by Zero");
        }
        denominador = den;

    }

    public void visualizarRacional() {
        System.out.printf("%d/%d", numerador, denominador);
    }
}

