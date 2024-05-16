package Rovers;

public class Controls {
    private int axisY;
    private int axisX;
    private Facing actualFacing;

    public enum Commands {R, L, M}

    public enum Facing {NORTH, SOUTH, WEST, EAST}

    public Controls(int axisY, int axisX, Facing actualFacing) {
        this.axisY = axisY;
        this.axisX = axisX;
        this.actualFacing = actualFacing;
    }
    public Facing getActualFacing(){
        return this.actualFacing;
    }

    public Facing rotation(Commands commands) {
        Facing facing = getActualFacing();
        return switch (commands) {
            case L -> switch (facing) {
                case NORTH -> actualFacing = Facing.WEST;
                case EAST -> actualFacing = Facing.NORTH;
                case SOUTH -> actualFacing = Facing.EAST;
                case WEST -> actualFacing = Facing.SOUTH;
            };
            case R -> switch (facing) {
                case NORTH -> actualFacing = Facing.EAST;
                case EAST -> actualFacing = Facing.SOUTH;
                case SOUTH -> actualFacing = Facing.WEST;
                case WEST -> actualFacing = Facing.NORTH;
            };
            default -> facing;
        };
    }

    public String moveForward() {
        Facing facing = this.actualFacing;
        switch (facing) {
            case NORTH -> this.axisY++;
            case SOUTH -> this.axisY--;
            case WEST -> this.axisX--;
            case EAST -> this.axisX++;
        }
        return actualPosition();
    }
    public String actualPosition(){
        return "Axis Y: " +  axisY + " Axis X:" + axisX;
    }
}
