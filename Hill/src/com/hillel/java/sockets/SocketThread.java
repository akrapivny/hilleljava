package com.hillel.java.sockets;

import java.net.Socket;

/**
 * Created by AKRAPIVNY on 15.06.2015.
 */
public class SocketThread implements Runnable{

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    private Socket socket;

    @Override
    public void run() {

    }
}
