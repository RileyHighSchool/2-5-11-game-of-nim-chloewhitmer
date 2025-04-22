import java.util.Scanner;
public class Game {
    
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(){
        player1 = new Player();
        player2 = new Player();
     
    }

   //work on this it is not working correctly
    public void setFirstPlayer(){
        
    if (Math.random() > .5 ){
      currentPlayer = player1;
    } else{
      currentPlayer = player2;
    }
    
    }

    
    public void switchPlayer(){
        if (currentPlayer.equals(player1)){
          currentPlayer = player2;
          
        } else {
          currentPlayer = player1;
          
        }
        System.out.println("Your turn, " + currentPlayer.getName());
    }

    public void play(){
//try to get the loop done
      setFirstPlayer();
      System.out.println();
      System.out.println("Your turn, " + currentPlayer.getName());

      while (Board.getPileSize() > 1){
        Board.displayPileSize();
        Board.takePieces();
        switchPlayer();
    } 
    endGame();
        
    }

    public void endGame(){
      if (player1.equals(currentPlayer)){
          System.out.println("Congratulations " + player2.getName() + " you win!");
          player2.updateScore(1);
        } else {
          System.out.println("Congratulations " + player1.getName() + " you win!");
          player1.updateScore(1);
        } 

        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play again? Y or N");
        String answer = input.nextLine();
        if (answer.equals("Y")){
          Board.populate();
          play();
        } 

       
  }
  

}
