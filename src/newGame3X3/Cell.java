package newGame3X3;

public class Cell {

    private int cell[][];
    public Cell(int [][] cell )
    {
        this.cell =cell ;
    }

    public void print() {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                System.out.print(this.cell[i][j]);
            }
            System.out.println();
        }
    }
       public int cellChecker()
        {
              // return 1 for player 1 winning
              // return 2 for player 2 winning
             // return -1 for no one winning

                for(int i =0 ; i < this.cell.length ; i++){

                    if(this.cell[i][0]!=0 && (this.cell[i][0]==this.cell[i][1]) && (this.cell[i][2]==this.cell[i][0]))
                    {
                        if(this.cell[i][0]==1)
                            return 1;
                        else
                        return 2;
                    }
                }
                for(int j =0 ; j< this.cell.length ; j++){
                    if(this.cell[0][j]!=0 && (this.cell[0][j]==this.cell[1][j]) && (this.cell[2][j]==this.cell[0][j]))
                    {
                        if(this.cell[0][j]==1)
                           return 1;
                        else
                            return 2 ;

                    }
                }
                if(this.cell[0][0]!=0 && (this.cell[0][0]==this.cell[1][1]) && (this.cell[2][2]==this.cell[0][0]))
                {
                    if(this.cell[0][0]==1)
                        return 1;
                    else
                    return 2;
                }
                if(this.cell[0][2]!=0 && (this.cell[0][2]==this.cell[1][1]) && (this.cell[2][0]==this.cell[0][2]))
                {
                    if(this.cell[0][2]==1)
                       return 1;
                    else
                    return 2;
                }

                return  -1;


        }


}
