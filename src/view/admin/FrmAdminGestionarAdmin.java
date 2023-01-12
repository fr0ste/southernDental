/**
 * Autor: Joel && Elio
 * Fecha de creación: 08 de enero del 2023
 * Fecha de modificación: 12 de enero del 2023
 * Descripción: Frame Gestionar administradores
 */
package view.admin;

import controller.UsuarioController;
import entity.Usuario;
import javax.swing.table.DefaultTableModel;
import utilities.Colors;

public class FrmAdminGestionarAdmin extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private DefaultTableModel modeloTabla;

    public FrmAdminGestionarAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        UsuarioController usuarioController = new UsuarioController();
        modeloTabla = (DefaultTableModel) tablaRol.getModel();
        usuarioController.mostrarRegistros(modeloTabla);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        lblSuperior = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        pnlIzquierdo = new javax.swing.JPanel();
        pnlSuperior1 = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JLabel();
        PnlIzquierdo = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        icnHome = new javax.swing.JLabel();
        pnlAlumnos = new javax.swing.JPanel();
        btnAlumnos = new javax.swing.JLabel();
        icnAlumnos = new javax.swing.JLabel();
        pnlProfesores = new javax.swing.JPanel();
        btnProfesores = new javax.swing.JLabel();
        icnProfesores = new javax.swing.JLabel();
        icnLogo = new javax.swing.JLabel();
        PnlDerecho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRol = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pnlActualizar = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        passUsuario = new javax.swing.JPasswordField();
        lblNombreUsuario1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        icnLogo1 = new javax.swing.JLabel();
        pnlAgregar = new javax.swing.JPanel();
        lblEliminar1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));
        mainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSuperior.setBackground(new java.awt.Color(255, 255, 255));
        lblSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuperior.setPreferredSize(new java.awt.Dimension(1280, 30));
        lblSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblSuperiorMouseDragged(evt);
            }
        });
        lblSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSuperiorMousePressed(evt);
            }
        });

        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setIcon(new javax.swing.ImageIcon("resources/images/exit.png")
        );
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        pnlIzquierdo.setBackground(new java.awt.Color(0, 0, 32));
        pnlIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSuperior1.setBackground(new java.awt.Color(255, 255, 255));
        pnlSuperior1.setPreferredSize(new java.awt.Dimension(1280, 30));

        btnCerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlSuperior1Layout = new javax.swing.GroupLayout(pnlSuperior1);
        pnlSuperior1.setLayout(pnlSuperior1Layout);
        pnlSuperior1Layout.setHorizontalGroup(
            pnlSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperior1Layout.createSequentialGroup()
                .addGap(0, 830, Short.MAX_VALUE)
                .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSuperior1Layout.setVerticalGroup(
            pnlSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperior1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlIzquierdo.add(pnlSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 860, -1));

        javax.swing.GroupLayout lblSuperiorLayout = new javax.swing.GroupLayout(lblSuperior);
        lblSuperior.setLayout(lblSuperiorLayout);
        lblSuperiorLayout.setHorizontalGroup(
            lblSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblSuperiorLayout.createSequentialGroup()
                .addComponent(pnlIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1010, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lblSuperiorLayout.setVerticalGroup(
            lblSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblSuperiorLayout.createSequentialGroup()
                .addGroup(lblSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        mainContainer.add(lblSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PnlIzquierdo.setBackground(new java.awt.Color(0, 0, 32));
        PnlIzquierdo.setPreferredSize(new java.awt.Dimension(240, 700));

        pnlHome.setBackground(new java.awt.Color(0, 0, 32));

        btnHome.setBackground(new java.awt.Color(0, 0, 32));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setText("HOME");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        icnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome.setIcon(new javax.swing.ImageIcon("resources/images/hogar.png")
        );
        icnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addComponent(icnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlAlumnos.setBackground(new java.awt.Color(0, 0, 32));

        btnAlumnos.setBackground(new java.awt.Color(0, 0, 32));
        btnAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlumnos.setText("ALUMNOS");
        btnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnosMouseExited(evt);
            }
        });

        icnAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnAlumnos.setIcon(new javax.swing.ImageIcon("resources/images/aalumnoHome.png")
        );
        icnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnAlumnosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAlumnosLayout = new javax.swing.GroupLayout(pnlAlumnos);
        pnlAlumnos.setLayout(pnlAlumnosLayout);
        pnlAlumnosLayout.setHorizontalGroup(
            pnlAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlumnosLayout.createSequentialGroup()
                .addComponent(icnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAlumnosLayout.setVerticalGroup(
            pnlAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlProfesores.setBackground(new java.awt.Color(0, 0, 32));
        pnlProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlProfesoresMouseExited(evt);
            }
        });

        btnProfesores.setBackground(new java.awt.Color(0, 0, 32));
        btnProfesores.setForeground(new java.awt.Color(255, 255, 255));
        btnProfesores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfesores.setText("PROFESORES");
        btnProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfesoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfesoresMouseExited(evt);
            }
        });

        icnProfesores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnProfesores.setIcon(new javax.swing.ImageIcon("resources/images/profesor.png")
        );
        icnProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnProfesoresMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlProfesoresLayout = new javax.swing.GroupLayout(pnlProfesores);
        pnlProfesores.setLayout(pnlProfesoresLayout);
        pnlProfesoresLayout.setHorizontalGroup(
            pnlProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProfesoresLayout.createSequentialGroup()
                .addComponent(icnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProfesoresLayout.setVerticalGroup(
            pnlProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        icnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo.setIcon(new javax.swing.ImageIcon("resources/images/LogoLight_128.png"));

        javax.swing.GroupLayout PnlIzquierdoLayout = new javax.swing.GroupLayout(PnlIzquierdo);
        PnlIzquierdo.setLayout(PnlIzquierdoLayout);
        PnlIzquierdoLayout.setHorizontalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlIzquierdoLayout.setVerticalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addComponent(icnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        mainContainer.add(PnlIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 690));

        PnlDerecho.setBackground(new java.awt.Color(255, 255, 255));

        tablaRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Usuario", "Email", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRol);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        pnlActualizar.setBackground(new java.awt.Color(0, 0, 32));
        pnlActualizar.setForeground(new java.awt.Color(255, 255, 255));

        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizar.setText("Actualizar");
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlEliminar.setBackground(new java.awt.Color(0, 0, 32));
        pnlEliminar.setForeground(new java.awt.Color(255, 255, 255));

        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuario.setText("Nombre del Usuario");

        passUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passUsuario.setText("jPasswordField1");
        passUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passUsuarioMouseClicked(evt);
            }
        });

        lblNombreUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuario1.setText("Contraseña");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Correo electrónico");

        icnLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo1.setIcon(new javax.swing.ImageIcon("resources/images/alumno_128.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUsuario1)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombreUsuario)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoElectronico)
                    .addComponent(icnLogo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icnLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pnlAgregar.setBackground(new java.awt.Color(0, 0, 32));
        pnlAgregar.setForeground(new java.awt.Color(255, 255, 255));

        lblEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar1.setText("Agregar Usuario");
        lblEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarLayout = new javax.swing.GroupLayout(pnlAgregar);
        pnlAgregar.setLayout(pnlAgregarLayout);
        pnlAgregarLayout.setHorizontalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAgregarLayout.setVerticalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar");

        javax.swing.GroupLayout PnlDerechoLayout = new javax.swing.GroupLayout(PnlDerecho);
        PnlDerecho.setLayout(PnlDerechoLayout);
        PnlDerechoLayout.setHorizontalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlDerechoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlDerechoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(183, 183, 183))
        );
        PnlDerechoLayout.setVerticalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(65, 65, 65)
                .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainContainer.add(PnlDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 1040, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked
    /**
     *
     * Permite mover la ventana a cualquier dirección
     *
     */
    private void lblSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblSuperiorMouseDragged
    /**
     *
     * Permite mover la ventana a cualquier dirección
     *
     */
    private void lblSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblSuperiorMousePressed
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón home
     *
     */
    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnHomeMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón home
     *
     */
    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnHomeMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón home
     *
     */
    private void icnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnHomeMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón home
     *
     */
    private void icnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnHomeMouseEntered

    private void tablaRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRolMouseClicked

    }//GEN-LAST:event_tablaRolMouseClicked
    /**
     *
     * Elimina un usario de la tabla
     *
     */
    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        UsuarioController uController = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(Integer.parseInt(tablaRol.getValueAt(
                tablaRol.getSelectedRow(), 0).toString()));
        uController.eliminarUsuario(usuario);
        UsuarioController usuarioController = new UsuarioController();
        modeloTabla = (DefaultTableModel) tablaRol.getModel();
        usuarioController.mostrarRegistros(modeloTabla);

    }//GEN-LAST:event_lblEliminarMouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón eliminar
     *
     */
    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered
        pnlEliminar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_lblEliminarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón eliminar
     *
     */
    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited
        pnlEliminar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_lblEliminarMouseExited
    /**
     *
     * Actualiza un usuario de la tabla
     *
     */
    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
//        Usuario usuario = new Usuario();
//        UsuarioController uController = new UsuarioController();
//        usuario.setIdUsuario(Integer.parseInt(tablaRol.getValueAt(
//                tablaRol.getSelectedRow(), 0).toString()));
//        usuario.setNombreUsuario(this.txtNombreUsuario.getText());
//        usuario.setEmail(this.txtCorreoElectronico.getText());
//        uController.actualizarUsuario(usuario);
//        txtNombreUsuario.setText("");
//        txtCorreoElectronico.setText("");
//        UsuarioController usuarioController = new UsuarioController();
//        modeloTabla = (DefaultTableModel) tablaRol.getModel();
//        usuarioController.mostrarRegistros(modeloTabla);

    }//GEN-LAST:event_lblActualizarMouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón actualizar
     *
     */
    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered
        pnlActualizar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_lblActualizarMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón actualizar
     *
     */
    private void lblActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseExited
        pnlActualizar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_lblActualizarMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse clicked para el botón eliminar
     *
     */
    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        FrmAdminRegistrarAdmin VentanaRegistroAdmin = new FrmAdminRegistrarAdmin();
        VentanaRegistroAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEliminar1MouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón eliminar
     *
     */
    private void lblEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseEntered
        pnlAgregar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_lblEliminar1MouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón eliminar
     *
     */
    private void lblEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseExited
        pnlAgregar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_lblEliminar1MouseExited
    /**
     *
     * otorga y gestiona el evento de mouse clicked para el botón home
     *
     */
    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse clicked para el botón alumnos
     *
     */
    private void btnAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseClicked
        FrmAdminGestionarAlumno ventanaAlumno = new FrmAdminGestionarAlumno();
        ventanaAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnosMouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón alumnos
     *
     */
    private void btnAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseEntered
        pnlAlumnos.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnAlumnosMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón alumnos
     *
     */
    private void btnAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseExited
        pnlAlumnos.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnAlumnosMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón alumnos
     *
     */
    private void icnAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAlumnosMouseEntered
        pnlAlumnos.setBackground(Colors.MOUSE_ENTERED);

    }//GEN-LAST:event_icnAlumnosMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón alumnos
     *
     */
    private void icnAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAlumnosMouseExited
        pnlAlumnos.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnAlumnosMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse clicked para el botón profesor
     *
     */
    private void btnProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseClicked
        FrmAdminGestionarProfesor ventanaProfesor = new FrmAdminGestionarProfesor();
        ventanaProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfesoresMouseClicked
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón profesor
     *
     */
    private void btnProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseEntered
        pnlProfesores.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnProfesoresMouseEntered
    /**
     *
     * otorga y gestiona el evento de mouse exited para el botón profesor
     *
     */
    private void btnProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseExited
        pnlProfesores.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnProfesoresMouseExited
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón profesores
     *
     */
    private void icnProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnProfesoresMouseEntered
        pnlProfesores.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnProfesoresMouseEntered
/**
     *
     * otorga y gestiona el evento de mouse exited para el botón profesore
     *
     */
    private void icnProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnProfesoresMouseExited
        pnlProfesores.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnProfesoresMouseExited
/**
     *
     * otorga y gestiona el evento de mouse entered para el botón profesores
     *
     */
    private void pnlProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlProfesoresMouseEntered

    private void pnlProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesoresMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlProfesoresMouseExited

    private void passUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMouseClicked
        passUsuario.setText("");
    }//GEN-LAST:event_passUsuarioMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(FrmAdminGestionarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminGestionarAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDerecho;
    private javax.swing.JPanel PnlIzquierdo;
    private javax.swing.JLabel btnAlumnos;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnProfesores;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel icnAlumnos;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnLogo;
    private javax.swing.JLabel icnLogo1;
    private javax.swing.JLabel icnProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JPanel lblSuperior;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlAlumnos;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlProfesores;
    private javax.swing.JPanel pnlSuperior1;
    private javax.swing.JTable tablaRol;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
