package Utils;

import Plateu.PlateauCreator;

import java.util.Scanner;

public class InstructionsParser {

    public PlateauCreator plateauCreatorParser() {
        int axisY = 0;
        int axisX = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String[] split = userInput.split(" ");
            int Y = Integer.parseInt(split[0]);
            int X = Integer.parseInt(split[1]);
            if( Y > 0  && X > 0 ) {
                axisY = Y;
                axisX = X;
                break;
            }
        }

        return new PlateauCreator(axisY,axisX);
    }
}
