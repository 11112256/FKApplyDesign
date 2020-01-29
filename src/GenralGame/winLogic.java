package GenralGame;


import Game3X3.Human;
import Game3X3.Player;
import Game3X3.board;
import Game3X3.game;
public class winLogic {

     private board b ;
     private String winner ;
    public winLogic(board b)
    {
      this.b = b;
      this.winner ="";
    }

    public board getBoard() {
        return this.b;
    }

    public boolean whowins(board b )
    {
         int n = b.getgameboard().length;
         //int m = n;
         if(n!=3){
             int d=n/3;
             int temp [][] = new int[d][d];

         }


        return  true ;
    }

    public int check3X3(board b,int initial_i, int intial_j,int final_i,int final_j)
    {
       return 0;
    }


    public String getWinner()
    {
        return this.winner;
    }


}
