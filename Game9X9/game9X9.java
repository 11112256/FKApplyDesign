package Game9X9;

import Game3X3.* ;

import java.util.Scanner;

public class game9X9 extends  Player{

    private game ThreeCrossThree[][];




    public game9X9() {

        ThreeCrossThree = new game[3][3];


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                ThreeCrossThree[i][j] = new game(3,new Human(),new Human());

            }
        print9X9();
    }

    public game[][] getThreeCrossThree() {
        return this.ThreeCrossThree;
    }

    public void run() {

         board check = new board(3);

        while (!check.isFull() ) {
            Scanner sc = new Scanner(System.in);


            System.out.println("please enter the board number that is the " +
                    "coordinate of the board you want to play");
            System.out.println("ranging form (0,0) to (2,2)");
            int boardNumber_i = sc.nextInt();
            int boardNumber_j = sc.nextInt();
            //checking of the i and j
             if(boardNumber_i>=9 || boardNumber_j>=9 || boardNumber_i <0 ||boardNumber_j <0)
             {
                 System.out.println("invalid input try again");
                 this.run();
             }


            String option = "y";
            while (option.equals("y") &&  !ThreeCrossThree[boardNumber_i][boardNumber_j].getNewboard().isFull()
                    && check.getValueOfGameBoard(boardNumber_i,boardNumber_j)==0 && !this.checker(check)) {



                ThreeCrossThree[boardNumber_i][boardNumber_j].run();
                //  this.print9X9();
                  if(ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer1().getStatus().equals("win")) {
                      check.place(boardNumber_i, boardNumber_j, 1);
                        break ;
                  }

                  else if(ThreeCrossThree[boardNumber_i][boardNumber_j].getPlayer2().getStatus().equals("win")) {

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

                st9X9.append(this.getThreeCrossThree()[i][j].print3X3());
                st9X9.append(System.getProperty("line.separator"));
              //  st9X9.append("new");
            }

            }
         System.out.println(st9X9);

        }






}

