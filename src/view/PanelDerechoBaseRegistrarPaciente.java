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
public class PanelDerechoBaseRegistrarPaciente extends javax.swing.JPanel {

    /**
     * Creates new form PanelDerechoBase
     */
    public PanelDerechoBaseRegistrarPaciente() {
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
        Nombres = new javax.swing.JLabel();
        Apellido1 = new javax.swing.JLabel();

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        Nombres.setForeground(new java.awt.Color(0, 0, 0));
        Nombres.setText("Nombres: ");

        Apellido1.setForeground(new java.awt.Color(0, 0, 0));
        Apellido1.setText("Apellido Paterno: ");

        javax.swing.GroupLayout pnlDerechoBaseLayout = new javax.swing.GroupLayout(pnlDerechoBase);
        pnlDerechoBase.setLayout(pnlDerechoBaseLayout);
        pnlDerechoBaseLayout.setHorizontalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apellido1)
                    .addComponent(Nombres))
                .addContainerGap(815, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Nombres)
                .addGap(29, 29, 29)
                .addComponent(Apellido1)
                .addContainerGap(545, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido1;
    private javax.swing.JLabel Nombres;
    private javax.swing.JPanel pnlDerechoBase;
    // End of variables declaration//GEN-END:variables
}
