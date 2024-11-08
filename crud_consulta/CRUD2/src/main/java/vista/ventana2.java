package vista;

import Conexion.Conexiondb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventana2 extends javax.swing.JFrame {

    Conexiondb con = new Conexiondb();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public formulario v1;

    public ventana2() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtpregunta = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btneditar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnAventana1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SpnEdad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        CmboSexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("FORMULARIO");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel2.setText("CORREO:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel4.setText("TELEFONO:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel5.setText("PREGUNTA:");

        txtid.setEditable(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        txtpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreguntaActionPerformed(evt);
            }
        });

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Limpiar");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel6.setText("NOMBRE: ");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        btnAventana1.setText("Ventana 1");
        btnAventana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAventana1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel7.setText("Edad:");

        SpnEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jLabel8.setText("Sexo:");

        CmboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CmboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnAventana1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SpnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(CmboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnAventana1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        Tabla_Datos.setAutoCreateRowSorter(true);
        Tabla_Datos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        Tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "Edad", "Sexo", "Correo", "Telefono", "Pregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Datos);
        if (Tabla_Datos.getColumnModel().getColumnCount() > 0) {
            Tabla_Datos.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabla_Datos.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(3).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(4).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(5).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreguntaActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        editar();
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    public void setV1(formulario v1) {
        this.v1 = v1;
    }

    private void btnAventana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAventana1ActionPerformed
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAventana1ActionPerformed

    private void Tabla_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DatosMouseClicked
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        } else {
            try {
                int identificador = Integer.parseInt(Tabla_Datos.getValueAt(fila, 0).toString());
                String nom = Tabla_Datos.getValueAt(fila, 1).toString();
                int edad = Integer.parseInt(Tabla_Datos.getValueAt(fila, 2).toString());
                String sex = Tabla_Datos.getValueAt(fila, 3).toString();
                String correo = Tabla_Datos.getValueAt(fila, 4).toString();
                String telef = Tabla_Datos.getValueAt(fila, 5).toString();
                String pregunt = Tabla_Datos.getValueAt(fila, 6).toString(); // Cambié el índice de columna de 8 a 7 para evitar error de índice

                // Setear los valores en los campos de texto
                txtid.setText(String.valueOf(identificador));
                txtnombre.setText(nom);
                SpnEdad.setValue(edad);  // Usar setValue para el spinner
                CmboSexo.setSelectedItem(sex);  // Usa setSelectedItem para el combo box
                txtcorreo.setText(correo);
                txttelefono.setText(telef);
                txtpregunta.setText(pregunt);

            } catch (Exception e) {
                e.printStackTrace(); // Esto imprime el error en la consola
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tabla: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_Tabla_DatosMouseClicked

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    public void listar() {
        String sql = "SELECT * FROM consultas";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] usuario = new Object[7];
            modelo = (DefaultTableModel) Tabla_Datos.getModel();

            while (rs.next()) {
                usuario[0] = rs.getInt("identificador");
                usuario[1] = rs.getString("nombre");
                usuario[2] = rs.getInt("edad");       // Obtener edad
                usuario[3] = rs.getString("sexo");    // Obtener sexo
                usuario[4] = rs.getString("correo");
                usuario[5] = rs.getString("telefono");
                usuario[6] = rs.getString("pregunta");
                modelo.addRow(usuario);
            }

            Tabla_Datos.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
    }

    public void limpiar() {
        while (Tabla_Datos.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmboSexo;
    private javax.swing.JSpinner SpnEdad;
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JButton btnAventana1;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpregunta;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    public void eliminar() {
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona a alguien");
        } else {
            int identificador = Integer.parseInt(Tabla_Datos.getValueAt(fila, 0).toString());
            String sql = "DELETE FROM consultas WHERE identificador = " + identificador;
            try {
                cn = Conexiondb.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Pregunta eliminada");
                limpiar();
                listar();
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }
        }
    }

    public void nuevo() {
        txtid.setText("");
        txtnombre.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
        txtpregunta.setText("");
        CmboSexo.setSelectedIndex(0);
        SpnEdad.setValue(0);
    }

  public void editar() {
    int fila = Tabla_Datos.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona a alguien para modificar.");
        return;
    }

    int identificador = (int) Tabla_Datos.getValueAt(fila, 0); // Suponiendo que el ID es la primera columna
    String nombre = txtnombre.getText();
    String correo = txtcorreo.getText();
    String telefono = txttelefono.getText();
    String pregunta = txtpregunta.getText();
    String sexoSeleccionado = CmboSexo.getSelectedItem().toString();
    String sexo = sexoSeleccionado.equals("Masculino") ? "M" : "F"; // Ajusta el valor de sexo a un solo carácter
    int edad = (int) SpnEdad.getValue(); // Obtener el valor de JSpinner

    if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || pregunta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        return;
    }

    String sql = "UPDATE consultas SET nombre = ?, correo = ?, telefono = ?, pregunta = ?, sexo = ?, edad = ? WHERE identificador = ?";

    try {
        cn = Conexiondb.getConnection();
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, nombre);
        pst.setString(2, correo);
        pst.setString(3, telefono);
        pst.setString(4, pregunta);
        pst.setString(5, sexo); // Asignar el valor de sexo
        pst.setInt(6, edad); // Asignar el valor de edad
        pst.setInt(7, identificador);

        int n = pst.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Actualización completada");
            limpiar();
            cargarDatosEnTabla();
            // Asumiendo que este método lista los datos en la tabla
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la entrada a modificar.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en: " + e.getMessage());
    }
}

  public void cargarDatosEnTabla() {
    DefaultTableModel modelo = (DefaultTableModel) Tabla_Datos.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    String sql = "SELECT * FROM consultas";
    try {
        cn = Conexiondb.getConnection();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Object[] fila = new Object[7];
            fila[0] = rs.getInt("identificador");
            fila[1] = rs.getString("nombre");
            fila[2] = rs.getInt("edad");
            fila[3] = rs.getString("sexo");
            fila[4] = rs.getString("correo");
            fila[5] = rs.getString("telefono");
            fila[6] = rs.getString("pregunta");
            modelo.addRow(fila);
        }
        rs.close();
        st.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
    }
}

}
