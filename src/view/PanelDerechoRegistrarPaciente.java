/**
  * Autor: Joel && Elio
  * Fecha de creación: 16 de noviembre del 2022
  * Fecha de modificación: 19 de diciembre del 2022
  * Descripción: Panel derecho para registrar pacientes
  */
package view;

public class PanelDerechoRegistrarPaciente extends javax.swing.JPanel {


    public PanelDerechoRegistrarPaciente() {
        initComponents();
    }

    
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
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtGrupoEtnico = new javax.swing.JTextField();
        txtOcupacion = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtReligion = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();

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

        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });

        txtGrupoEtnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoEtnicoActionPerformed(evt);
            }
        });

        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });

        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });

        txtReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReligionActionPerformed(evt);
            }
        });

        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
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
                        .addComponent(apellido1)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(apellido2)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(edad))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(sexo))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(grupoEtnico)
                        .addGap(18, 18, 18)
                        .addComponent(txtGrupoEtnico, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(ocupacion)
                        .addGap(18, 18, 18)
                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(fechanacimiento))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(domicilio)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(estadoCivil)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(religion)
                        .addGap(18, 18, 18)
                        .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(fechaingreso))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(correo)
                            .addComponent(localidad)
                            .addComponent(nacionalidad))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(nombres)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        pnlDerechoBaseLayout.setVerticalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido1)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido2)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(edad)
                .addGap(18, 18, 18)
                .addComponent(sexo)
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(grupoEtnico)
                    .addComponent(txtGrupoEtnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocupacion)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(fechanacimiento)
                .addGap(15, 15, 15)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoCivil)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(religion)
                    .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(fechaingreso)
                .addGap(15, 15, 15)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localidad)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReligionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReligionActionPerformed

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupacionActionPerformed

    private void txtGrupoEtnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoEtnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoEtnicoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

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
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtGrupoEtnico;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtReligion;
    // End of variables declaration//GEN-END:variables
}