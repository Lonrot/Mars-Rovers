package Plateu;

import java.util.Arrays;

public class PlateauCreator {

    private int axisX;
    private int axisY;
    private final int[][] plateauGrid;


    public PlateauCreator(int axisY, int axisX)  throws RuntimeException {
        this.axisX = axisX;
        this.axisY = axisY;
        this.plateauGrid = new int[axisY][axisX];
    }

    public int[][] getPlateauGrid() {
        for (int[] row : plateauGrid) {
            System.out.println(Arrays.toString(row));
        }
        return plateauGrid;
    }

}
