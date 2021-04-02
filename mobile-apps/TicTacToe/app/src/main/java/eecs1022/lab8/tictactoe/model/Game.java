package eecs1022.lab8.tictactoe.model;

public class Game {
    boolean gameOver=false;
    int firstPlayer=0;
    boolean tie=false;
    boolean win=false;
    String status = "";
    String x = "";
    String o = "";
    int turn = 0;
    char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };


    public Game(String x, String o) {
        this.x = x;
        this.o = o;
    }

    public String getCurrentPlayer() {
        String player=null;


    if(gameOver==true){
       player=null;
     }

    else if (firstPlayer == 0) {

        if (this.turn % 2 == 0) {
            player = x;
        } else {
            player = o;

        }
    }

    else if (firstPlayer == 1) {
        if (this.turn % 2 == 0) {

            player = o;
        } else {

            player = x;
        }
    }
    if (status.equals("")) {
        status = player + "'s turn to play...";

    }
        return player;
    }



    public String getStatus() {
       return status;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setWhoPlaysFirst(char player) {
        if(player=='x'){
            firstPlayer=0;
        }
        if(player=='o'){
            firstPlayer=1;
        }
    }

    public void move(int row, int column) {

        if(gameOver&&win){
            status="Error: game is already over with a winner.";
        }
        if(gameOver&& tie){
            status="Error: game is already over with a tie.";
        }

        if (!gameOver) {
         if (row < 1 || row > 3) {
                status = "Error: row " + row + " is invalid.";
            } else if (column < 1 || column > 3) {
                status = "Error: col " + column + " is invalid.";
            } else if (row > 0 && row < 4 && column > 0 && column < 4 && !gameOver) {
                if (board[row - 1][column - 1] == 'x' || board[row - 1][column - 1] == 'o') {
                    status = "Error: slot @ (" + row + ", " + column + ") is already occupied.";
                }
                if (board[row - 1][column - 1] == '_') {
                    String current = getCurrentPlayer();
                    if (current.equals(x)) {
                        board[row - 1][column - 1] = 'x';
                        status = o + "'s turn to play...";
                    }
                    if (current.equals(o)) {
                        board[row - 1][column - 1] = 'o';
                        status = x + "'s turn to play...";
                    }
                    turn++;
                }
            }
         checkWin();
         checkTie();
        }
    }

    public boolean checkWin(){
        boolean over=false;
        String winner="";
        if(board[0][0]=='x'&&board[1][0]=='x'&&board[2][0]=='x'){
           winner=x;
        }
        else if(board[0][0]=='o'&&board[1][0]=='o'&&board[2][0]=='o'){
            winner=o;
        }
        else if(board[0][1]=='x'&&board[1][1]=='x'&&board[2][1]=='x'){
            winner=x;
        }
        else if(board[0][1]=='o'&&board[1][1]=='o'&&board[2][1]=='o'){
            winner=o;
        }
        else if(board[0][2]=='x'&&board[1][2]=='x'&&board[2][2]=='x'){
            winner=x;
        }
        else if(board[0][2]=='o'&&board[1][2]=='o'&&board[2][2]=='o'){
            winner=o;
        }
        else if(board[0][0]=='x'&&board[0][1]=='x'&&board[0][2]=='x'){
            winner=x;
        }
        else if(board[0][0]=='o'&&board[0][1]=='o'&&board[0][2]=='o'){
            winner=o;
        }
        else if(board[1][0]=='x'&&board[1][1]=='x'&&board[1][2]=='x'){
            winner=x;
        }
        else if(board[1][0]=='o'&&board[1][1]=='o'&&board[1][2]=='o'){
            winner=o;
        }
        else if(board[2][0]=='x'&&board[2][1]=='x'&&board[2][2]=='x'){
            winner=x;
        }
        else if(board[2][0]=='o'&&board[2][1]=='o'&&board[2][2]=='o'){
            winner=o;
        }
        else if(board[0][0]=='x'&&board[1][1]=='x'&&board[2][2]=='x'){
            winner=x;
        }
        else if(board[0][0]=='o'&&board[1][1]=='o'&&board[2][2]=='o'){
            winner=o;
        }


        if(winner.equals(x)||winner.equals(o)){
            status="Game is over with "+winner+" being the winner.";
            over=true;
            gameOver=true;
            win=true;
        }
        else{
            over=false;
        }
        return over;
    }

    public boolean checkTie(){
        boolean isFilled=true;
        boolean isTie = false;
        for(int i =0;i <board.length;i++){
            for(int j =0; j <board.length;j++){
                if(board[i][j]=='_'){
                   isFilled=false;
                   break;
                }
            }
        }
        if(isFilled&&checkWin()==false){
            isTie=true;
            gameOver=true;
            tie=true;
            status="Game is over with a tie between "+x+" and "+o+".";
        }
        return isTie;
    }
}
