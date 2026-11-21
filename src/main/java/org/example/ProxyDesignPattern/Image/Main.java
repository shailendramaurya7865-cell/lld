package org.example.ProxyDesignPattern.Image;

public class Main {
    public static void main(String[] args) {
        Image image = new RealImage();
        image.display();


        Image image1 = new RealImageProxy(true, true);
        image1.display();
    }
}
