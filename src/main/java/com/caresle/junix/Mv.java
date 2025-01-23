package com.caresle.junix;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mv {
  public void run(String originalPath, String destinyPath) {
    Path originalFile = Paths.get(originalPath);
    Path targetDir = Paths.get(destinyPath);

    try {
      if (!Files.exists(targetDir)) {
        Files.createDirectory(targetDir);
      }

      Path targetFile = targetDir.resolve(originalFile.getFileName());
      Files.move(originalFile, targetFile);
    
      System.out.println("File moved sucessfully to: " + targetFile);
      
    } catch (IOException e) {
      System.err.println("Error moving the file: " + e.getMessage());
    }
  }
}
