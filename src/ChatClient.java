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
        //Instantiating all the Output Input Streams
        Socket sock= new Socket("127.0.0.1",5000); 
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in)); //reading values to send
        //Starting writing sreams 
        OutputStream istream= sock.getOutputStream();
        PrintWriter isr= new PrintWriter(istream);
        //Ending writing streams
        //starting reading steams
        InputStream input= sock.getInputStream();
        BufferedReader recieve= new BufferedReader(new InputStreamReader(input));// reading values that are recieved
        String msg1,msg2;
     //Sending receiving 
        try{  
            while(true)
          {
              if( (msg1=read.readLine()) != null)
              {
                  isr.println(msg1); // printing the msg to the server
                  isr.flush(); // flushing the msg out
              }
              if((msg2=recieve.readLine()) != null){ // reading the recived msg 
                  System.out.println(msg2); // displaying what you receieve 
              }
          }
    }
        catch(NullPointerException n){
            System.out.println("Chat Ended");
        }
    }
}