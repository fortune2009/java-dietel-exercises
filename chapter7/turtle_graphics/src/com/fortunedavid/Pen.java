package com.fortunedavid;

public class Pen {
    private PenPosition position = PenPosition.UP;

    public PenPosition getPosition() {
        return position;
    }

    public Pen setPosition(PenPosition position) {
        this.position = position;
        return this;
    }
}
