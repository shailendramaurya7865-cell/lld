package org.example.AbstractFactory.GUI;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropdown();
    }
}
