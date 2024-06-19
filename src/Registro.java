public class Registro {
    private String dni;
    private Double temp;
    private Double NroKit;

    public Registro(String dni, Double temp, Double nroKit) {
        this.dni = dni;
        this.temp = temp;
        NroKit = nroKit;
    }

    public Registro() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getNroKit() {
        return NroKit;
    }

    public void setNroKit(Double nroKit) {
        NroKit = nroKit;
    }
}
