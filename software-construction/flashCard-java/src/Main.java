package src;
import java.util.Scanner;

import src.Deck;

public class Main{
  public static void main(String[] args){
    Deck ob = new Deck();
    System.out.println(ob);
    Scanner sca = new Scanner(System.in);
    System.out.println("1. hola");
    System.out.println("2. hola");
    System.out.println("3. hola");
    int input = sca.nextInt();
    if(input == 1){
      System.out.println("\u001B[32m");
      System.out.println("asdfasdfasd");
    }
    sca.close();
  }
}