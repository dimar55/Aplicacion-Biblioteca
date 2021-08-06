
 
package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PRESTAMO extends javax.swing.JFrame {
    DefaultTableModel mdLibro;
    List<Listas.Libro> Lis_libro;
    List<Listas.NombreAutor> Lis_nombre;
    List<Listas.CantPrestamo> Lis_can;
   
    String data[][] = {};
    String Cabeza[] = {"ID", "TITULO","AUTORES"};
    Conexion.Conectar cc = new Conexion.Conectar();
    Connection cn = cc.conexion();
    
    public PRESTAMO() {
        initComponents();
        mdLibro = new DefaultTableModel(data, Cabeza) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jtbLibros.setModel(mdLibro);
        llenar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLibros = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 44, 188));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/20200601_175239_0000.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 44, 188));
        jLabel4.setText("PRESTAMO");

        jLabel5.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 44, 188));
        jLabel5.setText("NOMBRE");

        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "estudiante", "docente", "administrativo", "externo" }));
        jcb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tipoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(68, 44, 188));
        jLabel6.setText("CODIGO");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtbLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbLibros);
        if (jtbLibros.getColumnModel().getColumnCount() > 0) {
            jtbLibros.getColumnModel().getColumn(0).setMinWidth(30);
            jtbLibros.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtbLibros.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jButton2.setBackground(new java.awt.Color(64, 48, 148));
        jButton2.setText("REALIZAR PRESTAMO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 44, 188));
        jLabel8.setText("USUARIO");

        jLabel9.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 44, 188));
        jLabel9.setText("APELLIDO");

        jLabel10.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 44, 188));
        jLabel10.setText("LIBROS");

        jButton4.setText("VOLVER AL MENU");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(210, 210, 210))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_tipo, 0, 137, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 590, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String llautores(String id){
        Listas.Consultas obtn = new Listas.Consultas();
        Lis_nombre = obtn.obtnomautor(id);
        String nombres = "";
        String nombre = "";
        for (int i = 0; i < Lis_nombre.size(); i++) {
            nombre = Lis_nombre.get(i).getNombre();
            String partes[] = nombre.split(" ");
            nombres += partes[0];
            if (i==(Lis_nombre.size()-1)) {
                
            }else{
                nombres += ",";
            }
        }
        return nombres;
    }
    public void llenar(){
        Listas.Consultas obtn = new Listas.Consultas();
        Lis_libro = obtn.obtlibro();

        for (int i = 0; i < Lis_libro.size(); i++) {
            String id = Lis_libro.get(i).getId_libro();
            String titulo = Lis_libro.get(i).getTitulo();
            String autores = llautores(id);
            Object datos[] = {id, titulo,autores};
            mdLibro.addRow(datos);
        }
    }
    public void llenarc(String tituloc){
        Listas.Consultas obtn = new Listas.Consultas();
        Lis_libro = obtn.obtlibroc(tituloc);

        for (int i = 0; i < Lis_libro.size(); i++) {
            String id = Lis_libro.get(i).getId_libro();
            String titulo = Lis_libro.get(i).getTitulo();
            String autores = llautores(id);
            Object datos[] = {id, titulo,autores};
            mdLibro.addRow(datos);
        }
    }
    
    public int cantprestamo(int codigo){
        Listas.Consultas obtn = new Listas.Consultas();
        Lis_can = obtn.obtprestamoc(codigo);
        int cant = Lis_can.get(0).getContador();
        return cant;
        
    }
    private void jcb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_tipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mdLibro = new DefaultTableModel(data, Cabeza) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jtbLibros.setModel(mdLibro);
        String titulo = txt_titulo.getText();
        llenarc(titulo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tipo = (String) jcb_tipo.getSelectedItem();
        java.util.Date fecha_prestamo = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        String fecha_prest = sdf.format(fecha_prestamo);
        int codigo = Integer.parseInt(txt_codigo.getText());
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        int x = jtbLibros.getSelectedRow();
        String id_libro = (String) jtbLibros.getValueAt(x, 0);
        int dias = 0;
        if (tipo.equalsIgnoreCase("estudiante")) {
            dias=5;
        }else{
            if (tipo.equalsIgnoreCase("administrativo")) {
                dias=3;
            }else{
                if (tipo.equalsIgnoreCase("docente")) {
                    dias=7;
                }else{
                    dias=2;
                }
            }
        }
        String Consultasql = "INSERT INTO USUARIO(id_usuario,nombre,apellido,tipo_usuario,dia_permitido) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = cn.prepareStatement(Consultasql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, tipo);
            ps.setInt(5, dias);
            ps.execute();
        } catch (Exception e) {
        }
        
        int cant = cantprestamo(codigo);
        
        if (cant<3) {
            String Consultasql1 = "INSERT INTO PRESTAMO(id_libro,id_usuario,fecha_prestamo) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = cn.prepareStatement(Consultasql1);
            ps.setString(1, id_libro);
            ps.setInt(2, codigo);
            ps.setString(3, fecha_prest);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Prestamo realizado");
        } catch (Exception e) {
            System.out.println(""+e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "El usuario ha alcanzado el maximo de prestamos");
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Principal in = new Principal();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PRESTAMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRESTAMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRESTAMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRESTAMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRESTAMO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JTable jtbLibros;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
