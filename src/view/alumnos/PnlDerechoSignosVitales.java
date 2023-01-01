/**
  * Autor: Joel && Elio
  * Fecha de creación: 19 de noviembre del 2022
  * Fecha de modificación: 19 de diciembre del 2022
  * Descripción: Panel que servirá para regisar los signos vitales de los 
  * pacientes
  */
package view.alumnos;

import view.base.*;


public class PnlDerechoSignosVitales extends javax.swing.JPanel {


    public PnlDerechoSignosVitales() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombres = new javax.swing.JTextField();
        pnlDerechoBase = new javax.swing.JPanel();
        peso = new javax.swing.JLabel();
        estatura = new javax.swing.JLabel();
        temperatura = new javax.swing.JLabel();
        fcardiaca = new javax.swing.JLabel();
        frespiratoria = new javax.swing.JLabel();
        presion = new javax.swing.JLabel();
        oxigeno = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtFCardiaca = new javax.swing.JTextField();
        txtFRespiratoria = new javax.swing.JTextField();
        txtPresion = new javax.swing.JTextField();
        txtOxigeno = new javax.swing.JTextField();

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        peso.setText("Peso:");

        estatura.setText("Estatura:");

        temperatura.setText("Temperatura:");

        fcardiaca.setText("Frecuencia Cardiaca:");

        frespiratoria.setText("Frecuencia Respiratoria:");

        presion.setText("Presión Arterial:");

        oxigeno.setText("Saturación Oxigeno:");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstaturaActionPerformed(evt);
            }
        });

        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });

        txtFCardiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCardiacaActionPerformed(evt);
            }
        });

        txtFRespiratoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFRespiratoriaActionPerformed(evt);
            }
        });

        txtPresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresionActionPerformed(evt);
            }
        });

        txtOxigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOxigenoActionPerformed(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(697, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatura)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatura)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcardiaca)
                    .addComponent(txtFCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frespiratoria)
                    .addComponent(txtFRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presion))
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oxigeno)
                    .addComponent(txtOxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
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

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstaturaActionPerformed

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void txtFCardiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCardiacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCardiacaActionPerformed

    private void txtFRespiratoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFRespiratoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFRespiratoriaActionPerformed

    private void txtPresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresionActionPerformed

    private void txtOxigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOxigenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOxigenoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estatura;
    private javax.swing.JLabel fcardiaca;
    private javax.swing.JLabel frespiratoria;
    private javax.swing.JLabel oxigeno;
    private javax.swing.JLabel peso;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel presion;
    private javax.swing.JLabel temperatura;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFCardiaca;
    private javax.swing.JTextField txtFRespiratoria;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtOxigeno;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPresion;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
