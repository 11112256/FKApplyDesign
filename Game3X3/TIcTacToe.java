package Game3X3;



import java.util.Scanner;


public class TIcTacToe {


    public static void main(String args[]){


  // for 3X3
       game g = new game(3,new Human(),new Human());

        System.out.println("press 1 for Human to Human ");
        System.out.println("press 2 for Human to Computer");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        Human h1= new Human();
        Human h2 = new Human();
        Computer h3 = new Computer();

        if(n==1)
            g.run();
        if(n==2)
            System.out.println();
             g.run(h1,h3);
        if(n!=1 && n!=2)
            System.out.println("Invalied input ");



       //



    }

}
