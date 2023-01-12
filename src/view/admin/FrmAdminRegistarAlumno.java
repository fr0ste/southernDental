/**
 * Autor: Joel && Elio
 * Fecha de creación: 11 de enero del 2023
 * Fecha de modificación: 12 de enero del 2023
 * Descripción: Ventana  para registar administradores
 */
package view.admin;

import utilities.Colors;

public class FrmAdminRegistarAlumno extends javax.swing.JFrame {

    private int xMouse, yMouse;

    public FrmAdminRegistarAlumno() {
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
        pnlAlumnos = new javax.swing.JPanel();
        btnAlumnos = new javax.swing.JLabel();
        icnAlumnos = new javax.swing.JLabel();
        icnLogo = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();
        icnAdmin = new javax.swing.JLabel();
        pnlProfesores = new javax.swing.JPanel();
        btnProfesores = new javax.swing.JLabel();
        icnProfesores = new javax.swing.JLabel();
        PnlDerecho = new javax.swing.JPanel();
        nombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JLabel();
        ocupacion = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JLabel();
        txtidCatedratico = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        apellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        Catedratico = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        pnlGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        ocupacion1 = new javax.swing.JLabel();
        txtSemestre1 = new javax.swing.JTextField();
        estadoCivil1 = new javax.swing.JLabel();
        txtGrupo1 = new javax.swing.JTextField();
        estadoCivil2 = new javax.swing.JLabel();
        txtGrupo2 = new javax.swing.JTextField();
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
        pnlAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAlumnosMouseExited(evt);
            }
        });

        btnAlumnos.setBackground(new java.awt.Color(0, 0, 32));
        btnAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlumnos.setText("GESTIONAR ALUMNOS");
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
        icnAlumnos.setIcon(new javax.swing.ImageIcon("resources/images/gestionar.png")
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
                .addComponent(icnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAlumnosLayout.setVerticalGroup(
            pnlAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pnlAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        mainContainer.add(PnlIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 690));

        PnlDerecho.setBackground(new java.awt.Color(255, 255, 255));

        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.setText("Nombres:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil.setText("Grupo:");

        ocupacion.setForeground(new java.awt.Color(0, 0, 0));
        ocupacion.setText("Semestre:");

        apellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoMaterno.setText("Apellido Materno:");

        txtidCatedratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidCatedraticoActionPerformed(evt);
            }
        });

        txtSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreActionPerformed(evt);
            }
        });

        apellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        apellidoPaterno.setText("Apellido Paterno:");

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

        Catedratico.setForeground(new java.awt.Color(0, 0, 0));
        Catedratico.setText("Id Catedratico Responsable:");

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        pnlGuardar.setBackground(new java.awt.Color(0, 0, 32));
        pnlGuardar.setForeground(new java.awt.Color(255, 255, 255));

        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ocupacion1.setForeground(new java.awt.Color(0, 0, 0));
        ocupacion1.setText("Semestre:");

        txtSemestre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestre1ActionPerformed(evt);
            }
        });

        estadoCivil1.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil1.setText("Matricula:");

        txtGrupo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo1ActionPerformed(evt);
            }
        });

        estadoCivil2.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil2.setText("Correo:");

        txtGrupo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupo2ActionPerformed(evt);
            }
        });

        icnLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo1.setIcon(new javax.swing.ImageIcon("resources/images/alumno_256.png"));

        javax.swing.GroupLayout PnlDerechoLayout = new javax.swing.GroupLayout(PnlDerecho);
        PnlDerecho.setLayout(PnlDerechoLayout);
        PnlDerechoLayout.setHorizontalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(PnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDerechoLayout.createSequentialGroup()
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlDerechoLayout.createSequentialGroup()
                                .addComponent(ocupacion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSemestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                            .addGroup(PnlDerechoLayout.createSequentialGroup()
                                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombres)
                                    .addComponent(ocupacion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .addComponent(txtSemestre))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidoPaterno)
                            .addComponent(estadoCivil)
                            .addComponent(estadoCivil1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtGrupo)
                            .addComponent(txtGrupo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnlDerechoLayout.createSequentialGroup()
                                .addComponent(estadoCivil2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGrupo2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                                .addComponent(Catedratico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidCatedratico))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                                .addComponent(apellidoMaterno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(icnLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlDerechoLayout.setVerticalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDerechoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(icnLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaterno)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocupacion)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCivil)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Catedratico)
                    .addComponent(txtidCatedratico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocupacion1)
                    .addComponent(txtSemestre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCivil1)
                    .addComponent(txtGrupo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCivil2)
                    .addComponent(txtGrupo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
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
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_pnlHomeMouseExited

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtidCatedraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidCatedraticoActionPerformed
    }//GEN-LAST:event_txtidCatedraticoActionPerformed

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreActionPerformed

    }//GEN-LAST:event_txtSemestreActionPerformed

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed

    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed

    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed

    }//GEN-LAST:event_txtGrupoActionPerformed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked

    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        pnlGuardar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        pnlGuardar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_lblGuardarMouseExited

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void txtSemestre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestre1ActionPerformed

    private void txtGrupo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo1ActionPerformed

    private void txtGrupo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupo2ActionPerformed

    private void btnAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseClicked
        FrmAdminGestionarAlumno ventanaGestionarAlumno = new FrmAdminGestionarAlumno();
        ventanaGestionarAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnosMouseClicked

    private void btnAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseEntered
        pnlAlumnos.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnAlumnosMouseEntered

    private void btnAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnosMouseExited
        pnlAlumnos.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnAlumnosMouseExited

    private void pnlAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlAlumnosMouseEntered

    private void pnlAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlAlumnosMouseExited

    private void icnAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAlumnosMouseExited
        pnlAlumnos.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnAlumnosMouseExited

    private void icnAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnAlumnosMouseEntered
        pnlAlumnos.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnAlumnosMouseEntered

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
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlAdminMouseEntered

    private void pnlAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseExited
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrmAdminRegistarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminRegistarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminRegistarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminRegistarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminRegistarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Catedratico;
    private javax.swing.JPanel PnlDerecho;
    private javax.swing.JPanel PnlIzquierdo;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnAlumnos;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnProfesores;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JLabel estadoCivil1;
    private javax.swing.JLabel estadoCivil2;
    private javax.swing.JLabel icnAdmin;
    private javax.swing.JLabel icnAlumnos;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnLogo;
    private javax.swing.JLabel icnLogo1;
    private javax.swing.JLabel icnProfesores;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JPanel lblSuperior;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel ocupacion;
    private javax.swing.JLabel ocupacion1;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlAlumnos;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlProfesores;
    private javax.swing.JPanel pnlSuperior1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtGrupo1;
    private javax.swing.JTextField txtGrupo2;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSemestre;
    private javax.swing.JTextField txtSemestre1;
    private javax.swing.JTextField txtidCatedratico;
    // End of variables declaration//GEN-END:variables
}
