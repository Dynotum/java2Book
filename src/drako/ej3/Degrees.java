package drako.ej3;

public class Degrees {
    private float celcius;

    public Degrees(float celcius) {
        this.celcius = celcius;
    }


    public float toFareheint() {

        return 9F/5F * celcius + 32;
    }

    public float getCelcius(){
        return this.celcius;
    }

}
