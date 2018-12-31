package drako.ej1;

public class Calculate {
    private Double a;
    private Double b;
    private Double c;

    public Calculate(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculate() {
    }

    public Double result() {
        Double result = null;
        Double pw = null;
        try {
            if (a == null || b == null || c == null) {
                throw new java.lang.Error("Write your variables");
            }
            pw = Math.pow(b, 2);

            if (pw.isInfinite()) {
                throw new java.lang.Error("It's infinity");
            }

            result = (pw - (4 * a * c)) / (2 * a);

            if (result.isInfinite() || result.isNaN()) {

                throw new java.lang.Error("It's infinity or Nan");
            } else if (result == -0) {
                result = 0.0;
            }
        } catch (Exception e) {
            System.err.printf("Error: %s", e.toString());
        }

        return result;
    }
}
