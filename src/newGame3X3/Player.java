package newGame3X3;

import java.util.Scanner;

public class Player {


    private  String status ;

    public Player(){

        this.status = "draw ";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void move(Board board , int value)
    {


            Scanner sc = new Scanner(System.in);
            System.out.println("enter your move in 3 X 3 matrix row[1-3] col[1-3]");

            int i = sc.nextInt();
            int j = sc.nextInt();

            i--;
            j--;

            //need to check the validation of i j and value
            // sc.close();

            if(board.isValid(i,j,value) ) {
                board.place(i,j,value);
                board.printboard();
                System.out.println("Do you want to undo  y/n");
                String undo = sc.next();
                if(undo.equals("y"))
                {
                    board.place(i,j,0);
                    board.printboard();
                    this.move(board,value);
                }


            }
            else {
                System.out.println("unexpected input try Again");
                this.move(board,value);
            }




    }

}
