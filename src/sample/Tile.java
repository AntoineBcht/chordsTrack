package sample;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Tile {

    private String name;
    private int tic; //time
    private int velocity;
    private Pane view;

    public Tile(String name, Pane tile) {
        this.name = name;
        this.tic = 8;
        this.velocity = 50;
        this.view = tile;
    }

    public String getName(){
        return this.name;
    }

    public int getTic(){
        return this.tic;
    }

    public int getVelocity(){
        return this.velocity;
    }

    public Pane getView(){
        return this.view;
    }

    public void setTic(int tic){ this.tic = tic; }

    public void setVelocity(int velocity){ this.velocity = velocity; }


}
