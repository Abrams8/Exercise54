package com.company;

public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new MyRunnable());
        Thread threadTwo = new Thread(new MyRunnable());
        Thread threadThree = new Thread(new MyRunnable());
        Thread threadFour = new Thread(new MyRunnable());
        Thread threadFive = new Thread(new MyRunnable());

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
    }
}
