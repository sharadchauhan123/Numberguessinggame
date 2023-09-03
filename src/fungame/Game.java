package fungame;

import java.util.Random;

class Game {
     int computer;
     public Game(){
         Random rand = new Random();
         computer = rand.nextInt(100);
         System.out.println("Guess the Number Form  1 to 100");
     }
     public int computerNo(){
         return computer;
     }
}
