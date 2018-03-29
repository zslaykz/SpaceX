package main.java.rocket.util;

import com.sun.org.apache.xpath.internal.SourceTree;
import main.java.rocket.cabina.impl.Cabins;
import main.java.rocket.engine.Engine;
import main.java.rocket.engine.impl.Engines;

import java.util.Scanner;

public class UserActions {
    public static String addCabina(){
        System.out.println("Hello to our travel");
        System.out.println("Please enter the name of Cabin");
        Scanner scanner = new Scanner(System.in);
        for (Cabins cabins:Cabins.values()) {
            System.out.println("NAME : "+cabins.getName()+
            "  height :"+" "+ cabins.getHeight()+
            "  width :"+" "+ cabins.getWidth()+
            "  weight :"+" "+ cabins.getWeight()+
            "  capacity: "+" "+ cabins.getCapacity());
        }
        while (true){
            String userInput = scanner.nextLine();
            for (Cabins cabins: Cabins.values()){
                if (cabins.getName().equals(userInput)){
                    return cabins.getName().toUpperCase();
                }
            }
            System.out.println("Sorry, Please enter the name ");
        }
    }

    public static Engine[] addEngine() {

        int counterChoose = 0;
        String[] engineType = new String[5];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three engines from our List");
        for (Engines engines : Engines.values()) {
            System.out.println(engines.getName());
        }
        while (counterChoose <= 2) {
            int innerCounter = counterChoose;

            String userInput = scanner.nextLine();

            for (Engines engines : Engines.values()) {
                if (engines.getName().equals(userInput)) {
                    engineType[counterChoose] = engines.getName().toUpperCase();
                    innerCounter++;
                    if (innerCounter < 3) {
                        System.out.println("Please enter one more engine from list");
                    }

                }
            }
            if (innerCounter == counterChoose) {
                System.out.println("3232");
            }
        }

        boolean additionalEngine;

        do {
            if (counterChoose == 5 )break;
            if (){}
        }

    }
}
