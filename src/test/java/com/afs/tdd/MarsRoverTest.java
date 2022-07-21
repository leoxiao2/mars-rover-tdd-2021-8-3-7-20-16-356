package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_go_to_0_1_N_when_execute_command_M_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.ExecuteSingleCommand("M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_L_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.ExecuteSingleCommand("L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_R_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.ExecuteSingleCommand("R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    void should_go_to_0_minus1_S_when_execute_command_M_given_0_0_S() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"S");
        //when
        marsRover.ExecuteSingleCommand("M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
    
}
