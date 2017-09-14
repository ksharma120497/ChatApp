/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.io.*;
import java.net.*;
public class ChatServer {
    public static void main(String args[]) throws Exception{
        //Listening to 1st client
 ServerSocket sersock1 = new ServerSocket(5000);
  System.out.println("Server is ready and recieveing");
  Socket sock1= sersock1.accept();
  InputStream ostream = sock1.getInputStream();
  InputStreamReader osw = new InputStreamReader(ostream);
  BufferedReader bufw=new BufferedReader(osw);
  String msg=bufw.readLine();
  bufw.close();
  osw.close();
  ostream.close();
  sock1.close();
  sersock1.close();
  //Listening to 2nd Client
  ServerSocket sersock = new ServerSocket(5000);
  System.out.println("Server is ready and recieveing");
  Socket sock= sersock.accept();
  InputStream ostream1 = sock.getInputStream();
  InputStreamReader osw1 = new InputStreamReader(ostream1);
  BufferedReader bufw1=new BufferedReader(osw1);
  String msg1=bufw1.readLine();
  bufw1.close();
  osw1.close();
  ostream1.close();
  sock.close();
  sersock.close();
  //Sending Messages to client 2
 ServerSocket sersock2 = new ServerSocket(7000);
  System.out.println("Server is sending");
  Socket sock2= sersock2.accept();
  OutputStream ostream2 = sock2.getOutputStream();
  OutputStreamWriter osw2 = new OutputStreamWriter(ostream2);
  BufferedWriter bufw2=new BufferedWriter(osw2);
  bufw2.write(msg1);
  bufw2.close();
  osw2.close();
  ostream2.close();
  sock2.close();
  sersock2.close();
  //Sending to client 1
  ServerSocket sersock3 = new ServerSocket(8000);
  System.out.println("Server is sending");
  Socket sock3= sersock3.accept();
  OutputStream ostream3 = sock3.getOutputStream();
  OutputStreamWriter osw3 = new OutputStreamWriter(ostream3);
  BufferedWriter bufw3=new BufferedWriter(osw3);
  bufw3.write(msg);
  bufw3.close();
  osw3.close();
  ostream3.close();
  sock3.close();
  sersock3.close();
    }
    
}
