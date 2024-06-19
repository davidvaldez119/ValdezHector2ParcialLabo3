import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Main
{
    public static void main(String[] args) throws ExcepcionMuestras, ExcepcionTemp, IOException {
        LinkedHashSet<Persona> lista =new LinkedHashSet<>();
        HashMap<Double,Registro> mapa =new HashMap<>();
        System.out.printf("Hello and welcome!");
       Persona p1=new Persona();
       Contenedora c=new Contenedora();
       c.Registrar();
       c.agregarAlista();
       c.Testear(lista);
       c.Aislar(mapa);

    }
}