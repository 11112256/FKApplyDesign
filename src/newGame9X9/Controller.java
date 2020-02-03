package newGame9X9;

import newGame3X3.* ;

import java.util.Scanner;

public class Controller {



    public enum MOVE {

        PLAYER_1_MOVE(1), PLAYER_2_MOVE(2)   ;
        private int value;

        private MOVE(int value) {
            this.value = value;
        }
    };


    private newGame3X3.Controller ThreeCrossThree [][] ;
   private Player player1;
   private Player player2;
   private Board chart;
   private  int dimension ;

    public Board getChart() {
        return chart;
    }

    public void setChart(Board chart) {
        this.chart = chart;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
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

    public newGame3X3.Controller[][] getThreeCrossThree() {
        return ThreeCrossThree;
    }

    public void setThreeCrossThree(newGame3X3.Controller[][] ThreeCrossThree) {
        this.ThreeCrossThree = ThreeCrossThree;
    }

    public Controller(int n,Player player1 , Player player2)
  {

      System.out.println();
      this.ThreeCrossThree= new newGame3X3.Controller[n/3][n/3] ;
      this.player1 = player1 ;
      this.player2 = player2 ;
      this.dimension = n;
      this.chart = new Board(n/3);

      for (int i = 0; i < dimension /3; i++)
          for (int j = 0; j < dimension /3; j++) {
              ThreeCrossThree[i][j] = new newGame3X3.Controller( new Player(),new Player());

          }





  }





   public void run() {

     //  System.out.println("run");
       while (!chart.isFull()) {
           System.out.println("enter the game no. you want to play in " + dimension/3 + "X" + dimension/3 );
           System.out.println("row[1-" + dimension/3 +"],col[1-" + dimension/3+ "]");
           Scanner sc = new Scanner(System.in);
       //    System.out.println("You Have " + dimension + " games");

           int boardNumber_i = sc.nextInt();
           int boardNumber_j = sc.nextInt();

           boardNumber_i--;
           boardNumber_j--;
           if (boardNumber_i >= dimension/3 || boardNumber_j >= dimension/3 || boardNumber_i < 0 || boardNumber_j < 0) {
               System.out.println("invalid input try again");
               this.run();
           }

           String option = "y";

           while (option.equals("y") && !ThreeCrossThree[boardNumber_i][boardNumber_j].getBoard().isFull()
                   && chart.getValueOfGameBoard(boardNumber_i, boardNumber_j) == 0 && chart.whowins() < 0) {

               ThreeCrossThree[boardNumber_i][boardNumber_j].run();

               if (ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer1().getStatus().equals("win")) {
                   chart.place(boardNumber_i, boardNumber_j, MOVE.PLAYER_1_MOVE.value);
                   break;
               } else if (ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer2().getStatus().equals("win")) {

                   chart.place(boardNumber_i, boardNumber_j, MOVE.PLAYER_2_MOVE.value);
                   break;
               }


         //      System.out.println("you want to continue or switch the board ");
         //      System.out.println("y/n");
          //     option = sc.next();


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

       System.out.println("the "+dimension +" X " + dimension +" game is won by");
       System.out.println("player 1 "+ player1.getStatus() + " and "+ "player 2 "+ player2.getStatus());



   }





}
