using System;
namespace lab1;
public class Program{
  public static void Main(){
    int num1 = 0, num2 = 0;
    Console.WriteLine("Calculator 1.0");
    Console.WriteLine("--------------\n");

    while (true){
      int result = 0;
      Console.WriteLine("эхний тоогоо оруулна уу");
      num1 = Convert.ToInt32(Console.ReadLine());

      Console.WriteLine("үйлдлээ сонгоно уу");
      Console.WriteLine("\ta-Нэмэх");
      Console.WriteLine("\ts-Хасах");
      Console.WriteLine("\tm-үржүүлэх");
      Console.WriteLine("\td-хуваах");

      String op;
      while(true){
        op = Console.ReadLine();
        if(op != "a" && op != "s" && op != "m" && op != "d"){
          Console.WriteLine("дахин оруул");
          continue;
        }
        break;
      }

      Console.WriteLine("дараагийн тоогоо оруулна уу");
      num2 = Convert.ToInt32(Console.ReadLine());

      switch (op){
        case "a":
          try{
            op = "+";
            result = num1 + num2;
          }
          catch (ArithmeticException){
            Console.WriteLine("error");
          }
          break;
        case "s":
          try{
            op = "-";
            result = num1 - num2;
          }
          catch (ArithmeticException){
            Console.WriteLine("error");
          }
          break;
        case "m":
          try{
            op = "*";
            result = num1 * num2;
          }
          catch (ArithmeticException){
            Console.WriteLine("error");
          }
          break;
        case "d":
          try{
            op = "/";
            if(num2 == 0){
              Console.WriteLine("Тоог тэгт хувааж болохгүй");
              continue;
            }
            result = num1 / num2;
          }
          catch (ArithmeticException){
            Console.WriteLine("error");
          }
          break;
      }
      Console.WriteLine($"хариу: {num1} {op} {num2} = " + result);
      Console.WriteLine("дахин тоо бодох(y/n)");
      if(Console.ReadLine() == "n") break;
    }
  }
}