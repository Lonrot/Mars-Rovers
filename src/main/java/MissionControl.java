import Plateu.PlateauCreator;
import Utils.InstructionsParser;

public class MissionControl {
    InstructionsParser IS = new InstructionsParser();

    public void plateauStartup() {
        IS.plateauCreatorParser();

    }
}
