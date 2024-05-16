package Plateu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlateauCreatorTest {
    PlateauCreator plateauCreator = new PlateauCreator(5,5);

    @Test
    void getPlateauGrid() {
        int[][] testOne = new int[6][6];
        int[][] testTwo = plateauCreator.getPlateauGrid();
        assertArrayEquals(testOne, plateauCreator.getPlateauGrid());
        assertNotNull(testOne, "Can't be null");
    }
    @Test
    void emptyPlateauGrid() {
        PlateauCreator plateauCreatorEmpty= new PlateauCreator(0,0);
        int[][] testOne = new int[0][0];
        assertNotNull(testOne, "Can't be null");
        assertArrayEquals(testOne, plateauCreatorEmpty.getPlateauGrid());

    }


}