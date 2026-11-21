package org.example.solid.LSP;

public class Main {

    static void main(String[] args) {
        Bird bird = new Eagle();
        bird.fly();
        Bird ostrich = new Ostrich();
        ostrich.fly();
    }
}
