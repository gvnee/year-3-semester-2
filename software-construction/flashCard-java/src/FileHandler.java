package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
   void createFile(){
    try {
      File directory = new File("src/database");
      if(!directory.exists()){
        directory.mkdirs();
      }
      File file = new File(directory, "deck.txt");
      file.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
   }
   void write(){
    try {
      FileWriter writer = new FileWriter("src/database/deck.txt");
      writer.write("ayee");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

   }
}