
package atividade04;


import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patri
 */
public class Application extends javax.swing.JFrame {

  private final String[] tableColumns = {"Data", "Hora", "Pressão Sistólica", "Pressão Distólica", "Nivel de Stress"};
        DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
        private ArrayList<Dados> dadosList = new ArrayList<>(); 
    
    
    public Application() {
        initComponents();
    }

    
    public void geraAcessbilidade(){
        
        ButtonRegistrar.setMnemonic(KeyEvent.VK_S);
        ButtonLimpar.setMnemonic(KeyEvent.VK_L);
        ButtonExcluir.setMnemonic(KeyEvent.VK_E);
        ButtonSair.setMnemonic(KeyEvent.VK_A);
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelPS = new javax.swing.JLabel();
        LAbelPD = new javax.swing.JLabel();
        CheckStresseBaixo = new javax.swing.JCheckBox();
        CheckStresseMedio = new javax.swing.JCheckBox();
        CheckStresseAlto = new javax.swing.JCheckBox();
        DataText = new javax.swing.JTextField();
        HoraText = new javax.swing.JTextField();
        PSText = new javax.swing.JTextField();
        PDText = new javax.swing.JTextField();
        ButtonRegistrar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ButtonLimpar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelTitulo.setText("Registro de Pressão");

        LabelData.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelData.setText("Data :");

        LabelHora.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelHora.setText("Hora :");

        LabelPS.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelPS.setText("Pressão Sistólica :");

        LAbelPD.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LAbelPD.setText("Pressão Diastólica :");

        CheckStresseBaixo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        CheckStresseBaixo.setForeground(new java.awt.Color(0, 204, 0));
        CheckStresseBaixo.setText("Estresse Baixo");

        CheckStresseMedio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        CheckStresseMedio.setForeground(new java.awt.Color(255, 255, 51));
        CheckStresseMedio.setText("Estresse Médio");

        CheckStresseAlto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        CheckStresseAlto.setForeground(new java.awt.Color(255, 0, 0));
        CheckStresseAlto.setText("Estresse Alto");
        CheckStresseAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStresseAltoActionPerformed(evt);
            }
        });

        DataText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextActionPerformed(evt);
            }
        });

        HoraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraTextActionPerformed(evt);
            }
        });

        PSText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSTextActionPerformed(evt);
            }
        });

        PDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDTextActionPerformed(evt);
            }
        });

        ButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ButtonRegistrar.setText("Registrar");
        ButtonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });

        TabelaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Pressão  Sistólica", "Pressão Diastólica", "Nível Estresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaRegistro.setToolTipText("Medicao");
        jScrollPane1.setViewportView(TabelaRegistro);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        ButtonLimpar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonSair.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        ButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelData)
                                .addGap(18, 18, 18)
                                .addComponent(DataText, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelHora)
                                .addGap(18, 18, 18)
                                .addComponent(HoraText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckStresseMedio)
                            .addComponent(CheckStresseBaixo)))
                    .addComponent(jLayeredPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelPS)
                                .addGap(18, 18, 18)
                                .addComponent(PSText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(LabelTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LAbelPD))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(ButtonRegistrar)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonExcluir)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(CheckStresseAlto)))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelTitulo)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelData)
                    .addComponent(CheckStresseBaixo)
                    .addComponent(DataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHora)
                    .addComponent(CheckStresseMedio)
                    .addComponent(HoraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPS)
                    .addComponent(CheckStresseAlto)
                    .addComponent(PSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAbelPD)
                    .addComponent(PDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonRegistrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonLimpar)
                        .addComponent(ButtonSair)
                        .addComponent(ButtonExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed
   if (!emptyFields()) {
        Dados dados = getDados();
        if (dados != null) {
            inserirRegistro(dados);
            salvarRegistrosEmArquivo("registros.csv"); // Nome do arquivo onde os registros serão salvos
        }
    ButtonGroup grupoNivelStress = new ButtonGroup();
        grupoNivelStress.add(CheckStresseBaixo);
        grupoNivelStress.add(CheckStresseMedio);
        grupoNivelStress.add(CheckStresseAlto);
        
          DataText.setText("");
          HoraText.setText("");
          PSText.setText("");
          PDText.setText("");
          grupoNivelStress.clearSelection();

          
          DataText.requestFocus();
          
         
      }
    }//GEN-LAST:event_ButtonRegistrarActionPerformed

    private void DataTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextActionPerformed

    private void HoraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraTextActionPerformed

    private void PSTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSTextActionPerformed

    private void PDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDTextActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
         ButtonGroup grupoNivelStress = new ButtonGroup();
        grupoNivelStress.add(CheckStresseBaixo);
        grupoNivelStress.add(CheckStresseMedio);
        grupoNivelStress.add(CheckStresseAlto);
        
          DataText.setText("");
          HoraText.setText("");
          PSText.setText("");
          PDText.setText("");
          grupoNivelStress.clearSelection();

          
          DataText.requestFocus();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
       excluirRegistro(getPosicaoRegistro());
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void CheckStresseAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStresseAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckStresseAltoActionPerformed

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JCheckBox CheckStresseAlto;
    private javax.swing.JCheckBox CheckStresseBaixo;
    private javax.swing.JCheckBox CheckStresseMedio;
    private javax.swing.JTextField DataText;
    private javax.swing.JTextField HoraText;
    private javax.swing.JLabel LAbelPD;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelPS;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField PDText;
    private javax.swing.JTextField PSText;
    private final javax.swing.JTable TabelaRegistro = new javax.swing.JTable();
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   private boolean emptyFields(){
     /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
     boolean empty = true; 
     
     if(DataText.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data não pode ser vazio.");
     } else if(HoraText.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Hora não pode ser vazio.");
     } else if(PSText.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Pressão Sistólica não pode ser vazio.");
     }   else if(PDText.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Pressão Distólica não pode ser vazio.");
     }else{
         
         empty = false;
     }
     
     return empty;
  }
  
  //zero
   
  private Dados getDados(){
     if (!emptyFields() && validarData(DataText.getText()) && validarHora(HoraText.getText()) ) {
   
     Dados dados = new Dados();
     
     dados.setData(DataText.getText());
     dados.setHora(HoraText.getText());
     dados.setPressaoSistolica(Integer.parseInt(PSText.getText()));
     dados.setPressaDiastolica(Integer.parseInt(PDText.getText()));
     obterNivelStress();
       
       JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
            + "\nData: " + DataText.getText()
            + "\nHora: " + HoraText.getText()
            + "\nPressão Sistólica: " + PSText.getText()
            + "\nPressão Distólica: " + PDText.getText()
            + "\nNivel de Stress: "   + obterNivelStress()
          
    );
     
     return dados;
     } else {
    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente.");
     }
            return null;
  }
  
     private void inserirRegistro(Dados dados){
     
     dadosList.add(dados);
     
     atualizarTabela();
     
  }
   
  private void atualizarTabela(){
     
         
     if(!dadosList.isEmpty()){
         
         Dados dados;
         tableModel = new DefaultTableModel(tableColumns, 0);
         for (int i = 0; i < dadosList.size(); i++) {
             
             dados = dadosList.get(i);
             String[] rowData = {dados.getData(), dados.getHora(), String.valueOf(dados.getPressaoSistolica()), String.valueOf(dados.getPressaoDiastolica()), obterNivelStress() };
             tableModel.addRow(rowData);
         }
         
         TabelaRegistro.setModel(tableModel);
     }else{
         
         tableModel = new DefaultTableModel(tableColumns, 0);
         TabelaRegistro.setModel(tableModel);
     }     
  }
    private int getPosicaoRegistro(){
     
     int posRegistro = TabelaRegistro.getSelectedRow();
     
   
     if(posRegistro == -1){
         JOptionPane.showMessageDialog(rootPane, "Selecione um Registro");
     }
     
     
     return posRegistro;
  }
       private void excluirRegistro(int posRegistro){
     
            if(posRegistro >= 0){
        
         
         
         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir o Registro ?", 
                 "Exclusão de Registro", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         
         
         if(deletar == 0){
                
                dadosList.remove(posRegistro);

                 
                 atualizarTabela();
         }else{
             
                          
           TabelaRegistro.clearSelection();             
         }
     }  
  }

    private boolean validarData(String date) {
    
    if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
       
    JOptionPane.showMessageDialog(null, "Formato da DATA inválido. Use o formato XX/XX/XXXX.");
        return false;
    }
    return true;
}

        private boolean validarHora(String hora) {
    if (!hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
        JOptionPane.showMessageDialog(null, "Formato da HORA inválido. Use o formato HH:mm.");
        return false; // Hora no formato incorreto
    }
    
    String[] partes = hora.split(":");
    int horas = Integer.parseInt(partes[0]);
    int minutos = Integer.parseInt(partes[1]);
    
    if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
        JOptionPane.showMessageDialog(null, "Hora fora do intervalo válido (00:00 - 23:59).");
        return false; // Hora fora do intervalo válido
    }
    
    return true;
}
private String obterNivelStress() {
    if (CheckStresseBaixo.isSelected()) {
        return "Baixo";
    } else if (CheckStresseMedio.isSelected()) {
        return "Médio";
    } else if (CheckStresseAlto.isSelected()) {
        return "Alto";
    } else {
        return "Nenhum selecionado";
    }
}

 private void salvarRegistrosEmArquivo(String nomeArquivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
        
        writer.write("Data,Hora,Pressão Sistólica,Pressão Diastólica,Nível de Stress");
        writer.newLine();
         for (Dados dados : dadosList) {
            writer.write(dados.getData() + "," + dados.getHora() + ","
                    + dados.getPressaoSistolica() + "," + dados.getPressaoDiastolica() + ","
                    + obterNivelStress());
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Registros salvos com sucesso em " + nomeArquivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar registros em arquivo: " + e.getMessage());
    }
 }
}
