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
public class ChatClient {
    public static void main(String args[]) throws Exception{
        //Sending
        Socket sock= new Socket("127.0.0.1",5000);
        OutputStream istream= sock.getOutputStream();
        OutputStreamWriter isr=new OutputStreamWriter(istream);
        BufferedWriter bufr=new BufferedWriter(isr);
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        String msg1=read.readLine();
       bufr.write(msg1);
        bufr.close();
        isr.close();
        istream.close();
        sock.close();
        //Receiving 
         Socket sock1= new Socket("127.0.0.1",8000);
        InputStream istream1= sock1.getInputStream();
        InputStreamReader isr1=new InputStreamReader(istream1);
        BufferedReader bufr1=new BufferedReader(isr1);
        String msg=bufr1.readLine();
        System.out.println(msg);
        bufr1.close();
        isr1.close();
        istream1.close();
        sock1.close();
    }
}
