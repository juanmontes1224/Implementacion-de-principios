package diagramauml;

import java.util.ArrayList;

public class Vista extends javax.swing.JFrame {

    ArrayList<Integer> vector;
    ArrayList<Integer> natr;
    ArrayList<Integer> nmet;
    ArrayList<String> relaciones;
    UML uml = new UML();
    int i = 0;
    int a = 0;
    int m = 0;
   

    public Vista() {
        vector = new ArrayList<Integer>();
        natr = new ArrayList<Integer>();
        nmet = new ArrayList<Integer>();
        relaciones=new ArrayList<String>();
        initComponents();
        setBounds(100, 100, 500, 573);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jComboBox12 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre de la clase");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 14, 120, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 10, 140, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "public", "interface", "abstract" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(10, 38, 68, 20);

        jButton1.setText("Resgistrar clase");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 40, 140, 23);

        jLabel2.setText("Nombre del atributo ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 74, 120, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 70, 140, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "public", "private", "protected" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(10, 100, 72, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "double", "String", "char", "boolean", "byte", "long", "float" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(10, 128, 72, 20);

        jButton2.setText("Registrar atributo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 110, 140, 23);

        jLabel3.setText("Nombre del metodo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 169, 120, 14);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 170, 140, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "public", "private", "protected" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(10, 192, 72, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "double", "String", "char", "boolean", "byte", "long", "float" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(10, 223, 72, 20);

        jButton3.setText("Registrar metodo");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 200, 140, 23);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 10, 166, 232);

        jButton4.setText("Finalizar clase");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(130, 270, 140, 23);

        jButton5.setText("Diagrama UML");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 510, 140, 23);

        jButton6.setText("Crear Relacion");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(140, 380, 140, 23);

        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(10, 340, 140, 20);

        jLabel4.setText("Relacion\n");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 320, 78, 14);

        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(270, 340, 140, 20);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "extends", "implements" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(170, 340, 78, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 370, 170, 20);

        jLabel6.setText("Cardinalidad");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 420, 70, 14);

        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(90, 440, 140, 20);

        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(330, 440, 140, 20);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "agregar", "componer" }));
        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(240, 440, 80, 20);

        jButton7.setText("Crear Cardinalidad");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(140, 480, 140, 23);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "public", "private", "protected" }));
        getContentPane().add(jComboBox12);
        jComboBox12.setBounds(10, 440, 72, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Clase clase = new Clase();
        jTextArea1.setText(jTextArea1.getText() + clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()) + "\n");
        jComboBox6.addItem(clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()));
        jComboBox7.addItem(clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()));
        if (clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()).charAt(0) == 'c') {
            jComboBox9.addItem(clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()));
            jComboBox10.addItem(clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()));
        }
        uml.lista.add(clase.dibujar(jComboBox1.getSelectedIndex(), 0, jTextField1.getText()));
        uml.atributos.add(i, "");
        uml.metodos.add(i, "");
        jButton1.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton4.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jTextField1.setText("");

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Atributo atributo = new Atributo();
        jTextArea1.setText(jTextArea1.getText() + atributo.dibujar(jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), jTextField2.getText()));
        uml.atributos.add(i, uml.atributos.get(i) + atributo.dibujar(jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), jTextField2.getText()));
        jTextField2.setText("");
        natr.add(i, a + 15);
        a = a + 15;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Metodo metodo = new Metodo();
        jTextArea1.setText(jTextArea1.getText() + metodo.dibujar(jComboBox4.getSelectedIndex(), jComboBox5.getSelectedIndex(), jTextField3.getText()));
        uml.metodos.add(i, uml.metodos.get(i) + metodo.dibujar(jComboBox4.getSelectedIndex(), jComboBox5.getSelectedIndex(), jTextField3.getText()));
        jTextField3.setText("");
        nmet.add(i, m + 15);
        m = m + 15;
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jTextArea1.setText(jTextArea1.getText() + "----------------------------------------" + "\n");
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton1.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        vector.add(i);
        natr.add(a);
        nmet.add(m);
        a = 0;
        m = 0;
        i++;
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        uml.graficar(vector, natr, nmet);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Relacion relacion = new Relacion();
        jTextArea1.setText(jTextArea1.getText() + relacion.relacionar(String.valueOf(jComboBox6.getSelectedItem()), String.valueOf(jComboBox7.getSelectedItem()), jComboBox8.getSelectedIndex()));
        if (relacion.relacionar(String.valueOf(jComboBox6.getSelectedItem()), String.valueOf(jComboBox7.getSelectedItem()), jComboBox8.getSelectedIndex()).equals("")) {
        } else {
            uml.her1.add(relacion.her(String.valueOf(jComboBox6.getSelectedItem()), uml.lista));
            uml.her2.add(relacion.her(String.valueOf(jComboBox7.getSelectedItem()), uml.lista));
            uml.tipoh.add(jComboBox8.getSelectedIndex());
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        Metodos car = new Metodos();
        if (car.cardinal(String.valueOf(jComboBox9.getSelectedItem()), String.valueOf(jComboBox10.getSelectedItem()), jComboBox11.getSelectedIndex(), jComboBox12.getSelectedIndex()).equals("")) {

        } else {
            jTextArea1.setText(jTextArea1.getText()+String.valueOf(jComboBox9.getSelectedItem())+"\n");
            jTextArea1.setText(jTextArea1.getText() + car.cardinal(String.valueOf(jComboBox9.getSelectedItem()), String.valueOf(jComboBox10.getSelectedItem()), jComboBox11.getSelectedIndex(), jComboBox12.getSelectedIndex()) + "\n");
                uml.atributos.set(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista), uml.atributos.get(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista)) + car.cardinal(String.valueOf(jComboBox9.getSelectedItem()), String.valueOf(jComboBox10.getSelectedItem()), jComboBox11.getSelectedIndex(), jComboBox12.getSelectedIndex()) + "\n");
                natr.add(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista), natr.get(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista)) + 15);
                if(car.verificar(relaciones,car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista)+""+jComboBox11.getSelectedIndex()+""+car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista) )){
                    
                }else{
                relaciones.add(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista)+""+jComboBox11.getSelectedIndex()+""+car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista));
                uml.car1.add(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista));
                uml.car2.add(car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista));
                uml.tipoc.add(jComboBox11.getSelectedIndex());
                }
            if (car.buscar(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista), car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista), uml.cant1, uml.cant2)) {
                System.out.println("si");
                uml.cant1 = car.modificar1(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista), car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista), uml.cant1, uml.cant2, jComboBox11.getSelectedIndex());
                uml.cant2 = car.modificar2(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista), car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista), uml.cant1, uml.cant2, jComboBox11.getSelectedIndex());

            } else {
                if (jComboBox11.getSelectedIndex() == 0) {
                    uml.cant1.add(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista) + "*");
                    uml.cant2.add(car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista) + "0");
                } else {
                    uml.cant1.add(car.econ(String.valueOf(jComboBox9.getSelectedItem()), uml.lista) + "1");
                    uml.cant2.add(car.econ(String.valueOf(jComboBox10.getSelectedItem()), uml.lista) + "0");
                }
            }
        }
    }//GEN-LAST:event_jButton7MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox10;
    public javax.swing.JComboBox jComboBox11;
    public javax.swing.JComboBox jComboBox12;
    public javax.swing.JComboBox jComboBox2;
    public javax.swing.JComboBox jComboBox3;
    public javax.swing.JComboBox jComboBox4;
    public javax.swing.JComboBox jComboBox5;
    public javax.swing.JComboBox jComboBox6;
    public javax.swing.JComboBox jComboBox7;
    public javax.swing.JComboBox jComboBox8;
    public javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
