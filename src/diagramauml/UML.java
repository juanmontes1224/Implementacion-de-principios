package diagramauml;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class UML extends javax.swing.JFrame {

    public ArrayList<String> lista;
    public ArrayList<String> atributos;
    public ArrayList<String> metodos;
    public ArrayList<Integer> natr;
    public ArrayList<Integer> nmet;
    public ArrayList<Integer> her1;
    public ArrayList<Integer> her2;
    public ArrayList<Integer> tipoh;
    public ArrayList<Integer> car1;
    public ArrayList<Integer> car2;
    public ArrayList<Integer> tipoc;
    public ArrayList<String> ncar1;
    public ArrayList<String> ncar2;
    public ArrayList<String> cant1;
    public ArrayList<String> cant2;
    ImageIcon imagen1 = new ImageIcon("C:\\Users\\Estudiantes\\Downloads\\DiagramaUML\\src\\diagramauml\\flecha_herencia.jpg");
    ImageIcon imagen2 = new ImageIcon("C:\\Users\\Estudiantes\\Downloads\\DiagramaUML\\src\\diagramauml\\flecha_interfase.jpg");
    ImageIcon imagen3 = new ImageIcon("C:\\Users\\Estudiantes\\Downloads\\DiagramaUML\\src\\diagramauml\\flecha_agrega.jpg");
    ImageIcon imagen4 = new ImageIcon("C:\\Users\\Estudiantes\\Downloads\\DiagramaUML\\src\\diagramauml\\flecha_compo.jpg");
    ImageIcon imagen5 = new ImageIcon("C:\\Users\\Estudiantes\\Downloads\\DiagramaUML\\src\\diagramauml\\linea.png");

    public UML() {
        lista = new ArrayList<String>();
        atributos = new ArrayList<String>();
        metodos = new ArrayList<String>();
        natr = new ArrayList<Integer>();
        nmet = new ArrayList<Integer>();
        her1 = new ArrayList<Integer>();
        her2 = new ArrayList<Integer>();
        tipoh = new ArrayList<Integer>();
        car1 = new ArrayList<Integer>();
        car2 = new ArrayList<Integer>();
        tipoc = new ArrayList<Integer>();
        ncar1 = new ArrayList<String>();
        ncar2 = new ArrayList<String>();
        cant1 = new ArrayList<String>();
        cant2 = new ArrayList<String>();
        initComponents();
        setBounds(100, 100, 413, 238);
        jPanel1.setBounds(0, 0, 1000, 290);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 230));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(598, 228));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1160, 200);

        jButton1.setText("atras");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 210, 170, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jPanel1.removeAll();
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    public void graficar(ArrayList<Integer> vector, ArrayList<Integer> natr, ArrayList<Integer> nmet) {
        int k = 0;
        int x = 10;
        int y = 10;
        for (int i = 0; i < lista.size(); i++) {
            JLabel label = new JLabel(lista.get(i));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(i).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(i));
                area.setBounds(x, y, 110, natr.get(i));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(i).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(i);

            }
            if (metodos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(i));
                area.setBounds(x, y, 110, nmet.get(i));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(i).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
            }
            y = 10;
            x = x + 120;
        }
        //RELACION
        for (int i = 0; i < her1.size(); i++) {
            JLabel label = new JLabel(lista.get(her2.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(her2.get(i)).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(her2.get(i)));
                area.setBounds(x, y, 110, natr.get(her2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(her2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(her2.get(i));
            }
            if (metodos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(her2.get(i)));
                area.setBounds(x, y, 110, nmet.get(her2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(her2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + nmet.get(her2.get(i));
            }

            if (tipoh.get(i) == 0) {
                JLabel eti = new JLabel(imagen1);
                eti.setBounds(x, y, 110, 50);
                jPanel1.add(eti);
            } else {
                JLabel eti = new JLabel(imagen2);
                eti.setBounds(x, y, 110, 50);
                jPanel1.add(eti);
            }
            y = y + 50;
            label = new JLabel(lista.get(her1.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(her1.get(i)).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(her1.get(i)));
                area.setBounds(x, y, 110, natr.get(her1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(her1.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(her1.get(i));
            }
            if (metodos.get(i).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(her1.get(i)));
                area.setBounds(x, y, 110, nmet.get(her1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(her1.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + nmet.get(her1.get(i));
            }
            y = 10;
            x = x + 120;
        }
        //CARDINALIDAD
        for (int i = 0; i < car1.size(); i++) {
            JLabel label = new JLabel(lista.get(car2.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(car2.get(i)).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(car2.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(car2.get(i)));
                area.setBounds(x, y, 110, natr.get(car2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(car2.get(i));
            }
            if (metodos.get(car2.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(car2.get(i)));
                area.setBounds(x, y, 110, nmet.get(car2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + nmet.get(car2.get(i));
            }

            if (tipoc.get(i) == 0) {
                JLabel eti = new JLabel(imagen3);
                eti.setBounds(x, y, 110, 50);
                jPanel1.add(eti);
            } else {
                JLabel eti = new JLabel(imagen4);
                eti.setBounds(x, y, 110, 50);
                jPanel1.add(eti);
            }
            y = y + 50;
            label = new JLabel(lista.get(car1.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(car1.get(i)).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(car1.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(car1.get(i)));
                area.setBounds(x, y, 110, natr.get(car1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car1.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(car1.get(i));
            }
            if (metodos.get(car1.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(car1.get(i)));
                area.setBounds(x, y, 110, nmet.get(car1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car1.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + nmet.get(car1.get(i));
            }
            y = 10;
            x = x + 120;
        }
        for (int i = 0; i < cant1.size(); i++) {
            JLabel label = new JLabel(lista.get(car2.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            if (lista.get(car2.get(i)).charAt(0) == 'a') {
                label.setFont(new java.awt.Font("Tahoma", 2, 11));
            }
            jPanel1.add(label);
            y = y + 15;
            if (atributos.get(car2.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(car2.get(i)));
                area.setBounds(x, y, 110, natr.get(car2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + natr.get(car2.get(i));
            }
            if (metodos.get(car2.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(car2.get(i)));
                area.setBounds(x, y, 110, nmet.get(car2.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                if (lista.get(car2.get(i)).charAt(0) == 'a') {
                    area.setFont(new java.awt.Font("Tahoma", 2, 11));
                }
                jPanel1.add(area);
                y = y + nmet.get(car2.get(i));
            }

            x = x + 220;
            y = 10;
            label = new JLabel(cant2.get(i).charAt(1) + "");
            label.setBounds(x - 105, y, 15, 15);
            jPanel1.add(label);
            label = new JLabel(cant1.get(i).charAt(1) + "");
            label.setBounds(x - 10, y, 15, 15);
            jPanel1.add(label);
            label = new JLabel(lista.get(car1.get(i)));
            label.setBounds(x, y, 110, 15);
            label.setBorder(new LineBorder(Color.BLACK));
            jPanel1.add(label);

            JLabel eti = new JLabel(imagen5);
            eti.setBounds(x - 100, 1, 80, 40);
            jPanel1.add(eti);
            y = y + 15;
            if (atributos.get(car1.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(atributos.get(car1.get(i)));
                area.setBounds(x, y, 110, natr.get(car1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                jPanel1.add(area);
                y = y + natr.get(car1.get(i));
            }
            if (metodos.get(car1.get(i)).equals("")) {
            } else {
                JTextArea area = new JTextArea(metodos.get(car1.get(i)));
                area.setBounds(x, y, 110, nmet.get(car1.get(i)));
                area.setBorder(new LineBorder(Color.BLACK));
                area.setEditable(false);
                jPanel1.add(area);
                y = y + nmet.get(car1.get(i));
            }
            y = 10;
            x = x + 120;
            i++;
        }
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
