package Utils;

import Plateu.PlateauCreator;

import java.util.Scanner;

public class InstructionsParser {

    public PlateauCreator plateauCreatorParser() {
        int axisY = 0;
        int axisX = 0;
        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                String[] split = userInput.split(" ");
                int Y = Integer.parseInt(split[0]);
                int X = Integer.parseInt(split[1]);
                if (Y > 0 &&  Y <= 5 && X >0 && X <= 5) {
                    axisY = Y;
                    axisX = X;
                    scanner.close();
                    break;
                }
                System.out.println("Max size for both axis is 5");

            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.out.println("Wrong input, introduce coordinates in format  Y  X");
            }
        }
        return new PlateauCreator(axisY, axisX);

    }
}
