import java.util.Scanner;

public class Human extends Player{



    @Override
     public void move(board newboard,int value) {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter your move in 3 X 3 matrix with i and j values of matrix");
             System.out.println("follwed by 1 for player 1 and 2 for player 2");
             int i = sc.nextInt();
             int j = sc.nextInt();


            //need to check the validation of i j and value
                 // sc.close();

            if(newboard.isValid(newboard,i,j,value) ) {
                newboard.place(i,j,value);
                newboard.printboard(newboard.gameboard);

            }
             else {
                System.out.println("unexpected input");
              this.move(newboard,value);
            }



     }


     public static int getRandomInteger(int maximum, int minimum){
         return ((int) (Math.random()*(maximum - minimum))) + minimum;
     }
 }
