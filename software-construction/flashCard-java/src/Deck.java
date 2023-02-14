package src;

import java.util.ArrayList;

public class Deck {
  int cardsCount = 0;
  ArrayList<Card> cards = new ArrayList<Card>();
  
  void addCard(){
    System.out.print(Color.PURPLE + "front: " + Color.YELLOW);
    String front = Main.sca.nextLine();
    System.out.print(Color.PURPLE + "back: " + Color.YELLOW);
    String back = Main.sca.nextLine();
    cards.add(new Card(front, back));
    System.out.println(Color.GREEN + "added new card");
  }
  void printCards(){
    for(int i = 0;i<this.cards.size();i++){
      System.out.print(Color.PURPLE);
      System.out.println((i + 1) + ". " + this.cards.get(i).front + " | " + this.cards.get(i).back);
    }
  }

  void study(){
    for(int i = 0;i<this.cards.size();i++){
      System.out.print(Color.BLUE + this.cards.get(i).front + ": " + Color.YELLOW);
      String answer = Main.sca.nextLine();
      if(answer.compareToIgnoreCase(this.cards.get(i).back) == 0){
        System.out.println(Color.BLUE + "correct!");
      }
      else{
        System.out.println("wrong, correct answer: " + this.cards.get(i).back);
      }
    }
  }

}