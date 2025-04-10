
package Vista;
import Modelo.Coche;


public class Formulario_Registro_Vehiculo extends javax.swing.JFrame {

   
    public Formulario_Registro_Vehiculo() {
        initComponents();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JOptionPane = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_Serial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_Modelo = new javax.swing.JTextField();
        botonregistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Campo_NumeroPuertas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        JOptionPane.setBackground(new java.awt.Color(0, 153, 153));
        JOptionPane.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        titulu.setBackground(new java.awt.Color(153, 153, 0));
        titulu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulu.setForeground(new java.awt.Color(204, 0, 0));
        titulu.setText("REGISTRO VEHICULO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Digite serial del vehiculo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Digite el modelo");

        botonregistro.setBackground(new java.awt.Color(204, 255, 255));
        botonregistro.setText("REGISTRARSE");
        botonregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonregistroMouseClicked(evt);
            }
        });
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Digite EL N° DE PUERTAS");

        Campo_NumeroPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_NumeroPuertasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(titulu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(Campo_Modelo)))
                            .addComponent(Campo_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_NumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_NumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonregistroActionPerformed

    private void botonregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroMouseClicked
        System.out.println("se hizo clic en el boton");
        String auxSereal = Campo_Serial.getText();
        String auxModelo = Campo_Modelo.getText();
        String auxNumeroPuertas = Campo_NumeroPuertas.getText();
        
         Coche coche = new Coche();
    
    coche.setSerial_vehiculo(auxSereal);
    coche.setModelo_vehiculo(auxModelo);
    
    if (validarCamposVehiculo(auxSereal, auxModelo, auxNumeroPuertas)) {
        coche.mostrarInfo(); 
        JOptionPane.showMessageDialog(this, "Registro de vehículo exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Error en el registro. Verifique los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean validarCamposVehiculo(String serial, String modelo, String numeroPuertas) {
    if (!serial.matches("[0-9]+") || !modelo.matches("[0-9]+")) {
        return false;
    }
    if (!numeroPuertas.matches("[0-9]+")) {
        return false;
    }
    
    return true;

    }//GEN-LAST:event_botonregistroMouseClicked

    private void Campo_NumeroPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_NumeroPuertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_NumeroPuertasActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_Modelo;
    private javax.swing.JTextField Campo_NumeroPuertas;
    private javax.swing.JTextField Campo_Serial;
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton botonregistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel titulu;
    // End of variables declaration//GEN-END:variables
}
