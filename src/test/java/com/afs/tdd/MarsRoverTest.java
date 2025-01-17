package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_go_to_0_1_N_when_execute_command_M_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.ExecuteCommands("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_L_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.ExecuteCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_R_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.ExecuteCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_minus1_S_when_execute_command_M_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.ExecuteCommands("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_L_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.ExecuteCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_R_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.ExecuteCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_execute_command_M_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.ExecuteCommands("M");
        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_L_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.ExecuteCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_R_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.ExecuteCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_minus1_0_W_when_execute_command_M_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        marsRover.ExecuteCommands("M");
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_L_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        marsRover.ExecuteCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_R_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        marsRover.ExecuteCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_2_N_when_execute_commands_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.ExecuteCommands("MM");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(2, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

}
