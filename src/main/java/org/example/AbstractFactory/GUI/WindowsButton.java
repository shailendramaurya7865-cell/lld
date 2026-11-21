package org.example.AbstractFactory.GUI;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("WindowsButton.render");
    }
}
