/*
 */
package gameoftictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rokas
 */
public class GameOfTicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <String> winnerList = new ArrayList();

        Scanner sc = new Scanner(System.in);

        Board b = new Board();
        
        int gameRound = 0;

        while (true) {
            try {
                System.out.println("first player name: ");
                String name1 = sc.nextLine();
                b.addPlayer(name1);
                break;
            } catch (RuntimeException rte) {
                System.out.println(rte.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("second player name: ");
                String name2 = sc.nextLine();
                b.addPlayer(name2);
                break;
            } catch (RuntimeException rte) {
                System.out.println(rte.getMessage());
            }
        }
        
        
        boolean isNextRound;
        
        do { // game round
            
            System.out.println("");
            b.createOrderOfPriority(); // assignment of "X" and "O"
            b.printPlayersSigns();

            while (true) {
                try {
                    System.out.println("Select the board size: > \n0 - 3x3 \n1 - 9x9");
                    String selectionStr = sc.nextLine();
                    int selectionInt = Integer.parseInt(selectionStr);
                    if (0 == selectionInt || 1 == selectionInt) {
                        int size = 0 == selectionInt ? 3 : 9;
                        b.createBoard(size);
                        break;
                    } else {System.out.println(">> try again!!! <<\n");}
                } catch (NumberFormatException nfe) {
                    System.out.println(">> Try again! It isn't a number<<\n");
                } catch (RuntimeException rte) {
                    System.out.println(rte.getMessage());
                }
            }

            System.out.println(">--------------------------------------------------------<");
            b.printBoard();
            System.out.println(">--------------------------------------------------------<");

            while (true) {

                try {
                    System.out.println("Coordinates inputs");
                    b.printPlayer();
                    System.out.println("row index: ");
                    String row = sc.nextLine();
                    System.out.println("column index: ");
                    String col = sc.nextLine();

                    b.addSign(Integer.parseInt(row), Integer.parseInt(col));
                    b.printBoard();

                    if (b.isSignSequece(Integer.parseInt(row), Integer.parseInt(col))) {
                        System.out.println(">--------------------------------------------------------<");
                        winnerList.add(gameRound, b.getPlayer());
                        System.out.println("WIN!");
                        b.printPlayer();
                        break;
                    }

                    System.out.println(">--------------------------------------------------------<");
                    
                    if ( b.isBoardFilled() ) {
                        winnerList.add(gameRound, "DRAW");
                        System.out.println("");
                        break;
                    }

                    b.addStep();
                    
                } catch (NumberFormatException nfe) {
                    //System.out.println("----------------------------------------------------");
                    System.out.println(">> Wrong input!!! Row or column indexes are numbers! Try again... <<\n");
                } catch (RuntimeException rte) {
                    System.out.println(rte.getMessage());
                }

            }
            
            
            while (true) {
                System.out.println("We will play a new round? (y - YES, n - NO)");
                String nextRound = sc.nextLine();
                if ( "y".equals(nextRound) || "n".equals(nextRound) ) {
                    if ( "y".equals(nextRound) ) {
                        isNextRound = true;
                        gameRound++;
                    } else {
                        isNextRound = false;
                    }
                    break;
                } else {
                    System.out.println("Try again!, you have not selected 'y' or 'n' symbols...");
                }
            }
            
        } while (isNextRound); // game round end

    }

}
