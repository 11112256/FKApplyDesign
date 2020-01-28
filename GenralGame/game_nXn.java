package GenralGame;

import Game3X3.Human;
import Game3X3.Player;
import Game3X3.board;
import Game3X3.game;

import java.util.Scanner;

public class game_nXn extends Player {

 private  int n ;
        private game nCrossn[][];




    public game_nXn(int n) {
         this.n = n ;
        nCrossn = new game[n][n];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                nCrossn[i][j] = new game(n,new Human(),new Human());

            }
       // print9X9();
    }
       public int getN()
       {
           return this.n ;
       }

        public game[][] getnCrossn() {
        return this.nCrossn;
    }

        public void run() {

        board check = new board(this.n);

        while (!check.isFull() ) {
            Scanner sc = new Scanner(System.in);


            System.out.println("please enter the board number that is the " +
                    "coordinate of the board you want to play");
            System.out.println("ranging form (0,0) to (" +this.n+","+this.n+")");
            int boardNumber_i = sc.nextInt();
            int boardNumber_j = sc.nextInt();
            //checking of the i and j
            if(boardNumber_i>=this.n|| boardNumber_j>=this.n|| boardNumber_i <0 ||boardNumber_j <0)
            {
                System.out.println("invalid input try again");
                this.run();
            }


            String option = "y";
            while (option.equals("y") &&  !nCrossn[boardNumber_i][boardNumber_j].getNewboard().isFull()
                    && check.getValueOfGameBoard(boardNumber_i,boardNumber_j)==0 && !this.checker(check)) {



                nCrossn[boardNumber_i][boardNumber_j].run();
                //  this.print9X9();
                if(nCrossn[boardNumber_i][boardNumber_j].getPlayer1().getStatus().equals("win")) {
                    check.place(boardNumber_i, boardNumber_j, 1);
                    break ;
                }

                else if(nCrossn[boardNumber_i][boardNumber_j].getPlayer2().getStatus().equals("win")) {

                    check.place(boardNumber_i, boardNumber_j, 2);
                    break ;
                }


                System.out.println("you want to continue or switch the board ");
                System.out.println("y/n");
                option = sc.next();
            }

            if(this.checker(check))
                break;

        }
        System.out.println("the 9 X 9 game is won by");
        this.checker(check);


    }




        public void print9X9()
        {


            StringBuilder st9X9 = new StringBuilder();

            for(int i =0 ; i< 3 ; i++) {
                for (int j = 0; j < 3; j++)
                {

                    st9X9.append(this.getnCrossn()[i][j].print3X3());
                    st9X9.append(System.getProperty("line.separator"));
                    //  st9X9.append("new");
                }

            }
            System.out.println(st9X9);

        }






    }








