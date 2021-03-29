package eecs1022.lab8.tictactoe.model;

public class Game {
    char firstPlayer = 'x';
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
        String player="";
        if (firstPlayer == 'x') {

            if (this.turn % 2 == 0) {
                status = x + "'s turn to play...";
                player=x;
            } else {
                status = o + "'s turn to play...";
                player=o;

            }

        }
        if (firstPlayer == 'o') {


            if (this.turn % 2 == 0) {
                status = o + "'s turn to play...";
                player= o;
            } else {
                status = x + "'s turn to play...";
                player= x;

            }
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
        this.firstPlayer=player;

    }
}
