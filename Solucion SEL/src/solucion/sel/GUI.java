/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion.sel;

import javax.swing.JOptionPane;

/**
 *
 * @author monto
 */
public class GUI extends javax.swing.JFrame {
    float[][] matrizP = new float[3][3];
    float[][] matrizA = new float[3][3];
    float[][] matrizL = new float[3][3];
    float[][] matrizU = new float[3][3];
    float[] vectorB = new float[3];
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        solutionButton.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        x1Label = new javax.swing.JLabel();
        x2Label = new javax.swing.JLabel();
        x3Label = new javax.swing.JLabel();
        solutionButton = new javax.swing.JButton();
        inputMatrixButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PJTextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        LJTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        BJTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        AJTextPane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        UJTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Solución SEL AX=B con factorización PA=LU ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Matrices");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("P=");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("A=");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("L=");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("U=");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("B=");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Solución");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("X1=");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("X2=");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("X3=");

        x1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        x2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        x3Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        solutionButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        solutionButton.setText("Solución");
        solutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionButtonActionPerformed(evt);
            }
        });

        inputMatrixButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputMatrixButton.setText("Ingresar matrices");
        inputMatrixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMatrixButtonActionPerformed(evt);
            }
        });

        PJTextPane.setEditable(false);
        PJTextPane.setAutoscrolls(false);
        jScrollPane1.setViewportView(PJTextPane);

        LJTextPane.setEditable(false);
        LJTextPane.setAutoscrolls(false);
        jScrollPane2.setViewportView(LJTextPane);

        BJTextPane.setEditable(false);
        BJTextPane.setAutoscrolls(false);
        jScrollPane3.setViewportView(BJTextPane);

        AJTextPane.setEditable(false);
        AJTextPane.setAutoscrolls(false);
        jScrollPane4.setViewportView(AJTextPane);

        UJTextPane.setEditable(false);
        UJTextPane.setAutoscrolls(false);
        jScrollPane5.setViewportView(UJTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(inputMatrixButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(solutionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(x2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(x3Label))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(x1Label)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputMatrixButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solutionButton)
                            .addComponent(jLabel7))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(x1Label))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(x2Label))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(x3Label)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionButtonActionPerformed
        factorizacionPALU PALU = new factorizacionPALU(matrizP, matrizA, matrizL, matrizU, vectorB);
        float[] vectorX = PALU.solution();
        x1Label.setText(String.valueOf(vectorX[0]));
        x2Label.setText(String.valueOf(vectorX[1]));
        x3Label.setText(String.valueOf(vectorX[2]));

    }//GEN-LAST:event_solutionButtonActionPerformed

    private void inputMatrixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMatrixButtonActionPerformed
        String strMatrizP = "";
        String strMatrizA = "";
        String strMatrizL = "";
        String strMatrizU = "";
        String strVectorB = "";
        int error = 0;
        
        JOptionPane.showMessageDialog(rootPane, "A continuacion se te preguntaran uno por uno las componentes\nde las ma trices: P, A, L, U, B");
        
        //matriz P
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                String aux = JOptionPane.showInputDialog("Ingresa el valor de P" + (i+1) + (j+1)).replace(',','.');
                
                strMatrizP = strMatrizP + aux + " ";
                if(j==2){
                    strMatrizP = strMatrizP + "\n"; 
                }
                try{
                    matrizP[i][j]= Float.valueOf(aux);
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(rootPane, "Caracter invalido ingresado, Solo se permiten valores numericos");
                    i=3;
                    j=3;
                    error = 1;
                }
            }
        }
        PJTextPane.setText(strMatrizP);
        System.out.println(strMatrizP);
        
        if(error ==0){
            //matriz A
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

            String aux = JOptionPane.showInputDialog("Ingresa el valor de A" + (i+1) + (j+1)).replace(',','.');

                    strMatrizA = strMatrizA + aux + " ";
                    if(j==2){
                        strMatrizA = strMatrizA + "\n"; 
                    }
                    try{
                        matrizA[i][j]= Float.valueOf(aux);
                    }
                    catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, "Caracter invalido ingresado, Solo se permiten valores numericos");
                        i=3;
                        j=3;
                    }
                }
            }
            AJTextPane.setText(strMatrizA);
            System.out.println(strMatrizA);
        }
        
        if(error ==0){ 
            //matriz L
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    String aux = JOptionPane.showInputDialog("Ingresa el valor de L" + (i+1) + (j+1)).replace(',','.');

                    strMatrizL = strMatrizL + aux + " ";
                    if(j==2){
                        strMatrizL = strMatrizL + "\n"; 
                    }
                    try{
                        matrizL[i][j]= Float.valueOf(aux);
                    }
                    catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, "Caracter invalido ingresado, Solo se permiten valores numericos");
                        i=3;
                        j=3;
                    }
                }
            }
            LJTextPane.setText(strMatrizL);
            System.out.println(strMatrizL);
        }
        
        if (error==0){
            //matriz U
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    String aux = JOptionPane.showInputDialog("Ingresa el valor de U" + (i+1) + (j+1)).replace(',','.');

                    strMatrizU = strMatrizU + aux + " ";
                    if(j==2){
                        strMatrizU = strMatrizU + "\n"; 
                    }
                    try{
                        matrizU[i][j]= Float.valueOf(aux);
                    }
                    catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, "Caracter invalido ingresado, Solo se permiten valores numericos");
                        i=3;
                        j=3;
                    }
                }
            }
            UJTextPane.setText(strMatrizU);
            System.out.println(strMatrizU);
        }
        
        if(error==0){
            //Vector B
            for (int i = 0; i < 3; i++) {

                String aux = JOptionPane.showInputDialog("Ingresa el valor de B" + (i+1)).replace(',','.');

                strVectorB = strVectorB + aux + "\n";
                try{
                    vectorB[i]= Float.valueOf(aux);
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(rootPane, "Caracter invalido ingresado, Solo se permiten valores numericos");
                    i=3;
                }
            }
            BJTextPane.setText(strVectorB);
            System.out.println(strVectorB);
        }
        if(error==0){
            solutionButton.setVisible(true);
        }

    }//GEN-LAST:event_inputMatrixButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AJTextPane;
    private javax.swing.JTextPane BJTextPane;
    private javax.swing.JTextPane LJTextPane;
    private javax.swing.JTextPane PJTextPane;
    private javax.swing.JTextPane UJTextPane;
    private javax.swing.JButton inputMatrixButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton solutionButton;
    private javax.swing.JLabel x1Label;
    private javax.swing.JLabel x2Label;
    private javax.swing.JLabel x3Label;
    // End of variables declaration//GEN-END:variables
}