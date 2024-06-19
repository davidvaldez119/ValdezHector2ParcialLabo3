public class Persona extends Registro{
    private String NombreYapellido;
    private Integer edad;

    private String barrio;
    public Persona(String dni, Double temp, Double nroKit, String nombreYapellido, Integer edad, String barrio) {
        super(dni, temp, nroKit);
        NombreYapellido = nombreYapellido;
        this.edad = edad;
        this.barrio = barrio;
    }



    public Persona() {

    }

    public String getNombreYapellido() {
        return NombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        NombreYapellido = nombreYapellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
