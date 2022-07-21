package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should__when_execute_command_N_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.ExecuteSingleCommand("M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
    
}
