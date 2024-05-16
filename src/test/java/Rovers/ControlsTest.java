package Rovers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlsTest {


    @Test
    void rotation() {
        Controls controls = new Controls(0,0, Controls.Facing.NORTH);
        Controls controls2 = new Controls(0,0, Controls.Facing.EAST);
        Controls controls3 = new Controls(0,0, Controls.Facing.WEST);
        Controls controls4 = new Controls(0,0, Controls.Facing.SOUTH);


        var test = controls.rotation(Controls.Commands.L);
        var test2 = controls2.rotation(Controls.Commands.L);
        var test3 = controls3.rotation(Controls.Commands.R);
        var test4 = controls4.rotation(Controls.Commands.R);
        assertEquals(Controls.Facing.WEST,test);
        assertEquals(Controls.Facing.NORTH,test2);
        assertEquals(Controls.Facing.NORTH, test3);
        assertEquals(Controls.Facing.WEST,test4);


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

