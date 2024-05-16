package Rovers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlsTest {


    @Test
    void rotation() {
        Controls controls = new Controls(0,0, Controls.Facing.NORTH);

        var result = controls.rotation(Controls.Commands.R, Controls.Facing.NORTH);
        var result2 = controls.rotation(Controls.Commands.L, Controls.Facing.NORTH);
        var result3 = controls.rotation(Controls.Commands.R, Controls.Facing.SOUTH);
        var result4 = controls.rotation(Controls.Commands.R, Controls.Facing.WEST);
        assertEquals(Controls.Facing.EAST,result);
        assertEquals(Controls.Facing.WEST,result2);
        assertEquals(Controls.Facing.WEST,result3);
        assertEquals(Controls.Facing.NORTH,result4);
    }
    @Test
    void moveForwardTest(){
        Controls controls = new Controls(0,0, Controls.Facing.NORTH);
        String expected = "Axis Y: 1 Axis X:0";
        Controls controls2 = new Controls(3,3, Controls.Facing.SOUTH);
        String expected2 = "Axis Y: 2 Axis X:3";
        Controls controls3 = new Controls(5, 5, Controls.Facing.EAST);
        String expected3 = "Axis Y: 5 Axis X:6";
        Controls controls4 = new Controls(5, 2, Controls.Facing.NORTH);
        String expected4 = "Axis Y: 6 Axis X:2";




        assertEquals(expected,controls.moveForward());
        assertEquals(expected2,controls2.moveForward());
        assertEquals(expected4, controls4.moveForward());
        assertEquals(expected3, controls3.moveForward());
    }
}

