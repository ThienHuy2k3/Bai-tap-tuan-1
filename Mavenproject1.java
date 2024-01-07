
package com.mycompany.mavenproject1;
import java.net.InetAddress;

public class Mavenproject1 {

  public static void main(String[] args) {
    try {
    //lấy 1 trang web kiểm tra kết nối internet
        InetAddress inet = InetAddress.getByName("www.youtube.com");
    //thử kết nối
        boolean isKN = inet.isReachable(5000);
    //in ra thông tin 
        if(isKN){
            System.out.println("co internet");
        
        }
        else{
            System.out.println("khong the ket oi internet");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
}
}