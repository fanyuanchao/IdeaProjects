package com.company;

import java.io.IOException;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
       send();
    }
    public static void send() throws IOException, InterruptedException {
        DatagramSocket socket = new DatagramSocket(9999);
        int i = 0;
        for(;;){
            byte[] bytes = "Hello world!".getBytes();
            DatagramPacket pack = new DatagramPacket(bytes,bytes.length);
            pack.setSocketAddress(new InetSocketAddress("localhost",8888));
            socket.send(pack);
            Thread.sleep(500);
        }
    }

}
