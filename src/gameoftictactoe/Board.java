/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoftictactoe;

/**
 *
 * @author Rokas
 */
public class Board {
    
    int step;
    private char[] signs = {'X', 'O'};
    private char[][] boardList;
    private String[] playersList;
    private int[] playersOrder;
    private int[][] choicedCoordQueue; // firstPlayerCoord, secondPlayerCoord, firstPlayerCoord, ...
    
    
    public Board() {
        this.playersList = new String[2];
        this.playersOrder = new int[2];
    }
        
    
    public void createBoard(int size) {
        this.step = 0;
        if (3 > size) {
            throw new IllegalArgumentException(">> Error!!! Board size can't be lower then 3, you select: " + size + "\n");
        }
        this.boardList = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.boardList[i][j] = ' ';
            }
        }
    }
    
    
    public void addPlayer(String name) {
        if ( null == name ) {
            throw new NullPointerException(">> addPlayer(), name can't be null! <<\n");
        }
        if ("".equals(name)) {
            throw new IllegalArgumentException(">> player name, can't be empty <<\n");
        }
        for (int i = 0; i < this.playersList.length; i++) {
            if (null == this.playersList[i]) {
                this.playersList[i] = name;
                break;
            } 
        }
        
    }
    
    public void addSign(int rowInd, int colInd) {
        if (null == this.boardList) {
            throw new NullPointerException(">> boardList isn't created! Sign can't be added! <<\n");
        } else if (0 > rowInd || this.boardList.length <= rowInd || 0 > colInd || this.boardList.length <= colInd) {
            throw new ArrayIndexOutOfBoundsException(">> Wrong index!!! Index out range. Try again... <<\n");
        } else if (this.boardList[rowInd][colInd] == 'X' || this.boardList[rowInd][colInd] == 'O') {
            throw new IllegalArgumentException(">> Wrong indexes, this element isn't empty! Try again... <<\n");
        } else {
            this.boardList[rowInd][colInd] = signs[this.step%2];
            //this.step++;
        }
    }
    
    public void addStep() {
        this.step++;
    }
      
    public void createOrderOfPriority() {
        if (null == this.playersList) {
            throw new NullPointerException(">> playersList isn't created! Order of priority can't be created! <<\n");
        } else if ("".equals(this.playersList[0]) || "".equals(this.playersList[1])) {
            throw new IllegalArgumentException(">> playersList isn't enough full <<\n");
        } else {
            boolean isTrue = Math.random() < 0.5;
            this.playersOrder[0] = isTrue ? 0 : 1; 
            this.playersOrder[1] = isTrue ? 1 : 0;
        }
    }
    
    public String getPlayer() {
        int playerIndex = playersOrder[step%2]; // zaidejo indeksas, pagal esama iteracija
        return playersList[playerIndex];
    } 
    
    public boolean isBoardFilled() { // must be before addStep() method;
        if (null == this.boardList) {
            throw new NullPointerException(">> boardList isn't created <<\n");
        } else if (step < this.boardList.length * 3 - 1) {
            return false;
        } else {
            System.out.println("Board is filled! DRAW!!!");
            return true;
        }
    }
    
    public boolean isSignSequece(int row, int col) {
        
        int vert = 0;
        int horiz = 0;
        int diagLeft = 0;
        int diagRight = 0;
        
        for (int i = -2; i <= 2; i++) {
            //System.out.println("seq: " + i);
//            if ( 0 <= row + i && this.boardList.length > row + i && 0 <= col + i && this.boardList.length > col + i) {
//            }
            
            if (0 <= row + i && this.boardList.length > row + i) {
                
                // vertical ( | )
                vert = this.signs[this.step%2] == this.boardList[row+i][col] ? ++vert : 0;
                if (3 == vert) {return true;}
                
                // diagonals
                if (0 <= col + i && this.boardList.length > col + i) {
                    // left diagonal ( \ )
                    //System.out.println("diag " + this.signs[this.step%2]);
                    diagLeft = this.signs[this.step%2] == this.boardList[row+i][col+i] ? ++diagLeft : 0;
                    //System.out.println("diagLeft: " +diagLeft);
                    if (3 == diagLeft) {return true;}
                }
                
                if (0 <= col - i && this.boardList.length > col - i) {
                    // right diagonal ( / )
                    diagRight = this.signs[this.step%2] == this.boardList[row+i][col-i] ? ++diagRight : 0;
                    if (3 == diagRight) {return true;}
                }
                
            }
            
            // horizontal ( - )
            if (0 <= col + i && this.boardList.length > col + i) {
                horiz = this.signs[this.step%2] == this.boardList[row][col+i] ? ++horiz : 0;
                if (3 == horiz) {return true;}
            }
            
        }
        return false;
    }
        
    public void printBoard() {
        if (null == this.boardList) {
            throw new NullPointerException(">> Board isn't credted! <<");
        } else {
            
            // *2+1 - nes braizome lentele
            // eiluciu yra +2, o ne +1, nes 0 eilute skirta suzymeti stulpeliams, zymeti eilutems nekuriam papildomo stulpelio
            // kas atroje eiluteje dedame remeli ("+" arba "-" arba "|"), i kas antra irasom pasirinktas zenklas ("X" arba "O")
            for (int i = 0; i < this.boardList.length * 2 + 2; i++) {
                for (int j = 0; j < this.boardList.length * 2 + 1; j++) {
                    
                    if (1 == i%2) {
                        if (0 == j) {System.out.print("  ");} // pastumiame groteliu horizontales (->), nes remelis pasistumia del eiluciu numeracijos
                        System.out.print(0 == j%2 ? " + " : " - "); // groteliu horizontaliu braizymas
                    } else {
                        if (0 == i && 0 == j) {System.out.print("  ");} // eiluciu numeracija, kad nezymetu 0 eilutes
                        if (0 < i && 0 == j) {System.out.print( (i/2 - 1) + " " );} // eiluciu numeracija
                        if (0 == i) {
                            System.out.print(0 == j%2 ? "   " : " " + j/2 + " "); // stulpeliu numeracija, 
                        } else {
                            System.out.print(0 == j%2 ? " | " : " " + this.boardList[(i-1)/2][j/2] + " "); // groteliu vertikaliu liniju ir zaideju priskirtu simboliu ("X" arba "O"), jei tuscia (" ") braizymas
                        }
                    }
                }
                System.out.println("");
            }
            
        }
    }
    
    
    public void printPlayer() {
        int playerIndex = playersOrder[step%2]; // zaidejo indeksas, kurio eile pazymeti savo simboli
        System.out.println("player: " + playersList[playerIndex] + "(" + signs[step%2] + ")");
    }
    
    public void printPlayersSigns() {
        if (null == this.playersList) {
            throw new NullPointerException(">> PlayrsList isn't created! <<");
        }
        System.out.println("Players:");
        System.out.println("> " + signs[0] + " - " +  this.playersList[this.playersOrder[0]]);
        System.out.println("> " + signs[1] + " - " +  this.playersList[this.playersOrder[1]]);
        System.out.println("");
    }
    
    
}
