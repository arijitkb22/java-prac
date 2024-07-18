package Beer;

import java.util.Scanner;

public class Beer {
  public static void main(String[] args) {
    int availableBeer = 99;
    Integer answer=0;
    System.out.println("Available beer : "+availableBeer);
    while(availableBeer>0){
      System.out.println("How Many beer you want");
      Scanner sc = new Scanner(System.in);
      answer = Integer.parseInt(sc.nextLine());
      if (answer>availableBeer) {
        System.out.println("We dont have "+answer+" beer, we are having "+availableBeer+" beer");
        continue;
      }
      
      availableBeer= availableBeer-answer;
      availableBeer--;
      if (availableBeer == 1) {
        System.out.println("Only one beer available");
      } else{
        System.out.println("Available beer : "+availableBeer);
      }
    }
    if(availableBeer==0){
      System.out.println("No beer available");
    }
  }
}
