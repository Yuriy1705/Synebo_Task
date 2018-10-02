package com;

public class Task_1 {
    int side1;
    int side2;

    int squareQuantity;


    public Task_1(int squareQuantity) {
        double side1 = Math.floor(Math.sqrt(squareQuantity));
        double side2 = Math.ceil(squareQuantity / side1);
        this.side1 = (int) side1;
        this.side2 = (int) side2;
        this.squareQuantity = squareQuantity;

    }


    public int findAnswer() {

        return (2*this.squareQuantity+this.side2+this.side1);
    }

}
