package src;

import java.util.Scanner;

public class Main{

  public static final Scanner sca = new Scanner(System.in);

  public static void main(String[] args){
    FileHandler fileHandler = new FileHandler();
    fileHandler.createFile();
    fileHandler.write();
    
    FlashCard flash = new FlashCard();
    flash.mainLoop();

    // Deck deck = new Deck();
    // Scanner sca = new Scanner(System.in);
    // System.out.println("1. add card");
    // int input = Integer.parseInt(sca.nextLine());
    // if(input == 1){
    //   System.out.print("\u001B[32m");
    //   System.out.println("card front side: ");
    //   String front = sca.nextLine();
    //   System.out.println("card back side: ");
    //   String back = sca.nextLine();
    //   deck.addCard(front, back);
    //   deck.printCards();
    // }
    // sca.close();
  }
}