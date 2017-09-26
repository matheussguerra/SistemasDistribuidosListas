/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_01;

import java.awt.Color;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/**
 *
 * @author guerra
 */
public class ChatMultiCast_GUI extends javax.swing.JFrame {
    Integer aux;
    String ip;
    Integer port;
    String apelido;
    InetAddress group;
    MulticastSocket s = null;
    Color botaoCor;

    public ChatMultiCast_GUI() {
        initComponents();
        textMsg.requestFocus();

        botaoEnviar.setEnabled(false);
        botaoEnviar.setBackground(Color.gray);

    }

    public synchronized void exibeMsg(String msg) {
        areaMsg.append(msg + "\n");

    }

    public synchronized void exibeMsgOutros(String msg) {
        areaMsg.append(msg + "\n");

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
        textApelido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPort = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMsg = new javax.swing.JTextArea();
        textMsg = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        botaoSAir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat multicast");

        jLabel1.setText("Apelido:");

        textApelido.setName("textApelido"); // NOI18N

        jLabel2.setText("IP:");

        textIP.setText("225.1.2.3");
        textIP.setName("textIP"); // NOI18N

        jLabel3.setText("Porta:");

        textPort.setText("5678");

        areaMsg.setEditable(false);
        areaMsg.setColumns(20);
        areaMsg.setRows(5);
        areaMsg.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensagens"));
        areaMsg.setName("areaMSG"); // NOI18N
        jScrollPane1.setViewportView(areaMsg);

        textMsg.setName("textMSG"); // NOI18N

        botaoEnviar.setMnemonic('E');
        botaoEnviar.setText("Enviar");
        botaoEnviar.setToolTipText("");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        botaoEntrar.setText("Entrar grupo");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        botaoSAir.setText("Sair grupo");
        botaoSAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSAirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(textApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textMsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEnviar))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSAir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEntrar)
                    .addComponent(botaoSAir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        String msg = textMsg.getText();        
        msg = this.apelido + msg;

        byte[] m = msg.getBytes();
        DatagramPacket messageOut = new DatagramPacket(m, m.length, this.group, this.port);

        try {
            this.s.send(messageOut);
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }

        //this.exibeMsg(msg);
        textMsg.setText("");
        textMsg.requestFocus();
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        if (!(textApelido.getText().equals("") || textIP.getText().equals("") || textPort.getText().equals(""))) {

            botaoCor = botaoEntrar.getBackground();

            this.ip = textIP.getText();
            textIP.setEditable(false);
            textIP.setBackground(Color.gray);

            this.port = Integer.parseInt(textPort.getText());
            textPort.setEditable(false);
            textPort.setBackground(Color.gray);

            this.apelido = textApelido.getText();
            this.apelido = ("[" + this.apelido + "]: ");
            textApelido.setEditable(false);
            textApelido.setBackground(Color.gray);

            areaMsg.append("Conectando ao grupo " + this.ip + "\n");
            try {
                this.group = InetAddress.getByName(this.ip);
                this.s = new MulticastSocket(this.port);
                this.s.joinGroup(group);
            } catch (SocketException e) {
                System.out.println("Socket: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO: " + e.getMessage());
            }

            areaMsg.append("Conectado.\n");

            botaoEnviar.setEnabled(true);
            botaoEnviar.setBackground(botaoCor);

            botaoEntrar.setEnabled(false);
            botaoEntrar.setBackground(Color.gray);

            ListenerThread lt = new ListenerThread(this, s);
            lt.start();            
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoSAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSAirActionPerformed
        textIP.setText("225.1.2.3");
        textIP.setEditable(true);
        textIP.setBackground(Color.white);

        textPort.setText("5678");
        textPort.setEditable(true);
        textPort.setBackground(Color.white);

        textApelido.setText("");
        textApelido.setEditable(true);
        textApelido.setBackground(Color.white);

        botaoEntrar.setEnabled(true);
        botaoEntrar.setBackground(botaoCor);

        areaMsg.setText("");

        try {
            s.leaveGroup(this.group);
            aux = 0;
            //lt.interrupt();
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }//GEN-LAST:event_botaoSAirActionPerformed

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
            java.util.logging.Logger.getLogger(ChatMultiCast_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatMultiCast_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatMultiCast_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatMultiCast_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatMultiCast_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMsg;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoSAir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textApelido;
    private javax.swing.JTextField textIP;
    private javax.swing.JTextField textMsg;
    private javax.swing.JTextField textPort;
    // End of variables declaration//GEN-END:variables
}
