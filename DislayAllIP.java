
package com.mycompany.mavenproject1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class DislayAllIP {
  public static void main (String [] arg){
      try{
          //lấy tất cả interface của máy
          Enumeration <NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
          
          //duyệt qua từng giao diện
          while (netInterfaces.hasMoreElements()){
              NetworkInterface networkInterface = netInterfaces.nextElement();
              
              //lấy danh sách địa chỉ IP qua các giao diện mạng
              Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
              
              //duyệt qua từng địa chỉ IP  và in ra màn hình
              while (inetAddress.hasMoreElements()){
                  InetAddress address = inetAddress.nextElement();
                  System.out.println("Interface: " + networkInterface.getName() + "; Dia chi IP : " + address.getHostAddress());
              }
          }
      }catch (Exception e){
          e.printStackTrace();
      }
  }  
}
