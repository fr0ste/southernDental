/**
 * Autor: Joel && Elio
 * Fecha de creación: 15 de noviembre del 2022
 * Fecha de modificación: 15 de diciembre del 2022
 * Descripción: Panel que servirá como base para partes izquierdas del Frame
 */
package view.alumnos;

public class PnlIzquierdoPaciente extends javax.swing.JPanel {

    public PnlIzquierdoPaciente() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzquierdoBase = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 32));
        setMaximumSize(new java.awt.Dimension(240, 700));
        setPreferredSize(new java.awt.Dimension(240, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIzquierdoBase.setBackground(new java.awt.Color(0, 0, 32));

        javax.swing.GroupLayout pnlIzquierdoBaseLayout = new javax.swing.GroupLayout(pnlIzquierdoBase);
        pnlIzquierdoBase.setLayout(pnlIzquierdoBaseLayout);
        pnlIzquierdoBaseLayout.setHorizontalGroup(
            pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        pnlIzquierdoBaseLayout.setVerticalGroup(
            pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        add(pnlIzquierdoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlIzquierdoBase;
    // End of variables declaration//GEN-END:variables
}
