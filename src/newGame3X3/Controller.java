package newGame3X3;

//import Game3X3.Human;

public class Controller {

    private  Board board;

    private Player player1 ;
    private Player player2 ;

    public Controller(int n, Player player1,Player player2)
    {
        this.board = new Board(n);
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


            while(!board.isFull()){

                player1.move(board,1);
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

                player2.move(board,2);
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
