package inventariodetienda;
public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menUsuario = new javax.swing.JMenu();
        subAddUsuario = new javax.swing.JMenuItem();
        subEliUsuario = new javax.swing.JMenuItem();
        subModUsuario = new javax.swing.JMenuItem();
        menuProveedor = new javax.swing.JMenu();
        subAddProveedor = new javax.swing.JMenuItem();
        subEliProveedor = new javax.swing.JMenuItem();
        subModProveedor = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        subAddProductos = new javax.swing.JMenuItem();
        subEliProductos = new javax.swing.JMenuItem();
        subModProductos = new javax.swing.JMenuItem();

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menUsuario.setText("Usuarios");

        subAddUsuario.setText("Agregar Nuevo");
        subAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAddUsuarioActionPerformed(evt);
            }
        });
        menUsuario.add(subAddUsuario);

        subEliUsuario.setText("Eliminar");
        menUsuario.add(subEliUsuario);

        subModUsuario.setText("Modificar");
        menUsuario.add(subModUsuario);

        jMenuBar1.add(menUsuario);

        menuProveedor.setText("Proveedores");

        subAddProveedor.setText("Agregar Nuevo");
        menuProveedor.add(subAddProveedor);

        subEliProveedor.setText("Eliminar");
        menuProveedor.add(subEliProveedor);

        subModProveedor.setText("Modificar");
        menuProveedor.add(subModProveedor);

        jMenuBar1.add(menuProveedor);

        menuProductos.setText("Productos");

        subAddProductos.setText("Agregar Nuevo");
        menuProductos.add(subAddProductos);

        subEliProductos.setText("Eliminar");
        menuProductos.add(subEliProductos);

        subModProductos.setText("Modificar");
        menuProductos.add(subModProductos);

        jMenuBar1.add(menuProductos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAddUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subAddUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu menUsuario;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedor;
    private javax.swing.JMenuItem subAddProductos;
    private javax.swing.JMenuItem subAddProveedor;
    private javax.swing.JMenuItem subAddUsuario;
    private javax.swing.JMenuItem subEliProductos;
    private javax.swing.JMenuItem subEliProveedor;
    private javax.swing.JMenuItem subEliUsuario;
    private javax.swing.JMenuItem subModProductos;
    private javax.swing.JMenuItem subModProveedor;
    private javax.swing.JMenuItem subModUsuario;
    // End of variables declaration//GEN-END:variables
}
