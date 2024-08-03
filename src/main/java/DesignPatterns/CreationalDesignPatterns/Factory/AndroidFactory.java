package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.Button.AndroidButton;
import DesignPatterns.CreationalDesignPatterns.Factory.Button.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.AndroidDropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.DropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.AndroidMenu;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
