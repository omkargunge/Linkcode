package com.linkcode.jagged;

import java.util.Scanner;

public class flightSeatBooking{
    //business-3 first- 5 Economy-7
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to redflight");
        boolean flight[][]={
            new boolean[3],
            new boolean[5],
            new boolean[7]
        };
        //print the board
        while(true){
            for(int i=0;i<flight.length;i++){
                System.out.print((i+1)+(i==0?"business: ":(i==1?"first: ":"economy: ")));
                for(int j=0;j<flight[i].length;j++){
                    System.out.print(flight[i][j]?" [X] ":" [ ] ");
                }
                System.out.println();

            }

            System.out.println("Enter row num : ");
            int row=sc.nextInt();
            if(row<=0||row>=4){
                System.out.println("Invalid row...");
                continue;
            }

            System.out.println("enter a seat number(1-"+flight[row-1].length+")");
            int seat=sc.nextInt();
            if(seat<=0||seat>flight[row-1].length) {
                System.out.println("invalid col number");
                continue;
            }

            flight[row-1][seat-1]=true;
            System.out.println("seat booked succesfully..");
        }
    }
}