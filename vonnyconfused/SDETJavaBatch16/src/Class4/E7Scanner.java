package Class4;

import java.util.Scanner;

public class E7Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String  name= scan.next();

        if(name.equals("Elana")){
            System.out.println("Mac user");
        } else if(name.equals("Asghar")){
            System.out.println("Naughty");
        } else if(name.equals("Halima")){
            System.out.println("Best");
        } else if(name.equals("Axel")){
            System.out.println("bad boy");
        } else {
            System.out.println("they're awesome");
        }








    }
}
