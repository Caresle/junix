package com.caresle.junix;

public class App {
  public static void main(String[] args) {
    // Temp main method, just testing the implementation of the commands
    Ls ls = new Ls();
    System.out.println("=== LS BEGIN ===");
    ls.run();
    System.out.println("=== LS END ===");

    System.out.println("=== MV BEGIN ===");
    Mv mv = new Mv();
    mv.run();
    System.out.println("=== MV END ===");

    System.out.println("=== IfConfig Begin ===");
    IfConfig ifConfig = new IfConfig();
    ifConfig.run();
    System.out.println("=== IfConfig END ===");
  }
}
