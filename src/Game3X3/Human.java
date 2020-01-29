

package Game3X3;
import java.util.Scanner;



public class Human extends Player{

  private String status ;


       public Human(){
           this.status = "draw";
       }

    @Override
     public void move(board newboard,int value) {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter your move in 3 X 3 matrix with i and j postion values of matrix");
            // System.out.println("follwed by 1 for player 1 and 2 for player 2");
             int i = sc.nextInt();
             int j = sc.nextInt();


            //need to check the validation of i j and value
                 // sc.close();

            if(newboard.isValid(newboard,i,j,value) ) {
                newboard.place(i,j,value);
                newboard.printboard(newboard.getgameboard());
                System.out.println("Do you want to undo  y/n");
                String undo = sc.next();
                if(undo.equals("y"))
                {
                    newboard.place(i,j,0);
                    newboard.printboard(newboard.getgameboard());
                    this.move(newboard,value);
                }


            }
             else {
                System.out.println("unexpected input try Again");
              this.move(newboard,value);
            }



     }

     public void setStatus(String status){
           this.status = status ;
     }

    public String getStatus()
    {
        return this.status;
    }

     public static int getRandomInteger(int maximum, int minimum){
         return ((int) (Math.random()*(maximum - minimum))) + minimum;
     }
 }
