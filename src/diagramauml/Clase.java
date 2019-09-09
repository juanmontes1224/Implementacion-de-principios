package diagramauml;

public class Clase extends Tipo {

    @Override
    String dibujar(int a,int b,String nombre) {
        String cadena;
       
        if (a == 0) {
            cadena = "class " + nombre;
        } else if (a == 1) {
            cadena = "interface " + nombre;
        } else {
            cadena = "abstract class " + nombre;
            
        }
        
       return cadena;
    }

}
