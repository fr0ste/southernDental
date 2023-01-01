 /**
  * Autor: Joel && Elio
  * Fecha de creación: 26 de noviembre del 2022
  * Fecha de modificación: 01 de diciembre del 2022
  * Descripción: Ventana donde el administrador podra seleccionar 
  *              alumno, paciente o profesor para administrar su información
  */

package view.admin;

import utilities.Colors;

public class Home extends javax.swing.JFrame {

    /**
     * variables
     */
    private int xMouse, yMouse;
    private final int MENU_HOME = 0;
    private final int MENU_PACIENTES = 1;
    private final int MENU_ALUMNOS =2;
    private final int MENU_PROFESORES =3;
    

    public Home() {
        initComponents();
        setLocationRelativeTo(null);

    }
    
    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSuperior = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        pnlIzquierdo = new javax.swing.JPanel();
        pnlSuperior1 = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JLabel();
        containerDerecho = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        pnlProfesor = new javax.swing.JPanel();
        btnProfesor = new javax.swing.JLabel();
        pnlAlumnos = new javax.swing.JPanel();
        btnAlumnos = new javax.swing.JLabel();
        pnlPacientes = new javax.swing.JPanel();
        btnPacientes = new javax.swing.JLabel();
        menu = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        icnHome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnlIzquierdoBase = new javax.swing.JPanel();
        pnlHome1 = new javax.swing.JPanel();
        btnHome1 = new javax.swing.JLabel();
        icnHome1 = new javax.swing.JLabel();
        pnlRegistar = new javax.swing.JPanel();
        btnRegistar = new javax.swing.JLabel();
        icnRegistar = new javax.swing.JLabel();
        pnlActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        icnActualizar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        icnEliminar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        pnlHome3 = new javax.swing.JPanel();
        btnHome3 = new javax.swing.JLabel();
        icnHome3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        pnlHome2 = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JLabel();
        icnHome2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSuperior.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(lblSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        containerDerecho.setLayout(new java.awt.GridLayout(1, 0));

        pnlProfesor.setBackground(new java.awt.Color(0, 0, 32));
        pnlProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlProfesorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlProfesorMouseExited(evt);
            }
        });

        btnProfesor.setBackground(new java.awt.Color(0, 0, 32));
        btnProfesor.setForeground(new java.awt.Color(255, 255, 255));
        btnProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfesor.setText("PROFESOR");
        btnProfesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlProfesorLayout = new javax.swing.GroupLayout(pnlProfesor);
        pnlProfesor.setLayout(pnlProfesorLayout);
        pnlProfesorLayout.setHorizontalGroup(
            pnlProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        pnlProfesorLayout.setVerticalGroup(
            pnlProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProfesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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
        btnAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlumnos.setText("ALUMNOS");
        btnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlAlumnosLayout = new javax.swing.GroupLayout(pnlAlumnos);
        pnlAlumnos.setLayout(pnlAlumnosLayout);
        pnlAlumnosLayout.setHorizontalGroup(
            pnlAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        pnlAlumnosLayout.setVerticalGroup(
            pnlAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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

        btnPacientes.setBackground(new java.awt.Color(0, 0, 32));
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPacientes.setText("PACIENTES");
        btnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPacientesLayout = new javax.swing.GroupLayout(pnlPacientes);
        pnlPacientes.setLayout(pnlPacientesLayout);
        pnlPacientesLayout.setHorizontalGroup(
            pnlPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        pnlPacientesLayout.setVerticalGroup(
            pnlPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(pnlPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnlAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pnlProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(431, Short.MAX_VALUE))
        );

        containerDerecho.add(jPanel3);

        jPanel1.add(containerDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 1050, 720));

        jPanel2.setBackground(new java.awt.Color(0, 0, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 700));

        pnlHome.setBackground(new java.awt.Color(0, 0, 32));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHomeMouseEntered(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 0, 32));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setText("HOME");
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
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.addTab("tab1", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIzquierdoBase.setBackground(new java.awt.Color(0, 0, 32));
        pnlIzquierdoBase.setPreferredSize(new java.awt.Dimension(240, 700));

        pnlHome1.setBackground(new java.awt.Color(0, 0, 32));

        btnHome1.setBackground(new java.awt.Color(0, 0, 32));
        btnHome1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnHome1.setText("HOME    ");
        btnHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome1MouseExited(evt);
            }
        });

        icnHome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome1.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnHome1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnHome1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHome1Layout = new javax.swing.GroupLayout(pnlHome1);
        pnlHome1.setLayout(pnlHome1Layout);
        pnlHome1Layout.setHorizontalGroup(
            pnlHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHome1Layout.createSequentialGroup()
                .addComponent(icnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHome1Layout.setVerticalGroup(
            pnlHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnHome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlRegistar.setBackground(new java.awt.Color(0, 0, 32));

        btnRegistar.setBackground(new java.awt.Color(0, 0, 32));
        btnRegistar.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegistar.setText("REGISTAR PACIENTE   ");
        btnRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistarMouseExited(evt);
            }
        });

        icnRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnRegistar.setIcon(new javax.swing.ImageIcon("resources/images/crear.png")
        );
        icnRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnRegistarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnRegistarMouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });

        icnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnActualizar.setIcon(new javax.swing.ImageIcon("resources/images/actualizar.png")
        );
        icnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnActualizarMouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        icnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnEliminar.setIcon(new javax.swing.ImageIcon("resources/images/borrar.png")
        );
        icnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnEliminarMouseExited(evt);
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
                .addComponent(pnlHome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlIzquierdoBaseLayout.setVerticalGroup(
            pnlIzquierdoBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzquierdoBaseLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(pnlHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(pnlIzquierdoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 690));

        menu.addTab("tab2", jPanel5);

        jPanel9.setBackground(new java.awt.Color(0, 0, 32));
        jPanel9.setPreferredSize(new java.awt.Dimension(240, 700));

        pnlHome3.setBackground(new java.awt.Color(0, 0, 32));
        pnlHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHome3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHome3MouseEntered(evt);
            }
        });

        btnHome3.setBackground(new java.awt.Color(0, 0, 32));
        btnHome3.setForeground(new java.awt.Color(255, 255, 255));
        btnHome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome3.setText("HOME");
        btnHome3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome3MouseEntered(evt);
            }
        });

        icnHome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome3.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnHome3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnHome3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlHome3Layout = new javax.swing.GroupLayout(pnlHome3);
        pnlHome3.setLayout(pnlHome3Layout);
        pnlHome3Layout.setHorizontalGroup(
            pnlHome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHome3Layout.createSequentialGroup()
                .addComponent(icnHome3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        pnlHome3Layout.setVerticalGroup(
            pnlHome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnHome3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(pnlHome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.addTab("tab3", jPanel6);

        jPanel8.setBackground(new java.awt.Color(0, 0, 32));
        jPanel8.setPreferredSize(new java.awt.Dimension(240, 700));

        pnlHome2.setBackground(new java.awt.Color(0, 0, 32));
        pnlHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHome2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHome2MouseEntered(evt);
            }
        });

        btnHome2.setBackground(new java.awt.Color(0, 0, 32));
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome2.setText("HOME");
        btnHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome2MouseEntered(evt);
            }
        });

        icnHome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnHome2.setIcon(new javax.swing.ImageIcon("resources/images/iconoHome.png")
        );
        icnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnHome2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnHome2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlHome2Layout = new javax.swing.GroupLayout(pnlHome2);
        pnlHome2.setLayout(pnlHome2Layout);
        pnlHome2Layout.setHorizontalGroup(
            pnlHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHome2Layout.createSequentialGroup()
                .addComponent(icnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        pnlHome2Layout.setVerticalGroup(
            pnlHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icnHome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnHome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(pnlHome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.addTab("tab4", jPanel7);

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     * otorga y gestiona el evento de mouse pressed para la barra superior.
     * 
     */
    private void lblSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblSuperiorMousePressed
    
    /**
     * 
     * otorga y gestiona el evento de mouse dragged para la barra superior.
     * 
     */
    private void lblSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblSuperiorMouseDragged
    
    /**
     * 
     * otorga y gestiona el evento de mouse clicked para el botón de salir.
     * 
     */
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked
    
    /**
     * 
     * otorga y gestiona el evento de mouse exited para el botón home.
     *
     */
    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnHomeMouseExited
    
    /**
     * 
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de pacientes.
     * 
     */
    private void pnlPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPacientesMouseEntered
        pnlPacientes.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlPacientesMouseEntered
    
    /**
     * 
     * otorga y gestiona el evento de mouse exited para el panel que contiene
     * el botón de pacientes.
     * 
     */
    private void pnlPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPacientesMouseExited
        pnlPacientes.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_pnlPacientesMouseExited
    
    /**
     * 
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de alumnos.
     * 
     */
    private void pnlAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseEntered
        pnlAlumnos.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlAlumnosMouseEntered
    
    /**
     * 
     * otorga y gestiona el evento de mouse exited para el panel que contiene
     * el botón de alumnos.
     * 
     */
    private void pnlAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseExited
        pnlAlumnos.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_pnlAlumnosMouseExited
    
    /**
     * 
     * otorga y gestiona el evento de mouse entered para el panel que contiene
     * el botón de profesor.
     * 
     */
    private void pnlProfesorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesorMouseEntered
        pnlProfesor.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlProfesorMouseEntered
    
    /**
     * 
     * otorga y gestiona el evento de mouse exited para el panel que contiene
     * el botón de profesor.
     * 
     */
    private void pnlProfesorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProfesorMouseExited
        pnlProfesor.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_pnlProfesorMouseExited
    
    /**
     *
     * otorga y gestiona el evento de mouse entered para el botón home.
     *
     */
    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void icnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseEntered
         pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnHomeMouseEntered

    private void icnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHomeMouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnHomeMouseExited

    private void pnlHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHomeMouseExited

    private void btnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseClicked
        
        containerDerecho.removeAll();
        menu.setSelectedIndex(1);
        
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnPacientesMouseClicked

    private void btnHome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnHome1MouseEntered

    private void btnHome1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnHome1MouseExited

    private void icnHome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome1MouseEntered
        pnlHome.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnHome1MouseEntered

    private void icnHome1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome1MouseExited
        pnlHome.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnHome1MouseExited

    private void btnRegistarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistarMouseEntered
        pnlRegistar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnRegistarMouseEntered

    private void btnRegistarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistarMouseExited
        pnlRegistar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnRegistarMouseExited

    private void icnRegistarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnRegistarMouseEntered
        pnlRegistar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnRegistarMouseEntered

    private void icnRegistarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnRegistarMouseExited
        pnlRegistar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnRegistarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        pnlActualizar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        pnlActualizar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void icnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnActualizarMouseEntered
        pnlActualizar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnActualizarMouseEntered

    private void icnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnActualizarMouseExited
        pnlActualizar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnActualizarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        pnlEliminar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        pnlEliminar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void icnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnEliminarMouseEntered
        pnlEliminar.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_icnEliminarMouseEntered

    private void icnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnEliminarMouseExited
        pnlEliminar.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_icnEliminarMouseExited

    private void btnHome2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome2MouseExited

    private void btnHome2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome2MouseEntered

    private void icnHome2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_icnHome2MouseExited

    private void icnHome2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_icnHome2MouseEntered

    private void pnlHome2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHome2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHome2MouseExited

    private void pnlHome2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHome2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHome2MouseEntered

    private void btnHome3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome3MouseExited

    private void btnHome3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome3MouseEntered

    private void icnHome3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_icnHome3MouseExited

    private void icnHome3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnHome3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_icnHome3MouseEntered

    private void pnlHome3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHome3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHome3MouseExited

    private void pnlHome3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHome3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHome3MouseEntered

    private void btnHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseClicked
        menu.setSelectedIndex(0);
    }//GEN-LAST:event_btnHome1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnAlumnos;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnHome1;
    private javax.swing.JLabel btnHome2;
    private javax.swing.JLabel btnHome3;
    private javax.swing.JLabel btnPacientes;
    private javax.swing.JLabel btnProfesor;
    private javax.swing.JLabel btnRegistar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JDesktopPane containerDerecho;
    private javax.swing.JLabel icnActualizar;
    private javax.swing.JLabel icnEliminar;
    private javax.swing.JLabel icnHome;
    private javax.swing.JLabel icnHome1;
    private javax.swing.JLabel icnHome2;
    private javax.swing.JLabel icnHome3;
    private javax.swing.JLabel icnRegistar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel lblSuperior;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlAlumnos;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlHome1;
    private javax.swing.JPanel pnlHome2;
    private javax.swing.JPanel pnlHome3;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlIzquierdoBase;
    private javax.swing.JPanel pnlPacientes;
    private javax.swing.JPanel pnlProfesor;
    private javax.swing.JPanel pnlRegistar;
    private javax.swing.JPanel pnlSuperior1;
    // End of variables declaration//GEN-END:variables
}
