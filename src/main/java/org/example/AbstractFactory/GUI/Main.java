package org.example.AbstractFactory.GUI;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new WindowsFactory());
        application.renderGUI();
    }
}
