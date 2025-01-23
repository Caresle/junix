package com.caresle.junix;

public class App {
  public static void main(String[] args) {

    if (args.length <= 0) {
      System.out.println("Please specify one of the commands <ls, ifconfig, mv>");
      return;
    }

    String commandName = args[0];

    if (commandName.equals("ls")) {
      Ls ls = new Ls();
      ls.run();
    }

    if (commandName.equals("mv")) {
      if (args.length != 3) {
        System.out.println("Please specify [originalPath] [destinyPath]");
        return;
      }
      Mv mv = new Mv();
      mv.run(args[1], args[2]);
    }

    if (commandName.equals("ifconfig")) {
      IfConfig ifConfig = new IfConfig();
      ifConfig.run();
    }
  }
}
