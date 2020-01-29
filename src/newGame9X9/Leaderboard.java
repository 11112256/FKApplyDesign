package newGame9X9;

import newGame3X3.Board;

public class Leaderboard {


    public void leaderBoard(Board board)
    {
        int player1_wins =0;
        int player2_wins =0 ;
        int player1_loss =0;
        int player2_loss=0 ;
        for(int i = 0 ; i< board.getgameboard().length ; i++)
        {
            for(int j =0 ; j<board.getgameboard().length ; j++)
            {

                if(board.getValueOfGameBoard(i,j)==1)
                {
                    player1_wins++;
                    player2_loss++;
                }
                else if(board.getValueOfGameBoard(i,j)==2){
                    player2_wins++;
                    player1_loss++;
                }
            }
        }


        System.out.println( " Player 1 Wins " +player1_wins + " Player 1 loss " + player1_loss);
        System.out.println( " Player 2 Wins " +player2_wins + " Player 2 loss " + player2_loss);

    }

}
