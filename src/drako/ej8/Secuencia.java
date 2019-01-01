package drako.ej8;

public class Secuencia {
    private int noFila;
    private final static int NO_FILA = 20;
    private int NO_FILA_AUX = NO_FILA;
    private final static char SPACE = '-'; //32

    public Secuencia(int noFila) {
        this.noFila = noFila;
    }

    public Secuencia() {
    }

    public void getPiramide() {

        for (int filaActual = 1; filaActual <= NO_FILA; filaActual++) { // loop all filas
            for (int i = 1; i < NO_FILA * 2; i++) { // print char's
                if ((NO_FILA_AUX * 2) / 2 == i ) {
                    if (filaActual >= 10 && filaActual % 10 == 0) {
                        System.out.printf("%d", filaActual * 0);
                        NO_FILA_AUX--;
                    } else if (filaActual > 10 && filaActual % 10 != 0) {
                        System.out.printf("%d", filaActual % 10);
                        NO_FILA_AUX--;
                    } else if (filaActual > 10) {
                        System.out.printf("%d", filaActual / 10);
                        NO_FILA_AUX--;
                    } else {
                        System.out.printf("%d", filaActual);
                        NO_FILA_AUX--;
                    }
                } else {
                    System.out.printf("%s", SPACE);
                }
            }
            if (NO_FILA_AUX == 0)
                NO_FILA_AUX = NO_FILA;

            System.out.println();
        }


    }
}

