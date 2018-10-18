package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        receive();
    }
    public static void receive() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
        while (true){
            datagramSocket.receive(datagramPacket);
            int dataLen = datagramPacket.getLength();
            System.out.println(dataLen);
            String str = new String(buf,0,dataLen);
            System.out.println("receiver:"+str);
        }

    }
}
