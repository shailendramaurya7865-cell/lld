package org.example.ProxyDesignPattern.Image;

public class RealImage implements Image{
    @Override
    public void display() {
        System.out.println("Displaying Real Image");
    }
}
