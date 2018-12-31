package drako.ej5;

public class Esfera {
    private Double radio;

    public Esfera(Double radio) {
        this.radio = radio;
    }

    public Double getVolume() {
        return ((4F / 3F) * Math.PI * (Math.pow(radio, 3)));
    }

    public Double getRadio() {
        return radio;
    }
}
