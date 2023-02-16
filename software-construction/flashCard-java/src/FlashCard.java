package src;

public class FlashCard {

  Deck deck = new Deck();

  void mainLoop(){
    FileHandler.createFile();
    FileHandler.loadDeck(deck);
    for(;;){
      printMenu();
      takeChoice();
    }
  }

  void printMenu(){
    System.out.print(Color.WHITE + Color.BOLD);
    System.out.println("1. add card");
    System.out.println("2. study");
    System.out.println("3. see cards");
    System.out.println("4. delete card");
    System.out.println("5. exit");
  }

  void takeChoice(){
    try {
      System.out.print(Color.CYAN + "> " + Color.YELLOW);
      int input = Integer.parseInt(Main.sca.nextLine());
      switch (input) {
        case 1:
          deck.addCardChoice();
          break;
        case 2:
          deck.study();
          break;
        case 3:
          deck.printCards();
          break;
        case 4:
          // deck.deleteCardChoice();
          break;
        case 5:
          this.terminate();
        default:
          break;
      }
    } catch (Exception e) {
      System.out.println("enter valid input");
    }
  }

  void terminate(){
    System.out.println("see ya");
    Main.sca.close();
    System.exit(0);
  }

}