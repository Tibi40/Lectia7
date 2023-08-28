package guessthenumber;

import java.util.Random;

public class GuessGame {

    public void startGame(){
            Random rand = new Random();
            int computerGeneratedNumber = rand.nextInt(0,9);//range-ul intre si intre
            System.out.println("computer generated number: " + computerGeneratedNumber);

            Player1 player1 = new Player1();//asa am facut legatura dintre clasa GuessGame
                                            //si clasa Player1 (prin intermediul obiectului Player1 in GuessGame;
            Player1 player2 = new Player1();
            Player1 player3 = new Player1();

            player1.setName("Tita");
            player2.setName("Elena");
            player3.setName("Tiberiu");

            int player1Guess = player1.getPlayerGuessNumber();
            int player2Guess = player2.getPlayerGuessNumber();
            int player3Guess = player3.getPlayerGuessNumber();

            boolean isGameon = true;

            while(isGameon) {

                if (player1Guess == computerGeneratedNumber) {
                    isGameon = false; //ca sa se opreasca bucla, s-a schimbat isGameon din true in false
                    System.out.println(player1.getName() + " is the winner");
                } else if (player2Guess == computerGeneratedNumber) {
                    isGameon = false;
                    System.out.println(player2.getName() + " is the winner");
                } else if (player3Guess == computerGeneratedNumber){
                    isGameon = false;
                    System.out.println(player3.getName() + " is the winner");
                }
            }
        }
}
