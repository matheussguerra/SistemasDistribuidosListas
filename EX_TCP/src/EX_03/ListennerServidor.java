/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author guerra
 */
public class ListennerServidor extends Thread{
    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    ServidorGUI gui;
    

    public ListennerServidor(ServidorGUI gui, Socket aClientSocket) {
        this.gui = gui;        
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            /* inicializa a thread */
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        } //catch
    } //construtor

    /* metodo executado ao iniciar a thread - start() */
    public void run() {
        while (true) {
            try {
                String data = in.readUTF();
                /* aguarda o envio de dados */
                data = (clientSocket.getInetAddress() + ": " + data);
                gui.exibeMsg(data);
                //out.writeUTF(data);
                gui.sendMsg(data);
                
                /*if(data.equals("!SAIR")){
                    gui.removeList(clientSocket);
                    clientSocket.close();
                    in.close();
                    out.close();
                    this.interrupt();
                    break;
                }*/
            } catch (EOFException e) {
                System.out.println("EOF: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("leitura: " + e.getMessage());
            } //catch
        }//end while
    } //run
}
