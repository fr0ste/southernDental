/**
  * Autor: Joel && Elio
  * Fecha de creación: 15 de noviembre del 2022
  * Fecha de modificación: 15 de diciembre del 2022
  * Descripción: Panel que servirá como base para partes izquierdas del Frame
  */
package view;

import view.base.*;

/**
 *
 * @author Elioenaí
 */
public class PanelDerechoRegistarTutor extends javax.swing.JPanel {

    /**
     * Creates new form PanelDerechoBase
     */
    public PanelDerechoRegistarTutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDerechoBase = new javax.swing.JPanel();
        nombres = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres:");

        apellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoPaterno.setText("Apellido Paterno:");

        apellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoMaterno.setText("Apellido Materno:");

        sexo.setForeground(new java.awt.Color(0, 0, 0));
        sexo.setText("Sexo:");

        javax.swing.GroupLayout pnlDerechoBaseLayout = new javax.swing.GroupLayout(pnlDerechoBase);
        pnlDerechoBase.setLayout(pnlDerechoBaseLayout);
        pnlDerechoBaseLayout.setHorizontalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sexo)
                    .addComponent(apellidoMaterno)
                    .addComponent(apellidoPaterno)
                    .addComponent(nombres))
                .addContainerGap(819, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(nombres)
                .addGap(18, 18, 18)
                .addComponent(apellidoPaterno)
                .addGap(18, 18, 18)
                .addComponent(apellidoMaterno)
                .addGap(18, 18, 18)
                .addComponent(sexo)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        add(pnlDerechoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 700));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JLabel nombres;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
