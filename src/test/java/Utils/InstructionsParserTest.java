package Utils;

import Plateu.PlateauCreator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class InstructionsParserTest {
    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void plateauCreatorParser() {
        InstructionsParser ps = new InstructionsParser();
        String userInput = "1 1";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        PlateauCreator pcExpected = new PlateauCreator(1,1);
        PlateauCreator pc = ps.plateauCreatorParser();
        assertEquals(pcExpected.getAxisY(),pc.getAxisY());

        String userInput2 = "5 5";
        ByteArrayInputStream bais2 = new ByteArrayInputStream(userInput2.getBytes());
        System.setIn(bais2);

        PlateauCreator pcExpected2 = new PlateauCreator(5,5);
        PlateauCreator pc2= ps.plateauCreatorParser();
      assertEquals(pcExpected2.getAxisX(),pc2.getAxisX());
    }
}