/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
public class Ex11 {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int euros;
        double rate;
        System.out.println("How many euros are you exchanging?");
        euros = kb.nextInt();
        System.out.println("What is the exchange rate? ");
        rate = kb.nextDouble();
        System.out.println(euros + " euros at an exchange rate of " + rate + " is " +  ((double)Math.round(rate * euros*100)/100) + " U.S. dollars.");

    }
}