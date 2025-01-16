package org.example;
import java.util.Scanner;
public class costoffood {
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of puffs");
        int puffs = in.nextInt();
        System.out.println("Enter the no of the pizza");
        int pizza = in.nextInt();
        System.out.println("Enter the no of the cooldrinks");
        int cooldrink = in.nextInt();
        System.out.println("Enter the no of puffs"+":"+puffs);
        System.out.println("Enter the no of the pizza"+":"+pizza);
        System.out.println("Enter the no of the cooldrinks"+":"+cooldrink);



        int costpuf = 20*puffs;
        int costpizza = 100*pizza;
        int costdrink = 10*cooldrink;
        int sum = (costpuf+costpizza+costdrink);
        System.out.println("total no of price"+":"+sum);
    }
}
