package com.mycompany.mavenproject1;
import java.net.InetAddress;


public class GetIP {
    public static void main (String [] arg){
        try {
           //lấy địa chỉ của 1 trang web
           InetAddress inet = InetAddress.getByName("www.youtube.com");
           //In ra địa chỉ IP
           System.out.println("Địa chỉ IP của trang web youtube.com : " + inet.getHostAddress());
        }catch (Exception e){
        e.printStackTrace();
    }
    }
}