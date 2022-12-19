/**
  * Autor: Joel && Elio
  * Fecha de creación: 19 de noviembre del 2022
  * Fecha de modificación: 19 de diciembre del 2022
  * Descripción: Panel que servirá para regisar los signos vitales de los 
  * pacientes
  */
package view;

import view.base.*;


public class PanelDerechoSignosVitales extends javax.swing.JPanel {


    public PanelDerechoSignosVitales() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDerechoBase = new javax.swing.JPanel();
        peso = new javax.swing.JLabel();
        estatura = new javax.swing.JLabel();
        temperatura = new javax.swing.JLabel();
        fcardiaca = new javax.swing.JLabel();
        frespiratoria = new javax.swing.JLabel();
        presion = new javax.swing.JLabel();
        oxigeno = new javax.swing.JLabel();

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        peso.setForeground(new java.awt.Color(0, 0, 0));
        peso.setText("Peso:");

        estatura.setForeground(new java.awt.Color(0, 0, 0));
        estatura.setText("Estatura:");

        temperatura.setForeground(new java.awt.Color(0, 0, 0));
        temperatura.setText("Temperatura:");

        fcardiaca.setForeground(new java.awt.Color(0, 0, 0));
        fcardiaca.setText("Frecuencia Cardiaca:");

        frespiratoria.setForeground(new java.awt.Color(0, 0, 0));
        frespiratoria.setText("Frecuencia Respiratoria:");

        presion.setForeground(new java.awt.Color(0, 0, 0));
        presion.setText("Presión Arterial:");

        oxigeno.setForeground(new java.awt.Color(0, 0, 0));
        oxigeno.setText("Saturación Oxigeno:");

        javax.swing.GroupLayout pnlDerechoBaseLayout = new javax.swing.GroupLayout(pnlDerechoBase);
        pnlDerechoBase.setLayout(pnlDerechoBaseLayout);
        pnlDerechoBaseLayout.setHorizontalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oxigeno)
                    .addComponent(presion)
                    .addComponent(frespiratoria)
                    .addComponent(fcardiaca)
                    .addComponent(temperatura)
                    .addComponent(estatura)
                    .addComponent(peso))
                .addContainerGap(815, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(peso)
                .addGap(18, 18, 18)
                .addComponent(estatura)
                .addGap(18, 18, 18)
                .addComponent(temperatura)
                .addGap(18, 18, 18)
                .addComponent(fcardiaca)
                .addGap(18, 18, 18)
                .addComponent(frespiratoria)
                .addGap(18, 18, 18)
                .addComponent(presion)
                .addGap(18, 18, 18)
                .addComponent(oxigeno)
                .addContainerGap(401, Short.MAX_VALUE))
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
    private javax.swing.JLabel estatura;
    private javax.swing.JLabel fcardiaca;
    private javax.swing.JLabel frespiratoria;
    private javax.swing.JLabel oxigeno;
    private javax.swing.JLabel peso;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel presion;
    private javax.swing.JLabel temperatura;
    // End of variables declaration//GEN-END:variables
}
