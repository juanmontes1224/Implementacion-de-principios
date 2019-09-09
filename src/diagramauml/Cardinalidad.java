
package diagramauml;

import java.util.ArrayList;

public interface Cardinalidad {

    public String cardinal(String a, String b, int c, int t);

    public int econ(String a, ArrayList<String> lista);

    public boolean buscar(int p, int o, ArrayList<String> car1, ArrayList<String> car2);

    public ArrayList<String> modificar1(int p, int o, ArrayList<String> car1, ArrayList<String> car2, int s);

    public ArrayList<String> modificar2(int p, int o, ArrayList<String> car1, ArrayList<String> car2, int s);

    public boolean verificar(ArrayList<String> relaciones, String a);

}
