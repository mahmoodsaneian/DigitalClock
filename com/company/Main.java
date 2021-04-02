package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClockDisplay clockDisplay = new ClockDisplay();
        Scanner scan = new Scanner(System.in);
        printmenu();
        int code = scan.nextInt();

        switch (code){
            case 1:
                break;
            case 2:
                int hour = scan.nextInt();
                int minute = scan.nextInt();
                int second = scan.nextInt();
                clockDisplay.setTime(hour,minute,second);
        }

        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            clockDisplay.timeTick();
            System.out.println(clockDisplay.getTime());
        }
    }

    public static void printmenu(){
        System.out.println("1.default time");
        System.out.println("2.choose time");
    }
}
