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
  //Listening to Client
  ServerSocket sersock = new ServerSocket(5000);
  System.out.println("Server is ready and recieveing");
  Socket sock= sersock.accept();
//Startinng writing classes initialization
OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream);
//ending....
BufferedReader read= new BufferedReader(new InputStreamReader(System.in)); //readong msg that is to be sended

// Starting instanting the reading classes
  InputStream ostream1 = sock.getInputStream();
  InputStreamReader osw1 = new InputStreamReader(ostream1);
  BufferedReader bufw1=new BufferedReader(osw1);
 // Ending....... 
  String msg1,msg2;
 try{ 
     while(true){
         if((msg1=bufw1.readLine()) != null)
              System.out.println(msg1);
         if((msg2= read.readLine()) != null){
              pwrite.println(msg2);
              pwrite.flush();
    }
     
     
  }
    }
    catch(SocketException e){
    System.out.println("Chat Ended");
    }
    }
    
}                     
