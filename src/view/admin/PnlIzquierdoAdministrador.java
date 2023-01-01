/**
 * Autor: Joel && Elio
 * Fecha de creación: 20 de noviembre del 2022
 * Fecha de modificación: 20 de diciembre del 2022
 * Descripción: Panel para opciones del administrador
 */
package view.admin;

import view.*;
import utilities.Colors;

public class PnlIzquierdoAdministrador extends javax.swing.JPanel {

    public PnlIzquierdoAdministrador() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzquierdoBase = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        icnHome = new javax.swing.JLabel();
        pnlRegistar = new javax.swing.JPanel();
        btnRegistar = new javax.swing.JLabel();
        icnRegistar = new javax.swing.JLabel();
        pnlActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        icnActualizar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        icnEliminar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 32));
        setMaximumSize(new java.awt.Dimension(240, 700));
        setPreferredSize(new java.awt.Dimension(240, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIzquierdoBase.setBackground(new java.awt.Color(0, 0, 32));

        pnlHome.setBackground(new java.awt.Color(0, 0, 32));

        btnHome.setBackground(new java.awt.Color(0, 0, 32));
        btnHome.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnHome.setText("HOME    ");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
        });

        icnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnHomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnHomeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addComponent(icnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlRegistar.setBackground(new java.awt.Color(0, 0, 32));

        btnRegistar.setBackground(new java.awt.Color(0, 0, 32));
        btnRegistar.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegistar.setText("REGISTAR PACIENTE   ");
        btnRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistarMouseEntered(evt);
            }
        });

        icnRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnRegistar.setIcon(new javax.swing.ImageIcon("resources/images/crear.png")
        );
        icnRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnRegistarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnRegistarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistarLayout = new javax.swing.GroupLayout(pnlRegistar);
        pnlRegistar.setLayout(pnlRegistarLayout);
        pnlRegistarLayout.setHorizontalGroup(
            pnlRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistarLayout.createSequentialGroup()
                .addComponent(icnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRegistarLayout.setVerticalGroup(
            pnlRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icnRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
        );

        pnlActualizar.setBackground(new java.awt.Color(0, 0, 32));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 32));
        btnActualizar.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnActualizar.setText("ACTUALIZAR PACIENTE   ");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
        });

        icnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnActualizar.setIcon(new javax.swing.ImageIcon("resources/images/actualizar.png")
        );
        icnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnActualizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnActualizarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarLayout.createSequentialGroup()
                .addComponent(icnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlEliminar.setBackground(new java.awt.Color(0, 0, 32));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 32));
        btnEliminar.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setText("ELIMINAR PACIENTE   ");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
        });

        icnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnEliminar.setIcon(new javax.swing.ImageIcon("resources/images/borrar.png")
        );
        icnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnEliminarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnEliminarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEliminarLayout.createSequentialGroup()
                .addComponent(icnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pnlIzquierdoBaseLayout = new javax.swing.GroupLayout(pnlIzquierdoBase);
        pnlIzquierdoBase.setLayout(pnlIzquierdoBaseLayout);
        pnlIzquierdoBaseLayout.setHorizontalGroup(
            pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzquierdoBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlIzquierdoBaseLayout.createSequentialGroup()
                .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlIzquierdoBaseLayout.setVerticalGroup(
            pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzquierdoBaseLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        add(pnlIzquierdoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de actualizar.
     *
     */

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        pnlActualizar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnActualizarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Actualizar.
     *
     */

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        pnlActualizar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnActualizarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Actualizar.
     *
     */
    private void icnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnActualizarMouseExited
        pnlActualizar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnActualizarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Actualizar.
     *
     */
    private void icnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnActualizarMouseEntered
        pnlActualizar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnActualizarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Eliminar.
     *
     */
    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        pnlEliminar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnEliminarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Eliminar.
     *
     */
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        pnlEliminar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnEliminarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Eliminar.
     *
     */
    private void icnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnEliminarMouseExited
        pnlEliminar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnEliminarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Eliminar.
     *
     */
    private void icnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnEliminarMouseEntered
        pnlEliminar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnEliminarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Registrar.
     *
     */
    private void icnRegistarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnRegistarMouseEntered
        pnlRegistar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnRegistarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Registrar.
     *
     */
    private void icnRegistarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnRegistarMouseExited
        pnlRegistar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnRegistarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Registar.
     *
     */
    private void btnRegistarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistarMouseEntered
        pnlRegistar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnRegistarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Registar.
     *
     */
    private void btnRegistarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistarMouseExited
        pnlRegistar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnRegistarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Home.
     *
     */
    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnHomeMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Home.
     *
     */
    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnHomeMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el panel que contiene el
     * botón de Home.
     *
     */
    private void icnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnHomeMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de Home.
     *
     */
    private void icnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnHomeMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRegistar;
    private javax.swing.JLabel icnActualizar;
    private javax.swing.JLabel icnEliminar;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnRegistar;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIzquierdoBase;
    private javax.swing.JPanel pnlRegistar;
    // End of variables declaration//GEN-END:variables
}
