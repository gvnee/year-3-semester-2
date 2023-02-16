package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
  static File directory;
  static File file;
  
   static void createFile(){
    try {
      directory = new File("src/data");
      if(!directory.exists()){
        directory.mkdirs();
      }
      file = new File(directory, "deck.txt");
      file.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
   }
   static void loadDeck(Deck deck){
    try (Scanner fileSca = new Scanner(file)){
      while(fileSca.hasNextLine()){
        String line = fileSca.nextLine();
        String[] words = line.split("\\|");
        deck.addCard(words[0], words[1]);
      }
    } catch (Exception e) {
      System.out.println("error" + e);
    }

   }
   static void write(String front, String back){
    try {
      FileWriter writer = new FileWriter(file, true);
      writer.write(front + '|' + back + "\n");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
   }
}