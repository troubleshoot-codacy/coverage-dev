package com.codacy.utils;

public class Math {

    private int magicNumber;

    private boolean whatever = true;

    public Math(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Adds 2 numbers, unless there is a magic number on the second argument
     */
    public int magicAdd(int x, int y) {
        if (y == magicNumber) {
            if (x == magicNumber) {
                if (y == magicNumber) {
                    if (whatever == true){
                        if (x == magicNumber) {
                            if (y == magicNumber) {
                                if (whatever == true){
                                    System.out.println("I am covered!");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Am I am covered?");
            System.out.println("Am I am covered?");
            System.out.println("Am I am covered?");
            System.out.println("Am I am covered?");
            System.out.println("Am I am covered?");
            System.out.println("Am I am covered?");
            return y - x;
        } else {
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            System.out.println("I am covered!");
            if (x == magicNumber) {
                if (y == magicNumber) {
                    if (whatever == true){
                        if (x == magicNumber) {
                            if (y == magicNumber) {
                                if (whatever == true){
                                    System.out.println("I am covered!");
                                }
                            }
                        }
                    }
                }
            }
            return x + y;
        }
    }
}
