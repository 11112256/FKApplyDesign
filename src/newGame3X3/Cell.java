package newGame3X3;

public class Cell {

    public enum PLAYER {

        PLAYER_1(1), PLAYER_2(2)  , DRAW(-1) ;
        private int value;

        private PLAYER(int value) {
            this.value = value;
        }
    };
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



                    int game_status =this.cell[i][0] ;
                    // Have to check overflow
                    int sum = 0 ;
                    for (int j = 0 ; j < this.cell.length ; j++){

                        if(this.cell[i][j] !=0 && this.cell[i][j] == game_status)
                            sum++;
                        else
                            break;

                    }


                    if(sum == this.cell.length)
                        if(this.cell[i][0]==1)
                            return PLAYER.PLAYER_1.value;
                        else
                            return PLAYER.PLAYER_2.value;


                }



                for(int j =0 ; j< this.cell.length ; j++){

                    int game_status =this.cell[0][j] ;
                    // Have to check overflow
                    int sum = 0 ;

                    for (int i = 0 ; i < this.cell.length ; i++){

                        if(this.cell[i][j] !=0 && this.cell[i][j] == game_status)
                            sum++;
                        else
                            break;

                    }


                    if(sum == this.cell.length)
                        if(this.cell[0][j]==1)
                            return PLAYER.PLAYER_1.value;
                        else
                            return PLAYER.PLAYER_2.value;


                }

                     int sum = 0 ;

                for(int i = 0 ; i < this.cell.length ; i++){


                        int game_status =this.cell[0][0] ;
                        // Have to check overflow
                    if(this.cell[i][i] == game_status && this.cell[i][i]!=0)
                        sum++;
                    else
                        break;




                }

            if(sum == this.cell.length)
                if(this.cell[0][0]==1)
                    return PLAYER.PLAYER_1.value;
                else
                    return PLAYER.PLAYER_2.value;



                sum =0;

            for(int i = this.cell.length -1 ; i >0 ; i--){


                int game_status =this.cell[this.cell.length-1][this.cell.length-1] ;
                // Have to check overflow
                if(this.cell[i][i] == game_status && this.cell[i][i]!=0)
                    sum++;
                else
                    break;




            }

            if(sum == this.cell.length)
                if(this.cell[0][0]==1)
                    return PLAYER.PLAYER_1.value;
                else
                    return PLAYER.PLAYER_2.value;











                return  PLAYER.DRAW.value;


        }


}
