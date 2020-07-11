package com.fortunedavid;

import java.math.BigDecimal;

public class Turtle {
    private Pen turtlePen;
    private  int xMove;
    private int yMove;
    private Compass direction = Compass.EAST;

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public Turtle setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
        return this;
    }

    public int getxMove() {
        return xMove;
    }

    public Turtle setxMove(int xMove) {
        this.xMove = xMove;
        return this;
    }

    public int getyMove() {
        return yMove;
    }

    public Turtle setyMove(int yMove) {
        this.yMove = yMove;
        return this;
    }

    public Compass getDirection() {
        return direction;
    }

    public Turtle setDirection(Compass direction) {
        this.direction = direction;
        return this;
    }

    public void moveForward(int numberOfMoves, int[][] plain) {
        if(this.getDirection() == Compass.EAST){
            for(int i = yMove; i < BigDecimal.ONE.intValue(); i++){
                for(int j = xMove; j < numberOfMoves; j++){
                    plain[i][j] = BigDecimal.ONE.intValue();
                }
            }
            this.xMove += (numberOfMoves-1);
        }

    }

    public void turnRight() {
        if(getDirection() == null){
            throw new NullPointerException("This direction is Null");
        }
        if(getDirection() == Compass.EAST){
            this.setDirection(Compass.SOUTH);
        }
        else if(getDirection() == Compass.SOUTH){
            this.setDirection(Compass.WEST);
        }
        else if(getDirection() == Compass.WEST){
            this.setDirection(Compass.NORTH);
        }
        else if(getDirection() == Compass.NORTH){
            this.setDirection(Compass.EAST);
        }
    }
}
