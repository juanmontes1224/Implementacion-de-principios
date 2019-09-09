package diagramauml;

import java.util.ArrayList;

public class Metodos implements Cardinalidad{

    public String cardinal(String a, String b, int c, int t) {
        if (a.equals(b)) {
            return "";
        } else if (c == 0) {
            if (t == 0) {
                return "+ new " + b + " []";
            } else if (t == 1) {
                return "- new " + b + " []";
            } else {
                return "# new " + b + " []";
            }
        } else {
            if (t == 0) {
                return "+ new " + b;
            } else if (t == 1) {
                return "- " + b;
            } else {
                return "# " + b;
            }
        }
    }

    public int econ(String a, ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (a.equals(lista.get(i))) {
                return i;

            }
        }
        return 0;
    }

    public boolean buscar(int p, int o, ArrayList<String> car1, ArrayList<String> car2) {
        for (int i = 0; i < car1.size(); i++) {
            if ((Integer.parseInt("" + car1.get(i).charAt(0)) == p || Integer.parseInt("" + car1.get(i).charAt(0)) == o) && (Integer.parseInt("" + car2.get(i).charAt(0)) == p || Integer.parseInt("" + car2.get(i).charAt(0)) == o)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> modificar1(int p, int o, ArrayList<String> car1, ArrayList<String> car2, int s) {
        for (int i = 0; i < car1.size(); i++) {
            if ((Integer.parseInt("" + car1.get(i).charAt(0)) == p) && (Integer.parseInt("" + car2.get(i).charAt(0)) == o)) {
                if (s == 1) {
                    String g = car1.get(i).charAt(0) + "";
                    if (car1.get(i).charAt(1) != '*') {
                        g = g + (Integer.parseInt("" + car1.get(i).charAt(1)) + 1);
                        car1.set(i, g);
                    }
                } else {
                    String g = car1.get(i).charAt(0) + "";
                    g = g + "*";
                    car1.set(i, g);
                }
            }
            
        }
        return car1;
    }
    public ArrayList<String> modificar2(int p, int o, ArrayList<String> car1, ArrayList<String> car2, int s) {
        for (int i = 0; i < car1.size(); i++) {
           if ((Integer.parseInt("" + car2.get(i).charAt(0)) == p) && (Integer.parseInt("" + car1.get(i).charAt(0)) == o)) {
                if (s == 1) {
                    String g = car2.get(i).charAt(0) + "";
                    if (car2.get(i).charAt(1) != '*') {
                        g = g + (Integer.parseInt("" + car2.get(i).charAt(1)) + 1);
                        car2.set(i, g);
                    }
                } else {
                    String g = car2.get(i).charAt(0) + "";
                    g = g + "*";
                    car2.set(i, g);
                }
            } 
        }
        return car2;
    }
    public boolean verificar(ArrayList<String> relaciones,String a){
        for(int i=0;i<relaciones.size();i++){
            if(a.equals(relaciones.get(i))){
                return true;
            }
        }
        return false;
    }

}
