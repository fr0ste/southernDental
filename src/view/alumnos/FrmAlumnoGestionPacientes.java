package view.alumnos;

import utilities.Colors;

/**
 *
 * @author froste
 */
public class FrmAlumnoGestionPacientes extends javax.swing.JFrame {

    /**
     * variables
     */
    private int xMouse, yMouse;
    public FrmAlumnoGestionPacientes() {
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
        pnlConsultas = new javax.swing.JPanel();
        icnConsultas = new javax.swing.JLabel();
        btnConstultas = new javax.swing.JLabel();
        pnlPacientes = new javax.swing.JPanel();
        icnPacientes = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JLabel();
        PnlDerecho = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        icnUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setText("HOME");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        icnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
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
            .addComponent(icnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        icnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnLogo.setIcon(new javax.swing.ImageIcon("/home/froste/NetBeansProjects/southernDental/resources/images/LogoLight_128.png")); // NOI18N

        pnlConsultas.setBackground(new java.awt.Color(0, 0, 32));
        pnlConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConsultasMouseExited(evt);
            }
        });

        icnConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnConsultas.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnConsultasMouseExited(evt);
            }
        });

        btnConstultas.setBackground(new java.awt.Color(0, 0, 32));
        btnConstultas.setForeground(new java.awt.Color(255, 255, 255));
        btnConstultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConstultas.setText("CONSULTAS");
        btnConstultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConstultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConstultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConstultasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultasLayout = new javax.swing.GroupLayout(pnlConsultas);
        pnlConsultas.setLayout(pnlConsultasLayout);
        pnlConsultasLayout.setHorizontalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConstultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConsultasLayout.setVerticalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConstultas, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(icnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlPacientes.setBackground(new java.awt.Color(0, 0, 32));
        pnlPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPacientesMouseExited(evt);
            }
        });

        icnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnPacientes.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnPacientesMouseExited(evt);
            }
        });

        btnPacientes.setBackground(new java.awt.Color(0, 0, 32));
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPacientes.setText("PACIENTES");
        btnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPacientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlPacientesLayout = new javax.swing.GroupLayout(pnlPacientes);
        pnlPacientes.setLayout(pnlPacientesLayout);
        pnlPacientesLayout.setHorizontalGroup(
            pnlPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPacientesLayout.setVerticalGroup(
            pnlPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPacientesLayout.createSequentialGroup()
                        .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(icnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlIzquierdoLayout = new javax.swing.GroupLayout(PnlIzquierdo);
        PnlIzquierdo.setLayout(PnlIzquierdoLayout);
        PnlIzquierdoLayout.setHorizontalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlIzquierdoLayout.setVerticalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addComponent(icnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        mainContainer.add(PnlIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 690));

        PnlDerecho.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        icnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnUsuario.setIcon(new javax.swing.ImageIcon("/home/froste/NetBeansProjects/southernDental/resources/images/usuario(2).png")); // NOI18N

        jLabel2.setText("NOMBRE");

        jLabel3.setText("EDAD");

        jLabel4.setText("TRATAMIENTOS");

        jLabel5.setText("FECHA DE REGISTRO");

        jLabel6.setText("DIRECCION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "APELLIDO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jLabel1.setText("PACIENTES REGISTRADOS");

        javax.swing.GroupLayout PnlDerechoLayout = new javax.swing.GroupLayout(PnlDerecho);
        PnlDerecho.setLayout(PnlDerechoLayout);
        PnlDerechoLayout.setHorizontalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(402, 402, 402))
        );
        PnlDerechoLayout.setVerticalGroup(
            PnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDerechoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void icnConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnConsultasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_icnConsultasMouseEntered

    private void icnConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnConsultasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_icnConsultasMouseExited

    private void btnConstultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConstultasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstultasMouseEntered

    private void btnConstultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConstultasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstultasMouseExited

    private void pnlConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlConsultasMouseEntered

    private void pnlConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlConsultasMouseExited

    private void icnPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnPacientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_icnPacientesMouseEntered

    private void icnPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnPacientesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_icnPacientesMouseExited

    private void btnPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPacientesMouseEntered

    private void btnPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPacientesMouseExited

    private void pnlPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPacientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlPacientesMouseEntered

    private void pnlPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPacientesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlPacientesMouseExited

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
            java.util.logging.Logger.getLogger(FrmAlumnoGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnoGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnoGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnoGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlumnoGestionPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDerecho;
    private javax.swing.JPanel PnlIzquierdo;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnConstultas;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnPacientes;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel icnConsultas;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnLogo;
    private javax.swing.JLabel icnPacientes;
    private javax.swing.JLabel icnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel lblSuperior;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel pnlConsultas;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlPacientes;
    private javax.swing.JPanel pnlSuperior1;
    // End of variables declaration//GEN-END:variables
}
