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
        nombres = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        apellido2 = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        grupoEtnico = new javax.swing.JLabel();
        ocupacion = new javax.swing.JLabel();
        fechanacimiento = new javax.swing.JLabel();
        domicilio = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        fechaingreso = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JLabel();
        localidad = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres:");

        apellido1.setForeground(new java.awt.Color(0, 0, 0));
        apellido1.setText("Apellido Paterno:");

        apellido2.setForeground(new java.awt.Color(0, 0, 0));
        apellido2.setText("Apellido Materno:");

        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setText("Edad:");

        sexo.setForeground(new java.awt.Color(0, 0, 0));
        sexo.setText("Sexo:");

        grupoEtnico.setForeground(new java.awt.Color(0, 0, 0));
        grupoEtnico.setText("Grupo étnico:");

        ocupacion.setForeground(new java.awt.Color(0, 0, 0));
        ocupacion.setText("Ocupación:");

        fechanacimiento.setForeground(new java.awt.Color(0, 0, 0));
        fechanacimiento.setText("Fecha de nacimiento:");

        domicilio.setForeground(new java.awt.Color(0, 0, 0));
        domicilio.setText("Domicilio:");

        estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil.setText("Estado civil:");

        religion.setForeground(new java.awt.Color(0, 0, 0));
        religion.setText("Religión:");

        fechaingreso.setForeground(new java.awt.Color(0, 0, 0));
        fechaingreso.setText("Fecha de ingreso:");

        nacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        nacionalidad.setText("Nacionalidad:");

        localidad.setForeground(new java.awt.Color(0, 0, 0));
        localidad.setText("Localidad:");

        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.setText("Correo electrónico:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDerechoBaseLayout = new javax.swing.GroupLayout(pnlDerechoBase);
        pnlDerechoBase.setLayout(pnlDerechoBaseLayout);
        pnlDerechoBaseLayout.setHorizontalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(apellido1))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(apellido2))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(edad))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(sexo))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(grupoEtnico))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(ocupacion))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(fechanacimiento))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(domicilio))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(estadoCivil))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(religion))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(fechaingreso))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(correo)
                            .addComponent(localidad)
                            .addComponent(nacionalidad)))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(nombres)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(apellido1)
                .addGap(18, 18, 18)
                .addComponent(apellido2)
                .addGap(18, 18, 18)
                .addComponent(edad)
                .addGap(18, 18, 18)
                .addComponent(sexo)
                .addGap(18, 18, 18)
                .addComponent(grupoEtnico)
                .addGap(18, 18, 18)
                .addComponent(ocupacion)
                .addGap(18, 18, 18)
                .addComponent(fechanacimiento)
                .addGap(18, 18, 18)
                .addComponent(domicilio)
                .addGap(18, 18, 18)
                .addComponent(estadoCivil)
                .addGap(18, 18, 18)
                .addComponent(religion)
                .addGap(18, 18, 18)
                .addComponent(fechaingreso)
                .addGap(18, 18, 18)
                .addComponent(nacionalidad)
                .addGap(18, 18, 18)
                .addComponent(localidad)
                .addGap(18, 18, 18)
                .addComponent(correo))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel apellido2;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel domicilio;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JLabel fechaingreso;
    private javax.swing.JLabel fechanacimiento;
    private javax.swing.JLabel grupoEtnico;
    private javax.swing.JLabel localidad;
    private javax.swing.JLabel nacionalidad;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel ocupacion;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel religion;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
