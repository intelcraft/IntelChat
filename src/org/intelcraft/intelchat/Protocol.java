package org.intelcraft.intelchat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Protocol
{
	public static boolean checkOnline(String host, int port)
	{
		try {
			Socket socket = new Socket(host, port);

			return socket.isConnected();
		} catch(IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	public static String UDPPingClient(String hostname, int port)
	{
		try
		{
			byte[] inData = new byte[1024];
			byte[] outData = new byte[1024];

			DatagramSocket socket = new DatagramSocket();

			outData = "Ping".getBytes();

			DatagramPacket out = new DatagramPacket(outData, outData.length, InetAddress.getByName(hostname), port);
			socket.send(out);

			DatagramPacket in = new DatagramPacket(inData, inData.length);
			socket.receive(in);
			String message = new String(in.getData(), 0, in.getLength());

			//System.out.println("Got " + message);

			socket.close();

			return "Got " + message;
		} catch(IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
