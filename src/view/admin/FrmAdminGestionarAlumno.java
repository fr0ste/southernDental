/**
 * Autor: Joel && Elio
 * Fecha de creación: 11 de noviembre del 2022
 * Fecha de modificación: 12 de diciembre del 2022
 * Descripción: Ventana para gestionar alumnos
 */

package view.admin;

import utilities.Colors;

public class FrmAdminGestionarAlumno extends javax.swing.JFrame {

    /**
     * variables
     */
    private int xMouse, yMouse;

    public FrmAdminGestionarAlumno() {
        initComponents();
        setLocationRelativeTo(null);
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
        icnLogo = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();
        icnAdmin = new javax.swing.JLabel();
        pnlProfesores = new javax.swing.JPanel();
        btnProfesores = new javax.swing.JLabel();
        icnProfesores = new javax.swing.JLabel();
        PnlDerecho = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        Catedratico = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        apellidoPaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JLabel();
        estadoCivil1 = new javax.swing.JLabel();
        Catedratico1 = new javax.swing.JLabel();
        txtGrupo2 = new javax.swing.JTextField();
        txtGrupo3 = new javax.swing.JTextField();
        txtGrupo4 = new javax.swing.JTextField();
        txtGrupo5 = new javax.swing.JTextField();
        Catedratico2 = new javax.swing.JLabel();
        txtGrupo6 = new javax.swing.JTextField();
        Catedratico3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlAgregar = new javax.swing.JPanel();
        lblEliminar1 = new javax.swing.JLabel();
        icnLogo1 = new javax.swing.JLabel();

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
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHomeMouseExited(evt);
            }
        });

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

        icnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo.setIcon(new javax.swing.ImageIcon("resources/images/LogoLight_128.png"));

        pnlAdmin.setBackground(new java.awt.Color(0, 0, 32));
        pnlAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAdminMouseExited(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(0, 0, 32));
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdmin.setText("ADMINISTRADORES");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });

        icnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnAdmin.setIcon(new javax.swing.ImageIcon("resources/images/admin.png")
        );
        icnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addComponent(icnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout PnlIzquierdoLayout = new javax.swing.GroupLayout(PnlIzquierdo);
        PnlIzquierdo.setLayout(PnlIzquierdoLayout);
        PnlIzquierdoLayout.setHorizontalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(pnlProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlIzquierdoLayout.setVerticalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addComponent(icnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        mainContainer.add(PnlIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 700));

        PnlDerecho.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar");

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        Catedratico.setForeground(new java.awt.Color(0, 0, 0));
        Catedratico.setText("Matricula:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        apellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoPaterno.setText("Apellido Paterno:");

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });

        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });

        estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil.setText("Semestre:");

        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres:");

        apellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoMaterno.setText("Apellido Materno:");

        estadoCivil1.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil1.setText("Grupo:");

        Catedratico1.setForeground(new java.awt.Color(0, 0, 0));
        Catedratico1.setText("Id Catedratico Responsable:");

        txtGrupo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo2ActionPerformed(evt);
            }
        });

        txtGrupo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo3ActionPerformed(evt);
            }
        });

        txtGrupo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo4ActionPerformed(evt);
            }
        });

        txtGrupo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo5ActionPerformed(evt);
            }
        });

        Catedratico2.setForeground(new java.awt.Color(0, 0, 0));
        Catedratico2.setText("Teléfono:");

        txtGrupo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo6ActionPerformed(evt);
            }
        });

        Catedratico3.setForeground(new java.awt.Color(0, 0, 0));
        Catedratico3.setText("Correo Electónico:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Matricula"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnlAgregar.setBackground(new java.awt.Color(0, 0, 32));
        pnlAgregar.setForeground(new java.awt.Color(255, 255, 255));

        lblEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar1.setText("Agregar Alumno");
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

        icnLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo1.setIcon(new javax.swing.ImageIcon("resources/images/alumno_128.png"));

        javax.swing.GroupLayout PnlDerechoLayout = new javax.swing.GroupLayout(PnlDerecho);
        PnlDerecho.setLayout(PnlDerechoLayout);
        PnlDerechoLayout.setHorizontalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Catedratico1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Catedratico2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Catedratico3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGrupo6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGrupo5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGrupo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombres)
                            .addComponent(estadoCivil1)
                            .addComponent(estadoCivil)
                            .addComponent(apellidoMaterno)
                            .addComponent(apellidoPaterno)
                            .addComponent(Catedratico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoPaterno)
                                .addComponent(txtApellidoMaterno)
                                .addComponent(txtGrupo)
                                .addComponent(txtGrupo2)
                                .addComponent(txtGrupo3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icnLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
        );
        PnlDerechoLayout.setVerticalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icnLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaterno))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoCivil)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoCivil1)
                    .addComponent(txtGrupo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Catedratico)
                    .addComponent(txtGrupo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Catedratico1)
                    .addComponent(txtGrupo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrupo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Catedratico2))
                .addGap(18, 18, 18)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Catedratico3))
                .addGap(14, 14, 14))
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

    private void lblSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblSuperiorMouseDragged

    private void lblSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblSuperiorMousePressed

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void icnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnHomeMouseExited

    private void icnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnHomeMouseEntered

    private void pnlHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHomeMouseExited

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed

    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed

    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed

    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtGrupo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo2ActionPerformed

    private void txtGrupo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo3ActionPerformed

    private void txtGrupo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo4ActionPerformed

    private void txtGrupo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo5ActionPerformed

    private void txtGrupo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo6ActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        FrmAdminRegistarAlumno VentanaRegistarAlumno = new FrmAdminRegistarAlumno();
        VentanaRegistarAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEliminar1MouseClicked

    private void lblEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseEntered
        pnlAgregar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_lblEliminar1MouseEntered

    private void lblEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseExited
        pnlAgregar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_lblEliminar1MouseExited

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        FrmAdminGestionarAdmin ventanaAdmin = new FrmAdminGestionarAdmin();
        ventanaAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        pnlAdmin.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        pnlAdmin.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnAdminMouseExited

    private void icnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAdminMouseEntered
        pnlAdmin.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnAdminMouseEntered

    private void icnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAdminMouseExited
        pnlAdmin.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnAdminMouseExited

    private void pnlAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseEntered

    }//GEN-LAST:event_pnlAdminMouseEntered

    private void pnlAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseExited

    }//GEN-LAST:event_pnlAdminMouseExited

    private void btnProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseClicked
        FrmAdminGestionarProfesor ventanaProfesor = new FrmAdminGestionarProfesor();
        ventanaProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfesoresMouseClicked

    private void btnProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseEntered
        pnlProfesores.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnProfesoresMouseEntered

    private void btnProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesoresMouseExited
        pnlProfesores.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnProfesoresMouseExited

    private void icnProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnProfesoresMouseEntered
        pnlProfesores.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnProfesoresMouseEntered

    private void icnProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnProfesoresMouseExited
        pnlProfesores.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnProfesoresMouseExited

    private void pnlProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesoresMouseEntered

    }//GEN-LAST:event_pnlProfesoresMouseEntered

    private void pnlProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesoresMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlProfesoresMouseExited

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
            java.util.logging.Logger.getLogger(FrmAdminGestionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGestionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmAdminGestionarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Catedratico;
    private javax.swing.JLabel Catedratico1;
    private javax.swing.JLabel Catedratico2;
    private javax.swing.JLabel Catedratico3;
    private javax.swing.JPanel PnlDerecho;
    private javax.swing.JPanel PnlIzquierdo;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnProfesores;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JLabel estadoCivil1;
    private javax.swing.JLabel icnAdmin;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnLogo;
    private javax.swing.JLabel icnLogo1;
    private javax.swing.JLabel icnProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JPanel lblSuperior;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JLabel nombres;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlProfesores;
    private javax.swing.JPanel pnlSuperior1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtGrupo2;
    private javax.swing.JTextField txtGrupo3;
    private javax.swing.JTextField txtGrupo4;
    private javax.swing.JTextField txtGrupo5;
    private javax.swing.JTextField txtGrupo6;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
