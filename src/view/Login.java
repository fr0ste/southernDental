/**
 * Autor: Salvador Elioenai Antonio Pérez
 * Fecha de creación: 26 de noviembre del 2022
 * Fecha de modificación: 01 de diciembre del 2022
 * Descripción: Ventana Login
 */
package view;

import view.base.Base;
import entity.Usuario;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import service.UsuarioServiceImpl;
import utilities.DefaultMsg;

public class Login extends javax.swing.JFrame {

    //variables globales
    private int xMouse, yMouse;

    /**
     * constructor
     */
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlSuperiorDerecho = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        pnlIzquierdo1 = new javax.swing.JPanel();
        pnlSuperior1 = new javax.swing.JPanel();
        pnlIzquierdo = new javax.swing.JPanel();
        icnLogo = new javax.swing.JLabel();
        pnlDerecho = new javax.swing.JPanel();
        passUsuario = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        icnUsuario = new javax.swing.JLabel();
        lblLogin = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1280, 720));

        pnlSuperiorDerecho.setBackground(new java.awt.Color(255, 255, 255));
        pnlSuperiorDerecho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSuperiorDerecho.setPreferredSize(new java.awt.Dimension(1280, 30));
        pnlSuperiorDerecho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlSuperiorDerechoMouseDragged(evt);
            }
        });
        pnlSuperiorDerecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuperiorDerechoMousePressed(evt);
            }
        });

        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon
            ("resources/images/exit.png"));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        pnlIzquierdo1.setBackground(new java.awt.Color(0, 0, 32));
        pnlIzquierdo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSuperior1.setBackground(new java.awt.Color(255, 255, 255));
        pnlSuperior1.setPreferredSize(new java.awt.Dimension(1280, 30));

        javax.swing.GroupLayout pnlSuperior1Layout = new javax.swing.GroupLayout(pnlSuperior1);
        pnlSuperior1.setLayout(pnlSuperior1Layout);
        pnlSuperior1Layout.setHorizontalGroup(
            pnlSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        pnlSuperior1Layout.setVerticalGroup(
            pnlSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlIzquierdo1.add(pnlSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 860, -1));

        javax.swing.GroupLayout pnlSuperiorDerechoLayout = new javax.swing.GroupLayout(pnlSuperiorDerecho);
        pnlSuperiorDerecho.setLayout(pnlSuperiorDerechoLayout);
        pnlSuperiorDerechoLayout.setHorizontalGroup(
            pnlSuperiorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorDerechoLayout.createSequentialGroup()
                .addComponent(pnlIzquierdo1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 830, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSuperiorDerechoLayout.setVerticalGroup(
            pnlSuperiorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorDerechoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlIzquierdo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlIzquierdo.setBackground(new java.awt.Color(0, 0, 32));

        icnLogo.setIcon(new javax.swing.ImageIcon("resources/images/LogoLight .png"));
        icnLogo.setPreferredSize(new java.awt.Dimension(320, 320));

        javax.swing.GroupLayout pnlIzquierdoLayout = new javax.swing.GroupLayout(pnlIzquierdo);
        pnlIzquierdo.setLayout(pnlIzquierdoLayout);
        pnlIzquierdoLayout.setHorizontalGroup(
            pnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlIzquierdoLayout.setVerticalGroup(
            pnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzquierdoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(icnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDerecho.setBackground(new java.awt.Color(255, 255, 255));

        passUsuario.setForeground(new java.awt.Color(153, 153, 153));
        passUsuario.setText(DefaultMsg.IN_PASS);
        passUsuario.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK)
        );
        passUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passUsuarioMousePressed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Signika Light", 1, 24)); // NOI18N
        lblContraseña.setText("Contraseña:");

        lblUsuario.setFont(new java.awt.Font("Signika Light", 1, 24)); // NOI18N
        lblUsuario.setText("Usuario:");

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText(DefaultMsg.IN_USUARIO);
        txtUsuario.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });

        icnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnUsuario.setIcon(new javax.swing.ImageIcon("resources/images/usuario3d.png"));
        icnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLogin.setBackground(new java.awt.Color(0, 0, 32));

        btnLogin.setFont(new java.awt.Font("Signika Light", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lblLoginLayout = new javax.swing.GroupLayout(lblLogin);
        lblLogin.setLayout(lblLoginLayout);
        lblLoginLayout.setHorizontalGroup(
            lblLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lblLoginLayout.setVerticalGroup(
            lblLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "alumno", "paciente" }));
        jComboBox1.setBorder(null);

        javax.swing.GroupLayout pnlDerechoLayout = new javax.swing.GroupLayout(pnlDerecho);
        pnlDerecho.setLayout(pnlDerechoLayout);
        pnlDerechoLayout.setHorizontalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDerechoLayout.createSequentialGroup()
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDerechoLayout.createSequentialGroup()
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(365, 365, 365))
        );
        pnlDerechoLayout.setVerticalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(icnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(pnlIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlSuperiorDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(pnlSuperiorDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(pnlDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addComponent(pnlIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     * otorga y gestiona el evento de mouse pressed para el text fiel de 
     * usuario.
     * 
     */
    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals(DefaultMsg.IN_USUARIO)) {
            txtUsuario.setText("");

        }
        if (String.valueOf(passUsuario.getPassword()).isEmpty()) {
            passUsuario.setText(DefaultMsg.IN_PASS);

        }
     }//GEN-LAST:event_txtUsuarioMousePressed
    
    
    /**
     * 
     * otorga y gestiona el evento de mouse pressed para el text field de 
     * contraseña.
     * 
     */
    private void passUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMousePressed
        if (String.valueOf(passUsuario.getPassword()).equals(
                DefaultMsg.IN_PASS)) {
            passUsuario.setText("");

        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText(DefaultMsg.IN_USUARIO);

        }
     }//GEN-LAST:event_passUsuarioMousePressed
    
    /**
     * 
     * otorga y gestiona el evento de mouse clicked para el boton de 
     * login.
     * 
     */
    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        UsuarioServiceImpl service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(txtUsuario.getText());
        usuario.setPassUsuario(String.valueOf(
                passUsuario.getPassword()));
        usuario.setRol(jComboBox1.getSelectedItem().toString());

        if (service.validarUsuario(usuario)) {
            JOptionPane.showMessageDialog(
                    null, "usuario correcto");
            if (jComboBox1.getSelectedItem().toString().equals(
                    "administrador")) {
                new Registro().setVisible(true);
                this.setVisible(false);
                
            }else if (jComboBox1.getSelectedItem().toString().equals(
                    "alumno")) {
                new Home().setVisible(true);
                this.setVisible(false);
                
            }else if (jComboBox1.getSelectedItem().toString().equals(
                    "paciente")) {
                new Base().setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "error");
        }
        if ((txtUsuario.getText().equals(DefaultMsg.IN_USUARIO) || 
                txtUsuario.getText().isEmpty()) || (String.valueOf(
           passUsuario.getPassword()).equals(DefaultMsg.IN_PASS) || 
                String.valueOf(passUsuario.getPassword()).isEmpty())) {
            JOptionPane.showMessageDialog(null, "error");
        } else {
            JOptionPane.showMessageDialog(null, txtUsuario.getText(
            ) + " " + String.valueOf(passUsuario.getPassword()));
        }


    }//GEN-LAST:event_btnLoginMouseClicked
    
    /**
     * 
     * otorga y gestiona el evento de mouse pressed para la barra superior.
     * 
     */
    private void pnlSuperiorDerechoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorDerechoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlSuperiorDerechoMousePressed
    
    /**
     *
     * otorga y gestiona el evento de mouse dragged para la barra superior.
     *
     */
    private void pnlSuperiorDerechoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorDerechoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlSuperiorDerechoMouseDragged
    
    /**
     * 
     * otorga y gestiona el evento de mouse clicked para el botón cerrar.
     * 
     */
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    /**
     * metodo principal.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel icnLogo;
    private javax.swing.JLabel icnUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JPanel lblLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JPanel pnlDerecho;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlIzquierdo1;
    private javax.swing.JPanel pnlSuperior1;
    private javax.swing.JPanel pnlSuperiorDerecho;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
