package drako.ej6;

public class Multiplos {
    private int aA;
    private int bB;
    private int result = 0;

    public Multiplos(int a, int b) {
        this.aA = a;
        this.bB = b;

        if (aA < 0 || bB < 0) {
            throw new java.lang.Error("No negative numbers");
        } else if (aA > bB) {
            aA = aA + bB;
            bB = aA - bB;
            aA = aA - bB;
            //System.out.printf("a: %d, b: %d",a,b);
        }
    }

    public int getAddMult() {
        //System.out.printf("a: %d, b: %d\n", aA, bB);
        for (; aA <= bB; aA++) {
            if (aA % 5 == 0) {
                result += aA;
                //System.out.println(result);
            }
        }
        return result;
    }
}
