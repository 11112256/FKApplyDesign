package newGame9X9;

import newGame3X3.* ;

import java.util.Scanner;

public class Controller {



    private newGame3X3.Controller ThreeCrossThree [][] ;
   private Player player1;
   private Player player2;
   private Board chart;

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

    public newGame3X3.Controller[][] getThreeCrossThree() {
        return ThreeCrossThree;
    }

    public void setThreeCrossThree(newGame3X3.Controller[][] ThreeCrossThree) {
        this.ThreeCrossThree = ThreeCrossThree;
    }

    public Controller(int n,Player player1 , Player player2)
  {

      System.out.println();
      this.ThreeCrossThree= new newGame3X3.Controller[n][n] ;
      this.player1 = player1 ;
      this.player2 = player2 ;
      this.chart = new Board(3);

      for (int i = 0; i < n; i++)
          for (int j = 0; j < n; j++) {
              ThreeCrossThree[i][j] = new newGame3X3.Controller(n,new Player(),new Player());

          }





  }





   public void run() {

       System.out.println("run");
       while (!chart.isFull()) {
           System.out.println("enter the game no you want to play in 9 x 9 ");
           System.out.println("row[1-3],col[1-3]");
           Scanner sc = new Scanner(System.in);


           int boardNumber_i = sc.nextInt();
           int boardNumber_j = sc.nextInt();

           boardNumber_i--;
           boardNumber_j--;
           if (boardNumber_i >= 9 || boardNumber_j >= 9 || boardNumber_i < 0 || boardNumber_j < 0) {
               System.out.println("invalid input try again");
               this.run();
           }

           String option = "y";

           while (option.equals("y") && !ThreeCrossThree[boardNumber_i][boardNumber_j].getBoard().isFull()
                   && chart.getValueOfGameBoard(boardNumber_i, boardNumber_j) == 0 && chart.whowins() < 0) {

               ThreeCrossThree[boardNumber_i][boardNumber_j].run();

               if (ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer1().getStatus().equals("win")) {
                   chart.place(boardNumber_i, boardNumber_j, 1);
                   break;
               } else if (ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer2().getStatus().equals("win")) {

                   chart.place(boardNumber_i, boardNumber_j, 2);
                   break;
               }


               System.out.println("you want to continue or switch the board ");
               System.out.println("y/n");
               option = sc.next();


           }

           System.out.println("###############Leaderboard#############");
             Leaderboard lb = new Leaderboard();
             lb.leaderBoard(chart);

           if (this.chart.whowins() > 0)
               break;


       }

       if(chart.whowins()==1) {
           player1.setStatus("win");
           player2.setStatus("loss");
       }
       if(chart.whowins()==2) {
           player2.setStatus("win");
             player2.setStatus("loss");
       }

       System.out.println("the 9 X 9 game is won by");
       System.out.println("player 1 "+ player1.getStatus() + " and "+ "player 2 "+ player2.getStatus());



   }





}
