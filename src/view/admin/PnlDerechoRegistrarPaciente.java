/**
  * Autor: Joel && Elio
  * Fecha de creación: 16 de noviembre del 2022
  * Fecha de modificación: 19 de diciembre del 2022
  * Descripción: Panel derecho para registrar pacientes
  */
package view.admin;

import view.*;

public class PnlDerechoRegistrarPaciente extends javax.swing.JPanel {


    public PnlDerechoRegistrarPaciente() {
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
        txtApellidoMaterno1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();

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

        txtApellidoMaterno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaterno1ActionPerformed(evt);
            }
        });

        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Hombre");

        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Hombre");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dia:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mes:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Año:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dia:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mes:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Año:");

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
                        .addComponent(edad)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(sexo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
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
                        .addComponent(fechanacimiento)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(fechaingreso)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(492, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad)
                    .addComponent(txtApellidoMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(10, 10, 10)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(grupoEtnico)
                    .addComponent(txtGrupoEtnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocupacion)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechanacimiento)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
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
                .addGap(12, 12, 12)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaingreso)
                    .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
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

    private void txtApellidoMaterno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaterno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaterno1ActionPerformed


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JLabel localidad;
    private javax.swing.JLabel nacionalidad;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel ocupacion;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel religion;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoMaterno1;
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
