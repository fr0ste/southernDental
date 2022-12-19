/**
 * Autor: Joel && Elio
 * Fecha de creación: 19 de noviembre del 2022
 * Fecha de modificación: 19 de diciembre del 2022
 * Descripción: Panel que servirá para registar tutores
 */
package view;

public class PanelDerechoRegistarTutor extends javax.swing.JPanel {

    public PanelDerechoRegistarTutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDerechoBase = new javax.swing.JPanel();
        nombres = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        ocupacion = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JLabel();

        pnlDerechoBase.setBackground(new java.awt.Color(255, 255, 255));

        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres:");

        apellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoPaterno.setText("Apellido Paterno:");

        apellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoMaterno.setText("Apellido Materno:");

        sexo.setForeground(new java.awt.Color(0, 0, 0));
        sexo.setText("Sexo:");

        ocupacion.setForeground(new java.awt.Color(0, 0, 0));
        ocupacion.setText("Ocupacion:");

        estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil.setText("Estado Civil:");

        javax.swing.GroupLayout pnlDerechoBaseLayout = new javax.swing.GroupLayout(pnlDerechoBase);
        pnlDerechoBase.setLayout(pnlDerechoBaseLayout);
        pnlDerechoBaseLayout.setHorizontalGroup(
            pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoBaseLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnlDerechoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estadoCivil)
                    .addComponent(ocupacion)
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
                .addGap(18, 18, 18)
                .addComponent(ocupacion)
                .addGap(18, 18, 18)
                .addComponent(estadoCivil)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDerechoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel ocupacion;
    private javax.swing.JPanel pnlDerechoBase;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
