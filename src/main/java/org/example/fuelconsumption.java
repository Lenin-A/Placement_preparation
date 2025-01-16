//problem Statement – Write a program to calculate the fuel consumption of your
//        truck.The program should ask the user to enter the quantity of diesel to fill up the tank
//        and the distance covered till the tank goes dry.Calculate the fuel consumption and
//        display it in the format (liters per 100 kilometers).
//        Convert the same result to the U.S. style of miles per gallon and display the result. If
//        the quantity or distance is zero or negative display ” is an Invalid Input”.
//        [Note: The US approach of fuel consumption calculation (distance / fuel) is the
//        inverse of the European approach (fuel / distance ). Also note that 1 kilometer is
//        0.6214 miles, and 1 liter is 0.2642 gallons.
//Enter the no of liters to fill the tank
//        20
//        Enter the distance covered
//        150
//        Sample Output 1:
//        Liters/100KM
//        13.33
//        Miles/gallons
//        17.64
package org.example;
import java.util.Scanner;
public class fuelconsumption {
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the litre:");
        float litre = in.nextFloat();
        System.out.println("Enter the distance:");
        float distance = in.nextFloat();

        if(litre < 0||distance<0){
            System.out.println("Invalid input");
        }else{
            float litreperkm = (litre)/(distance)*100;
            System.out.printf("this litre per 100 km of india"+ " " + litreperkm);

            double miles = 0.6214*distance;
            double gallons =0.2642*litre;
            double total = (miles)/(gallons);
            System.out.printf("this litre per miles of us"+ " " +total);
        }
    }
}
