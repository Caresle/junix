package com.caresle.junix;

import java.net.*;
import java.util.Enumeration;

/**
 * IfConfig
 */
public class IfConfig extends Command {
  @Override
  public void run() {
    try {
      Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();

      while (networks.hasMoreElements()) {
        NetworkInterface network = networks.nextElement(); 

        if (!network.isUp() || network.isLoopback()) {
          continue;
        }

        System.out.println("Interface:" + network.getName());
        System.out.println("Display name:" + network.getDisplayName());

        byte[] mac = network.getHardwareAddress();

        if (mac != null) {
          System.out.print("MAC:");
          for (int i = 0; i < mac.length; i++) {
            System.out.printf("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
          }
          System.out.println();
        }
        
        // flags
        System.out.println("mtu: " + network.getMTU());
        System.out.println("virtual: " + network.isVirtual());
        System.out.println("Support multicast: " + network.supportsMulticast());

        Enumeration<InetAddress> inets = network.getInetAddresses();

        while (inets.hasMoreElements()) {
          InetAddress inet = inets.nextElement();

          System.out.println("inet: " + inet.getHostAddress());
          if (inet instanceof Inet4Address) {
            System.out.println("Type: IPv4");
          }

          if (inet instanceof Inet6Address) {
            System.out.println("Type: IPv6");
          }
        }
      }
    } catch (SocketException e) {
      System.err.println(e.getMessage());
    }
  }
}
