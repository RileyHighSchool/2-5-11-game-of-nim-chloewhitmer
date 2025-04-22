
import java.util.Scanner;


public class Board {
    
private static int pileSize;

public static int getPileSize(){
    return pileSize;
}

public static void populate(){
    int randomInt = (int) ((Math.random() * 40) + 10);    
    pileSize = randomInt;
}

public static void displayPileSize(){
    System.out.println(pileSize);
}

public static void takePieces(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many pieces do you want?");
    int pieces = sc.nextInt();

    while (pieces > pileSize/2 || pieces < 1) {
        System.out.println("You have to to take at least 1 and less then half the pile size, Try Again.");
        pieces = sc.nextInt();
    }
    
    pileSize -= pieces;

}




}


