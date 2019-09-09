package diagramauml;

public class Atributo extends Tipo {

    @Override
    String dibujar(int a, int b, String nombre) {

        String cadena;
        if (a == 0) {
            cadena = "+ ";
        } else if (a == 1) {
            cadena = "- ";
        } else {
            cadena = "# ";
        }
        if (b == 0) {
            cadena = cadena + "int " + nombre + "\n";
        } else if (b == 1) {
            cadena = cadena + "double " + nombre + "\n";
        } else if (b == 2) {
            cadena = cadena + "String " + nombre + "\n";
        } else if (b == 3) {
            cadena = cadena + "char " + nombre + "\n";
        } else if (b == 4) {
            cadena = cadena + "boolean " + nombre + "\n";
        } else if (b == 5) {
            cadena = cadena + "byte " + nombre + "\n";
        } else if (b == 6) {
            cadena = cadena + "long " + nombre + "\n";
        } else if (b == 7) {
            cadena = cadena + "float " + nombre + "\n";
        }
        return cadena;
    }

}
