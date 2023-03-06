package src;

import java.util.ArrayList;

public class Deck {
  int cardsCount = 0;
  private ArrayList<Card> cards = new ArrayList<Card>();
    
  void addCard(String front, String back){
    cards.add(new Card(front, back));
  }

  void addCardChoice(){
    System.out.print(Color.PURPLE + "front: " + Color.YELLOW);
    String front = Main.sca.nextLine();
    System.out.print(Color.PURPLE + "back: " + Color.YELLOW);
    String back = Main.sca.nextLine();
    this.addCard(front, back);
    
    FileHandler.write(front, back);

    System.out.println("\n" + Color.GREEN + "added new card" + "\n");
  }

  // void deleteCardChoice(){
  //   this.printCards();
  //   System.out.print(Color.RED + "enter index of a card to delete: " + Color.YELLOW);
  //   int index = Integer.parseInt(Main.sca.nextLine());
  //   cards.remove(index);
  //   FileHandler.delete(index);
  //   System.out.println("Color.RED" + "card deleted");
  // }

  void printCards(){
    System.out.println();
    for(int i = 0;i<this.cards.size();i++){
      System.out.print(Color.PURPLE);
      System.out.println((i + 1) + ". " + this.cards.get(i).front + " | " + this.cards.get(i).back);
    }
    System.out.println();
  }

  void study(){

    ArrayList<Card> shuffled = new ArrayList<Card>(this.cards);
    //Durstenfeld shuffle
    for(int i = 0;i<shuffled.size()-1;i++){
      int randomIndex = (int)(Math.random() * (shuffled.size() - i) + i);
      Card temp = shuffled.get(i);
      shuffled.set(i, shuffled.get(randomIndex));
      shuffled.set(randomIndex, temp);
    }
    //ask questions
    int correct = 0;
    for(int i = 0;i<shuffled.size();i++){
      System.out.print(Color.CYAN + shuffled.get(i).front + ": " + Color.YELLOW);
      String answer = Main.sca.nextLine();
      if(answer.compareToIgnoreCase(shuffled.get(i).back) == 0){
        System.out.println(Color.CYAN + "correct!");
        correct++;
      }
      else
        System.out.println("wrong, correct answer: " + shuffled.get(i).back);
    }

    System.out.println("\nResult:");
    System.out.println(correct + "/" + shuffled.size());
    float perc = correct * 100 / shuffled.size();
    System.out.println(perc + "%\n");

  }

}