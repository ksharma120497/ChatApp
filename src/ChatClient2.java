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
public class ChatClient2 {
    public static void main(String args[])throws Exception{
//Sending
         Socket sock1= new Socket("127.0.0.1",6000);
        OutputStream istream1= sock1.getOutputStream();
        OutputStreamWriter isr1=new OutputStreamWriter(istream1);
        BufferedWriter bufr1=new BufferedWriter(isr1);
        BufferedReader read1= new BufferedReader(new InputStreamReader(System.in));
        String msg1=read1.readLine();
       bufr1.write(msg1);
        bufr1.close();
        isr1.close();
        istream1.close();
        sock1.close();        
//Recieving 
    Socket sock= new Socket("127.0.0.1",7000);
        InputStream istream= sock.getInputStream();
        InputStreamReader isr=new InputStreamReader(istream);
        BufferedReader bufr=new BufferedReader(isr);
        String msg=bufr.readLine();
        System.out.println(msg);
        bufr.close();
        isr.close();
        istream.close();
        sock.close();
        
    }
}
