package org.example.AbstractFactory.GUI;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
