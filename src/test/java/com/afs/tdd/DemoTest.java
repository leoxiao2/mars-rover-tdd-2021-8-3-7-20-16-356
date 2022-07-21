package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_turn_left_when_ExecuteSingleCommand_given_left_command() {
        //given
        Application application=new Application(0,0,"N");
        //when
        application.ExecuteSingleCommand("L");
        //then
        assertEquals("W",application.getDirection());
    }
    
}
