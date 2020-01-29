package newGame3X3;

import Game3X3.board;

public class Board {

    private int gameBoard[][] ;

    public Board(int n)
    {
        this.gameBoard = new int[n][n];
    }

    public int[][] getgameboard()
    {
        return this.gameBoard ;
    }

    public void setGameBoard(int[][] gameBoard){
        this.gameBoard = gameBoard ;
    }
    public int getValueOfGameBoard(int i , int j){
        return  this.getgameboard()[i][j];
    }




    public void printboard(){

        StringBuilder st = new StringBuilder();



        for(int i =0 ; i < this.gameBoard.length ; i++) {
            for (int j = 0; j < this.gameBoard.length; j++) {

                st.append(this.getValueOfGameBoard(i,j));
            }
            st.append("\n");

        }
        System.out.println(st.toString());

    }



    public boolean isFull()
    {
        int count =0;
        for(int i = 0; i< this.gameBoard.length; i++)
            for(int j = 0; j< this.gameBoard.length; j++)
                if(this.gameBoard[i][j]==0)
                    return false;

        return true ;
    }


    public void place(int i,int j,int value)
    {
        this.gameBoard[i][j] = value ;
    }

    public boolean isValid( int i , int j , int value){

           if( this.gameBoard[i][j] != 0  || i<0 || j >=this.gameBoard.length)
            return false;


        return true ;
    }




    public int whowins()
    {
        if(this.gameBoard.length==3)
        {
            Cell cell =new Cell(this.gameBoard);
            return cell.cellChecker();
        }
        // need to implment


       else{

           int n = this.gameBoard.length;
           int j=3 ;
           for(int i = 0 ;i < n ;i+=3){

               

           }




        }



       return -2;
    }

    public int whoWins3X3(int ar[][], int i , int j)
    {
        int n =ar.length ;
        int new_ar[][] = new int[3][3];
        int it=0;
        int jt=0;
        for(int i_new = i ; i_new< i+3 ;i_new++)
        {
            for(int j_new =j;j_new <j+3 ; j_new++){
                new_ar[it++][jt++]=ar[i_new][j_new];
            }


        }
        Cell cell =new Cell(new_ar);
        return cell.cellChecker();

    }


}
