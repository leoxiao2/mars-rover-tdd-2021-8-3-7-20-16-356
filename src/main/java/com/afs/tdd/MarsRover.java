package com.afs.tdd;

import java.lang.reflect.Executable;
import java.util.List;

public class MarsRover {
    private int locationX;
    private int locationY;
    private  String direction;
    public MarsRover(int locationX, int locationY, String direction){
        this.locationX=locationX;
        this.locationY=locationY;
        this.direction=direction;
    }

    public void ExecuteSingleCommand(String command){
        if(command.equals("M")){
            Move();
        }
        else if(command.equals("L")){
            TurnLeft();
        }
        else{
            TurnRight();
        }
    }

    private void TurnRight() {
        if(direction.equals("N")){
            direction="E";
        }
        else if(direction.equals("S")){
            direction="W";
        }
        else if(direction.equals("E")){
            direction="S";
        }
    }

    private void TurnLeft() {
        if(direction.equals("N")){
            direction="W";
        }
        else if(direction.equals("S")){
            direction="E";
        }
        else if(direction.equals("E")){
            direction="N";
        }
    }

    public void ExecuteCommands(List<String> commands){
    }

    public void Move(){
        if(direction.equals("N")){
            locationY+=1;
        }
        else if(direction.equals("S")){
            locationY-=1;
        }
        else if(direction.equals("E")){
            locationX+=1;
        }
        else{
            locationX-=1;
        }
    }

    public String getDirection() {
        return this.direction;
    }

    public int getLocationX(){
        return  this.locationX;
    }

    public int getLocationY(){
        return this.locationY;
    }
}
