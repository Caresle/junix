package com.caresle.junix;

import java.io.File;

public class Ls extends Command {
  @Override
  public void run() {
    File directory = new File(".");
    File[] files = directory.listFiles();

    if (files != null) {
      for (File file : files) {
        if (file.isDirectory()) {
          System.out.println("\t FOLDER: " + file.getName());
          continue;
        }
        
        if (file.isHidden()) {
          System.out.println("\t HIDDEN: " + file.getName());
          continue;
        }

        System.out.println("\t FILE: " + file.getName());
      }
    }
  }
}
