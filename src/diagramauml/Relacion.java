package diagramauml;

import java.util.ArrayList;

public class Relacion {

    String relacionar(String a, String b, int r) {
        if (a.equals(b)) {
            return "";
        } else {

            if ((a.charAt(0) == 'c' ) && r == 0 && (b.charAt(0) == 'c' || b.charAt(0) == 'a')) {
                return a + " extends " + b + "\n";
            } else if ((a.charAt(0) == 'c' || a.charAt(0) == 'a') && r == 1 && b.charAt(0) == 'i') {
                return a + " implements " + b + "\n";
            } else {
                return "";
            }
        }
    }

    int her(String x, ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (x.equals(lista.get(i))) {
                return i;
            }
        }
        return 0;
    }

}
