/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import form.Home;
import java.awt.Color;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Seno
 */
public class Server {

    static ServerSocket server;
    static Socket client;
    static boolean signal = false;

    /**
     * @param args the command line arguments
     */
    public Server() {

        try {
            System.out.println("Loading n Waitting");
            Home.btn_start.setText("...");
            server = new ServerSocket(Parameter.PORT);
            signal = true;
        } catch (Exception ex) {
            signal = false;
        }

        if (signal == true) {
            new terimaKoneksi("RunServer");
            Home.btn_start.setText("STOP");
            Home.lbl_status.setText("ON");
            Home.lbl_status.setBackground(Color.BLUE);
        }
    }

    public static class terimaKoneksi implements Runnable {

        Thread t;

        terimaKoneksi(String imeNiti) {
            t = new Thread(this, imeNiti);
            t.start();
        }

        public void run() {
            while (true) {
                try {
                    try {
                        client = server.accept();
                        System.out.println("Access Client.....");
                        Home.lbl_status.setText("CON..");
                        Home.lbl_status.setBackground(Color.GREEN);
                    } catch (Exception ex) {
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void serverOff() {
        try {
            server.close();
            Home.btn_start.setText("START");
            Home.lbl_status.setText("OFF");
            Home.lbl_status.setBackground(Color.RED);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
