package newGame3X3;

//import Game3X3.board;

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

            Cell cell =new Cell(this.gameBoard);
            return cell.cellChecker();







    }












}
