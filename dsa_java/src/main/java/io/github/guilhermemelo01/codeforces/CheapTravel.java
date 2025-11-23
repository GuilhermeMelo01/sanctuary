package io.github.guilhermemelo01.codeforces;

import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // normal ride = a
        // special ticket for 'm' rides for 'b' rubles
        // uses subway = 'n'

        // I've to found the minimum sum of money for 'n' rides;

        // n, m, a, b
        // 6 2 1 2

        // a = value
        // b / m = value
        // n
        // n / value

        //101 110 1 100

        int numberOfRides, normalTicket, specialTicket, specialTicketRides;

        numberOfRides = in.nextInt();
        specialTicketRides = in.nextInt();
        normalTicket = in.nextInt();
        specialTicket = in.nextInt();

        int minimumValue = 0;

        while(numberOfRides > 0){
            if((numberOfRides - specialTicketRides >= 0)){
                minimumValue += specialTicket;
                numberOfRides -= specialTicketRides;
            }else {
                minimumValue += normalTicket;
                numberOfRides -= 1;
            }
        }

        System.out.println(minimumValue);
        in.close();
    }
}
