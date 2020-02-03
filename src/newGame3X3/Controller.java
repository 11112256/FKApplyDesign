package newGame3X3;

//import Game3X3.Human;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Controller {

    public enum MOVE {

        PLAYER_1_MOVE(1), PLAYER_2_MOVE(2)   ;
        private int value;

        private MOVE(int value) {
            this.value = value;
        }
    };

    public enum NUMBER{
                THREE(3),
                FOUR(4);
        private int value;
       private NUMBER(int value)
       {
           this.value = value ;
       }
    };

    private  Board board;

    private Player player1 ;
    private Player player2 ;

    public Controller( Player player1,Player player2)
    {
        System.out.println("Enter the dimension of the single cell ");
        System.out.println("example : 3 for 3X3 , 4 for 4X4");
        Scanner sc = new Scanner(System.in);

        int cell_size =sc.nextInt();
        NUMBER.FOUR.value =cell_size;
   //      NUMBER basic_cell_dimension = new NUMBER(4);
        this.board = new Board(NUMBER.FOUR.value);
        this.player1= player1 ;
        this.player2 = player2 ;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Board getBoard() {
        return this.board;
    }

    public void run()
    {
             board.printboard();


            while(!board.isFull()) {

                player1.move ( board , MOVE.PLAYER_1_MOVE.value ) ;
                if( board.whowins() >0 ) {
                    player1.setStatus("win");
                    player2.setStatus("loss");

                    break;
                }
                if(board.isFull()) {
                    player1.setStatus("draw");
                    player2.setStatus("draw");
                    System.out.println("match is draw");
                    break;
                }

                player2.move ( board , MOVE.PLAYER_2_MOVE.value );
                if(board.whowins() >0 )
                {
                    player2.setStatus("win");
                    player1.setStatus("loss");
                    break;
                }
              //  return;
            }

        System.out.println("Player 1 " + player1.getStatus() +" and "+ "Player 2 " + player2.getStatus());


    }//




}
