import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Contenedora {

    HashMap<Double,Registro> mapa =new HashMap<>();
    LinkedHashSet<Persona> lista =new LinkedHashSet<>();

    public Persona Registrar() throws ExcepcionMuestras {
       String aux;
        Scanner scanner=new Scanner(System.in);
        Persona p=new Persona();
        System.out.println("hay kits disponibles?.....");
        aux=scanner.nextLine();
        if(aux=="si")
        {
            System.out.println("ingrese nombre:.....");
            p.setNombreYapellido(scanner.nextLine());
            System.out.println("ingrese edad:.....");
            p.setEdad(scanner.nextInt());
            System.out.println("ingrese barrio:.....");
            p.setBarrio(scanner.nextLine());
            System.out.println("temperatura:.....");
            p.setTemp(scanner.nextDouble());
        }else{
            ExcepcionMuestras m =new ExcepcionMuestras("no hay kits de testeo disponibles");
            throw m;
        }
        return p;
    }
 public LinkedHashSet<Persona>agregarAlista() throws ExcepcionMuestras
 {
     Scanner scanner=new Scanner(System.in);
     String flag="si";
     double num;
       Persona p=new Persona();
       while(flag=="si")
       {

            num=Math.random()+35;
            p=Registrar();
            p.setNroKit(num);
            lista.add(p);
           System.out.println("ingresa otra persona?:.....si/no");
           flag=scanner.nextLine();

       }
     return lista;
 }

 public HashMap<Double,Registro> Testear(LinkedHashSet<Persona>lista){

        for(Persona listi:lista){
            Registro r=new Registro();
            r.setNroKit(listi.getNroKit());
            r.setDni(listi.getDni());
            r.setTemp(listi.getTemp());
            mapa.put(listi.getNroKit(),r);

        }
   return mapa;
 }

public void Aislar(HashMap<Double, Registro> mapa) throws ExcepcionTemp, IOException {

    for(Persona temperaturas: lista){
        if(temperaturas.getTemp()>38){
            File file =new File("archiAislados.json") ;
            ObjectMapper mapper= new ObjectMapper();
            mapper.writeValue(file,lista.getClass());
          ExcepcionTemp m= new ExcepcionTemp(temperaturas.getBarrio(),temperaturas.getTemp());
          throw m;

        }

    }
}
}
