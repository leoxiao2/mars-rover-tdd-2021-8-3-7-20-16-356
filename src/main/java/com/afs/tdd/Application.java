package com.afs.tdd;

import java.lang.reflect.Executable;
import java.util.List;

public class Application {
    private int locationX;
    private int locationY;
    private  String direction;
    public Application(int locationX,int locationY,String direction){
        this.locationX=locationX;
        this.locationY=locationY;
        this.direction=direction;
    }

    public void ExecuteSingleCommand(String command){
    }

    public void ExecuteCommands(List<String> commands){
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
