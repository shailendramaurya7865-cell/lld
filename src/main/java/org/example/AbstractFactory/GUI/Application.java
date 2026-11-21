package org.example.AbstractFactory.GUI;

public class Application {
    Button button;
    Dropdown dropdown;

    Application(GUIFactory factory) {
        button = factory.createButton();
        dropdown = factory.createDropdown();
    }

    public void renderGUI() {
        button.render();
        dropdown.render();
    }
}
