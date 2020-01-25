import java.util.Scanner;

public class Computer extends Player {

    @Override
    public void move(board newboard,int value) {
       //
      //  Same as Human but with some extra logic

        {
            System.out.println("enter your move in 3 X 3 matrix with i and j values of matrix");
            System.out.println(" by 1 for player 1 and 2 for player 2");
                  int i=-1 , j=-1 ;
               for(int i_new =0 ;i_new < newboard.gameboard.length ;i_new++) {
                   for (int j_new = 0; j_new < newboard.gameboard.length; j_new++)
                       if (newboard.gameboard[i_new][j_new] == 0) {
                           i = i_new;
                           j = j_new;
                           break;
                       }
                   if(i!=-1)
                       break ;
               }
            //need to check the validation of i j and value
            // sc.close();
            System.out.println(i+" "+ j);

                newboard.place(i,j,value);
                newboard.printboard(newboard.gameboard);






        }

    }
}
