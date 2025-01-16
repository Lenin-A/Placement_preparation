package org.example;
import java.util.Scanner;
public class TicketBooking {
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of the ticket:");
        int ticket = in.nextInt();
        System.out.println("enter the refresh (y/n):");
        char ref=in.next().charAt(0);
        System.out.println("enter the coupon (y/n):");
        char cou=in.next().charAt(0);
        System.out.println("enter the circle (k/q)");
        char cir=in.next().charAt(0);

        if(ticket>=5 && ticket<=40){
            cost(ticket,ref,cou,cir);
        }else{
            System.out.println("Invalid input");
        }
    }
    static void cost(int ticket,char ref,char cou,char cir) {
        double costtick = 0;
        if (cir == 'k') {
            costtick = ticket * 75;
        } else if (cir == 'q') {
            costtick = ticket * 150;
        } else {
            System.out.println("invalid input");
            return;
        }
        if (ref == 'y') {
            costtick = costtick + 50;
        }
        if (ticket > 20) {
            costtick = costtick * 0.9;
        }
        if (cou == 'y') {
            costtick = costtick * 0.98;
        }

         System.out.println("total ticketcost is: %.2f%n:"+costtick);
    }
}
